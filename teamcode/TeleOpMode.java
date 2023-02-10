package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.DeviceMap;

@TeleOp(name="Pierce Code", group = "TeleOp")
public class TeleOpMode extends OpMode {
    DeviceMap robot = new DeviceMap();

    @Override
    public void init() {
        robot.init(hardwareMap);

        telemetry.addData("Say, ", "Pierce Initialized");
        telemetry.update();
    }
    @Override
    public void init_loop(){

    }

    @Override
    public void start(){

    }

    @Override
    public void loop(){
        double left = gamepad1.left_stick_y;
        double right = gamepad1.right_stick_y;

        robot.leftBack.setPower(left);
        robot.rightBack.setPower(right);

    }
}