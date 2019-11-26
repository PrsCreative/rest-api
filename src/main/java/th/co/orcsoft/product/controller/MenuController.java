package th.co.orcsoft.product.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import th.co.orcsoft.product.model.*;
import th.co.orcsoft.product.model.ProductReq;
import com.google.gson.Gson;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
@RequestMapping(path = "v1")
public class MenuController {

	@PostMapping(path = "product", consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ProductResp getProduct(@RequestBody ProductReq request) throws Throwable {
		ProductResp response = new ProductResp();
		response.setId("1200");
		response.setProductName("iPhone");
		response.setDesc("iPhone 11 Pro Max");
		response.setId(null);
		Gson gson = new Gson();
		//return gson.toJson(response);
		return response;
	}
}
