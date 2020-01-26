package com.github.artemsetko.javafx.fxml;

import org.springframework.stereotype.Component;

@Component
public class EditView extends SpringFxmlView {

        private static final String FXML_EDIT = "com/github/artemsetko/javafx/fxml/edit.fxml";

        public EditView() {
                super(MainView.class.getClassLoader().getResource(FXML_EDIT));
        }


}
