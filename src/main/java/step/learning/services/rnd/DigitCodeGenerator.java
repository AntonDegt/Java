package step.learning.services.rnd;
import com.google.errorprone.annotations.IncompatibleModifiers;
import com.google.inject.Inject;

import java.util.Random;


public class DigitCodeGenerator implements CodeGenerator{


    private final Random random;

    @Inject
    public DigitCodeGenerator(Random random) {
        this.random = random;
    }

    @Override
    public String newCode(int length) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++)
            stringBuilder.append(random.nextInt(10));
        return stringBuilder.toString();
    }
}
