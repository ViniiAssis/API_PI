@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {

    @PostMapping("/book")
    public ResponseEntity<?> bookAppointment(@RequestBody AppointmentRequest request) {

    }

    @GetMapping("/my-appointments")
    public ResponseEntity<List<Appointment>> getAppointments(Principal principal) {

    }
}
