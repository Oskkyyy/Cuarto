public class TiposDeDatos{
    public static void main(String [] args){
        byte a = -128; // 2 a la 7;
        byte b = 127;
        System.out.println("El byte va desde : "+a+" hasta:"+b);
/*
        byte $a = (byte) -129; //2 a la 7
        byte _b= (byte)128;
        System.out.println("El byte va desde : "+$a+" hasta:"+_b);
 */
        short c; //2 a la 15
        short d;
        c = -32768; 
        d = 32767;
        System.out.println("El short va desde : "+c+" hasta:"+d);
    
        int e, f; // 2 a la 31
        e = -2147483648;
        f = 2147483647;
        System.out.println("El int va desde : "+e+" hasta:"+f);

        long g, h; //2 a la 63
        g = -9223372036854775808l; // termina con l minuscula
        h = 9223372036854775807L; //termina con L mayuscula
        System.out.println("El long va desde : "+g+" hasta: "+h);

        //Para el float se agrega una f o F al final
        float i = 3.121569f;
        System.out.println("Un flotante "+i);
        //Para el double no es necesario la d por defecto es double.
        double j = 3.141569e-2;
        System.out.println("Un double "+j);

        //El lógico o boolean
        boolean k= true;
        boolean l = (5>7); //Se puede asignar a partir de una evaluación o expresión
        System.out.println("El valor logico puede ser "+k+" o "+l);

        //Los char o caracter van del 0 al 65,535 que representa alguno.
        char m = 'a';
        char n = '\u0000'; // Representa el valor vacío 
        char o ='\u003D'; //Representa el signo del igual 
        System.out.println("Algunos char son: "+m+", "+n+","+o);

        //El String o cadena en java es un tipo de objeto
        String cadena = "ABCEDEFGHI";
        for (int x=0; x <cadena.length(); x++){
            System.out.println(cadena.charAt(x)+" ");
        }
    }

}
