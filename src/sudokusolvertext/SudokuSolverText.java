package sudokusolvertext;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author Anthuan
 */
public class SudokuSolverText extends JPanel implements ActionListener {
    //creates initializers needed for all functions
    static JPanel grid = new JPanel(new FlowLayout(FlowLayout.LEADING));
    Component lists[][] = new Component[9][];
    JFrame frame = new JFrame("Sudoku Solver");

    //
    Component aa[];
    static Component bb[];
    static Component cc[];
    static Component dd[];
    static Component ee[];
    static Component ff[];
    static Component gg[];
    static Component hh[];
    static Component ii[];
    static int n = 0;
    
    //creates rows for the puzzle
    JPanel p1 = new JPanel(new GridLayout(1, 9));
    JPanel p2 = new JPanel(new GridLayout(1, 9));
    JPanel p3 = new JPanel(new GridLayout(1, 9));
    JPanel p4 = new JPanel(new GridLayout(1, 9));
    JPanel p5 = new JPanel(new GridLayout(1, 9));
    JPanel p6 = new JPanel(new GridLayout(1, 9));
    JPanel p7 = new JPanel(new GridLayout(1, 9));
    JPanel p8 = new JPanel(new GridLayout(1, 9));
    JPanel p9 = new JPanel(new GridLayout(1, 9));

    //initialized on start of program
    public SudokuSolverText() {
        String column = "A";
        JPanel pall1 = new JPanel(new GridLayout(9, 9));

        //solve button
        JButton Solve = new JButton("Solve");
        Solve.setName("Solve");
        Solve.addActionListener(buttonListener);

        //change button
        JButton Change = new JButton("Change");
        Change.setName("Change");
        //       Change.addActionListener(Changer);
        
        //reset button
        JButton Reset = new JButton("Reset");
        Reset.setName("Reset");
        Reset.addActionListener(Reseter);
        
        //creates all textboxes needed for the solver
        Text A1 = new Text("A1", actionListener);
        p1.add(A1.ret());
        Text A2 = new Text("A2", actionListener);
        p1.add(A2.ret());
        Text A3 = new Text("A3", actionListener);
        p1.add(A3.ret());
        Text A4 = new Text("A4", actionListener);
        p1.add(A4.ret());
        Text A5 = new Text("A5", actionListener);
        p1.add(A5.ret());
        Text A6 = new Text("A6", actionListener);
        p1.add(A6.ret());
        Text A7 = new Text("A7", actionListener);
        p1.add(A7.ret());
        Text A8 = new Text("A8", actionListener);
        p1.add(A8.ret());
        Text A9 = new Text("A9", actionListener);
        p1.add(A9.ret());

        Text B1 = new Text("B1", actionListener);
        p2.add(B1.ret());
        Text B2 = new Text("B2", actionListener);
        p2.add(B2.ret());
        Text B3 = new Text("B3", actionListener);
        p2.add(B3.ret());
        Text B4 = new Text("B4", actionListener);
        p2.add(B4.ret());
        Text B5 = new Text("B5", actionListener);
        p2.add(B5.ret());
        Text B6 = new Text("B6", actionListener);
        p2.add(B6.ret());
        Text B7 = new Text("B7", actionListener);
        p2.add(B7.ret());
        Text B8 = new Text("B8", actionListener);
        p2.add(B8.ret());
        Text B9 = new Text("B9", actionListener);
        p2.add(B9.ret());

        Text C1 = new Text("C1", actionListener);
        p3.add(C1.ret());
        Text C2 = new Text("C2", actionListener);
        p3.add(C2.ret());
        Text C3 = new Text("C3", actionListener);
        p3.add(C3.ret());
        Text C4 = new Text("C4", actionListener);
        p3.add(C4.ret());
        Text C5 = new Text("C5", actionListener);
        p3.add(C5.ret());
        Text C6 = new Text("C6", actionListener);
        p3.add(C6.ret());
        Text C7 = new Text("C7", actionListener);
        p3.add(C7.ret());
        Text C8 = new Text("C8", actionListener);
        p3.add(C8.ret());
        Text C9 = new Text("C9", actionListener);
        p3.add(C9.ret());

        Text D1 = new Text("D1", actionListener);
        p4.add(D1.ret());
        Text D2 = new Text("D2", actionListener);
        p4.add(D2.ret());
        Text D3 = new Text("D3", actionListener);
        p4.add(D3.ret());
        Text D4 = new Text("D4", actionListener);
        p4.add(D4.ret());
        Text D5 = new Text("D5", actionListener);
        p4.add(D5.ret());
        Text D6 = new Text("D6", actionListener);
        p4.add(D6.ret());
        Text D7 = new Text("D7", actionListener);
        p4.add(D7.ret());
        Text D8 = new Text("D8", actionListener);
        p4.add(D8.ret());
        Text D9 = new Text("D9", actionListener);
        p4.add(D9.ret());

        Text E1 = new Text("E1", actionListener);
        p5.add(E1.ret());
        Text E2 = new Text("E2", actionListener);
        p5.add(E2.ret());
        Text E3 = new Text("E3", actionListener);
        p5.add(E3.ret());
        Text E4 = new Text("E4", actionListener);
        p5.add(E4.ret());
        Text E5 = new Text("E5", actionListener);
        p5.add(E5.ret());
        Text E6 = new Text("E6", actionListener);
        p5.add(E6.ret());
        Text E7 = new Text("E7", actionListener);
        p5.add(E7.ret());
        Text E8 = new Text("E8", actionListener);
        p5.add(E8.ret());
        Text E9 = new Text("E9", actionListener);
        p5.add(E9.ret());

        Text F1 = new Text("F1", actionListener);
        p6.add(F1.ret());
        Text F2 = new Text("F2", actionListener);
        p6.add(F2.ret());
        Text F3 = new Text("F3", actionListener);
        p6.add(F3.ret());
        Text F4 = new Text("F4", actionListener);
        p6.add(F4.ret());
        Text F5 = new Text("F5", actionListener);
        p6.add(F5.ret());
        Text F6 = new Text("F6", actionListener);
        p6.add(F6.ret());
        Text F7 = new Text("F7", actionListener);
        p6.add(F7.ret());
        Text F8 = new Text("F8", actionListener);
        p6.add(F8.ret());
        Text F9 = new Text("F9", actionListener);
        p6.add(F9.ret());

        Text G1 = new Text("G1", actionListener);
        p7.add(G1.ret());
        Text G2 = new Text("G2", actionListener);
        p7.add(G2.ret());
        Text G3 = new Text("G3", actionListener);
        p7.add(G3.ret());
        Text G4 = new Text("G4", actionListener);
        p7.add(G4.ret());
        Text G5 = new Text("G5", actionListener);
        p7.add(G5.ret());
        Text G6 = new Text("G6", actionListener);
        p7.add(G6.ret());
        Text G7 = new Text("G7", actionListener);
        p7.add(G7.ret());
        Text G8 = new Text("G8", actionListener);
        p7.add(G8.ret());
        Text G9 = new Text("G9", actionListener);
        p7.add(G9.ret());

        Text H1 = new Text("H1", actionListener);
        p8.add(H1.ret());
        Text H2 = new Text("H2", actionListener);
        p8.add(H2.ret());
        Text H3 = new Text("H3", actionListener);
        p8.add(H3.ret());
        Text H4 = new Text("H4", actionListener);
        p8.add(H4.ret());
        Text H5 = new Text("H5", actionListener);
        p8.add(H5.ret());
        Text H6 = new Text("H6", actionListener);
        p8.add(H6.ret());
        Text H7 = new Text("H7", actionListener);
        p8.add(H7.ret());
        Text H8 = new Text("H8", actionListener);
        p8.add(H8.ret());
        Text H9 = new Text("H9", actionListener);
        p8.add(H9.ret());

        Text I1 = new Text("I1", actionListener);
        p9.add(I1.ret());
        Text I2 = new Text("I2", actionListener);
        p9.add(I2.ret());
        Text I3 = new Text("I3", actionListener);
        p9.add(I3.ret());
        Text I4 = new Text("I4", actionListener);
        p9.add(I4.ret());
        Text I5 = new Text("I5", actionListener);
        p9.add(I5.ret());
        Text I6 = new Text("I6", actionListener);
        p9.add(I6.ret());
        Text I7 = new Text("I7", actionListener);
        p9.add(I7.ret());
        Text I8 = new Text("I8", actionListener);
        p9.add(I8.ret());
        Text I9 = new Text("I9", actionListener);
        p9.add(I9.ret());

        //adds all rows into the larger panel
        pall1.add(p1);
        pall1.add(p2);
        pall1.add(p3);
        pall1.add(p4);
        pall1.add(p5);
        pall1.add(p6);
        pall1.add(p7);
        pall1.add(p8);
        pall1.add(p9);

        //adds everything into the grid
        grid.add(pall1);
        grid.add(Solve);
        grid.add(Reset);
        grid.add(Change);
        
        //everything goes into the frame of the window
        frame.add(grid);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();

        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SudokuSolverText solve = new SudokuSolverText();
            }
        });
    }

    public boolean tests() {
        Component list[] = p1.getComponents();
        Component listb[] = p2.getComponents();
        Component listc[] = p3.getComponents();
        Component listd[] = p4.getComponents();
        Component liste[] = p5.getComponents();
        Component listf[] = p6.getComponents();
        Component listg[] = p7.getComponents();
        Component listh[] = p8.getComponents();
        Component listi[] = p9.getComponents();

        //creates a 2D array
        lists[0] = p1.getComponents();
        lists[1] = p2.getComponents();
        lists[2] = p3.getComponents();
        lists[3] = p4.getComponents();
        lists[4] = p5.getComponents();
        lists[5] = p6.getComponents();
        lists[6] = p7.getComponents();
        lists[7] = p8.getComponents();
        lists[8] = p9.getComponents();

        boolean legal = true;

        //does the box have errors in rows
        String temp = null;
        int tem = 0;
        for (int a = 0; a < 9; a++) {
            for (int b = 0; b < 9; b++) {
                temp = lists[a][b].getName();
                tem = b;
                for (int n = 1 + tem; n < 9; n++) {
                    if (temp.equals(lists[a][n].getName())) {
                        legal = false;
                    }
                }
            }
        }
        // check columns 
        Component column[][] = new Component[9][9];
        for (int a = 0; a < 9; a++) {
            for (int b = 0; b < 9; b++) {
                column[a][b] = lists[b][a];
            }
        }

        Component colA[] = new Component[9];
        Component colB[] = new Component[9];
        Component colC[] = new Component[9];
        Component colD[] = new Component[9];
        Component colE[] = new Component[9];
        Component colF[] = new Component[9];
        Component colG[] = new Component[9];
        Component colH[] = new Component[9];
        Component colI[] = new Component[9];

        for (int m = 0; m < 9; m++) {
            colA[m] = column[0][m];
            colB[m] = column[1][m];
            colC[m] = column[2][m];
            colD[m] = column[3][m];
            colE[m] = column[4][m];
            colF[m] = column[5][m];
            colG[m] = column[6][m];
            colH[m] = column[7][m];
            colI[m] = column[8][m];

        }

        String tempcol = null;
        int temcol = 0;
        for (int a = 0; a < 9; a++) {
            for (int b = 0; b < 9; b++) {
                tempcol = column[a][b].getName();
                temcol = b;
                for (int f = 1 + temcol; f < 9; f++) {
                    if (tempcol.equals(column[a][f].getName())) {
                        legal = false;
                    }
                }
            }
        }
        //check for 3x3 box errors
        Component A[][] = new Component[3][3];
        Component B[][] = new Component[3][3];
        Component C[][] = new Component[3][3];
        Component D[][] = new Component[3][3];
        Component E[][] = new Component[3][3];
        Component F[][] = new Component[3][3];
        Component G[][] = new Component[3][3];
        Component H[][] = new Component[3][3];
        Component I[][] = new Component[3][3];

        for (int f = 0; f < 9; f++) {
            for (int g = 0; g < 9; g++) {
                if (f < 3 && g < 3) {
                    A[f][g] = lists[f][g];
                } else if (f < 3 && g < 6) {
                    B[f][g - 3] = lists[f][g];
                } else if (f < 3 && g < 9) {
                    C[f][g - 6] = lists[f][g];
                } else if (f < 6 && g < 3) {
                    D[f - 3][g] = lists[f][g];
                } else if (f < 6 && g < 6) {
                    E[f - 3][g - 3] = lists[f][g];
                } else if (f < 6 && g < 9) {
                    F[f - 3][g - 6] = lists[f][g];
                } else if (f < 9 && g < 3) {
                    G[f - 6][g] = lists[f][g];
                } else if (f < 9 && g < 6) {
                    H[f - 6][g - 3] = lists[f][g];
                } else if (f < 9 && g < 9) {
                    I[f - 6][g - 6] = lists[f][g];
                }
            }
        }

        if (A[0][0].getName().equals(A[1][1].getName()) || A[0][0].getName().equals(A[2][1].getName()) || A[0][0].getName().equals(A[1][2].getName())
                || A[0][0].getName().equals(A[2][2].getName()) || A[0][1].getName().equals(A[1][0].getName())
                || A[0][1].getName().equals(A[1][2].getName()) || A[0][1].getName().equals(A[2][0].getName())
                || A[0][1].getName().equals(A[2][2].getName()) || A[0][2].getName().equals(A[1][0].getName())
                || A[0][2].getName().equals(A[1][1].getName()) || A[0][2].getName().equals(A[2][0].getName())
                || A[0][2].getName().equals(A[2][1].getName()) || A[1][0].getName().equals(A[2][1].getName())
                || A[1][0].getName().equals(A[2][2].getName()) || A[1][1].getName().equals(A[2][0].getName())
                || A[1][1].getName().equals(A[2][2].getName()) || A[1][2].getName().equals(A[2][0].getName())
                || A[1][2].getName().equals(A[2][1].getName())) {
            legal = false;
        }
        if (B[0][0].getName().equals(B[1][1].getName()) || B[0][0].getName().equals(B[2][1].getName()) || B[0][0].getName().equals(B[1][2].getName())
                || B[0][0].getName().equals(B[2][2].getName()) || B[0][1].getName().equals(B[1][0].getName())
                || B[0][1].getName().equals(B[1][2].getName()) || B[0][1].getName().equals(B[2][0].getName())
                || B[0][1].getName().equals(B[2][2].getName()) || B[0][2].getName().equals(B[1][0].getName())
                || B[0][2].getName().equals(B[1][1].getName()) || B[0][2].getName().equals(B[2][0].getName())
                || B[0][2].getName().equals(B[2][1].getName()) || B[1][0].getName().equals(B[2][1].getName())
                || B[1][0].getName().equals(B[2][2].getName()) || B[1][1].getName().equals(B[2][0].getName())
                || B[1][1].getName().equals(B[2][2].getName()) || B[1][2].getName().equals(B[2][0].getName())
                || B[1][2].getName().equals(B[2][1].getName())) {
            legal = false;
        }
        if (C[0][0].getName().equals(C[1][1].getName()) || C[0][0].getName().equals(C[2][1].getName()) || C[0][0].getName().equals(C[1][2].getName())
                || C[0][0].getName().equals(C[2][2].getName()) || C[0][1].getName().equals(C[1][0].getName())
                || C[0][1].getName().equals(C[1][2].getName()) || C[0][1].getName().equals(C[2][0].getName())
                || C[0][1].getName().equals(C[2][2].getName()) || C[0][2].getName().equals(C[1][0].getName())
                || C[0][2].getName().equals(C[1][1].getName()) || C[0][2].getName().equals(C[2][0].getName())
                || C[0][2].getName().equals(C[2][1].getName()) || C[1][0].getName().equals(C[2][1].getName())
                || C[1][0].getName().equals(C[2][2].getName()) || C[1][1].getName().equals(C[2][0].getName())
                || C[1][1].getName().equals(C[2][2].getName()) || C[1][2].getName().equals(C[2][0].getName())
                || C[1][2].getName().equals(C[2][1].getName())) {
            legal = false;
        }
        if (D[0][0].getName().equals(D[1][1].getName()) || D[0][0].getName().equals(D[2][1].getName()) || D[0][0].getName().equals(D[1][2].getName())
                || D[0][0].getName().equals(D[2][2].getName()) || D[0][1].getName().equals(D[1][0].getName())
                || D[0][1].getName().equals(D[1][2].getName()) || D[0][1].getName().equals(D[2][0].getName())
                || D[0][1].getName().equals(D[2][2].getName()) || D[0][2].getName().equals(D[1][0].getName())
                || D[0][2].getName().equals(D[1][1].getName()) || D[0][2].getName().equals(D[2][0].getName())
                || D[0][2].getName().equals(D[2][1].getName()) || D[1][0].getName().equals(D[2][1].getName())
                || D[1][0].getName().equals(D[2][2].getName()) || D[1][1].getName().equals(D[2][0].getName())
                || D[1][1].getName().equals(D[2][2].getName()) || D[1][2].getName().equals(D[2][0].getName())
                || D[1][2].getName().equals(D[2][1].getName())) {
            legal = false;
        }
        if (E[0][0].getName().equals(E[1][1].getName()) || E[0][0].getName().equals(E[2][1].getName()) || E[0][0].getName().equals(E[1][2].getName())
                || E[0][0].getName().equals(E[2][2].getName()) || E[0][1].getName().equals(E[1][0].getName())
                || E[0][1].getName().equals(E[1][2].getName()) || E[0][1].getName().equals(E[2][0].getName())
                || E[0][1].getName().equals(E[2][2].getName()) || E[0][2].getName().equals(E[1][0].getName())
                || E[0][2].getName().equals(E[1][1].getName()) || E[0][2].getName().equals(E[2][0].getName())
                || E[0][2].getName().equals(E[2][1].getName()) || E[1][0].getName().equals(E[2][1].getName())
                || E[1][0].getName().equals(E[2][2].getName()) || E[1][1].getName().equals(E[2][0].getName())
                || E[1][1].getName().equals(E[2][2].getName()) || E[1][2].getName().equals(E[2][0].getName())
                || E[1][2].getName().equals(E[2][1].getName())) {
            legal = false;
        }
        if (F[0][0].getName().equals(F[1][1].getName()) || F[0][0].getName().equals(F[2][1].getName()) || F[0][0].getName().equals(F[1][2].getName())
                || F[0][0].getName().equals(F[2][2].getName()) || F[0][1].getName().equals(F[1][0].getName())
                || F[0][1].getName().equals(F[1][2].getName()) || F[0][1].getName().equals(F[2][0].getName())
                || F[0][1].getName().equals(F[2][2].getName()) || F[0][2].getName().equals(F[1][0].getName())
                || F[0][2].getName().equals(F[1][1].getName()) || F[0][2].getName().equals(F[2][0].getName())
                || F[0][2].getName().equals(F[2][1].getName()) || F[1][0].getName().equals(F[2][1].getName())
                || F[1][0].getName().equals(F[2][2].getName()) || F[1][1].getName().equals(F[2][0].getName())
                || F[1][1].getName().equals(F[2][2].getName()) || F[1][2].getName().equals(F[2][0].getName())
                || F[1][2].getName().equals(F[2][1].getName())) {
            legal = false;
        }
        if (G[0][0].getName().equals(G[1][1].getName()) || G[0][0].getName().equals(G[2][1].getName()) || G[0][0].getName().equals(G[1][2].getName())
                || G[0][0].getName().equals(G[2][2].getName()) || G[0][1].getName().equals(G[1][0].getName())
                || G[0][1].getName().equals(G[1][2].getName()) || G[0][1].getName().equals(G[2][0].getName())
                || G[0][1].getName().equals(G[2][2].getName()) || G[0][2].getName().equals(G[1][0].getName())
                || G[0][2].getName().equals(G[1][1].getName()) || G[0][2].getName().equals(G[2][0].getName())
                || G[0][2].getName().equals(G[2][1].getName()) || G[1][0].getName().equals(G[2][1].getName())
                || G[1][0].getName().equals(G[2][2].getName()) || G[1][1].getName().equals(G[2][0].getName())
                || G[1][1].getName().equals(G[2][2].getName()) || G[1][2].getName().equals(G[2][0].getName())
                || G[1][2].getName().equals(G[2][1].getName())) {
            legal = false;
        }
        if (H[0][0].getName().equals(H[1][1].getName()) || H[0][0].getName().equals(H[2][1].getName()) || H[0][0].getName().equals(H[1][2].getName())
                || H[0][0].getName().equals(H[2][2].getName()) || H[0][1].getName().equals(H[1][0].getName())
                || H[0][1].getName().equals(H[1][2].getName()) || H[0][1].getName().equals(H[2][0].getName())
                || H[0][1].getName().equals(H[2][2].getName()) || H[0][2].getName().equals(H[1][0].getName())
                || H[0][2].getName().equals(H[1][1].getName()) || H[0][2].getName().equals(H[2][0].getName())
                || H[0][2].getName().equals(H[2][1].getName()) || H[1][0].getName().equals(H[2][1].getName())
                || H[1][0].getName().equals(H[2][2].getName()) || H[1][1].getName().equals(H[2][0].getName())
                || H[1][1].getName().equals(H[2][2].getName()) || H[1][2].getName().equals(H[2][0].getName())
                || H[1][2].getName().equals(H[2][1].getName())) {
            legal = false;
        }
        if (I[0][0].getName().equals(I[1][1].getName()) || I[0][0].getName().equals(I[2][1].getName()) || I[0][0].getName().equals(I[1][2].getName())
                || I[0][0].getName().equals(I[2][2].getName()) || I[0][1].getName().equals(I[1][0].getName())
                || I[0][1].getName().equals(I[1][2].getName()) || I[0][1].getName().equals(I[2][0].getName())
                || I[0][1].getName().equals(I[2][2].getName()) || I[0][2].getName().equals(I[1][0].getName())
                || I[0][2].getName().equals(I[1][1].getName()) || I[0][2].getName().equals(I[2][0].getName())
                || I[0][2].getName().equals(I[2][1].getName()) || I[1][0].getName().equals(I[2][1].getName())
                || I[1][0].getName().equals(I[2][2].getName()) || I[1][1].getName().equals(I[2][0].getName())
                || I[1][1].getName().equals(I[2][2].getName()) || I[1][2].getName().equals(I[2][0].getName())
                || I[1][2].getName().equals(I[2][1].getName())) {
            legal = false;
        }

        return legal;

    }

    //what happens when the user selects a textbox
    ActionListener actionListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            
            Component real = (Component) e.getSource();

            JTextField really = (JTextField) real;
            String temp = really.getText();
            really.setName(temp);
            really.setEnabled(false);
            System.out.println(temp);
            tests();
            if (!tests()) {
                really.setEnabled(true);
            }

        }
    };

    //algorithm for the actual solution of the puzzle
    ActionListener buttonListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            //prints out current puzzle in stdout
            for (int x = 0; x < 9; x++) {
                for (int y = 0; y < 9; y++) {
                    System.out.print(lists[x][y].getName());
                    System.out.print("      ");
                }
                System.out.println();
            }

            //checks if puzzle is already solved
            int count = 0;
            for (int x = 0; x < 9; x++) {
                for (int y = 0; y < 9; y++) {
                    if ((lists[x][y].isEnabled())) {
                        break;
                    } else {
                        count++;
                        if (count == 81) {
                            System.out.println("GAME OVER YOU WON");
                        }
                    }
                }

            }
            
            int numbers = 0;
            boolean enable = false;
            boolean check = false;
            boolean bw = false;
            int before = 21;
            boolean tempsa = false;
            boolean traverse = false;
            int bad = 0;
            if (tests()) {
                while (tests()) {
                    for (int x = 0; x < 9; x++) {
                        for (int y = 0; y < 9; y++) {
                            enable = lists[x][y].isEnabled();
                            if (enable) {
                                if (numbers > 8) {
                                    numbers = 11;
                                } else {
                                    numbers++;
                                }

                                lists[x][y].setName("" + numbers);
                                //     lists[x][y].
                                check = tests();

                                if (!tests()) {
                                    while (!tests()) {

                                        lists[x][y].setName("" + numbers);
                                        if (numbers < 10) {
                                            numbers++;
                                        } else {
                                            numbers = 11;
                                            break;
                                        }

                                    }
                                }
                            }
                            if (numbers == 11) {

                                before++;
                                lists[x][y].setName("" + before);

                                System.out.print(lists[x][y].getName());
                                boolean temps;
                                if (y == 0) {
                                    y = 9;
                                    x--;
                                }
                                for (int r = x; r > -1; r--) {
                                    for (int h = y - 1; h > -1; h--) {

                                        temps = lists[r][h].isEnabled();
                                        if ((h == 0) && (!temps)) {
                                            h = 9;
                                            x--;
                                            char bc = '\b';
                                            System.out.print(bc);
                                            System.out.println();
                                            for (int ex = 0; ex < x; ex++) {
                                                for (int why = 0; why < h; why++) {
                                                    System.out.print(lists[ex][why].getName());
                                                    System.out.print("      ");

                                                    if (why == 8) {
                                                        System.out.println();
                                                    }
                                                }
                                            }
                                        }
                                        if (temps) {
                                            if (lists[r][h].getName().equals("1")) {
                                                numbers = 1;
                                            } else if (lists[r][h].getName().equals("2")) {
                                                numbers = 2;
                                            } else if (lists[r][h].getName().equals("3")) {
                                                numbers = 3;
                                            } else if (lists[r][h].getName().equals("4")) {
                                                numbers = 4;
                                            } else if (lists[r][h].getName().equals("5")) {
                                                numbers = 5;
                                            } else if (lists[r][h].getName().equals("6")) {
                                                numbers = 6;
                                            } else if (lists[r][h].getName().equals("7")) {
                                                numbers = 7;
                                            } else if (lists[r][h].getName().equals("8")) {
                                                numbers = 8;
                                            } else if (lists[r][h].getName().equals("9")) {
                                                numbers = 9;
                                            }

                                            y = h;
                                            bad = h - 1;
                                            char bc = '\b';
                                            System.out.print(bc);

                                            for (int ly = 0; ly < y; ly++) {
                                                System.out.print(lists[x][ly].getName());
                                                System.out.print("      ");
                                                if (ly == 8) {
                                                    System.out.println();
                                                }

                                            }

                                            //          traverse = true;
                                            break;
                                            //break;
                                        }

                                    }
                                    //           if(traverse)
                                    if (bad > -1) {
                                        break;
                                    }
                                }
                                bw = true;
                            } else {
                                numbers = 0;
                            }
                            if (bw) {
                                y--;

                                bw = false;

                            } else {
                                System.out.print(lists[x][y].getName());
                                System.out.print("      ");

                                if (y == 8) {
                                    System.out.println();
                                }
                            }
                        }
                    }

                }
            }
        }
    };

    ActionListener Reseter = new ActionListener() {
        public void actionPerformed(ActionEvent e) {

            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    SudokuSolverText solve = new SudokuSolverText();
                }
            });
            frame.dispose();
        }
    };

    @Override

    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
