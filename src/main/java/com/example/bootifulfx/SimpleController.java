package com.example.bootifulfx;

import javafx.application.HostServices;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class SimpleController {

	private final HostServices hostServices;

	private String Stringtobeused = "String here";

	@FXML
	public Label label;

	@FXML
	public Label label2;

	@FXML
	public Button button1;

	@FXML
	public Button button2;



	@FXML
	public void initialize() {
		this.button1.setOnAction(actionEvent -> {
					if (label.getText().equals(this.hostServices.getDocumentBase())) {
						this.label.setText("");

					} else {
						this.label.setText(this.hostServices.getDocumentBase());
					}

				}
		);
		this.button2.setOnAction(actionEvent -> {
					if (label2.getText().equals(this.Stringtobeused)) {
						this.label2.setText("Something else");

					} else {
						this.label2.setText(this.Stringtobeused);
					}

				}
		);


	}

}
