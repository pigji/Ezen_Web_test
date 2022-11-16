package BoardWeb.domain.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaordRepository extends JpaRepository<BoardEntity, Integer> {
                                            // < 엔티티명,ID 자료형( = pk 필드 자료형) >

}
