package com.example.multiplication;

import java.util.Random;

public class Model
{
    private int num1;
    private int num2;
    public Model()
    {
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    //two numbers each one digits
    public void setLeftBtn()
    {
        Random rand = new Random();
        this.num1 = rand.nextInt(10);
        this.num2 = rand.nextInt(10);

    }

    //two numbers first-one digit second two digits 20 max value
    public void setMiddleBtn()
    {
        Random rand = new Random();
        this.num1 = rand.nextInt(10);
        this.num2 = rand.nextInt(11)+10;

    }
    //two numbers first-one digit second two digits
    public void setRightBtn()
    {
        Random rand = new Random();
        this.num1 = rand.nextInt(10);
        this.num2 = rand.nextInt(90)+10;
    }
    //check answer
    public boolean isAnswerCorrect(int answer)
    {
        return (this.num1*this.num2)==answer;
    }
}
