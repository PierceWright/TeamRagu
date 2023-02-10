package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.rev.Rev2mDistanceSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

public class DeviceMap {
    public DcMotor leftBack = null;
    public DcMotor rightBack = null;
    public DcMotor linearSlide = null;
    public Servo servoMotor = null;
    //public Servo leftClaw = null;
    //public DistanceSensor distanceSensor;

    HardwareMap hwMap = null;
    private ElapsedTime period = new ElapsedTime();

    public DeviceMap() {}

    public void init(HardwareMap hwMap)
    {
        leftBack = hwMap.get(DcMotor.class, "leftBack");
        rightBack = hwMap.get(DcMotor.class, "rightBack");
        linearSlide = hwMap.get(DcMotor.class, "linearSlide");
        leftBack.setDirection(DcMotor.Direction.FORWARD);
        rightBack.setDirection(DcMotor.Direction.REVERSE);
        linearSlide.setDirection(DcMotor.Direction.FORWARD);
        servoMotor = hwMap.get(Servo.class, "servoMotor");

        //Rev2mDistanceSensor sensorTOF = (Rev2mDistanceSensor) distanceSensor;
        leftBack.setPower(0);
        rightBack.setPower(0);
        linearSlide.setPower(0);

        leftBack.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightBack.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        linearSlide.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        //leftClaw = hwMap.get(Servo.class, "leftClaw");

    }


}