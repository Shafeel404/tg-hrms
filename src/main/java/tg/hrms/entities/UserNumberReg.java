package tg.hrms.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user_number_reg", schema = "master")
@Setter
@Getter
//@NoArgsConstructor
//@AllArgsConstructor
public class UserNumberReg {
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "phone_number")
	private Long phoneNumber;

	@Column(name = "tg_id")
	private Long tgId;

	@Column(name = "reg_id")
	private String regId;

}
