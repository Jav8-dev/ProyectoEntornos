import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.MathService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathServiceTest {
    private MathService mathService;

    @BeforeEach
    void setUp(){
        mathService =new MathService();
    }
    @Test
    public void TestSuma(){
        int a = 5;
        int b = 4;
        int result = this.mathService.sumar(a,b);
    }
}
//@author Jav8-dev|@version 1.0.