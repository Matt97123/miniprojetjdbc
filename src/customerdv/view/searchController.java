package customerdv.view;

import customerdv.model.beans.RendezVous;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.util.ArrayList;

public class searchController {

    @FXML
    private ListView listViewField;

    public void fillListView(ArrayList<RendezVous> list) {
        listViewField.setItems((ObservableList) list);
    }
}
