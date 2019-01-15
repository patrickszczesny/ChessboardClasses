package pl.sdacademy.chessboard.classes;



public class AppBootstrapper {

    public static void start() {

        Chessboard chessboard0 = Chessboard.build(10,

                10);

        Chessboard chessboard1 = Chessboard.build(8, 6);


        System.out.println(chessboard0);

        System.out.println(chessboard1);

    }


}
