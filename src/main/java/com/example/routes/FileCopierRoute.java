/**
 * 
 */
package com.example.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * Simple file-copying route
 * 
 * @author tom
 *
 */
@Component
public class FileCopierRoute extends RouteBuilder {

	/* (non-Javadoc)
	 * @see org.apache.camel.builder.RouteBuilder#configure()
	 */
	@Override
	public void configure() throws Exception {
		from("file:C:\\Temp\\camelsource?fileName=camelsource.txt&noop=true").routeId("filecopy").to("file:C:\\Temp\\cameltarget").end();
	}

}
