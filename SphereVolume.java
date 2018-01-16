
/**
 * โปรแกรมคำนวณปริมาตรรูปทรงกลม 
 */
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class SphereVolume
{
    // instance variables - replace the example below with your own
    private Sphere sphere;

    public static void main(String[] agrs){
        SphereVolume sphereVolume = new SphereVolume();
        sphereVolume.start();
    } // End main

    /**
     * Constructor for objects of class SphereVolume
     */
    public SphereVolume()
    {
        // initialise instance variables
        sphere = new Sphere();
    } // End constructor

    /**
     * ควบคุมการทำงานทั้งหมด โดยเรียกใช้เมท็อด private
     */
    public void start()
    {
        describeProgram();
        getInput();
        displayOutput();
    } // End start

    private void describeProgram()
    {
        //       System.out.println("เมท็อด describeProgram");
        System.out.println("โปรแกรมนี้คำนวณหาปริมาตรทรงกลมตามที่คุณป้อนเข้ามา");
    } // End describeProgram

    private void getInput()
    {
        //        System.out.println("เมท็อด getInput");
        double radius;
        String inputStr = "";
        inputStr = JOptionPane.showInputDialog(null, 
            "ค่ารัศมี");
        radius = Double.parseDouble(inputStr);

        sphere.setRadius(radius);

        //        System.out.println("รัศมี = " + sphere.getRadius());

    } // End getInput

    private void displayOutput()
    {
        //       System.out.println("เมท็อด displayOutput");
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("รัศมีรูปทรงกลม = " 
        + df.format(sphere.getRadius()));
        System.out.println("ปริมาตรเท่ากับ = " 
        + df.format(sphere.getVolume()));

    } // End displayOutput
} // End class
