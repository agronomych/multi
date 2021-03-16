package resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface Resource {

    @GetMapping("/impl")
    public String getImpl();

    @GetMapping("/impl2")
    public String getImpl2();

}
