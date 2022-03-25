package ifce.edu.br;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;

public class BeanUtilities {
	public static void populateBean(Object formBean, HttpServletRequest request) {
		populateBean(formBean,request.getParameterMap());
	}
	public static void populateBean(Object Bean, Map propertyMap) {
		try {
			BeanUtils.populate(Bean,propertyMap);
			}catch(Exception e) {
				
			}
	}
}
