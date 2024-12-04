package ma.wafae.ta3aounyati.dto.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskRequest {
    @NotNull(message = "title must not be null")
    @NotBlank(message = "title must not be blank")
    @NotEmpty(message = "title must not be empty")
    private String title;
    @NotNull(message = "description must not be null")
    @NotBlank(message = "description must not be blank")
    @NotEmpty(message = "description must not be empty")
    private String description;
    private boolean done;
    private LocalDate date;
    @NotNull(message = "user id must not be null")
    private Integer userId;
}
