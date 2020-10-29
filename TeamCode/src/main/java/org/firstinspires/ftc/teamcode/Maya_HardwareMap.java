package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Maya_HardwareMap {

    /** intreg a,b;  declarare motoare    */
     public DcMotor right = null;
     public DcMotor left = null;
  /** declarare servo */
     public Servo mana = null;

     HardwareMap Maya_HardwareMap = null;

     public void init(HardwareMap ahwMap)
     {
         Maya_HardwareMap = ahwMap;
         right = Maya_HardwareMap.get(DcMotor.class, "right");
         left = Maya_HardwareMap.get(DcMotor.class, "left");

         mana = Maya_HardwareMap.get(Servo.class, "mana");

         right.setDirection(DcMotor.Direction.FORWARD);
         left.setDirection(DcMotor.Direction.REVERSE);

         right.getPower(0);
         left.getPower(0);

         mana.getPosition(0.56);
     }

}
