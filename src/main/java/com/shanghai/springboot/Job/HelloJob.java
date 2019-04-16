package com.shanghai.springboot.Job;

import com.shanghai.springboot.service.WebSocketService;
import com.shanghai.springboot.utils.BaseJob;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HelloJob implements BaseJob {
    private static  Logger log = LoggerFactory.getLogger(HelloJob.class);

    public HelloJob() {
    }

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        ConcurrentHashMap<String, WebSocketService> map = WebSocketService.getWebSocketMap();
        if (map.size() != 0) {
            for (Map.Entry<String, WebSocketService> entry : map.entrySet()) {
                WebSocketService webSocketServer = entry.getValue();
                try {
                    //向客户端推送消息
                    webSocketServer.getSession().getBasicRemote().sendText("每隔两秒,向客户端推送一次数据");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("WebSocket未连接");
        }

        log.info("job执行时间" + new Date());
    }

}
