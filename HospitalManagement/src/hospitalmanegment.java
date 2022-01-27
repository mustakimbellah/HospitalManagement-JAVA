import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class hospitalmanegment {

	 public static void data_write() {
	        try {
	            File f = new File("D:\\hospitalmanagement.txt");
	            if (f.createNewFile()) {
	                System.out.println("File created Successfully...");
	            } else {
	                System.out.println("File Did not able to create...");
	            }
	        } catch (IOException ex) {
	            System.out.println("Something went wrong to create the file: ");
	            ex.printStackTrace();
	        }

	        try {
	            File f = new File("D:\\hospitalmanagement.txt");
	            FileWriter fw = new FileWriter(f, true);
	            BufferedWriter bw = new BufferedWriter(fw);
	            PrintWriter pw = new PrintWriter(bw);

	            String input;

	            Scanner s = new Scanner(System.in);

	            System.out.println("Enter Patient ID: ");
	            input = s.nextLine();
	            pw.println(input);

	            System.out.println("Enter Patient Name: ");
	            input = s.nextLine();
	            pw.println(input);

	            System.out.println("Enter Patient NID Number : ");
	            input = s.nextLine();
	            pw.println(input);

	            System.out.println("Enter Patient Gender: ");
	            input = s.nextLine();
	            pw.println(input);

	            System.out.println("Enter Patient Blood Group: ");
	            input = s.nextLine();
	            pw.println(input);

	            System.out.println("Enter Patient Disease: ");
	            input = s.nextLine();
	            pw.println(input);

	            System.out.println("Enter Patient Admit Date: ");
	            input = s.nextLine();
	            pw.println(input);

	            System.out.println("Enter Patient Room Number: ");
	            input = s.nextLine();
	            pw.println(input);

	            System.out.println("Enter Doctor Name: ");
	            input = s.nextLine();
	            pw.println(input);

	            System.out.println("Emergency Contact : ");
	            input = s.nextLine();
	            pw.println(input);

	            System.out.println("Enter Patient discharge Date : ");
	            input = s.nextLine();
	            pw.println(input);

	            pw.close();
	            bw.close();
	            fw.close();

	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }

	    }

	    public static void data_read() {
	        String pn, pg, pbg, pd, dn, ad, pdd;
	        int pid, nid, rn, ec;

	        try {
	            File f = new File("D:\\hospitalmanagement.txt");
	            Scanner s = new Scanner(f);

	            while (s.hasNextLine()) {
	                pid = Integer.parseInt(s.nextLine());
	                pn = s.nextLine();
	                nid = Integer.parseInt(s.nextLine());
	                pg = s.nextLine();
	                pbg = s.nextLine();
	                pd = s.nextLine();
	                ad = s.nextLine();
	                rn = Integer.parseInt(s.nextLine());
	                dn = s.nextLine();
	                ec = Integer.parseInt(s.nextLine());
	                pdd = s.nextLine();

	                System.out.println("Enter Patient ID: " + pid
	                        + " Enter Patient Name: " + pn
	                        + " Enter Patient NID Number : " + nid
	                        + " Enter Patient Gender:  " + pg
	                        + " Enter Patient Blood Group:  " + pbg
	                        + " Enter Patient Disease:   " + pd
	                        + " Enter Patient Admit Date:  " + ad
	                        + " Enter Patient Room Number:  " + rn
	                        + " Enter Doctor Name:  " + dn
	                        + " Emergency Contact :  " + ec
	                        + " Enter Patient discharge Date :  " + pdd
	                        + " \n");

	            }

	            s.close();

	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	    }

	    public static void data_update() {
	        String pn, pg, pbg, pd, dn, ad, pdd, pid, nid, rn, ec, patient_id, patient_disease, patient_discharge;

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter Patient ID, Enter Patient Disease and Enter Patient discharge Date: ");
	        patient_id = sc.nextLine();
	        patient_disease = sc.nextLine();
	        patient_discharge = sc.nextLine();

	        try {
	            File f = new File("D:\\hospitalmanagement.txt");
	            Scanner s = new Scanner(f);

	            StringBuffer sb = new StringBuffer();
	            while (s.hasNextLine()) {
	                pn = s.nextLine();
	                pg = s.nextLine();
	                pbg = s.nextLine();
	                pd = s.nextLine();
	                dn = s.nextLine();
	                ad = s.nextLine();
	                pdd = s.nextLine();
	                pid = s.nextLine();
	                nid = s.nextLine();
	                rn = s.nextLine();
	                ec = s.nextLine();

	                if (patient_id.equalsIgnoreCase(pn)) {
	                    pd = patient_disease;
	                    pdd = patient_discharge;

	                }

	                sb.append(pn + "\n");
	                sb.append(pg + "\n");
	                sb.append(pbg + "\n");
	                sb.append(pd + "\n");
	                sb.append(dn + "\n");
	                sb.append(ad + "\n");
	                sb.append(pdd + "\n");
	                sb.append(pid + "\n");
	                sb.append(nid + "\n");
	                sb.append(rn + "\n");
	                sb.append(ec + "\n");
	            }

	            String all_hospital_details = sb.toString();
	            s.close();

	            FileWriter fw = new FileWriter("D:\\hospitalmanagement.txt");

	            fw.append(all_hospital_details);

	            fw.close();
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }

	    }

	    public static void data_delete() {
	        String pn, pg, pbg, pd, dn, ad, pdd, pid, nid, rn, ec, patient_id, patient_disease, patient_discharge;

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter Patiend Details for delete: ");
	        patient_id = sc.nextLine();

	        try {
	            File f = new File("D:\\hospitalmanagement.txt");
	            Scanner s = new Scanner(f);

	            StringBuffer sb = new StringBuffer();
	            while (s.hasNextLine()) {
	                pn = s.nextLine();
	                pg = s.nextLine();
	                pbg = s.nextLine();
	                pd = s.nextLine();
	                dn = s.nextLine();
	                ad = s.nextLine();
	                pdd = s.nextLine();
	                pid = s.nextLine();
	                nid = s.nextLine();
	                rn = s.nextLine();
	                ec = s.nextLine();

	                if (patient_id.equalsIgnoreCase(pn)) {
	                    continue;
	                }

	                sb.append(pn + "\n");
	                sb.append(pg + "\n");
	                sb.append(pbg + "\n");
	                sb.append(pd + "\n");
	                sb.append(dn + "\n");
	                sb.append(ad + "\n");
	                sb.append(pdd + "\n");
	                sb.append(pid + "\n");
	                sb.append(nid + "\n");
	                sb.append(rn + "\n");
	                sb.append(ec + "\n");
	            }

	            String all_hospital_details = sb.toString();
	            s.close();

	            FileWriter fw = new FileWriter("D:\\hospitalmanagement.txt");

	            fw.append(all_hospital_details);

	            fw.close();
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }

	    }

	    public static void main(String[] args) {

	        data_write();
	        data_read();

	        data_update();
	        data_delete();
	    }
}
