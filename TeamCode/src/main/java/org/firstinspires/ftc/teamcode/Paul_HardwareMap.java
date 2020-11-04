package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Paul_HardwareMap
{
    public DcMotor right = null;
    public DcMotor left = null;

    //declaram servo
    public Servo mana = null;

    HardwareMap Paul_HardwareMap = null;

    public void init(HardwareMap ahwMap)
    {
        Paul_HardwareMap = ahwMap;
        right = Paul_HardwareMap.get(DcMotor.class, "right");
        left = Paul_HardwareMap.get(DcMotor.class,   "left");

        mana = Paul_HardwareMap.get(Servo.class,  "mana");

        right.setDirection(DcMotor.Direction.FORWARD);
        left.setDirection(DcMotor.Direction.REVERSE);

        right.setPower(0);
        left.setPower(0);
        mana.setPosition(0.65);
    }

}
