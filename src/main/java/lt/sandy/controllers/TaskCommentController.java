package lt.sandy.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/api/task-comments")
@RestController
class TaskCommentController {

    @GetMapping
    List<TaskComment> getAll(

    ) {
        return new ArrayList<>();
    }

    static class TaskComment {

    }
}
