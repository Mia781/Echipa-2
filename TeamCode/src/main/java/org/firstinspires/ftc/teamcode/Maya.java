package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Maya {


    public DcMotor right1 = null;
    public DcMotor right2 = null;
    public DcMotor left1 = null;
    public DcMotor left2 = null;
    public Servo mana1 = null;
    public Servo mana2 = null;
    public Servo mana3 = null;

    HardwareMap Maya = null;
    public void init(HardwareMap ahwMap)
        {
            Maya = ahwMap;

            right1 = Maya.get(DcMotor.class, "right1");
            right2 = Maya.get(DcMotor.class, "right2");
            left1 = Maya.get(DcMotor.class, "left1");
            left2 = Maya.get(DcMotor.class, "left2");

            mana1 = Maya.get(Servo.class, "mana1");
            mana2 = Maya.get(Servo.class, "mana2");
            mana3 = Maya.get(Servo.class, "mana3");

            right1.setDirection(DcMotor.Direction.FORWARD);
            right2.setDirection(DcMotor.Direction.FORWARD);
            left1.setDirection(DcMotor.Direction.REVERSE);
            left2.setDirection(DcMotor.Direction.REVERSE);

            right1.setPower(0);
            right2.setPower(0);
            left1.setPower(0);
            left2.setPower(0);

            mana1.setPosition(0.64);
            mana2.setPosition((0.64);
            mana3.setPosition(0.64);

        }
}
