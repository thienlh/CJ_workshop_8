/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package customtablemodel;

import java.util.Vector;

/**
 *
 * @author thienlh
 */
public class EmployeeTableModel<E> extends javax.swing.table.AbstractTableModel {

    String[] header;
    int[] index;
    Vector<Employee> data;

    public EmployeeTableModel(String[] header, int[] index) {
        this.header = new String[header.length];
        for (int i = 0; i < header.length; i++) {
            this.header[i] = header[i];
        }
        this.index = new int[index.length];
        for (int i = 0; i < header.length; i++) {
            this.index[i] = index[i];
        }
        this.data = new Vector<Employee>();
    }

    public Vector<Employee> getData() {
        return data;
    }

    public int getRowCount() {
        return data.size();
    }

    public int getColumnCount() {
        return header.length;
    }

    @Override
    public String getColumnName(int column) {
        return (column >= 0 && column < header.length) ? header[column] : "";
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        if (rowIndex < 0 || rowIndex >= data.size() || columnIndex < 0 || columnIndex >= header.length) {
            return null;
        }
        Employee emp = data.get(rowIndex);
        switch (index[columnIndex]) {
            case 0:
                return emp.getId();
            case 1:
                return emp.getName();
            case 2:
                return emp.getAddress();
            case 3:
                return emp.isGender();
            case 4:
                return emp.getSalary();
        }
        return null;
    }
}
