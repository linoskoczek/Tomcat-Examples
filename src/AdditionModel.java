public class AdditionModel implements Model {

    int num1, num2, result;

    AdditionModel(int num1, int num2, int result) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
    }

    @Override
    public int getResult() {
        return result;
    }
}
