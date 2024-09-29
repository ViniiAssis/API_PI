@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {

    @PostMapping("/book")
    public ResponseEntity<?> bookAppointment(@RequestBody AppointmentRequest request) {
        // Verificação de disponibilidade e criação do agendamento
    }

    @GetMapping("/my-appointments")
    public ResponseEntity<List<Appointment>> getAppointments(Principal principal) {
        // Listar agendamentos do cliente/profissional logado
    }
}
