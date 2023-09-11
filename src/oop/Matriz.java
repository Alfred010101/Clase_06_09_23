package oop;

/**
 *
 * @author alfredo
 */
public class Matriz
{

    int[][] x;
    int[][][][] y;

    public Matriz()
    {
        x = new int[5][5];
        llenar();
    }

    public Matriz(int a)
    {
        y = new int[3][3][3][3];
        llenar(1);
    }

    public Matriz(int a, int b)
    {
        x = new int[a][b];
        llenar();
    }

    public Matriz(int a, int b, int c, int d)
    {
        y = new int[a][b][c][d];
        llenar(1);
    }

    public Matriz(int[][] x)
    {
        this.x = x;
    }

    public Matriz(int[][][][] y)
    {
        this.y = y;
    }

    public String desplegar()
    {
        String str = "";
        for (int i = 0; i < x.length; i++)
        {
            for (int j = 0; j < x[i].length; j++)
            {
                str += "Dato[" + i + "] = " + x[i][j] + "\t";
            }
            str += "\n";
        }
        return str;
    }

    public String desplegar(int a)
    {
        String str = "";
        for (int i = 0; i < y.length; i++)
        {
            for (int j = 0; j < y[i].length; j++)
            {
                for (int k = 0; k < y[i][j].length; k++)
                {
                    for (int l = 0; l < y[i][j][k].length; l++)
                    {
                        str += "Dato[" + i + "][" + j + "][" + k +"][" + l +"] = " + y[i][j][k][l] + "\t";
                    }
                    str += "\n";
                }
                str += "\n";
            }
            str += "\n";
        }
        return str;
    }

    public void desplegarForEach()
    {
        for (int[] array : x)
        {
            for (int dato : array)
            {
                System.out.print("Dato = " + dato + "\t");
            }
            System.out.println("\n");
        }
    }

    public void desplegarForEach(int a)
    {
        for (int[][][] matrizTres : y)
        {
            for (int[][] matriz : matrizTres)
            {
                for (int[] vector : matriz)
                {
                    for (int value : vector)
                    {
                        System.out.print("Dato = " + value + "\t");
                    }
                    System.out.println("");
                }
                System.out.println("");
            }
            System.out.println("\n");
        }
    }

    private void llenar()
    {
        for (int[] x1 : x)
        {
            for (int j = 0; j < x1.length; j++)
            {
                x1[j] = (int) (Math.random() * 100);
            }
        }
    }

    private void llenar(int a)
    {
        for (int[][][] matrizTres : y)
        {
            for (int[][] matriz : matrizTres)
            {
                for (int[] vector : matriz)
                {
                    for (int i = 0; i < vector.length; i++)
                    {
                        vector[i] = (int) (Math.random() * 100);
                    }
                }
            }
        }
    }
}
