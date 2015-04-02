package ricardo.kwon.repository;

import ricardo.kwon.entity.StaticResource;

import java.util.List;

public interface StaticResourceRepository {
    List<StaticResource> findAll();
}
