
package domain;

/**
 *
 * @author ahern
 */
public class Matrix {
    
    //Una matriz que indica las posiciones de las naves dentro de la misma
    private Object[][] matrix;
    
    public Matrix() {
        matrix = new Object[3][3];
    }
    
    public int getWidth() {
        return matrix[0].length;
    }
    
    public int getHeight() {
        return matrix.length;
    }

    public Object[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(Object[][] matrix) {
        this.matrix = matrix;
    }
    
}
