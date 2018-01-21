import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class write_to_file {
    File mat = new File("C:\\Users\\anish\\Desktop\\Questions\\q_maths.txt");
    File phy = new File("C:\\Users\\anish\\Desktop\\Questions\\q_physics.txt");
    File chem = new File("C:\\Users\\anish\\Desktop\\Questions\\q_chemistry.txt");
    int i,j,k;
    private Formatter xmat;
    private Formatter xphy;
    private Formatter xchem;
    write_to_file(){
        try{
            xmat = new Formatter(mat);
            i = 0;
            for(Question temp:sub.Maths){
                if(temp.type == 1){
                    xmat.format("%s\n%s\n%s\n%s\n%s\n%s\n%s\n",temp.type,temp.query,temp.option1,temp.option2,temp.option3,temp.option4,temp.ans);
                }

                else if(temp.type==2){
                    xmat.format("%s\n%s\n%s\n",temp.type,temp.query,temp.ans);
                }
                else if(temp.type ==3){
                    xmat.format("%s\n%s\n%s\n",temp.type,temp.query,temp.ans);
                }
                i++;
            }
            xmat.close();
        }
        catch(Exception e){
            System.out.println("could not find maths file");
        }
        try{
            xphy = new Formatter(phy);
            for(Question temp:sub.Physics){
                if(temp.type == 1){
                    xphy.format("%s\n%s\n%s\n%s\n%s\n%s\n%s\n",temp.type,temp.query,temp.option1,temp.option2,temp.option3,temp.option4,temp.ans);
                }
                else if(temp.type==2){
                    xphy.format("%s\n%s\n%s\n",temp.type,temp.query,temp.ans);
                }
                else if(temp.type ==3){
                    xphy.format("%s\n%s\n%s\n",temp.type,temp.query,temp.ans);
                }

            }
            xphy.close();
        }
        catch(Exception e){
            System.out.println("could not find physics file");
        }
        try{
            xchem = new Formatter(chem);
            for(Question temp:sub.Chemistry){
                if(temp.type == 1){
                    xchem.format("%s\n%s\n%s\n%s\n%s\n%s\n%s\n",temp.type,temp.query,temp.option1,temp.option2,temp.option3,temp.option4,temp.ans);
                }
                else if(temp.type==2){
                    xchem.format("%s\n%s\n%s\n",temp.type,temp.query,temp.ans);
                }
                else if(temp.type ==3){
                    xchem.format("%s\n%s\n%s\n",temp.type,temp.query,temp.ans);
                }
            }
            xchem.close();
        }
        catch(Exception e){
            System.out.println("could not find chemistry file");
        }
    }

}
