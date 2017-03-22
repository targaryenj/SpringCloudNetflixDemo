package com.erongdu.modules.image;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/image")
public class ImageController {
	
	@Autowired
	private ImageRepository imageRepository;
	
	@GetMapping(path="/all")
	@ResponseBody
	public Iterable<Image> getAllImage(){
		return imageRepository.findAll();
	}
	
	@GetMapping(path="/find")
	@ResponseBody
	public Image findImage(long id){
		return imageRepository.findOne(id);
	}
}
