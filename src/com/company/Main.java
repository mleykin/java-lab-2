package com.company;

import matrix.MatrixComplex;
import matrix.MatrixDouble;
import complex.Complex;

public class Main {

    public static void main(String[] args) {
        var arr = new Complex[][] {{new Complex(2, 0), new Complex(2, 0), new Complex(3, 0)},
                                  {new Complex(4, 0), new Complex(5, 0), new Complex(6, 0)},
									{new Complex(7, 0), new Complex(8, 0), new Complex(9, 0)}};

	    var m = new MatrixComplex(arr);
	    var copy = new MatrixComplex(m);
	    var empty = new MatrixComplex(3, 3);

	    System.out.println(m);
	    System.out.println(copy);
	    System.out.println(empty);

	    System.out.println(m.mul(m));
	    System.out.println(m.add(m));
	    System.out.println(m.sub(m));
	    System.out.println(m.mul(new Complex (4, 0)));
	    System.out.println(m.transpose());
	    System.out.println(m.triangleForm());
	    System.out.println(m.det());


	    var vect = new Complex[][] {{new Complex(1, 0), new Complex(2, 0), new Complex(3, 0)}};

	    var v = new MatrixComplex(vect);

	    System.out.println(v);
	    System.out.println(v.mul(m));
    }
}
