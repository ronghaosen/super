package cn.rong.superLottery.utils;

import java.util.Locale;
import java.util.ResourceBundle;

import org.apache.commons.lang.StringUtils;

/**
 * <p>Title:ConfigUtils</p>
 * <p>Description: 加载配置文件中的配置属性	</P>
 * <p>Company:www.sumpay.cn</p>		
 * @author ronghaosen
 *
 * @date 2016年8月26日 上午10:47:46
 */
public class ConfigUtils {

	private static ResourceBundle resourceBundle = ResourceBundle.getBundle("application", Locale.getDefault());
	
	public static String getProperty(String name){
		
		if(StringUtils.isBlank(name)){
			throw new RuntimeException("获取属性的名称为空");
		}
		
		return resourceBundle.getString(StringUtils.trim(name));
		
	}
	
}
