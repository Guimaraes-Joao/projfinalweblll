package gabriel.joao.Projfinal.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

//Spring
@Component

//Lombook
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString

//JPA
@Entity
@Table(name = "funcionario")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cargo")
    private String cargo;

    @Column(name = "renda")
    private double renda;
}
