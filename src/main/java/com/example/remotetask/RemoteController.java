package com.example.remotetask;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <h3>remotetask</h3>
 * <p></p>
 *
 * @author : Kinser Lin
 * @date : 2020-09-01 11:51
 **/
@RestController("/")
public class RemoteController {

    @PostMapping("/exec")
    public void exec(@RequestParam("cmd") String cmd) throws Exception{
        ShellParam param = new ShellParam();
        param.setIp("122.112.200.37");
        param.setUserName("xxxx");
        param.setPassword("xxxx");
        RmtShellExecutor executor=new RmtShellExecutor(param);
        // python ~/remotetask.py
        System.out.println(executor.exec(cmd));
    }
}
