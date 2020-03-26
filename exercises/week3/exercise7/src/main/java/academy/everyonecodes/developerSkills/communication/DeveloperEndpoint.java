package academy.everyonecodes.developerSkills.communication;

import academy.everyonecodes.developerSkills.domain.Developer;
import academy.everyonecodes.developerSkills.logic.DeveloperService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("")
public class DeveloperEndpoint {

    private final DeveloperService service;


    public DeveloperEndpoint(DeveloperService service) {
        this.service = service;
    }

    @GetMapping("/developers")
    List<Developer> getDeveloper(){
        return service.finaAll();
    }

    @GetMapping("/developers/skills/{skills}")
    List<Developer> getSkilledDeveloper(@PathVariable String skills){
        return service.findBy(skills);
    }
}
