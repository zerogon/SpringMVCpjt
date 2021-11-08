package dao;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.UserVO;
@Repository
public class UserDAO {
	private static final String namespace = "user";

	@Autowired
	private SqlSession sqlSession;
	
	public UserVO selectUserInfo(String email) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("email", email);
		UserVO userVO=sqlSession.selectOne(namespace + ".selectUserInfo", map);
		return userVO;
	}
	
}
