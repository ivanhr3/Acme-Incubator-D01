
package acme.features.anonymous.hernandezBulletin;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;

import acme.entities.bulletins.HernandezBulletin;
import acme.framework.repositories.AbstractRepository;

public interface AnonymousHernandezBulletinRepository extends AbstractRepository {

	@Query("SELECT B FROM HERNANDEZBULLETIN B")
	Collection<HernandezBulletin> findMany();

}
