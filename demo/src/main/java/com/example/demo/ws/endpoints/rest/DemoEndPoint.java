package com.example.demo.ws.endpoints.rest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.InvService;
import com.example.demo.ws.obj.Inventory;

@RestController
public class DemoEndPoint {
	private InvService invService;

	public DemoEndPoint(InvService invService) {
		this.invService = invService;
	}

	@RequestMapping("/getInvPicture")
	public DemoEndPoint getQuote() {
		return this.invService.getQuote();
	}

	@RequestMapping(value="/quote", method=RequestMethod.POST)
	public void addQuote(@RequestBody DemoEndPoint quote) {
		this.invService.addQuote(quote);
	}
}
