package com.tpns;

import java.util.UUID;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endpoint")
public class TsController {

//	@PreAuthorize("#oauth2.hasScope('read')")
	@Secured("ROLE_AUTHOR")
	@RequestMapping(method = RequestMethod.GET, path = "/public")
	public String findPublished() {
		return UUID.randomUUID().toString();
	}

}