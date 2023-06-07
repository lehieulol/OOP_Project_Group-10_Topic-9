package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI_Frame extends JFrame{
	private static final long serialVersionUID = 1L;
	JPanel panel = new JPanel(), input_panel = new JPanel(), output_panel = new JPanel();
	JPanel choice_panel = new JPanel();
	Integer[] no_of_variable = {3, 4};
	JComboBox<Integer> num_variable = new JComboBox<Integer>(no_of_variable);
	String[] _output_type = {"SOP", "POS"};
	JComboBox<String> output_type = new JComboBox<String>(_output_type);
	
	public GUI_Frame(String title){
		super(title);
		this.setLayout(new BorderLayout());
		this.add(this.panel);
		
		this.choice_panel.setSize(this.getWidth(), this.getHeight()/8);
		this.panel.add(this.choice_panel, BorderLayout.PAGE_START);
		this.input_panel.setSize(this.getWidth()/2, this.getHeight()*7/8);
		this.panel.add(this.input_panel, BorderLayout.LINE_START);
		this.output_panel.setSize(this.getWidth()/2, this.getHeight()*7/8);
		this.panel.add(this.output_panel, BorderLayout.LINE_END);
		
		// Choice panel
		this.choice_panel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 0));
		this.choice_panel.add(new JLabel("Number of variables:"));
		this.choice_panel.add(num_variable);
		
		this.choice_panel.add(new JLabel(""));
		this.choice_panel.add(new JLabel(""));
		
		this.choice_panel.add(new JLabel("Output type:"));
		this.choice_panel.add(output_type);

		this.choice_panel.add(new JLabel(""));
		this.choice_panel.add(new JLabel(""));
		
		JButton confirm = new JButton("Confirm");
		confirm.addActionListener(new ConfirmClicked(this));
		this.choice_panel.add(confirm);
		
		// Input panel
	}
	
	// Choice panel event handler
	
	private class OptionChanged implements ItemListener{
		
		GUI_Frame frame;
		private OptionChanged(GUI_Frame frame) {
			this.frame = frame;
		}
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() != ItemEvent.SELECTED) {
				return;
			}
			if(e.getSource() == this.frame.num_variable) {
				Integer NoV = (Integer) this.frame.num_variable.getSelectedItem();
				this.frame.input_panel.add()
			}
		}
	}
	
	private class ConfirmClicked implements ActionListener{
		GUI_Frame frame;
		private ConfirmClicked(GUI_Frame frame) {
			this.frame = frame;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			//Get number of variable:
			Integer NoV = (Integer) this.frame.num_variable.getSelectedItem();
			
		}
	}
	
	// Input panel generator
	
	private static JPanel input_panel_generator(Integer NoV) {
		
	}
}
