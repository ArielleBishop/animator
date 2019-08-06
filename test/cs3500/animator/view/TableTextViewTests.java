package cs3500.animator.view;

import static cs3500.animator.util.AnimationReader.parseFile;
import static org.junit.Assert.assertEquals;

import cs3500.animator.model.AnimationModel;
import cs3500.animator.model.AnimationModelImpl.AnimationModelImplBuilder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;

import org.junit.Test;

/**
 * Runs tests for TableTextView and creates the file necessary for submission.
 */
public class TableTextViewTests {

  /**
   * Creates the file required for submission and checks that the view produces the desired output.
   * @throws FileNotFoundException if the file we are reading in cannot be found.
   */
  @Test
  public void easyTest() throws FileNotFoundException {
    File file = new File("C:\\Users\\jmich\\Desktop\\animation_examples\\toh-3.txt");
    Readable readable = new FileReader(file);
    AnimationModelImplBuilder builder = new AnimationModelImplBuilder();
    AnimationModel model = parseFile(readable, builder);

    model.setCanvas();

    TableTextViewImpl view = new TableTextViewImpl(model, new StringBuilder());

    //creates the actual file for the submission
    PrintStream output = null;
    output = new PrintStream(new File("text-transcript.txt"));

    TableTextViewImpl viewForFile = new TableTextViewImpl(model, output);

    view.display();
    viewForFile.display();
    assertEquals("canvas 0 0 555 270\n"
            + "shape disk1 RECTANGLE\n"
            + "motion disk1 0 0 0 0 0 0 0 0     0 0 0 0 0 0 0 0\n"
            + "motion disk1 0 0 0 0 0 0 0 0     1 190 180 20 30 0 49 90\n"
            + "motion disk1 1 190 180 20 30 0 49 90     1 190 180 20 30 0 49 90\n"
            + "motion disk1 1 190 180 20 30 0 49 90     25 190 180 20 30 0 49 90\n"
            + "motion disk1 25 190 180 20 30 0 49 90     35 190 50 20 30 0 49 90\n"
            + "motion disk1 35 190 50 20 30 0 49 90     36 190 50 20 30 0 49 90\n"
            + "motion disk1 36 190 50 20 30 0 49 90     46 490 50 20 30 0 49 90\n"
            + "motion disk1 46 490 50 20 30 0 49 90     47 490 50 20 30 0 49 90\n"
            + "motion disk1 47 490 50 20 30 0 49 90     57 490 240 20 30 0 49 90\n"
            + "motion disk1 57 490 240 20 30 0 49 90     89 490 240 20 30 0 49 90\n"
            + "motion disk1 89 490 240 20 30 0 49 90     99 490 50 20 30 0 49 90\n"
            + "motion disk1 99 490 50 20 30 0 49 90     100 490 50 20 30 0 49 90\n"
            + "motion disk1 100 490 50 20 30 0 49 90     110 340 50 20 30 0 49 90\n"
            + "motion disk1 110 340 50 20 30 0 49 90     111 340 50 20 30 0 49 90\n"
            + "motion disk1 111 340 50 20 30 0 49 90     121 340 210 20 30 0 49 90\n"
            + "motion disk1 121 340 210 20 30 0 49 90     153 340 210 20 30 0 49 90\n"
            + "motion disk1 153 340 210 20 30 0 49 90     163 340 50 20 30 0 49 90\n"
            + "motion disk1 163 340 50 20 30 0 49 90     164 340 50 20 30 0 49 90\n"
            + "motion disk1 164 340 50 20 30 0 49 90     174 190 50 20 30 0 49 90\n"
            + "motion disk1 174 190 50 20 30 0 49 90     175 190 50 20 30 0 49 90\n"
            + "motion disk1 175 190 50 20 30 0 49 90     185 190 240 20 30 0 49 90\n"
            + "motion disk1 185 190 240 20 30 0 49 90     217 190 240 20 30 0 49 90\n"
            + "motion disk1 217 190 240 20 30 0 49 90     227 190 50 20 30 0 49 90\n"
            + "motion disk1 227 190 50 20 30 0 49 90     228 190 50 20 30 0 49 90\n"
            + "motion disk1 228 190 50 20 30 0 49 90     238 490 50 20 30 0 49 90\n"
            + "motion disk1 238 490 50 20 30 0 49 90     239 490 50 20 30 0 49 90\n"
            + "motion disk1 239 490 50 20 30 0 49 90     249 490 180 20 30 0 49 90\n"
            + "motion disk1 249 490 180 20 30 0 49 90     257 490 180 20 30 0 255 0\n"
            + "motion disk1 257 490 180 20 30 0 255 0     302 490 180 20 30 0 255 0\n"
            + "shape disk2 RECTANGLE\n"
            + "motion disk2 0 0 0 0 0 0 0 0     0 0 0 0 0 0 0 0\n"
            + "motion disk2 0 0 0 0 0 0 0 0     1 167 210 65 30 6 247 41\n"
            + "motion disk2 1 167 210 65 30 6 247 41     1 167 210 65 30 6 247 41\n"
            + "motion disk2 1 167 210 65 30 6 247 41     57 167 210 65 30 6 247 41\n"
            + "motion disk2 57 167 210 65 30 6 247 41     67 167 50 65 30 6 247 41\n"
            + "motion disk2 67 167 50 65 30 6 247 41     68 167 50 65 30 6 247 41\n"
            + "motion disk2 68 167 50 65 30 6 247 41     78 317 50 65 30 6 247 41\n"
            + "motion disk2 78 317 50 65 30 6 247 41     79 317 50 65 30 6 247 41\n"
            + "motion disk2 79 317 50 65 30 6 247 41     89 317 240 65 30 6 247 41\n"
            + "motion disk2 89 317 240 65 30 6 247 41     185 317 240 65 30 6 247 41\n"
            + "motion disk2 185 317 240 65 30 6 247 41     195 317 50 65 30 6 247 41\n"
            + "motion disk2 195 317 50 65 30 6 247 41     196 317 50 65 30 6 247 41\n"
            + "motion disk2 196 317 50 65 30 6 247 41     206 467 50 65 30 6 247 41\n"
            + "motion disk2 206 467 50 65 30 6 247 41     207 467 50 65 30 6 247 41\n"
            + "motion disk2 207 467 50 65 30 6 247 41     217 467 210 65 30 6 247 41\n"
            + "motion disk2 217 467 210 65 30 6 247 41     225 467 210 65 30 0 255 0\n"
            + "motion disk2 225 467 210 65 30 0 255 0     302 467 210 65 30 0 255 0\n"
            + "shape disk3 RECTANGLE\n"
            + "motion disk3 0 0 0 0 0 0 0 0     0 0 0 0 0 0 0 0\n"
            + "motion disk3 0 0 0 0 0 0 0 0     1 145 240 110 30 11 45 175\n"
            + "motion disk3 1 145 240 110 30 11 45 175     1 145 240 110 30 11 45 175\n"
            + "motion disk3 1 145 240 110 30 11 45 175     121 145 240 110 30 11 45 175\n"
            + "motion disk3 121 145 240 110 30 11 45 175     131 145 50 110 30 11 45 175\n"
            + "motion disk3 131 145 50 110 30 11 45 175     132 145 50 110 30 11 45 175\n"
            + "motion disk3 132 145 50 110 30 11 45 175     142 445 50 110 30 11 45 175\n"
            + "motion disk3 142 445 50 110 30 11 45 175     143 445 50 110 30 11 45 175\n"
            + "motion disk3 143 445 50 110 30 11 45 175     153 445 240 110 30 11 45 175\n"
            + "motion disk3 153 445 240 110 30 11 45 175     161 445 240 110 30 0 255 0\n"
            + "motion disk3 161 445 240 110 30 0 255 0     302 445 240 110 30 0 255 0\n",
            view.output.toString());
  }
}