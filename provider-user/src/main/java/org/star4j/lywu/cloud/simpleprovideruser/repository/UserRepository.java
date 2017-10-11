package org.star4j.lywu.cloud.simpleprovideruser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.star4j.lywu.cloud.simpleprovideruser.entity.User;

/**
 * @Author: WuYL
 * @Description:
 * @Date: Create in 2017/10/10 10:02
 * @Modified By:
 */
public interface UserRepository extends JpaRepository<User, Long>{
}
