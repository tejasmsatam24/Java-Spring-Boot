package io.javabrains.springbootstarter.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicsService {
	
	@Autowired
	private TopicRepository topicRepository;
	private List<Topics> topics= new ArrayList<>(Arrays.asList(
			 new Topics("001","Java","Basic Concepts of Java."),
			 new Topics("002","Java Spring", "Basic Concepts of Java Spring."),
			 new Topics("003","Java Spring Boot","Basic Concepts of Java Spring Boot.")
			 ));
	
	public List<Topics> getAllTopics(){
		
		List<Topics> topics = new ArrayList<>();
		topicRepository.findAll()
		.forEach(topics::add);
		return topics;
	}
	
//	public <Topics> getTheTopic(String id) {
//		 topicRepository.findById(id);
//		
//	}
	
	public void addTopic(Topics topic) {
		topicRepository.save(topic);
	}
	
	public void updateTopic(String id, Topics topic) {
		topicRepository.save(topic);
			}
			
	public void deleteTopic(String id) {
		 topicRepository.deleteById(id);
	}

	}


