import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Random;

public class Generate_Quiz {
    int i;
    boolean condition;
    Random num_random = new Random();
    ArrayList<Integer> counter = new ArrayList<Integer>();
    JTextArea paper = new JTextArea();
    BufferedReader br ;
    private Formatter xmat;
    private Formatter xans;
    Generate_Quiz(int num,int total){
        i = 0;

        while (i<=num-1){
            int g = num_random.nextInt(total);
            if(!(counter.contains(g))){
                counter.add(g);
                i++;
            }
        }
        if(sub.subjectdata == 1){
            try{
                xmat = new Formatter("C:\\Users\\anish\\Desktop\\Questions\\takequestions_"+Integer.toString(sub.filecounter)+".txt");
                xans = new Formatter("C:\\Users\\anish\\Desktop\\Questions\\takeanswer_"+Integer.toString(sub.filecounter)+".txt");
                i = 0;
                for(int variable1:counter){
                    Question temp = sub.Maths.get(variable1);
                    if(temp.type == 1){
                       xans.format("\nAnswer for q%s\n%s\n",Integer.toString(i+1),temp.ans);
                        xmat.format("\n%s\n%s%s\n%s\n%s: %s\n%s: %s\n%s: %s\n%s: %s\n","MCQ","Question",Integer.toString(i+1),temp.query,"option1",temp.option1,"option2",temp.option2,"option3",temp.option3,"option4",temp.option4);
                    }

                    else if(temp.type==2){
                        xans.format("\nAnswer for q%s\n%s\n",Integer.toString(i+1),temp.ans);
                        xmat.format("\n%s\nQuestion%s\n%s\noption1:True\noption2:False\n","True or False",Integer.toString(i+1),temp.query);
                    }
                    else if(temp.type ==3){
                        xans.format("\nAnswer for q%s\n%s\n",Integer.toString(i+1),temp.ans);
                        xmat.format("\n%s\nQuestion%s\n%s\n____________\n","Blank Type",Integer.toString(i+1),temp.query);
                    }
                    i++;
                }
                xans.close();
                xmat.close();
            }
            catch(Exception e){
                System.out.println("could not find maths file");
            }
        }
        if(sub.subjectdata == 2){
            try{
                i =0;
                xans = new Formatter("C:\\Users\\anish\\Desktop\\Questions\\takeanswer_"+Integer.toString(sub.filecounter)+".txt");
                xmat = new Formatter("C:\\Users\\anish\\Desktop\\Questions\\takequestions_"+Integer.toString(sub.filecounter)+".txt");
                for(int variable2:counter){
                    Question temp = sub.Physics.get(variable2);
                    if(temp.type == 1){
                        xans.format("\nAnswer for q%s\n%s\n",Integer.toString(i+1),temp.ans);
                        xmat.format("\n%s\n%s%s\n%s\n%s: %s\n%s: %s\n%s: %s\n%s: %s\n","MCQ","Question",Integer.toString(i+1),temp.query,"option1",temp.option1,"option2",temp.option2,"option3",temp.option3,"option4",temp.option4);
                    }
                    else if(temp.type==2){
                        xans.format("\nAnswer for q%s\n%s\n",Integer.toString(i+1),temp.ans);
                        xmat.format("\n%s\nQuestion%s\n%s\noption1:True\noption2:False\n","True or False",Integer.toString(i+1),temp.query);
                    }
                    else if(temp.type ==3){
                        xans.format("\nAnswer for q%s\n%s\n",Integer.toString(i+1),temp.ans);
                        xmat.format("\n%s\nQuestion%s\n%s\n____________\n","Blank Type",Integer.toString(i+1),temp.query);
                    }
                    i++;
                }
                xans.close();
                xmat.close();
            }
            catch(Exception e){
                System.out.println("could not find physics file");
            }
        }
        if(sub.subjectdata == 3){
            try{
                i =0;
                xans = new Formatter("C:\\Users\\anish\\Desktop\\Questions\\takeanswer_"+Integer.toString(sub.filecounter)+".txt");
                xmat = new Formatter("C:\\Users\\anish\\Desktop\\Questions\\takequestions_"+Integer.toString(sub.filecounter)+".txt");
                for(int variable3:counter){
                    Question temp = sub.Chemistry.get(variable3);
                    if(temp.type == 1){
                        xans.format("\nAnswer for q%s\n%s\n",Integer.toString(i+1),temp.ans);
                        xmat.format("\n%s\n%s%s\n%s\n%s: %s\n%s: %s\n%s: %s\n%s: %s\n","MCQ","Question",Integer.toString(i+1),temp.query,"option1",temp.option1,"option2",temp.option2,"option3",temp.option3,"option4",temp.option4);
                    }
                    else if(temp.type==2){
                        xans.format("\nAnswer for q%s\n%s\n",Integer.toString(i+1),temp.ans);
                        xmat.format("\n%s\nQuestion%s\n%s\noption1:True\noption2:False\n","True or False",Integer.toString(i+1),temp.query);
                    }
                    else if(temp.type ==3){
                        xans.format("\nAnswer for q%s\n%s\n",Integer.toString(i+1),temp.ans);
                        xmat.format("\n%s\nQuestion%s\n%s\n____________\n","Blank Type",Integer.toString(i+1),temp.query);
                    }
                    i++;
                }
                xans.close();
                xmat.close();
            }
            catch(Exception e){
                System.out.println("could not find chemistry file");
            }
        }

    }


}
