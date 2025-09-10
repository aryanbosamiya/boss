class PassByValue {
		void f1(int a ) {
			a = a + 10;
  			System.out.ptintln("A =" +a);
	}
}

class Digit {
	int num=10;
}

class PassByRef{
		void f2( Digit d){
		       d.num = d.num + 60;
			
     }
}

class ReturnByValue {
			void f3 ( int c) {
				return c*c;
	}
}

class Result {
	int v;
			void f4 ( int n1 , int n2){
				Result r = new Result ();
				r.v = r. n1 + r. n2
			return r ;
	}
}

		class Q18 {
				public static void main ( string args[ ] ) {
				int k=10;
				PassByValue p = new PassByValue ( );
				p.f1 ( k );

				Digit d = new Digit( );
				d.num( 20 );

				PassByRef p1 = new PassByRef( );
				p1 . f2 ( d );
				System.out.println( "After  " +d.num );
				ReturnByValue r1 = new ReturnByValue( );
				int result = r1.f3( 15 );
				System.out.println(" square " + result);

				Result r2 = new Result ();
				Result object 1 = r2.f4( 4 , 5 );
				System.out.println("sum =" +object 1.v);
	}
}
