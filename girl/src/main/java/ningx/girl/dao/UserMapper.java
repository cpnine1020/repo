package ningx.girl.dao;

import ningx.girl.model.User;

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