package org.fengling.blog;

import com.google.gson.Gson;
import org.fengling.blog.controller.Bean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogApplicationTests {
    @Autowired
    private Gson gson;

    @Test
    void contextLoads() {
        String json = "{\"success\":true,\"message\":\"\",\"data\":{\"001\":4355,\"002\":3131,\"003\":2967}}";
        Bean bean = gson.fromJson(json, Bean.class);
        System.out.println(bean.toString());
        for (Object o: bean.getData().keySet()) {
            System.out.println(o instanceof String);
            System.out.println(o + " ----> " + bean.getData().get(o));
        }
        System.out.println(bean.getData().get("001"));
    }

}
