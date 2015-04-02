package ricardo.kwon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ricardo.kwon.entity.StaticResource;
import ricardo.kwon.repository.StaticResourceRepository;

import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class StaticResourceServiceImpl implements StaticResourceService {

    @Autowired
    StaticResourceRepository staticResourceRepository;

    @Override
    public List<StaticResource> findAll() {
        return this.staticResourceRepository.findAll();
    }
}
