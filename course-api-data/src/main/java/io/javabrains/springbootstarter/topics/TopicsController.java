package io.javabrains.springbootstarter.topics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {

@Autowired
private TopicsService topicsService;

@RequestMapping("/topics")
 public List<Topics> getAllTopics() {
	 return topicsService.getAllTopics();
 }

//get APIs
//@RequestMapping("/topics/{id}")
////public Topics getTheTopic(@PathVariable("id") String id) {
////	//return topicsService.getTheTopic(id);
////	
////}

//post API's 
@RequestMapping(method=RequestMethod.POST, value = "/topics")
public void addPost(@RequestBody Topics topic) {
	topicsService.addTopic(topic);
	}

//put API(Update the stuff
@RequestMapping(method=RequestMethod.PUT, value = "/topics/{id}")
public void updatePost(@RequestBody Topics topic, @PathVariable("id") String id){
	topicsService.updateTopic(id, topic);
}


}

