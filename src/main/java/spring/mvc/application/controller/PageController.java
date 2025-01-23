package spring.mvc.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Home Page - My Website");
        model.addAttribute("metaDescription", "Welcome to the best website for your needs.");
        model.addAttribute("metaKeywords", "home, website, services");
        model.addAttribute("metaAuthor", "Your Name");
        model.addAttribute("metaRobots", true);
        model.addAttribute("ogTitle", "Home Page");
        model.addAttribute("ogDescription", "Welcome to My Website's Home Page");
        model.addAttribute("ogImage", "/images/home-banner.jpg");
        model.addAttribute("ogUrl", "https://www.mywebsite.com/");
        model.addAttribute("canonicalUrl", "https://www.mywebsite.com/");

        model.addAttribute("content", "pages/home");
        return "layouts/master";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About Us - My Website");
        model.addAttribute("metaDescription", "Learn more about us and our mission.");
        model.addAttribute("metaKeywords", "about, company, mission, team");
        model.addAttribute("metaAuthor", "Your Name");
        model.addAttribute("metaRobots", true);
        model.addAttribute("ogTitle", "About Us");
        model.addAttribute("ogDescription", "Learn more about My Website and our vision.");
        model.addAttribute("ogImage", "/images/about-banner.jpg");
        model.addAttribute("ogUrl", "https://www.mywebsite.com/about");
        model.addAttribute("canonicalUrl", "https://www.mywebsite.com/about");

        model.addAttribute("content", "pages/about");
        return "layouts/master";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("title", "Contact Us - My Website");
        model.addAttribute("metaDescription", "Get in touch with us for any inquiries or support.");
        model.addAttribute("metaKeywords", "contact, support, inquiries");
        model.addAttribute("metaAuthor", "Your Name");
        model.addAttribute("metaRobots", true);
        model.addAttribute("ogTitle", "Contact Us");
        model.addAttribute("ogDescription", "Reach out to My Website for any queries.");
        model.addAttribute("ogImage", "/images/contact-banner.jpg");
        model.addAttribute("ogUrl", "https://www.mywebsite.com/contact");
        model.addAttribute("canonicalUrl", "https://www.mywebsite.com/contact");

        model.addAttribute("content", "pages/contact");
        return "layouts/master";
    }

    @GetMapping("/services")
    public String services(Model model) {
        model.addAttribute("title", "Our Services - My Website");
        model.addAttribute("metaDescription", "Discover the wide range of services we offer.");
        model.addAttribute("metaKeywords", "services, offerings, business solutions");
        model.addAttribute("metaAuthor", "Your Name");
        model.addAttribute("metaRobots", true);
        model.addAttribute("ogTitle", "Our Services");
        model.addAttribute("ogDescription", "Explore the services offered by My Website.");
        model.addAttribute("ogImage", "/images/services-banner.jpg");
        model.addAttribute("ogUrl", "https://www.mywebsite.com/services");
        model.addAttribute("canonicalUrl", "https://www.mywebsite.com/services");

        model.addAttribute("content", "pages/services");
        return "layouts/master";
    }
}
