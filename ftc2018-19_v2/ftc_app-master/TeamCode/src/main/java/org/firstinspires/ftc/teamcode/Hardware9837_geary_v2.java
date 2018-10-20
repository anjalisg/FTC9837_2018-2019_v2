package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created by Anjali on 10/19/2018.
 */

class Hardware9837_geary_v2 {
    public DcMotor rightMotor = null;
    public DcMotor leftMotor = null;
    public ColorSensor colorSensor = null;


    HardwareMap hwMap = null;
    private ElapsedTime period  = new ElapsedTime();

    public Hardware9837_geary_v2(){

    }

    public void init(HardwareMap hardwareMap){
        //set direction of motors facing opposite directions

        rightMotor.setDirection(DcMotor.Direction.FORWARD);
        leftMotor.setDirection(DcMotor.Direction.FORWARD);

//        colorSensor = hwMap.colorSensor.get("color sensor");

        //set pwr to 0

        rightMotor.setPower(0.0);
        leftMotor.setPower(0.0);

    }
}
