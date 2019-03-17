package com.xworkz.web.component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class BatteAngadiComponent {

	public BatteAngadiComponent() {
		System.out.println("created\t" + this.getClass().getSimpleName());
	}

	List<String> list = new ArrayList<String>();
	{
		list.add("lee");
		list.add("nike");
		list.add("armani");
		list.add("levice");
		list.add("wrangler");
	}

	List<String> list1 = new ArrayList<String>();

	@PostConstruct
	public void initList1() {
		list1.add("pant");
		list1.add("shirts");
		list1.add("jeans");
		list1.add("casual");
		list1.add("formals");
		list1.add("t-shirts");
	}

	@RequestMapping("/kharidi")
	public String onClickingKharidi(@RequestParam(value = "brand", required = true, defaultValue = "null") String brand,
			@RequestParam(value = "category", required = true, defaultValue = "null") String category,
			@RequestParam(name = "quantity", value = "quantity", defaultValue = "null", required = false) Integer quantity,
			@RequestParam(value = "size") String size, @RequestParam(value = "color") String color, ModelMap model) {
		try {
			if (brand == null || brand.isEmpty() || category == null || category.isEmpty()) {
				String message = "Please enter the brand and category";
				model.addAttribute("message1", message);
				return "ErrorPage.jsp";
			}

			if (!list.contains(brand)) {
				String message = "Available Brands are: lee,nike,armani,levice,wrangler. please select only these brands";
				model.addAttribute("message2", message);
				return "ErrorPage.jsp";
			}

			if (!list1.contains(category)) {
				String message = "Please give valid categories";
				model.addAttribute("message3", message);
				return "ErrorPage.jsp";
			}

			/*
			 * if (quantity != null) { System.out.println("Its not null"); } else { String
			 * message = "Quantity should be Greater than zero";
			 * model.addAttribute("message4", message); return "ErrorPage.jsp"; }
			 */

			if (quantity == null || quantity <= 0 ) {
				String message = "Quantity should be Greater than zero";
				model.addAttribute("message4", message);
				return "ErrorPage.jsp";
			}

			String message = "Your order is Success";
			model.addAttribute("message5", message);
			return "ErrorPage.jsp";

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@PreDestroy
	public void clear() {
		this.list1.clear();
	}
}
