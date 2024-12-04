package ma.wafae.ta3aounyati.dto.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JournalRequest {
    @NotNull(message = "description must not be null")
    @NotBlank(message = "description must not be blank")
    @NotEmpty(message = "description must not be empty")
    private String description;
    @NotNull(message = "date must not be null")
    private LocalDateTime date;
    @NotNull(message = "user id must not be null")
    private Integer userId;
}
