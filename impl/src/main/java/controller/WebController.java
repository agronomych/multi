package controller;

import org.springframework.web.bind.annotation.RestController;
import resource.Resource;

@RestController
public class WebController implements Resource {

    @Override
    public String getImpl() {
        return null;
    }

    @Override
    public String getImpl2() {
        return null;
    }
}
