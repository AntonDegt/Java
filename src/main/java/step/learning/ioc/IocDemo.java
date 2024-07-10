package step.learning.ioc;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import step.learning.services.hash.HashService;
import step.learning.services.rnd.CodeGenerator;

public class IocDemo {
    @Inject @Named("hash-128")
    private HashService hashServiceField;


    private final HashService hashService;
    private final CodeGenerator codeGenerator;

    @Inject
    public IocDemo(@Named("hash-160") HashService hashService,
                   CodeGenerator codeGenerator) {
        this.hashService = hashService;
        this.codeGenerator = codeGenerator;
    }

    public void run() {
        System.out.println("Inversion of Control");
        //System.out.println(hashService.hash("123"));
        //System.out.println(hashServiceField.hash("123"));


        System.out.println(codeGenerator.newCode(20));
    }
}
