package a.b.c.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MemInfoUpdateCmd {
	private Long mem_num;
	private String mem_pass;
	private String mem_id;
	private String mem_name;
	private String mem_email;
}

