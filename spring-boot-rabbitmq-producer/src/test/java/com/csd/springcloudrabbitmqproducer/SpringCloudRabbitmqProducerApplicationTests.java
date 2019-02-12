package com.csd.springcloudrabbitmqproducer;

import com.csd.queue.send.MessageSend;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


//添加注释11113334445555666777
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringCloudRabbitmqProducerApplicationTests {

	@Autowired
	MessageSend messageSend;

	@Test
	public void contextLoads() {
		while(true) {
			messageSend.sendMessage();
		}
	}

	@Test
	public void testSendTopicMessage(){
		messageSend.sendTopicMessage("topic.message");

		messageSend.sendTopicMessage("topic.messagessss");
	}

	@Test
	public void testSendFanoutMessage(){
		messageSend.sendFanoutMessage();
	}
}
