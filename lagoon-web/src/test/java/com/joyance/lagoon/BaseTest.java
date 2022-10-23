package com.joyance.lagoon;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.joyance.lagoon.web.controller.HelloworldApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {HelloworldApplication.class})
public class BaseTest {

}
