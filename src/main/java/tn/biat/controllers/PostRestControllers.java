package tn.biat.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.biat.domain.Post;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class PostRestControllers {

	private static Map<Integer, Post> data;
	
	static {
		data = new HashMap<>();
		data.put(1, new Post(1, "RestExample1", "BodyExample1"));
		data.put(2, new Post(2, "RestExample2", "BodyExample2"));
		data.put(3, new Post(3, "RestExample3", "BodyExample3"));
	}
	
	// Ou bien on peut faire 
	// @RequestMapping(value="/api/posts",method=RequestMethod.GET)
	@GetMapping(path="/api/posts")
	public List<Post> getProduits() {
//		return (List<Post>) data.values();
		List<Post> al = new ArrayList<Post>(data.values());

	return al;
	}
}
