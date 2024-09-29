@RestController
@RequestMapping("/api/professionals")
public class ProfessionalController {

    @GetMapping("/{professionalId}/availability")
    public ResponseEntity<List<Availability>> getAvailability(@PathVariable Long professionalId) {

    }

    @PostMapping("/{professionalId}/availability")
    public ResponseEntity<?> setAvailability(@PathVariable Long professionalId, @RequestBody List<AvailabilityRequest> requests) {

    }
}
