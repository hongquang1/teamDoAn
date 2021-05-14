package Mlem.com.Common.Entity;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
@Id
@Column(name = "user_id")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private int role;
private String email;
@Column(name = "full_name")
private String fullName;
private String gender;
private boolean enable;
private String avatar;
@Column(name = "auth_provider")
private Provider provider;

}
