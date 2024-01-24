package ru.maliutin.diary_app_rest_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.maliutin.diary_app_rest_api.models.Status;
import ru.maliutin.diary_app_rest_api.models.Task;

import java.util.List;

/**
 * Репозиторий для сущности task.
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    /**
     * Получение списка задач по статусу задачи.
     * @param status статус задачи.
     * @return список задач.
     */
    List<Task> findByStatus(Status status);
}
