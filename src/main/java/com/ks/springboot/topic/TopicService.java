package com.ks.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepo topicRepo;
	
	private List<Topic> topics = new ArrayList<>();
	
	public List<Topic> getAllTopics() {
		 
		List<Topic> topics = new ArrayList<>();
		topicRepo.findAll()
		.forEach(topics::add);
		return topics;
	}

	public Topic getTopic(String id) {
		return topicRepo.findOne(id);
	}

	public void addTopic(Topic topic) {
		topicRepo.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		topicRepo.save(topic);
	}

	public void deleteTopic(String id) {
		topicRepo.deleteAll();
		}
		
}
