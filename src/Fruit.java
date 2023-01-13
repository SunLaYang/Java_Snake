import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Fruit {
    private int x;
    private int y;
    private ImageIcon img;


    public Fruit(){
//        img = new ImageIcon("fruit.png");
        img = new ImageIcon(getClass().getResource("fruit.png"));
        this.x = (int) (Math.floor(Math.random() * Main.column) * Main.CELL_SIZE);
        this.y = (int) (Math.floor(Math.random() * Main.row) * Main.CELL_SIZE);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void drawFruit(Graphics g){
//        g.setColor(Color.RED);
//        g.fillOval(this.x, this.y, Main.CELL_SIZE, Main.CELL_SIZE);
        img.paintIcon(null, g, this.x, this.y);
    }

    public void setNewLocation(Snake s){//一定要避開蛇的身體範圍 才能放水果
        int new_x;
        int new_y;
        boolean overlapping;
        do{
            new_x = (int) (Math.floor(Math.random() * Main.column) * Main.CELL_SIZE);
            new_y = (int) (Math.floor(Math.random() * Main.row) * Main.CELL_SIZE);
            overlapping = check_overlap(new_x, new_y, s);
        }while (overlapping);

        this.x = new_x;
        this.y = new_y;
    }
    private boolean check_overlap(int x, int y,Snake s){
        ArrayList<Node> snake_Body = s.getSnakeBody();
        for(int j = 0; j < s.getSnakeBody().size(); j++){
            if(x == snake_Body.get(j).x && y == snake_Body.get(j).y){
                return  true;
            }

        }
        return false;
    }
}
