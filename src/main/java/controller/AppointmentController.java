package controller;

import org.hibernate.mapping.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.Appointment;

import java.security.Principal;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {

    @PostMapping("/book")
    public <AppointmentRequest> ResponseEntity<?> bookAppointment(@RequestBody AppointmentRequest request) {

        return null;
    }

    @GetMapping("/my-appointments")
    public ResponseEntity<List<Appointment>> getAppointments(Principal principal) {

        return null;
    }
}
