package com.Intern.InternPlus.service;

import com.Intern.InternPlus.model.Internship;
import com.Intern.InternPlus.repository.InternshipRepository;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class WebScraperService {

    private final InternshipRepository internshipRepository;

    public WebScraperService(InternshipRepository internshipRepository) {
        this.internshipRepository = internshipRepository;
    }

    public List<Internship> scrapeInternships() throws IOException {
        String url = "https://internshala.com/internships/backend-development-internship"; // sample page
        Document doc = Jsoup.connect(url).get();

        List<Internship> internships = new ArrayList<>();

        Elements listings = doc.select(".internship_meta");
        for (Element listing : listings) {
            String title = listing.select(".profile").text();
            String company = listing.select(".company_name").text();
            String location = listing.select(".location_link").text();
            String link = "https://internshala.com" + listing.select(".view_detail_button").attr("href");

            Internship internship = new Internship();
            internship.setTitle(title);
            internship.setCompanyName(company);
            internship.setLocation(location);
            internship.setApplyLink(link);
            internship.setDatePosted(LocalDate.now());

            internships.add(internship);
            internshipRepository.save(internship);
        }

        return internships;
    }
}

