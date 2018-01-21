import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.*;
import java.util.*;
import java.util.List;
class Question{
    public String ans,option1,option2,option3,option4,query;
    public int type;
}
class sub extends JFrame {
    JTextArea paper = new JTextArea();
    JTextArea paper2 = new JTextArea();
    BufferedReader br ,ar;
    JComboBox question_chooser;
    private int numtemp,number_of_questions;
    Question viewer1 = new Question();
    Question []questionlist1 = new Question[100];
    Question []questionlist2 = new Question[100];
    Question []questionlist3 = new Question[100];
    char[] correctPass = new char[] {'c', 'o', 'o', 'l', 'r', 'i','c','k'};
    private String cool_data;
    static public int realcount1,realcount2,realcount3;
    static public int subjectdata,val_count1,val_count2,val_count3,filecounter = 0;
    private JLabel header = new JLabel("Login_Page");
    private JLabel twarning = new JLabel("That question no does not exist");
    private JTextField text1 = new JTextField();
    private JTextField text2 = new JTextField();
    private JTextField text3 = new JTextField();
    private JTextField text4 = new JTextField();
    private JTextField text5 = new JTextField();
    private JTextField text6 = new JTextField();
    private JTextField text7 = new JTextField();
    private JTextField text8 = new JTextField();
    private JTextField text9 = new JTextField();
    private JTextField text10 = new JTextField();
    private JTextField text11 = new JTextField();
    private JTextField text12 = new JTextField();
    private JTextField numbertext = new JTextField();
    private JTextField answertext = new JTextField();
    private JPasswordField passcode = new JPasswordField();
    static public ArrayList <Question>Maths = new ArrayList<Question>(50);
    static public ArrayList <Question>Physics = new ArrayList<Question>(50);
    static public ArrayList <Question>Chemistry = new ArrayList<Question>(50);
    private Scanner xmat;
    private Scanner xphy;
    private Scanner xchem;
    File mat = new File("C:\\Users\\anish\\Desktop\\Questions\\q_maths.txt");
    File phy = new File("C:\\Users\\anish\\Desktop\\Questions\\q_physics.txt");
    File chem = new File("C:\\Users\\anish\\Desktop\\Questions\\q_chemistry.txt");
    sub(String s){

        val_count1 = 0;
        val_count2 = 0;
        val_count3 = 0;
        realcount1 = 0;
        realcount2 = 0;
        realcount3 = 0;
        if(mat.exists()){
            System.out.println(mat.getName()+" exists");
        }
        else{
            System.out.println(mat.getName()+" does not exist");
        }
        if(phy.exists()){
            System.out.println(phy.getName()+" exists");
        }
        else{
            System.out.println(phy.getName()+" does not exist");
        }
        if(chem.exists()){
            System.out.println(chem.getName()+" exists");
        }
        else{
            System.out.println(chem.getName()+" does not exist");
        }
        setTitle(s);
        setLayout(null);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                write_to_file writer = new write_to_file();

                System.exit(0);
            }
        });
    }
    public void readfile(){
        try{
            xmat = new Scanner(mat);
            writemaths();
        }
        catch(Exception e){
            System.out.println("could not find maths file");
        }
        try{
            xphy = new Scanner(phy);
            writephysics();
        }
        catch(Exception e){
            System.out.println("could not find physics file");
        }
        try{
            xchem = new Scanner(chem);
            writechemistry();
        }
        catch(Exception e){
            System.out.println("could not find chemistry file");
        }
    }
    public void writemaths(){
        while(xmat.hasNext()){
            questionlist1[val_count1] = new Question();
            questionlist1[val_count1].type =Integer.parseInt(xmat.nextLine());
            if(questionlist1[val_count1].type == 1){
                questionlist1[val_count1].query = xmat.nextLine();
                questionlist1[val_count1].option1 = xmat.nextLine();
                questionlist1[val_count1].option2 = xmat.nextLine();
                questionlist1[val_count1].option3 = xmat.nextLine();
                questionlist1[val_count1].option4 = xmat.nextLine();
                questionlist1[val_count1].ans = xmat.nextLine();
            }
            else if(questionlist1[val_count1].type == 2){
                questionlist1[val_count1].query = xmat.nextLine();
                questionlist1[val_count1].ans = xmat.nextLine();
            }
            else if(questionlist1[val_count1].type == 3){
                questionlist1[val_count1].query = xmat.nextLine();
                questionlist1[val_count1].ans = xmat.nextLine();
            }
            Maths.add(questionlist1[val_count1]);
            System.out.println(val_count1);
            val_count1++;
            realcount1++;
        }
        xmat.close();
    }
    public void writephysics(){
        while(xphy.hasNext()){
            questionlist2[val_count2] = new Question();
            questionlist2[val_count2].type =Integer.parseInt(xphy.nextLine());
            if(questionlist2[val_count2].type == 1){
                questionlist2[val_count2].query = xphy.nextLine();
                questionlist2[val_count2].option1 = xphy.nextLine();
                questionlist2[val_count2].option2 = xphy.nextLine();
                questionlist2[val_count2].option3 = xphy.nextLine();
                questionlist2[val_count2].option4 = xphy.nextLine();
                questionlist2[val_count2].ans = xphy.nextLine();
            }
            else if(questionlist2[val_count2].type == 2){
                questionlist2[val_count2].query = xphy.nextLine();
                questionlist2[val_count2].ans = xphy.nextLine();
            }
            else if(questionlist2[val_count2].type == 3){
                questionlist2[val_count2].query = xphy.nextLine();
                questionlist2[val_count2].ans = xphy.nextLine();
            }
            Physics.add(questionlist2[val_count2]);
            val_count2++;
            realcount2++;
        }
        xphy.close();
    }
    public void writechemistry(){
        while(xchem.hasNext()){
            questionlist3[val_count3] = new Question();
            questionlist3[val_count3].type =Integer.parseInt(xchem.nextLine());
            if(questionlist3[val_count3].type == 1){
                questionlist3[val_count3].query = xchem.nextLine();
                questionlist3[val_count3].option1 = xchem.nextLine();
                questionlist3[val_count3].option2 = xchem.nextLine();
                questionlist3[val_count3].option3 = xchem.nextLine();
                questionlist3[val_count3].option4 = xchem.nextLine();
                questionlist3[val_count3].ans = xchem.nextLine();
            }
            else if(questionlist3[val_count3].type == 2){
                questionlist3[val_count3].query = xchem.nextLine();
                questionlist3[val_count3].ans = xchem.nextLine();
            }
            else if(questionlist3[val_count3].type == 3){
                questionlist3[val_count3].query = xchem.nextLine();
                questionlist3[val_count3].ans = xchem.nextLine();
            }
            Chemistry.add(questionlist3[val_count3]);
            val_count3++;
            realcount3++;
        }
        xchem.close();
    }
    public void temp(){
        JButton a = new JButton();
        header.setText("Login_pg");
        header.setBounds(450,100,200,30);
        header.setFont(header.getFont().deriveFont(20f));
        a.setActionCommand("1");
        a.setText("Submit");
        a.addActionListener(new ClickListener());
        text1.setText("Username");
        text2.setText("Password");
        text1.setEditable(false);
        text2.setEditable(false);
        text1.setBounds(450,200,100,30);
        text1.setFont(text1.getFont().deriveFont(20f));
        text3.setBounds(450,240,100,30);
        text3.setFont(text3.getFont().deriveFont(20f));
        text2.setBounds(450,280,100,30);
        text2.setFont(text2.getFont().deriveFont(20f));
        passcode.setBounds(450,320,100,30);
        passcode.setFont(passcode.getFont().deriveFont(20f));
        a.setBounds(550,370,130,30);
        a.setFont(a.getFont().deriveFont(25f));
        add(header);
        add(text1);
        add(text3);
        add(text2);
        add(passcode);
        add(a);

    }
    public class ClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if(command.equals("1")){
                if(text3.getText().equals("anish")){
                    if(Arrays.equals(passcode.getPassword(), correctPass)){
                        demo();
                    }
                    else{
                        header.setText("Wrong Password");
                    }
                }
                else{
                    header.setText("Wrong username");
                }
            }
        }
    }
   public void demo(){
        getContentPane().removeAll();
        getContentPane().repaint();
        buttonadder();
        validate();
    }
    public void buttonadder(){
        JButton a1 = new JButton();
        JButton b1 = new JButton();
        JButton c1= new JButton();
        header.setText("Select The Subject");
        header.setBounds(420,90,250,30);
        header.setFont(text1.getFont().deriveFont(25f));
        a1.setBounds(450,200,150,30);
        a1.setFont(text1.getFont().deriveFont(20f));
        b1.setBounds(450,240,150,30);
        b1.setFont(text1.getFont().deriveFont(20f));
        c1.setBounds(450,280,150,30);
        c1.setFont(text1.getFont().deriveFont(20f));
        a1.setText("Maths");
        b1.setText("Physics");
        c1.setText("Chemistry");
        a1.setActionCommand("1");
        b1.setActionCommand("2");
        c1.setActionCommand("3");
        a1.addActionListener(new ButtonClickListener());
        b1.addActionListener(new ButtonClickListener());
        c1.addActionListener(new ButtonClickListener());
        add(header);
        add(a1);
        add(b1);
        add(c1);
    }

    public class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if (command.equals("1")) {
                subjectdata = 1;
                demo2("Maths");
            }
            else if (command.equals("2")) {
                subjectdata = 2;
                demo2("Physics");
            }
            else if(command.equals("3")) {
                subjectdata = 3;
                demo2("Chemistry");
            }
        }
    }
    public void demo2(String s) {
        getContentPane().removeAll();
        getContentPane().repaint();
        setTitle(s);
        buttonadder1();
        validate();
    }
    public void buttonadder1(){
        JButton a2 = new JButton();
        JButton b2 = new JButton();
        JButton c2 = new JButton();
        JButton d2 = new JButton();
        JButton backbutton = new JButton();
        JButton homebutton = new JButton();
        header.setText("Choose an option");
        header.setBounds(400,100,250,30);
        header.setFont(text1.getFont().deriveFont(25f));
        a2.setBounds(450,200,100,30);
        a2.setFont(text1.getFont().deriveFont(20f));
        b2.setBounds(450,240,100,30);
        b2.setFont(text1.getFont().deriveFont(20f));
        c2.setBounds(450,280,100,30);
        c2.setFont(text1.getFont().deriveFont(20f));
        d2.setBounds(400,350,200,30);
        d2.setFont(text1.getFont().deriveFont(20f));
        d2.setText("Generate_Test");
        a2.setText("insert");
        b2.setText("modify");
        c2.setText("delete");
        a2.setActionCommand("1");
        b2.setActionCommand("2");
        c2.setActionCommand("3");
        d2.setActionCommand("4");
        a2.addActionListener(new typeClickListener());
        b2.addActionListener(new typeClickListener());
        c2.addActionListener(new typeClickListener());
        d2.addActionListener(new typeClickListener());
        backbutton.setText("back");
        backbutton.setBounds(30,600,100,30);
        backbutton.setFont(text1.getFont().deriveFont(20f));
        homebutton.setText("Home");
        homebutton.setBounds(30,640,100,30);
        homebutton.setFont(text1.getFont().deriveFont(20f));
        backbutton.setActionCommand("10");
        homebutton.setActionCommand("11");
        backbutton.addActionListener(new typeClickListener());
        homebutton.addActionListener(new typeClickListener());
        add(header);
        add(a2);
        add(b2);
        add(c2);
        add(d2);
        add(backbutton);
        add(homebutton);
    }
    public class typeClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if (command.equals("1")) {
                deminsert();

            }
            else if (command.equals("2")) {
                demmodify();
            }
            else if (command.equals("3")) {
                demodel();
            }
            else if(command.equals("4")){
                demogentest();
            }
            else if(command.equals("10")){
                demo();
            }
            else if(command.equals("11")){
                demo();
            }
        }
    }
    void demogentest(){
        getContentPane().removeAll();
        getContentPane().repaint();
        buttonadderdemogentest();
        validate();
    }
    void buttonadderdemogentest(){
        int i = 0,temper;
        if(subjectdata == 1){
            temper = realcount1;
        }
        else if(subjectdata == 2){
            temper = realcount2;
        }
        else {
            temper = realcount3;
        }
        String []question_num = new String[temper];
        JButton submitbutton8 = new JButton();
        JButton backbutton12 = new JButton();
        JButton homebutton12 = new JButton();
        if(subjectdata == 1){
            i =0;
            System.out.println("Cool"+realcount1);
            while(i<realcount1){
                question_num [i]= Integer.toString(i+1);
                i++;
            }
        }
        else if(subjectdata == 2){
            i = 0;
            while(i<realcount2){
                question_num[i] = Integer.toString(i+1);
                i++;
            }
        }
        else if (subjectdata == 3){
            i=0;
            while(i<realcount3){
                question_num[i] = Integer.toString(i+1);
                i++;
            }
        }
        question_chooser = new JComboBox(question_num);
        question_chooser.setBounds(450,250,50,30);
        question_chooser.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    number_of_questions = question_chooser.getSelectedIndex()+1;
                }
            }
        });
        submitbutton8.setBounds(510,250,100,30);
        header.setText("Choose no of questions to generate test");
        header.setBounds(300,100,450,30);
        header.setFont(header.getFont().deriveFont(25f));
        submitbutton8.setActionCommand("1");
        submitbutton8.setText("Submit");
        submitbutton8.addActionListener(new GentestListener());
        text1.setText("Question NO");
        text1.setEditable(false);
        text1.setBounds(450,150,150,30);
        text1.setFont(text1.getFont().deriveFont(20f));
        submitbutton8.setFont(text1.getFont().deriveFont(20f));
        backbutton12.setText("back");
        backbutton12.setBounds(30,400,100,30);
        backbutton12.setFont(text1.getFont().deriveFont(20f));
        homebutton12.setText("Home");
        homebutton12.setBounds(30,450,100,30);
        homebutton12.setFont(text1.getFont().deriveFont(20f));
        backbutton12.setActionCommand("10");
        homebutton12.setActionCommand("11");
        backbutton12.addActionListener(new GentestListener());
        homebutton12.addActionListener(new GentestListener());
        add(header);
        add(text1);
        add(question_chooser);
        add(submitbutton8);
        add(homebutton12);
        add(backbutton12);
    }
    public class GentestListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if(command.equals("1")){
                filecounter++;
                if(subjectdata == 1){
                     new Generate_Quiz(number_of_questions,realcount1);
                }
                else if(subjectdata == 2){
                     new Generate_Quiz(number_of_questions,realcount2);
                }
                else{
                    new Generate_Quiz(number_of_questions,realcount3);
                }
                lastfunctiondemo();
            }
            else if(command.equals("10")){
                demo2(getTitle());
            }
            else if(command.equals("11")){
                demo();
            }
        }
    }
    public void lastfunctiondemo(){
        getContentPane().removeAll();
        getContentPane().repaint();
        lastfunction();
        validate();
    }
    public void lastfunction(){
        JButton lastsubmit1 = new JButton("Copy questions to a file");
        JButton lastsubmit2 = new JButton("Copy answers to a file");
        JButton cont2 = new JButton("Continue");
        cont2.setBounds(30,800,300,30);
        lastsubmit1.setBounds(30,700,300,30);
        lastsubmit2.setBounds(30,750,300,30);
        cont2.setActionCommand("3");
        cont2.addActionListener(new lastlistener());
        lastsubmit1.addActionListener(new lastlistener());
        lastsubmit2.addActionListener(new lastlistener());
        lastsubmit1.setFont(header.getFont().deriveFont(25f));
        lastsubmit2.setFont(header.getFont().deriveFont(25f));
        cont2.setFont(header.getFont().deriveFont(25f));
        try{
            br = new BufferedReader(new FileReader("C:\\Users\\anish\\Desktop\\Questions\\takequestions_"+Integer.toString(sub.filecounter)+".txt"));
            ar = new BufferedReader(new FileReader("C:\\Users\\anish\\Desktop\\Questions\\takeanswer_"+Integer.toString(sub.filecounter)+".txt"));
        }
        catch (Exception e){
            System.out.println("buffer reader error");
        }
        try{
            paper.read(br,null);
            paper2.read(ar,null);
        }
        catch(Exception e){
            System.out.println("problem with paper text area");
        }
        paper.setFont(paper.getFont().deriveFont(20f));
        paper2.setFont(paper.getFont().deriveFont(20f));
        JScrollPane viewer1 = new JScrollPane(paper);
        JScrollPane viewer2 = new JScrollPane(paper2);
        viewer1.setBounds(0,0,1000,300);
        viewer2.setBounds(0,350,1000,300);
        add(viewer2);
        add(viewer1);
        add(lastsubmit1);
        add(lastsubmit2);
        add(cont2);
    }
    public class lastlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if(command.equals("3")){
                demo2(getTitle());
            }
        }
    }
    public void demodel(){
        getContentPane().removeAll();
        getContentPane().repaint();
        buttonadderdemodel();
        validate();
    }
    public void buttonadderdemodel(){
        JButton submitbutton4 = new JButton();
        JButton backbutton7 = new JButton();
        JButton homebutton7 = new JButton();
        text6.setText("");
        text7.setText("");
        text8.setText("");
        text9.setText("");
        text10.setText("");
        text11.setText("");
        numbertext.setText("");
        header.setText("Insert a question number to delete");
        header.setBounds(340,100,400,30);
        header.setFont(header.getFont().deriveFont(25f));
        submitbutton4.setActionCommand("1");
        submitbutton4.setText("Submit");
        submitbutton4.addActionListener(new delListener());
        text1.setText("Question NO");
        text1.setEditable(false);
        text1.setBounds(450,150,150,30);
        text1.setFont(text1.getFont().deriveFont(20f));
        numbertext.setBounds(500,190,50,30);
        numbertext.setFont(text6.getFont().deriveFont(20f));
        submitbutton4.setBounds(450,250,100,30);
        submitbutton4.setFont(text1.getFont().deriveFont(20f));
        backbutton7.setText("back");
        backbutton7.setBounds(30,310,100,30);
        backbutton7.setFont(text1.getFont().deriveFont(20f));
        homebutton7.setText("Home");
        homebutton7.setBounds(30,350,100,30);
        homebutton7.setFont(text1.getFont().deriveFont(20f));
        backbutton7.setActionCommand("10");
        homebutton7.setActionCommand("11");
        backbutton7.addActionListener(new delListener());
        homebutton7.addActionListener(new delListener());
        add(header);
        add(text1);
        add(numbertext);
        add(submitbutton4);
        add(homebutton7);
        add(backbutton7);
    }
    public class delListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if(command.equals("1")){
                delete_sure();
            }
            else if(command.equals("10")){
                demo2(getTitle());
            }
            else if(command.equals("11")){
                demo();
            }
        }
    }
    public void delete_sure(){

        try{
            numtemp = Integer.parseInt(numbertext.getText());
            if(subjectdata ==1){
                viewer1 = Maths.get(numtemp-1);
                q_delete_sure();
            }
            if(subjectdata ==2){
                viewer1 = Physics.get(numtemp-1);
                q_delete_sure();
            }
            if(subjectdata ==3){
                viewer1 = Chemistry.get(numtemp-1);
                q_delete_sure();
            }
        }
        catch(IndexOutOfBoundsException e){
            demodel();
            twarning.setText("No such question");
            twarning.setBounds(430,290,200,30);
            twarning.setFont(twarning.getFont().deriveFont(20f));
            add(twarning);
            validate();
        }
    }
    public void q_delete_sure(){
        getContentPane().removeAll();
        getContentPane().repaint();
        buttonadderdemoq_del_sure();
        validate();
    }
    public void buttonadderdemoq_del_sure(){
        JButton backbutton8 = new JButton();
        JButton homebutton8 = new JButton();
        header.setText("Is this the question to delete");
        header.setBounds(340,100,400,30);
        header.setFont(header.getFont().deriveFont(25f));
        twarning.setBounds(300,150,500,30);
        twarning.setFont(twarning.getFont().deriveFont(25f));
        twarning.setText(viewer1.query);
        backbutton8.setText("NO");
        backbutton8.setBounds(300,230,100,30);
        backbutton8.setFont(text1.getFont().deriveFont(20f));
        homebutton8.setText("YES");
        homebutton8.setBounds(300,190,100,30);
        homebutton8.setFont(text1.getFont().deriveFont(20f));
        backbutton8.setActionCommand("10");
        homebutton8.setActionCommand("11");
        backbutton8.addActionListener(new qdelListener());
        homebutton8.addActionListener(new qdelListener());
        add(header);
        add(twarning);
        add(homebutton8);
        add(backbutton8);
    }
    public class qdelListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if(command.equals("10")){
                demodel();
            }
            else if(command.equals("11")){
                if(subjectdata == 1){
                    realcount1--;
                    Maths.remove(numtemp-1);
                }
                else if(subjectdata == 2){
                    realcount2--;
                    Physics.remove(numtemp-1);
                }
                else{
                    realcount3--;
                    Chemistry.remove(numtemp-1);
                }
                demo2(getTitle());
            }
        }
    }
    public void demmodify(){
        getContentPane().removeAll();
        getContentPane().repaint();
        buttonadderdemmodify();
        validate();
    }
    public void buttonadderdemmodify(){
        JButton submitbutton3 = new JButton();
        JButton backbutton6 = new JButton();
        JButton homebutton6 = new JButton();
        text6.setText("");
        text7.setText("");
        text8.setText("");
        text9.setText("");
        text10.setText("");
        text11.setText("");
        numbertext.setText("");
        header.setText("Insert a question number to modify");
        header.setBounds(340,100,400,30);
        header.setFont(header.getFont().deriveFont(25f));
        submitbutton3.setActionCommand("1");
        submitbutton3.setText("Submit");
        submitbutton3.addActionListener(new modListener());
        text1.setText("Question NO");
        text1.setEditable(false);
        text1.setBounds(450,150,150,30);
        text1.setFont(text1.getFont().deriveFont(20f));
        numbertext.setBounds(500,190,50,30);
        numbertext.setFont(numbertext.getFont().deriveFont(20f));
        submitbutton3.setBounds(450,250,100,30);
        submitbutton3.setFont(text1.getFont().deriveFont(20f));
        backbutton6.setText("back");
        backbutton6.setBounds(30,300,100,30);
        backbutton6.setFont(text1.getFont().deriveFont(20f));
        homebutton6.setText("Home");
        homebutton6.setBounds(30,340,100,30);
        homebutton6.setFont(text1.getFont().deriveFont(20f));
        backbutton6.setActionCommand("10");
        homebutton6.setActionCommand("11");
        backbutton6.addActionListener(new modListener());
        homebutton6.addActionListener(new modListener());
        add(header);
        add(text1);
        add(numbertext);
        add(submitbutton3);
        add(homebutton6);
        add(backbutton6);
    }
    public class modListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if(command.equals("1")){
                mod_sure();
            }
            else if(command.equals("10")){
                demo2(getTitle());
            }
            else if(command.equals("11")){
                demo();
            }
        }
    }
    public void mod_sure(){
        try{
            numtemp = Integer.parseInt(numbertext.getText());
            if(subjectdata ==1){
                viewer1 = Maths.get(numtemp-1);
                q_mod_sure();
            }
            if(subjectdata ==2){
                viewer1 = Physics.get(numtemp-1);
                q_mod_sure();
            }
            if(subjectdata ==3){
                viewer1 = Chemistry.get(numtemp-1);
                q_mod_sure();
            }
        }
        catch(IndexOutOfBoundsException e){
            demmodify();
            twarning.setText("No such question");
            twarning.setBounds(430,290,200,30);
            twarning.setFont(twarning.getFont().deriveFont(20f));
            add(twarning);
            validate();
        }
    }
    public void q_mod_sure(){
        getContentPane().removeAll();
        getContentPane().repaint();
        buttonadderq_mod_sure();
        validate();
    }
    public void buttonadderq_mod_sure(){
        JButton submitbutton7 = new JButton();
        JButton submitbutton6 = new JButton();
        JButton submitbutton5 = new JButton();
        JButton backbutton9 = new JButton();
        JButton homebutton9 = new JButton();
        JButton backbutton10 = new JButton();
        JButton homebutton10 = new JButton();
        JButton homebutton11 = new JButton();
        JButton backbutton11 = new JButton();
        if(viewer1.type == 1){
            header.setText("Modify the question");
            header.setBounds(430,80,250,30);
            header.setFont(header.getFont().deriveFont(25f));
            submitbutton5.setActionCommand("1");
            submitbutton5.setText("Submit");
            submitbutton5.addActionListener(new q_mod_sureListener());
            text1.setText("Question");
            text2.setText("OptionA");
            text3.setText("OptionB");
            text4.setText("OptionC");
            text5.setText("OptionD");
            answertext.setText("Answer");
            text1.setEditable(false);
            text2.setEditable(false);
            text3.setEditable(false);
            text4.setEditable(false);
            text5.setEditable(false);
            answertext.setEditable(false);
            text6.setText(viewer1.query);
            text7.setText(viewer1.option1);
            text8.setText(viewer1.option2);
            text9.setText(viewer1.option3);
            text10.setText(viewer1.option4);
            text11.setText(viewer1.ans);
            text1.setBounds(450,150,100,30);
            text1.setFont(text1.getFont().deriveFont(20f));
            text6.setBounds(350,190,300,30);
            text6.setFont(text6.getFont().deriveFont(20f));
            text2.setBounds(450,230,100,30);
            text2.setFont(text2.getFont().deriveFont(20f));
            text7.setBounds(350,270,300,30);
            text7.setFont(text7.getFont().deriveFont(20f));
            text3.setBounds(450,310,100,30);
            text3.setFont(text3.getFont().deriveFont(20f));
            text8.setBounds(350,350,300,30);
            text8.setFont(text8.getFont().deriveFont(20f));
            text4.setBounds(450,390,100,30);
            text4.setFont(text4.getFont().deriveFont(20f));
            text9.setBounds(350,430,300,30);
            text9.setFont(text9.getFont().deriveFont(20f));
            text5.setBounds(450,470,100,30);
            text5.setFont(text5.getFont().deriveFont(20f));
            text10.setBounds(350,510,300,30);
            text10.setFont(text10.getFont().deriveFont(20f));
            answertext.setBounds(450,550,100,30);
            answertext.setFont(answertext.getFont().deriveFont(20f));
            text11.setBounds(350,590,300,30);
            text11.setFont(text11.getFont().deriveFont(20f));
            backbutton9.setText("back");
            backbutton9.setBounds(30,700,100,30);
            backbutton9.setFont(backbutton9.getFont().deriveFont(20f));
            homebutton9.setText("Home");
            homebutton9.setBounds(30,750,100,30);
            homebutton9.setFont(homebutton9.getFont().deriveFont(20f));
            backbutton9.setActionCommand("10");
            homebutton9.setActionCommand("11");
            backbutton9.addActionListener(new q_mod_sureListener());
            homebutton9.addActionListener(new q_mod_sureListener());
            submitbutton5.setBounds(550,630,130,30);
            submitbutton5.setFont(submitbutton5.getFont().deriveFont(25f));
            add(header);
            add(text1);
            add(text3);
            add(text2);
            add(text4);
            add(text5);
            add(text6);
            add(answertext);
            add(text7);
            add(text8);
            add(text9);
            add(text10);
            add(text11);
            add(submitbutton5);
            add(backbutton9);
            add(homebutton9);
        }
        else if(viewer1.type == 2){
            text6.setText(viewer1.query);
            text7.setText(viewer1.ans);
            header.setText("Modify the TorF question");
            header.setBounds(350,80,350,30);
            header.setFont(header.getFont().deriveFont(25f));
            submitbutton6.setActionCommand("2");
            submitbutton6.setText("Submit");
            submitbutton6.addActionListener(new q_mod_sureListener());
            text1.setText("Question");
            answertext.setText("Answer");
            text1.setEditable(false);
            answertext.setEditable(false);
            text1.setBounds(450,150,100,30);
            text1.setFont(text1.getFont().deriveFont(20f));
            text6.setBounds(350,190,300,30);
            text6.setFont(text6.getFont().deriveFont(20f));
            answertext.setBounds(450,230,100,30);
            answertext.setFont(text2.getFont().deriveFont(20f));
            text7.setBounds(350,270,300,30);
            text7.setFont(text7.getFont().deriveFont(20f));
            backbutton10.setText("back");
            backbutton10.setBounds(30,420,100,30);
            backbutton10.setFont(backbutton10.getFont().deriveFont(20f));
            homebutton10.setText("Home");
            homebutton10.setBounds(30,470,100,30);
            homebutton10.setFont(homebutton10.getFont().deriveFont(20f));
            backbutton10.setActionCommand("10");
            homebutton10.setActionCommand("11");
            backbutton10.addActionListener(new q_mod_sureListener());
            homebutton10.addActionListener(new q_mod_sureListener());
            submitbutton6.setBounds(550,320,130,30);
            submitbutton6.setFont(submitbutton6.getFont().deriveFont(25f));
            add(header);
            add(text1);
            add(text6);
            add(answertext);
            add(text7);
            add(submitbutton6);
            add(backbutton10);
            add(homebutton10);
        }
        else if(viewer1.type == 3){
            text8.setText("");
            text9.setText("");
            text10.setText("");
            text11.setText("");
            text6.setText(viewer1.query);
            text7.setText(viewer1.ans);
            System.out.println("yep"+viewer1.query+" "+viewer1.ans);
            header.setText("Fill a blank type question");
            header.setBounds(380,80,300,30);
            header.setFont(header.getFont().deriveFont(25f));
            submitbutton7.setActionCommand("3");
            submitbutton7.setText("Submit");
            submitbutton7.addActionListener(new q_mod_sureListener());
            text1.setText("Question");
            answertext.setText("Answer");
            text1.setEditable(false);
            answertext.setEditable(false);
            text1.setBounds(450,150,100,30);
            text1.setFont(text1.getFont().deriveFont(20f));
            text6.setBounds(350,190,300,30);
            text6.setFont(text6.getFont().deriveFont(20f));
            answertext.setBounds(450,230,100,30);
            answertext.setFont(text2.getFont().deriveFont(20f));
            text7.setBounds(350,270,300,30);
            text7.setFont(text7.getFont().deriveFont(20f));
            backbutton11.setText("back");
            backbutton11.setBounds(30,420,100,30);
            backbutton11.setFont(backbutton11.getFont().deriveFont(20f));
            homebutton11.setText("Home");
            homebutton11.setBounds(30,470,100,30);
            homebutton11.setFont(homebutton11.getFont().deriveFont(20f));
            backbutton11.setActionCommand("10");
            homebutton11.setActionCommand("11");
            backbutton11.addActionListener(new q_mod_sureListener());
            homebutton11.addActionListener(new q_mod_sureListener());
            submitbutton7.setBounds(550,320,130,30);
            submitbutton7.setFont(submitbutton7.getFont().deriveFont(25f));
            add(header);
            add(text1);
            add(text6);
            add(answertext);
            add(text7);
            add(submitbutton7);
            add(backbutton11);
            add(homebutton11);
        }
    }
    public class q_mod_sureListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if(command.equals("1")){
                viewer1.query = text6.getText();
                viewer1.option1 = text7.getText();
                viewer1.option2 = text8.getText();
                viewer1.option3 = text9.getText();
                viewer1.option4 = text10.getText();
                viewer1.ans = text11.getText();
                if(text6.getText().equals("")||text7.getText().equals("")||text8.getText().equals("")||text9.getText().equals("")||text10.getText().equals("")||text11.getText().equals("")){
                    q_mod_sure();
                    twarning.setText("Fill all the boxes");
                    twarning.setBounds(430,670,250,30);
                    twarning.setFont(twarning.getFont().deriveFont(25f));
                    add(twarning);
                    validate();
                }
                else{
                    if(subjectdata == 1){
                        Maths.set(numtemp-1,viewer1);
                    }
                    else if (subjectdata == 2){
                        Physics.set(numtemp-1,viewer1);
                    }
                    else if (subjectdata == 3){
                        Chemistry.set(numtemp-1,viewer1);
                    }
                    demo2(getTitle());
                }
            }
            else if(command.equals("2")){
                viewer1.query = text6.getText();
                viewer1.ans = text7.getText();
                if(text6.getText().equals("")||text7.getText().equals("")){
                    q_mod_sure();
                    twarning.setText("Fill all the boxes");
                    twarning.setBounds(430,370,250,30);
                    twarning.setFont(twarning.getFont().deriveFont(25f));
                    add(twarning);
                    validate();
                }
                else{
                    if(subjectdata == 1){
                        Maths.set(numtemp-1,viewer1);
                    }
                    else if (subjectdata == 2){
                        Physics.set(numtemp-1,viewer1);
                    }
                    else if (subjectdata == 3){
                        Chemistry.set(numtemp-1,viewer1);
                    }
                    demo2(getTitle());
                }
            }
            else if(command.equals("3")){
                viewer1.query = text6.getText();
                viewer1.ans = text7.getText();
                if(text6.getText().equals("")||text7.getText().equals("")){
                    q_mod_sure();
                    twarning.setText("Fill all the boxes");
                    twarning.setBounds(430,370,250,30);
                    twarning.setFont(twarning.getFont().deriveFont(25f));
                    add(twarning);
                    validate();
                }
                else{
                    if(subjectdata == 1){
                        Maths.set(numtemp-1,viewer1);
                    }
                    else if (subjectdata == 2){
                        Physics.set(numtemp-1,viewer1);
                    }
                    else if (subjectdata == 3){
                        Chemistry.set(numtemp-1,viewer1);
                    }
                    demo2(getTitle());
                }
            }
            else if(command.equals("10")){
                demmodify();
            }
            else if(command.equals("11")){
                demo();
            }
        }
    }

    public void deminsert(){
        getContentPane().removeAll();
        getContentPane().repaint();
        buttonadderinsert();
        validate();
    }
    public void buttonadderinsert(){
        JButton a3 = new JButton();
        JButton b3 = new JButton();
        JButton c3 = new JButton();
        JButton backbutton2 = new JButton();
        JButton homebutton2 = new JButton();
        a3.setText("MCQ");
        c3.setText("Blanks");
        b3.setText("T or F");
        header.setText("Choose an option");
        header.setBounds(420,100,200,30);
        header.setFont(header.getFont().deriveFont(25f));
        a3.setBounds(450,200,100,30);
        a3.setFont(text1.getFont().deriveFont(20f));
        b3.setBounds(450,240,100,30);
        b3.setFont(text1.getFont().deriveFont(20f));
        c3.setBounds(450,280,100,30);
        c3.setFont(text1.getFont().deriveFont(20f));
        a3.setActionCommand("1");
        b3.setActionCommand("2");
        c3.setActionCommand("3");
        a3.addActionListener(new Listener());
        b3.addActionListener(new Listener());
        c3.addActionListener(new Listener());
        backbutton2.setText("back");
        backbutton2.setBounds(30,600,100,30);
        backbutton2.setFont(homebutton2.getFont().deriveFont(20f));
        homebutton2.setText("Home");
        homebutton2.setBounds(30,640,100,30);
        homebutton2.setFont(homebutton2.getFont().deriveFont(20f));
        backbutton2.setActionCommand("10");
        homebutton2.setActionCommand("11");
        backbutton2.addActionListener(new Listener());
        homebutton2.addActionListener(new Listener());
        add(header);
        add(a3);
        add(b3);
        add(c3);
        add(backbutton2);
        add(homebutton2);
    }
    public class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if (command.equals("1")) {
                demomcq();

            } else if (command.equals("2")) {
                demotf();

            } else if (command.equals("3")) {
                demobl();
            }
            else if(command.equals("10")){
                demo2(getTitle());
            }
            else if(command.equals("11")){
                demo();
            }
        }
    }
    public void demomcq(){
        getContentPane().removeAll();
        getContentPane().repaint();
        text6.setText("");
        text7.setText("");
        text8.setText("");
        text9.setText("");
        text10.setText("");
        text11.setText("");
        buttondemomcq();
        validate();
    }

    public void buttondemomcq(){
        JButton submitbutton = new JButton();
        JButton backbutton3 = new JButton();
        JButton homebutton3 = new JButton();
        header.setText("Fill a MCQ");
        header.setBounds(430,80,250,30);
        header.setFont(header.getFont().deriveFont(25f));
        submitbutton.setActionCommand("1");
        submitbutton.setText("Submit");
        submitbutton.addActionListener(new goodListener());
        text1.setText("Question");
        text2.setText("OptionA");
        text3.setText("OptionB");
        text4.setText("OptionC");
        text5.setText("OptionD");
        answertext.setText("Answer");
        text1.setEditable(false);
        text2.setEditable(false);
        text3.setEditable(false);
        text4.setEditable(false);
        text5.setEditable(false);
        answertext.setEditable(false);

        text1.setBounds(450,150,100,30);
        text1.setFont(text1.getFont().deriveFont(20f));
        text6.setBounds(350,190,300,30);
        text6.setFont(text6.getFont().deriveFont(20f));
        text2.setBounds(450,230,100,30);
        text2.setFont(text2.getFont().deriveFont(20f));
        text7.setBounds(350,270,300,30);
        text7.setFont(text7.getFont().deriveFont(20f));
        text3.setBounds(450,310,100,30);
        text3.setFont(text3.getFont().deriveFont(20f));
        text8.setBounds(350,350,300,30);
        text8.setFont(text8.getFont().deriveFont(20f));
        text4.setBounds(450,390,100,30);
        text4.setFont(text4.getFont().deriveFont(20f));
        text9.setBounds(350,430,300,30);
        text9.setFont(text9.getFont().deriveFont(20f));
        text5.setBounds(450,470,100,30);
        text5.setFont(text5.getFont().deriveFont(20f));
        text10.setBounds(350,510,300,30);
        text10.setFont(text10.getFont().deriveFont(20f));
        answertext.setBounds(450,550,100,30);
        answertext.setFont(answertext.getFont().deriveFont(20f));
        text11.setBounds(350,590,300,30);
        text11.setFont(text11.getFont().deriveFont(20f));
        backbutton3.setText("back");
        backbutton3.setBounds(30,650,100,30);
        backbutton3.setFont(backbutton3.getFont().deriveFont(20f));
        homebutton3.setText("Home");
        homebutton3.setBounds(30,700,100,30);
        homebutton3.setFont(homebutton3.getFont().deriveFont(20f));
        backbutton3.setActionCommand("10");
        homebutton3.setActionCommand("11");
        backbutton3.addActionListener(new goodListener());
        homebutton3.addActionListener(new goodListener());
        submitbutton.setBounds(550,630,130,30);
        submitbutton.setFont(submitbutton.getFont().deriveFont(25f));
        add(header);
        add(text1);
        add(text3);
        add(text2);
        add(text4);
        add(text5);
        add(text6);
        add(answertext);
        add(text7);
        add(text8);
        add(text9);
        add(text10);
        add(text11);
        add(submitbutton);
        add(backbutton3);
        add(homebutton3);

    }
    public class goodListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if(text6.getText().equals("")||text7.getText().equals("")||text8.getText().equals("")||text9.getText().equals("")||text10.getText().equals("")||text11.getText().equals("")){
                getContentPane().removeAll();
                getContentPane().repaint();
                buttondemomcq();
                twarning.setText("Fill all the boxes");
                twarning.setBounds(430,670,250,30);
                twarning.setFont(twarning.getFont().deriveFont(25f));
                add(twarning);
                validate();
            }
            else {
                if (command.equals("1")) {
                    addmcq();
                    demo2(getTitle());

                }
            }
            if(command.equals("10")){
                deminsert();
            }
            else if(command.equals("11")){
                demo();
            }
        }
    }
    public void addmcq(){
        if(subjectdata == 1){
            questionlist1[val_count1] = new Question();
            questionlist1[val_count1].query = text6.getText();
            questionlist1[val_count1].option1 = text7.getText();
            questionlist1[val_count1].option2 = text8.getText();
            questionlist1[val_count1].option3 = text9.getText();
            questionlist1[val_count1].option4 = text10.getText();
            questionlist1[val_count1].ans = text11.getText();
            questionlist1[val_count1].type = 1;
            Maths.add(questionlist1[val_count1]);
            val_count1++;
            realcount1++;
        }
        if(subjectdata == 2){
            questionlist2[val_count2] = new Question();
            questionlist2[val_count2].query = text6.getText();
            questionlist2[val_count2].option1 = text7.getText();
            questionlist2[val_count2].option2 = text8.getText();
            questionlist2[val_count2].option3 = text9.getText();
            questionlist2[val_count2].option4 = text10.getText();
            questionlist2[val_count2].ans = text11.getText();
            questionlist2[val_count2].type = 1;
            Physics.add(questionlist2[val_count2]);
            val_count2++;
            realcount2++;
        }
        if(subjectdata == 3){
            questionlist3[val_count3] = new Question();
            questionlist3[val_count3].query = text6.getText();
            questionlist3[val_count3].option1 = text7.getText();
            questionlist3[val_count3].option2 = text8.getText();
            questionlist3[val_count3].option3 = text9.getText();
            questionlist3[val_count3].option4 = text10.getText();
            questionlist3[val_count3].ans = text11.getText();
            questionlist3[val_count3].type = 1;
            Chemistry.add(questionlist3[val_count3]);
            val_count3++;
            realcount3++;
        }
    }
    public void demotf(){
        getContentPane().removeAll();
        getContentPane().repaint();
        text6.setText("");
        text7.setText("");
        text8.setText("");
        text9.setText("");
        text10.setText("");
        text11.setText("");
        buttondemoqf();
        validate();
    }
    public void buttondemoqf(){
        JButton submitbutton1 = new JButton();
        JButton backbutton4 = new JButton();
        JButton homebutton4 = new JButton();

        header.setText("Fill a T_or_F question");
        header.setBounds(380,80,250,30);
        header.setFont(header.getFont().deriveFont(25f));
        submitbutton1.setActionCommand("1");
        submitbutton1.setText("Submit");
        submitbutton1.addActionListener(new TFListener());
        text1.setText("Question");
        answertext.setText("Answer");
        text1.setEditable(false);
        answertext.setEditable(false);
        text1.setBounds(450,150,100,30);
        text1.setFont(text1.getFont().deriveFont(20f));
        text6.setBounds(350,190,300,30);
        text6.setFont(text6.getFont().deriveFont(20f));
        answertext.setBounds(450,230,100,30);
        answertext.setFont(text2.getFont().deriveFont(20f));
        text7.setBounds(350,270,300,30);
        text7.setFont(text7.getFont().deriveFont(20f));
        backbutton4.setText("back");
        backbutton4.setBounds(30,400,100,30);
        backbutton4.setFont(backbutton4.getFont().deriveFont(20f));
        homebutton4.setText("Home");
        homebutton4.setBounds(30,450,100,30);
        homebutton4.setFont(homebutton4.getFont().deriveFont(20f));
        backbutton4.setActionCommand("10");
        homebutton4.setActionCommand("11");
        backbutton4.addActionListener(new TFListener());
        homebutton4.addActionListener(new TFListener());
        submitbutton1.setBounds(550,320,130,30);
        submitbutton1.setFont(submitbutton1.getFont().deriveFont(25f));
        add(header);
        add(text1);
        add(text6);
        add(answertext);
        add(text7);
        add(submitbutton1);
        add(backbutton4);
        add(homebutton4);

    }
    public class TFListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if(text6.getText().equals("")||text7.getText().equals("")){
                getContentPane().removeAll();
                getContentPane().repaint();
                buttondemoqf();
                twarning.setText("Fill all the boxes");
                twarning.setBounds(430,370,250,30);
                twarning.setFont(twarning.getFont().deriveFont(25f));
                add(twarning);
                validate();
            }
            else{
                if (command.equals("1")) {
                    addtf();
                    demo2(getTitle());

                }
            }
            if(command.equals("10")){
                deminsert();
            }
            else if(command.equals("11")){
                demo();
            }
        }
    }
    public void addtf(){
        if(subjectdata == 1){
            questionlist1[val_count1] = new Question();
            questionlist1[val_count1].query = text6.getText();
            questionlist1[val_count1].ans = text7.getText();
            questionlist1[val_count1].type = 2;
            Maths.add(questionlist1[val_count1]);
            val_count1++;
            realcount1++;
        }
        if(subjectdata == 2){
            questionlist2[val_count2] = new Question();
            questionlist2[val_count2].query = text6.getText();
            questionlist2[val_count2].ans = text7.getText();
            questionlist2[val_count2].type = 2;
            Physics.add(questionlist2[val_count2]);
            val_count2++;
            realcount2++;
        }
        if(subjectdata == 3){
            questionlist3[val_count3] = new Question();
            questionlist3[val_count3].query = text6.getText();
            questionlist3[val_count3].ans = text7.getText();
            questionlist3[val_count3].type = 2;
            Chemistry.add(questionlist3[val_count3]);
            val_count3++;
            realcount3++;
        }
    }
    public void demobl(){
        getContentPane().removeAll();
        getContentPane().repaint();
        text6.setText("");
        text7.setText("");
        text8.setText("");
        text9.setText("");
        text10.setText("");
        text11.setText("");
        buttondemobl();
        validate();
    }
    public void buttondemobl(){

        JButton submitbutton2 = new JButton();
        JButton backbutton5 = new JButton();
        JButton homebutton5 = new JButton();
        header.setText("Fill a blank type question");
        header.setBounds(380,80,300,30);
        header.setFont(header.getFont().deriveFont(25f));
        submitbutton2.setActionCommand("1");
        submitbutton2.setText("Submit");
        submitbutton2.addActionListener(new blListener());
        text1.setText("Question");
        answertext.setText("Answer");
        text1.setEditable(false);
        answertext.setEditable(false);
        text1.setBounds(450,150,100,30);
        text1.setFont(text1.getFont().deriveFont(20f));
        text6.setBounds(350,190,300,30);
        text6.setFont(text6.getFont().deriveFont(20f));
        answertext.setBounds(450,230,100,30);
        answertext.setFont(text2.getFont().deriveFont(20f));
        text7.setBounds(350,270,300,30);
        text7.setFont(text7.getFont().deriveFont(20f));
        backbutton5.setText("back");
        backbutton5.setBounds(30,400,100,30);
        backbutton5.setFont(backbutton5.getFont().deriveFont(20f));
        homebutton5.setText("Home");
        homebutton5.setBounds(30,450,100,30);
        homebutton5.setFont(homebutton5.getFont().deriveFont(20f));
        backbutton5.setActionCommand("10");
        homebutton5.setActionCommand("11");
        backbutton5.addActionListener(new blListener());
        homebutton5.addActionListener(new blListener());
        submitbutton2.setBounds(550,320,130,30);
        submitbutton2.setFont(submitbutton2.getFont().deriveFont(25f));
        add(header);
        add(text1);
        add(text6);
        add(answertext);
        add(text7);
        add(submitbutton2);
        add(backbutton5);
        add(homebutton5);
    }
    public class blListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if(text6.getText().equals("")||text7.getText().equals("")){
                getContentPane().removeAll();
                getContentPane().repaint();
                buttondemobl();
                twarning.setText("Fill all the boxes");
                twarning.setBounds(430,370,250,30);
                twarning.setFont(twarning.getFont().deriveFont(25f));
                add(twarning);
                validate();
            }
            else{
                if (command.equals("1")) {
                    addbl();
                    demo2(getTitle());
                }
            }
            if(command.equals("10")){
                deminsert();
            }
            else if(command.equals("11")){
                demo();
            }
        }
    }
    public void addbl(){
        if(subjectdata == 1){
            questionlist1[val_count1] = new Question();
            questionlist1[val_count1].query = text6.getText();
            questionlist1[val_count1].ans = text7.getText();
            questionlist1[val_count1].type = 3;
            Maths.add(questionlist1[val_count1]);
            val_count1++;
            realcount1++;
        }
        if(subjectdata == 2){
            questionlist2[val_count2] = new Question();
            questionlist2[val_count2].query = text6.getText();
            questionlist2[val_count2].ans = text7.getText();
            questionlist2[val_count2].type = 3;
            Physics.add(questionlist2[val_count2]);
            val_count2++;
            realcount2++;
        }
        if(subjectdata == 3){
            questionlist3[val_count3] = new Question();
            questionlist3[val_count3].query = text6.getText();
            questionlist3[val_count3].ans = text7.getText();
            questionlist3[val_count3].type = 3;
            Chemistry.add(questionlist3[val_count3]);
            val_count3++;
            realcount3++;
        }
    }
}


public class quiz {
    public static void main(String []args) {
         sub f = new sub("Jav_quiz");

        f.setSize(1000, 1000);
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.readfile();
        f.temp();
        f.setVisible(true);

        //f.demo();
    }
}