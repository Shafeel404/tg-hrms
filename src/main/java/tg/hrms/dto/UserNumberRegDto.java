package tg.hrms.dto;

import lombok.Data;

public @Data class UserNumberRegDto {

	private Integer id;

	private Long phoneNumber;

	private Long tgId;

	private String regId;

}
