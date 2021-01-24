import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.io.File;

public class MysqlGenerate {
    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();

        GlobalConfig gc = new GlobalConfig();
        File file = new File("" );
        String projectPath = file.getAbsolutePath();
        gc.setOutputDir(projectPath + "/src/main/java" );
        gc.setAuthor("yaoding" );   // 作者
        gc.setOpen(false);      //生成代码后是否打开文件夹
        gc.setServiceName("%sService" );  // 设置Service接口生成名称,这样生成接口前面就不会有 I
        gc.setMapperName("%sMapper" );  // 设置Service接口生成名称,这样生成接口前面就不会有 I
        gc.setServiceImplName("%sServiceImpl" );  // 设置Service接口生成名称,这样生成接口前面就不会有 I
        gc.setControllerName("%sController" );  // 设置Service接口生成名称,这样生成接口前面就不会有 I
        mpg.setGlobalConfig(gc);

        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/user?serverTimezone=GMT&allowPublicKeyRetrieval=true&useSSL=false&characterEncoding=utf8" );
        dsc.setDriverName("com.mysql.cj.jdbc.Driver" );
        dsc.setUsername("root" );
        dsc.setPassword("123" );
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName("dockerdemo" ); // 模块名称, 这里可以根据不同模块来写
        pc.setParent("com" ); // 父包名
        pc.setEntity("entity");
        pc.setMapper("mapper");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        mpg.setPackageInfo(pc);


        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);
        strategy.setInclude("user" );  // 如果要生成多个,这里可以传入String[]
        mpg.setStrategy(strategy);
        mpg.execute();
    }
}
