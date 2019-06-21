package io.fsbg.inochi.dm1.repository.search;

import io.fsbg.inochi.dm1.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, String> {
}
