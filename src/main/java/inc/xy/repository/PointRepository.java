package inc.xy.repository;

import inc.xy.model.Point;
import inc.xy.model.PointPK;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface PointRepository extends CrudRepository<Point, PointPK >{

}
