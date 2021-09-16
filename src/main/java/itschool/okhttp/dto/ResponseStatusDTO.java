package itschool.okhttp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseStatusDTO {

    private String status;
    private TestDTO testDTO;
}
