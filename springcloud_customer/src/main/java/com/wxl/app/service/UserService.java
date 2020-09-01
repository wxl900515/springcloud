/**  
 * @Title:  UserService.java   
 * @Package com.wxl.app.service   
 * @Description:用一句话描述该文件做什么  
 * @author: 16460    
 * @date:   2020年9月1日 上午9:01:23   
 * @version V1.0 
 * @Copyright: 2020 www.tydic.com Inc. All rights reserved. 
 * -注意：本内容仅限于北京千锋互联科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
package com.wxl.app.service;

import com.wxl.app.entity.User;

/**   
 * @ClassName:UserService   
 * @Description:这里用一句话描述这个类的作用
 * @author 16460
 * @date:2020年9月1日 上午9:01:23   
 * -注意：本内容仅限于北京千锋互联科技有限公司内部传阅，禁止外泄以及用于其他的商业目 
 */
public interface UserService {

	/**   
	 * @Title: findByUserId   
	 * @Description:   
	 * @param: @param id
	 * @param: @return      
	 * @return: User      
	 * @throws   
	 */
	User findByUserId(Integer id);

}
