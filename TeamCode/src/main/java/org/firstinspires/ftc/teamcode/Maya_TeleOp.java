package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Maya_TeleOp", group= "Iterative Opmode")
//@Disabled
public class Maya_TeleOp extends OpMode {
    Maya_HardwareMap Robot4 = new Maya_HardwareMap();

    @Override
    public void init()
    {
        Robot4.init(hardwareMap);
    }
    @Override
    public void loop()
    {
        double power1 = gamepad1.left_stick_y;
        double power2 = gamepad1.right_stick_y;

        Robot4.left.setPower(power1);
        Robot4.right.setPower(power2);

        if(  gamepad1.a==true)
        {
            Robot4.mana.setPosition(1);
        }
        if(gamepad1.b==true)
        {
            Robot4.mana.setPosition(0);
        }

    }
    @Override
    public void stop()
    {
        Robot4.left.setPower(0);
        Robot4.right.setPower(0);
    }
}
