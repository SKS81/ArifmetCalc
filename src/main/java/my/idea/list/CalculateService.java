package my.idea.list;

public class CalculateService {

    public float get1Plus(float a, float b) {
        float rez1 = a + b;
        return rez1;
    }

    public float get2Minus(float c, float d) {
        float rez2 = c - d;
        return rez2;
    }

    public float get3Multiplication(float i, float f) {
        float rez3 = i * f;
        return rez3;
    }

    public float get4Division(float g, float h) {
        float rez4 = g / h;
        return rez4;
    }

    public float get5Sqrt(float j) {
        float rez5 = 0;
        for (float z = 1; z <= j; z++)
            if ((z * z) >= j) {
                rez5 = z;
                break;
            }
        return rez5;
    }

    public float get6Degree(float k, float l) {
        float rez6 = (float) Math.pow(k, l);
        return rez6;
    }

}