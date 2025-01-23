package guipkg;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;

public class PrimaryController {

    
    @FXML
    GridPane grid = new GridPane(); //GridPane Layout
    Button setUpButton = new Button(); //setUpSimulation Button
    Button runButton = new Button(); //runButton

    // Create Agents to fill in the cell of grid
    Region agent = new Region();
    Region vacant = new Region();

    
    public void moveRegionToNewPosition(GridPane gridPane, Region region, int targetRowIndex, int targetColumnIndex) {
        // Remove the region from its current position
        gridPane.getChildren().remove(region);

        // Add the region to the new position
        gridPane.add(region, targetColumnIndex, targetRowIndex);
    }

    @FXML
    public void setUpSimulation(ActionEvent e){
        // Agent in the grid
        agent.setStyle("-fx-background-color:rgb(68, 0, 255);");
        grid.add(agent,0,0);        

        // Vacant in the grid
        vacant.setStyle("-fx-background-color: rgb(0, 255, 81)");
        grid.add(vacant,8,5);

    }
    
    @FXML
    public void runSimulation(ActionEvent e){
        // Number of Rows and Columns: 14x14
        int numRows = grid.getRowCount();
        int numCols = grid.getColumnCount();
        System.out.println(numRows);
        System.out.println(numCols);
        
        // Find the position of the green region
        int greenRow = GridPane.getRowIndex(vacant) != null ? GridPane.getRowIndex(vacant) : 0;
        int greenCol = GridPane.getColumnIndex(vacant) != null ? GridPane.getColumnIndex(vacant) : 0;

        // Move the blue region to the green region's position
        moveRegionToNewPosition(grid, agent, greenRow, greenCol);

        // Optionally, change the color of the regions after the move
        // vacant.setFill(Color.BLUE);  // Make the green region blue
        // agent.setFill(Color.GREEN);  // Make the blue region green
        
        // Optionally, change the color of the regions after the move
        vacant.setStyle("-fx-background-color:rgb(68, 0, 255);");
        agent.setStyle("-fx-background-color: rgb(255, 0, 0)");

        // Fill cells with region in grid
        // for(int row = 0; row < numRows; row++){
        //     for(int col = 0; col < numCols; col++){
        //         Region region = new Region();
        //         grid.add(region,row,col);
        //     }
        // }


    }
    


    
}
