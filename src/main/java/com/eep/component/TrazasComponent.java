package com.eep.component;

import com.eep.repository.CourseJpaRepository;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("TrazasComponent")
public class TrazasComponent {
    private static final Log LOG = LogFactory.getLog(TrazasComponent.class);

    @Autowired
    @Qualifier("courseJpaRepository")
    private CourseJpaRepository courseJpaRepository;

    public void hola(){

        LOG.info("hola este es un mensaje desde mi primer componente de ejemplo");
    }

}
