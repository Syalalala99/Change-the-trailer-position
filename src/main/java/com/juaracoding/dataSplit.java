package com.juaracoding;


public class dataSplit {
    public static void main(String[] args) {
        String satuAtas = ":T1:202112SOAL3";
        String satuBawah = ":T2:SOAL3/2112/AB000000011 OD:0001234500CDE5432100 SOAL003 ABCDE12345 XAS SKILL TEST ESSAY .DT";

        String duaAtas = ":T1:202111SOAL3";
        String duaBawah = ":T2:SOAL3/2111/BC000011100 OD:0003452100EFG2451300 SOAL003 EFGHI25134 XAS SKILL TEST ESSAY .DT";

        String tigaAtas = ":T1:202110SOAL3";
        String tigaBawah = ":T2:SOAL3/2110/DE210031010 OD:0001524300HIJ2145300 SOAL003 JKLMN52431 XAS SKILL TEST ESSAY .DT";

        System.out.println(satuAtas);
        koak(satuBawah);

        System.out.println(duaAtas);
        koak(duaBawah);

        System.out.println(tigaAtas);
        koak(tigaBawah);

    }

    private static String koak(String tagTrailer) {
        char[] tag = new char[4];
        tagTrailer.getChars(0, 4, tag, 0);
        char[] trailer1 = new char[18];
        tagTrailer.getChars(4, 22, trailer1, 0);
        char[] trailer2 = new char[18];
        tagTrailer.getChars(22, 40, trailer2, 0);
        char[] trailer3 = new char[18];
        tagTrailer.getChars(40, 58, trailer3, 0);
        char[] trailer4 = new char[18];
        tagTrailer.getChars(58, 76, trailer4, 0);
        char[] trailer5 = new char[18];
        tagTrailer.getChars(76, 94, trailer5, 0);

        System.out.println(String.valueOf(tag) + String.valueOf(trailer3) + String.valueOf(trailer4) + String.valueOf(trailer5) + String.valueOf(trailer1) + String.valueOf(trailer2));
        return tagTrailer;
    }
}