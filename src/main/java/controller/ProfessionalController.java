import controller.Availability;
import controller.AvailabilityRequest;
import org.hibernate.mapping.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
