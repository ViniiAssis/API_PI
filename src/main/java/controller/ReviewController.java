package controller;

import controller.Review;
import controller.ReviewRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    @PostMapping("/{professionalId}/review")
    public ResponseEntity<?> submitReview(@PathVariable Long professionalId, @RequestBody ReviewRequest request) {

        return null;
    }

    @GetMapping("/{professionalId}")
    public ResponseEntity<List<Review>> getReviews(@PathVariable Long professionalId) {

        return null;
    }
}
