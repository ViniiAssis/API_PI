@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    @PostMapping("/{professionalId}/review")
    public ResponseEntity<?> submitReview(@PathVariable Long professionalId, @RequestBody ReviewRequest request) {
        // Submeter uma nova avaliação
    }

    @GetMapping("/{professionalId}")
    public ResponseEntity<List<Review>> getReviews(@PathVariable Long professionalId) {
        // Buscar avaliações de um profissional
    }
}
