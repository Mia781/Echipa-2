package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;




@TeleOp(name = "Tutorial", group = "Tutorials")
public class Tutorial extends OpMode {
    DcMotor Motor1;
    DcMotor Motor2;
    DcMotor Misc;

    Servo Servo1;
    public void loop(){
         Motor1.setPower(gamepad1.left_stick_y);
         Motor2.setPower(-gamepad1.right_stick_y);

        if(gamepad1.a) {
            Servo1.setPosition(0.65);
        } else {
            Servo1.setPosition(0.002);
        }
        if(gamepad1.b) {
            Misc.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            Misc.setTargetPosition(100);
            Misc.setPower(1);
        } else {
            telemetry.addData("B is not", "Presssed.");
        }
        telemetry.update();
    }

    public void init(){
         Motor1 = hardwareMap.dcMotor.get("m1");
         Motor2 = hardwareMap.dcMotor.get("m2");
         Servo1 = hardwareMap.servo.get("s1");
    }
}
