package ru.maliutin.diary_app_rest_api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import ru.maliutin.diary_app_rest_api.models.Status;

import java.time.LocalDateTime;

/**
 * Объект dto для задач.
 */
@Data
public class TaskDto {
    /**
     * Уникальный идентификатор задачи.
     */
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long id;
    /**
     * Описание задачи.
     */
    @NotEmpty(message = "Описание не может быть пустым!")
    private String description;
    /**
     * Время создания задачи.
     */
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private LocalDateTime dateCreation;
    /**
     * Статус задачи.
     */
    private Status status;
}
