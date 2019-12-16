package testyfuse;


import io.swagger.annotations.Api;

@Api("/info")
public class AppInfoServiceImpl implements AppInfoSevice {
    public String version() {
        return "1.0-SNAPSHOT";
    }

    public String name() {
        return "Application name: testy-fuse-op-springboot-3";
    }
}


