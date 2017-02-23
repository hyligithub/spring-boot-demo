package com.example;

import com.example.chapter2.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

public class SpringBootDemoApplicationTests extends BaseTest {

    @Test
    public void contextLoads() {
    }

    @Test
    public void testUserController() throws Exception {
        //post
        User user = new User();
        ObjectMapper mapper = new ObjectMapper();
        mvc.perform(MockMvcRequestBuilders.post("/users/").param("id", "1")
                .param("name", "测试大师")
                .param("age", "20"))
                .andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

        //get
        mvc.perform(MockMvcRequestBuilders.get("/users/")).andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print()).andReturn();

        //update
        mvc.perform(MockMvcRequestBuilders.put("/users/1")
                .param("name", "名字改了")
                .param("age", "20"))
                .andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

        //get
        mvc.perform(MockMvcRequestBuilders.get("/users/1")).andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print()).andReturn();

        //delete
        mvc.perform(MockMvcRequestBuilders.delete("/users/1").param("id", "1")).andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print()).andReturn();
        //get
        mvc.perform(MockMvcRequestBuilders.get("/users/")).andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print()).andReturn();
    }
}
