import java.io.*;

public class highScore {
    public int highestScore;

    public static void main(String[] args) throws IOException {
        userHighScore highscore = new userHighScore();
        highscore.highScore = 0;
        highscore.currentScore = 0;
        FileOutputStream FileOut = new FileOutputStream("C:\\Users\\SMULLENJT23\\IdeaProjects\\snake\\HighScore.ser");
        ObjectOutputStream out = new ObjectOutputStream(FileOut);
        out.writeObject(highscore);
        out.close();
        FileOut.close();
    }
    highScore(int applesEaten){
        userHighScore highscore = null;
        try {
            FileInputStream FileIn = new FileInputStream("C:\\Users\\SMULLENJT23\\IdeaProjects\\snake\\HighScore.ser");
            ObjectInputStream in = new ObjectInputStream(FileIn);
            highscore = (userHighScore) in.readObject();
            in.close();
            FileIn.close();
        }catch(Exception e){
            System.out.println("File not found");
        }
        highscore.currentScore = applesEaten;
        if(highscore.currentScore > highscore.highScore){
            highscore.highScore = highscore.currentScore;
            try {
                FileOutputStream FileOut = new FileOutputStream("C:\\Users\\SMULLENJT23\\IdeaProjects\\snake\\HighScore.ser");
                ObjectOutputStream out = new ObjectOutputStream(FileOut);
                out.writeObject(highscore);
                out.close();
                FileOut.close();
            }catch(Exception e){
                System.out.println("File not found");
            }
        }
        highestScore = highscore.highScore;
    }
}