package jenembed.com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bike")
public class BikeController 
{
	@Autowired
	BikeOperate crud;
	@GetMapping("/list")
	public ModelAndView listAll()
	{
		List<Bikes> res=new ArrayList<Bikes>();
		crud.findAll().forEach(res::add);
		return new ModelAndView("listBikes").addObject("all", res);
	}
}
