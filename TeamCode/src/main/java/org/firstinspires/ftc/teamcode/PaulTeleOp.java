package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
@TeleOp(name = "PaulTeleOp" , group = "Iterative OpMode")
//@Disabled
public class PaulTeleOp extends OpMode {
        Paul_HardwareMap Robot1 = new Paul_HardwareMap();
    @Override
    public void init() {

        Robot1.init(hardwareMap);
    }
    @Override
    public void loop () {
        double powerleft = gamepad1.left_stick_y;
        double powerright = gamepad1.right_stick_y;

        Robot1.left.setPower(powerleft);
        Robot1.right.setPower (powerright);

        if( gamepad1.a == true )
        {
            Robot1.mana.setPosition(1);
        }
        if ( gamepad1.b == true ) {
            Robot1.mana.setPosition(0);
        }
    }

        @Override
     public void stop(){
            Robot1.left.setPower(0);
            Robot1.right.setPower(0);
        }
}
