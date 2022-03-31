package maybankspringbootuuid;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
@Data
@Entity
@Table(name = "user", uniqueConstraints = @UniqueConstraint(columnNames = "user_name"))
public class User {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(
			name = "UUID", 
			strategy = "uuid2"
			)
	@Column(name = "user_id", updatable = false, nullable = false)
    private String user_id;
	private String user_name;
	private String user_password;
	private String role_id;
	
	public User () {
		
	}

	public User(String user_id, String user_name, String user_password, String role_id) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_password = user_password;
		this.role_id = role_id;
	}
	
}
