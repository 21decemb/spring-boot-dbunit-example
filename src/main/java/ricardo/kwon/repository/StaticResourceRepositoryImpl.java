package ricardo.kwon.repository;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import ricardo.kwon.entity.StaticResource;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class StaticResourceRepositoryImpl implements StaticResourceRepository {

    @PersistenceContext
    EntityManager entityManager;

    private Criteria getCriteria() {
        return entityManager.unwrap(Session.class).createCriteria(StaticResource.class);
    }

    @Override
    public List<StaticResource> findAll() {
        Criteria criteria = getCriteria();
        return criteria.list();
    }
}
