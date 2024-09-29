@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

    @ManyToOne
    @JoinColumn(name = "professional_id")
    private User professional;

    private LocalDateTime appointmentDate;
    private String service;
    private String status; // "PENDING", "CONFIRMED", "COMPLETED", "CANCELLED"

    // Getters e Setters
}
