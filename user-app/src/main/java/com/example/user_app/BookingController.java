package com.example.user_app;

import com.example.user_app.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookingController {

    private final BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService){
        this.bookingService = bookingService;
    }

    @GetMapping("/")
    public String redirectToLogin() {
        return "redirect:/showForm";
    }

    @GetMapping("/showForm")
    public String showForm(Model model){
        model.addAttribute("booking", new Booking());
        return "index";
    }

    @PostMapping("/book-flight")
    public String bookFlight(@ModelAttribute Booking booking, Model model) {
        // Process the booking here (save to database, etc.)
        bookingService.sendToServer(booking);

        // Add the booking to the model to display in confirmation page
        model.addAttribute("booking", booking);

        return "confirmation"; // This should match your template name (confirmation.html)
    }
}
