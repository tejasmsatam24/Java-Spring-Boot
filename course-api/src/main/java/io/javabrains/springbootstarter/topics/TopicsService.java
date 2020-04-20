package io.javabrains.springbootstarter.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicsService {
	
	private List<Topics> topics= new ArrayList<>(Arrays.asList(
			 new Topics("001","Java","Basic Concepts of Java."),
			 new Topics("002","Java Spring", "Basic Concepts of Java Spring."),
			 new Topics("003","Java Spring Boot","Basic Concepts of Java Spring Boot.")
			 ));
	
	public List<Topics> getAllTopics(){
		return topics;
	}
	
	public Topics getTheTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topics topic) {
		topics.add(topic);
	}
	
	public void updateTopic(String id, Topics topic) {
		for(int i=0;i<topics.size();i++) {
			Topics t = topics.get(i);
			if(t.getId()==id) {
				topics.set(i, topic);
				return;
			}
			
		}
	}

}
