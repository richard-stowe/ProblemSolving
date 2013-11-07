import spock.lang.Specification
import spock.lang.Unroll

class FibonacciCalculatorSpec extends Specification {

    def subject = new FibonacciCalculator()

    @Unroll
    def "Find the Nth term in the Fibonacci sequence"() {

        when:
        def result = subject.getNthTerm(n)

        then:
        result == expectedResult

        where:
        n    | expectedResult
        0    | 0
        1    | 1
        10   | 55
        99   | 218922995834555169026
        1000 | 43466557686937456435688527675040625802564660517371780402481729089536555417949051890403879840079255169295922593080322634775209689623239873322471161642996440906533187938298969649928516003704476137795166849228875

    }

}
