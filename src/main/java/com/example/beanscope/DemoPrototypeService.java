package com.example.beanscope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by lihuiyan on 2017/2/20.
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
