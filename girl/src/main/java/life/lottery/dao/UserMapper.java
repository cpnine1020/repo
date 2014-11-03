package life.lottery.dao;

import life.lottery.model.User;

public interface UserMapper {
	
	User selectByEmail(String email);
	
	/*------------------------------*/
	
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}