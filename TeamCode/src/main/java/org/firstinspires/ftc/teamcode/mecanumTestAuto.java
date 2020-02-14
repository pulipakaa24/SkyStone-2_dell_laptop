package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;


@Autonomous(name="BlueDetection", group="Bernard")
//@Disabled??'
public class mecanumTestAuto extends MecanumDriving{
    public void runOpMode()
    {
        super.runOpMode();
        waitForStart();
        float moveAmount;

        robot.servoClaw.setPosition(0.5);
        robot.servoLatch.setPosition(.7);
        robot.servoTwist.setPower(1);
        sleep(500);
        robot.servoTwist.setPower(0);


        //mecanumEncoder(0.5, -5, -5, 5.5, "vertical");
//        mecanumEncoder(.5, -3, -3, 2, "vertical");


        moveAmount = skystoneDetection(1);
        sleep(20000);
//
//        mecanumTurn(1, 90, 5);
//        gyroDrive(90, "x", .5, .4);
//
//        sleep(500);
//        mecanumEncoder(.5, -35 + moveAmount, -35 + moveAmount, 5, "vertical");
//        sleep(500);
//
//        skyLift(.5, 3, 3);
//        sleep (500);
//        skyLift(.5, -3, 3);
//
//        mecanumEncoder(.7, 11, 11, 3, "vertical");
//
//
//        telemetry.addData("Running", "Past the drive");
//        telemetry.update();

    }
}