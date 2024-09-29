@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;
    private String role; // "CLIENT" ou "PROFESSIONAL"

    // Para profissionais
    private String specialties;
    private String portfolioUrl;
    private double rating;

    // Métodos getters e setters
}
