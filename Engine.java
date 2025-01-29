import java.util.regex.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.util.Random;
import java.net.URL;


public class Engine {
    
    public static void main(String[] args) throws IOException {
        try (Scanner sc = new Scanner(System.in)) {
        boolean isValid = false;
        int spielTag = 19;
        boolean isEnglish = false;
        Random rand = new Random();

        double a = 883.00; // Bayern
        double b = 445.70; // BVB
        double c = 103.10; // Mainz
        double d = 92.98; // Augsburg
        double e = 320.55; // Frankfurt
        double f = 532.25; // Leipzig
        double g = 152.05; // Hoffenheim
        double h = 140.20; // Gladbach
        double i = 52.88; // St Pauli
        double j = 39.60; // Kiel
        double k = 334.23; // VfB
        double l = 70.18; // Heidenheim
        double m = 49.75; // Bochum
        double n = 121.08; // Union
        double o = 224.30; // Wolfsburg
        double p = 126.35; // Bremen
        double q = 153.35; // Freiburg
        double r = 609.05; // Leverkusen

        String stadiumA = "Allianz Arena"; // Bayern
        String stadiumB = "Signal Iduna Park"; // BVB
        String stadiumC = "Opel Arena"; // Mainz
        String stadiumD = "WWK Arena"; // Augsburg
        String stadiumE = "Deutsche Bank Park"; // Frankfurt
        String stadiumF = "Red Bull Arena"; // Leipzig
        String stadiumG = "PreZero Arena"; // Hoffenheim
        String stadiumH = "Borussia-Park"; // Gladbach
        String stadiumI = "Millerntor-Stadion"; // St Pauli
        String stadiumJ = "Holstein-Stadion"; // Kiel
        String stadiumK = "Mercedes-Benz Arena"; // VfB
        String stadiumL = "Voith-Arena"; // Heidenheim
        String stadiumM = "Vonovia Ruhrstadion"; // Bochum
        String stadiumN = "Stadion An der Alten Försterei"; // Union
        String stadiumO = "Volkswagen Arena"; // Wolfsburg
        String stadiumP = "Weserstadion"; // Bremen
        String stadiumQ = "Schwarzwald-Stadion"; // Freiburg
        String stadiumR = "BayArena"; // Leverkusen

        String positionA = "1. Platz zum " + spielTag + " Spieltag"; // Bayern          
        String positionB = "11. Platz zum " + spielTag + " Spieltag"; // BVB
        String positionC = "6. Platz zum " + spielTag + " Spieltag"; // Mainz
        String positionD = "12. Platz zum " + spielTag + " Spieltag"; // Augsburg
        String positionE = "3. Platz zum " + spielTag + " Spieltag"; // Frankfurt
        String positionF = "5. Platz zum " + spielTag + " Spieltag"; // Leipzig
        String positionG = "15. Platz zum " + spielTag + " Spieltag"; // Hoffenheim
        String positionH = "8. Platz zum " + spielTag + " Spieltag"; // Gladbach
        String positionI = "13. Platz zum " + spielTag + " Spieltag"; // St Pauli
        String positionJ = "17. Platz zum " + spielTag + " Spieltag"; // Kiel
        String positionK = "4. Platz zum " + spielTag + " Spieltag"; // VfB
        String positionL = "16. Platz zum " + spielTag + " Spieltag"; // Heidenheim
        String positionM = "18. Platz zum " + spielTag + " Spieltag"; // Bochum
        String positionN = "14. Platz zum " + spielTag + " Spieltag"; // Union
        String positionO = "7. Platz zum " + spielTag + " Spieltag"; // Wolfsburg
        String positionP = "9. Platz zum " + spielTag + " Spieltag"; // Bremen
        String positionQ = "10. Platz zum " + spielTag + " Spieltag"; // Freiburg
        String positionR = "2. Platz zum " + spielTag + " Spieltag"; // Leverkusen
            System.out.println("--------------------------------------------");
            System.out.println("\u001B[31mHinweis:\u001B[0m die erfassten Daten stammen von Spieltag \u001B[31m" + spielTag + "\u001B[0m der Bundesliga im Jahr 2025.");
            System.out.println(" ");
            System.out.printf("\t\t\t\t\t\t\t\t\t\t+---------------------------------+\t\t\t\t\t\t\t\t\t\t\n");
            System.out.printf("\t\t\t\t\t\t\t\t\t\t|       Majid  Leith Al-Shalbi    |\t\t\t\t\t\t\t\t\t\t\n");
            System.out.printf("\t\t\t\t\t\t\t\t\t\t+---------------------------------+\t\t\t\t\t\t\t\t\t\t\n");
            


        while (!isValid) {
            System.out.println("--------------------------------------------");
            if (isEnglish) {
                System.out.println("Enter '\u001B[31mstop\u001B[0m' to stop the program.");
                System.out.println("Enter '\u001B[31mTable\u001B[0m' to see the current table.");
                System.out.println("Enter the \u001B[31mclub name\u001B[0m to get information about it.");
                System.out.println("Enter '\u001B[31mTop Scorers\u001B[0m' to see the current top scorers.");
                System.out.println("Enter '\u001B[31mGame\u001B[0m' to simulate a game between two clubs.");
                System.out.println("Enter '\u001B[31mClear\u001B[0m' to clear the screen.");
                System.out.println("Enter '\u001B[31mPenalty Shootout\u001B[0m' to simulate a penalty shootout.");
                System.out.println("Enter '\u001B[31mTranslate\u001B[0m' to translate the menu back to German.");
            } else {
                System.out.println("Geben Sie '\u001B[31mstop\u001B[0m' ein, um das Programm zu beenden.");
                System.out.println("Geben Sie '\u001B[31mTabelle\u001B[0m' ein, um die Aktuelle Tabelle zu sehen.");
                System.out.println("Geben Sie den \u001B[31mVereinsnamen\u001B[0m ein, um Informationen über ihn zu erhalten.");
                System.out.println("Geben Sie '\u001B[31mTorschützen\u001B[0m' ein, um die Aktuellen Torschützen zu sehen.");
                System.out.println("Geben Sie '\u001B[31mSpiel\u001B[0m' ein, um ein Spiel zwischen zwei Vereinen zu simulieren.");
                System.out.println("Geben Sie '\u001B[31mClear\u001B[0m' ein, um den Bildschirm zu leeren.");
                System.out.println("Geben Sie '\u001B[31mElfer oder Elfmeter\u001B[0m' ein, um ein Elfmeterschießen zu Simulieren.");
                System.out.println("Geben Sie '\u001B[31mTranslate\u001B[0m' ein, um das Menü auf Englisch zu übersetzen.");
            }
            System.out.println("--------------------------------------------");
            String input = sc.nextLine();
            Pattern Bayern = Pattern.compile("(Bayern|bayern|FC Bayern|fc bayern)");
            Pattern LEV = Pattern.compile("(leverkusen|Leverkusen|Bayer Leverkusen|bayer leverkusen)");
            Pattern BVB = Pattern.compile("(BVB|Dortmund|dortmund|Borussia Dortmund|borussia dortmund)");
            Pattern MAINZ = Pattern.compile("(M05|Mainz|mainz|Mainz 05|mainz 05)");
            Pattern AUG = Pattern.compile("(Augsburg|augsburg|FCA|fca)");
            Pattern EINTRACHT = Pattern.compile("(Frankfurt|Eintracht|frankfurt|eintracht)");
            Pattern LEIPZ = Pattern.compile("(Leipzig|leipzig)");
            Pattern HOFFENH = Pattern.compile("(Hoffenheim|hoffenheim)");
            Pattern GLADBACH = Pattern.compile("(Gladbach|gladbach)");
            Pattern STPAU = Pattern.compile("(St Pauli|st pauli|stpauli)");
            Pattern SVH = Pattern.compile("(Kiel|kiel|Holstein Kiel|holstein kiel)");
            Pattern STUTTG = Pattern.compile("(VFB|VfB|vfb|Stuttgart|stuttgart)");
            Pattern HEIDENH = Pattern.compile("(Heidenheim|heidenheim)");
            Pattern BOCHUM = Pattern.compile("(bochum|Bochum)");
            Pattern UNION = Pattern.compile("(Union|union|Berlin|berlin|Union Berlin|union berlin)");
            Pattern WOLFSB = Pattern.compile("(Wolfsburg|wolfsburg)");
            Pattern BREMEN = Pattern.compile("(Bremen|bremen|werder|Werder|Werder Bremen|werder bremen|svw|SVW)");
            Pattern FREIB = Pattern.compile("(Freiburg|freiburg|SCF|scf)");
            Pattern TABELLE = Pattern.compile("(Tabelle|tabelle|table|Table)");
            Pattern TOR = Pattern.compile("(Torschützen|torschützen|Top Scorers|top scorers)");
            Pattern SPIEL = Pattern.compile("(Spiel|spiel|Game|game)");
            Pattern Clear = Pattern.compile("(clear|Clear|Clean|clean)");
            Pattern Pen = Pattern.compile("(elfer|Elfer|lfmeter|elfmeter|Penalty|penalty|Penalty Shootout|penalty shootout)");
            Pattern Translate = Pattern.compile("(translate|Translate)");
            Pattern Dev = Pattern.compile("(dev|Dev)");


            Matcher TAB = TABELLE.matcher(input);
            Matcher A = Bayern.matcher(input);
            Matcher B = BVB.matcher(input);
            Matcher C = MAINZ.matcher(input);
            Matcher D = AUG.matcher(input);
            Matcher E = EINTRACHT.matcher(input);
            Matcher F = LEIPZ.matcher(input);
            Matcher G = HOFFENH.matcher(input);
            Matcher H = GLADBACH.matcher(input);
            Matcher I = STPAU.matcher(input);
            Matcher J = SVH.matcher(input);
            Matcher K = STUTTG.matcher(input);
            Matcher L = HEIDENH.matcher(input);
            Matcher M = BOCHUM.matcher(input);
            Matcher N = UNION.matcher(input);
            Matcher O = WOLFSB.matcher(input);
            Matcher P = BREMEN.matcher(input);
            Matcher Q = FREIB.matcher(input);
            Matcher R = LEV.matcher(input);
            Matcher TR = TOR.matcher(input);
            Matcher SP = SPIEL.matcher(input);
            Matcher CL = Clear.matcher(input);
            Matcher PE = Pen.matcher(input);
            Matcher TL = Translate.matcher(input);
            Matcher DEV = Dev.matcher(input);
    
            if (TL.find()) {
                isEnglish = !isEnglish;
                if (isEnglish) {
                    System.out.println("Menu translated to English.");
                } else {
                    System.out.println("Menü zurück auf Deutsch übersetzt.");
                }
            } else if (isEnglish) {
                // Translate input to German before processing
                input = translate("en", "de", input);
            }

            if (A.find()) {
                System.out.println(positionA); // Bayern
                System.out.println("\u001B[32mKadermarktwert liegt bei " + a + " Mio.€\u001B[0m");
                System.out.println("Stadion: " + stadiumA);
            } else if (B.find()) {
                System.out.println(positionB); // BVB
                System.out.println("\u001B[32mKadermarktwert liegt bei " + b + " Mio.€\u001B[0m");
                System.out.println("Stadion: " + stadiumB);
            } else if (C.find()) {
                System.out.println(positionC); // Mainz
                System.out.println("\u001B[32mKadermarktwert liegt bei " + c + " Mio.€\u001B[0m");
                System.out.println("Stadion: " + stadiumC);
            } else if (D.find()) {
                System.out.println(positionD);  // Augsburg
                System.out.println("\u001B[32mKadermarktwert liegt bei " + d + " Mio.€\u001B[0m");
                System.out.println("Stadion: " + stadiumD);
            } else if (E.find()) {
                System.out.println(positionE);   // Frankfurt
                System.out.println("\u001B[32mKadermarktwert liegt bei " + e + " Mio.€\u001B[0m");
                System.out.println("Stadion: " + stadiumE);
            } else if (F.find()) {
                System.out.println(positionF);   // Leipzig
                System.out.println("\u001B[32mKadermarktwert liegt bei " + f + " Mio.€\u001B[0m");
                System.out.println("Stadion: " + stadiumF);
            } else if (G.find()) {
                System.out.println(positionG);   // Hoffenheim
                System.out.println("\u001B[32mKadermarktwert liegt bei " + g + " Mio.€\u001B[0m");
                System.out.println("Stadion: " + stadiumG);
            } else if (H.find()) {
                System.out.println(positionH);   // Gladbach
                System.out.println("\u001B[32mKadermarktwert liegt bei " + h + " Mio.€\u001B[0m");
                System.out.println("Stadion: " + stadiumH);
            } else if (I.find()) {
                System.out.println(positionI);   // St Pauli
                System.out.println("\u001B[32mKadermarktwert liegt bei " + i + " Mio.€\u001B[0m");
                System.out.println("Stadion: " + stadiumI);
            } else if (J.find()) {
                System.out.println(positionJ); // Kiel
                System.out.println("\u001B[32mKadermarktwert liegt bei " + j + " Mio.€\u001B[0m");
                System.out.println("Stadion: " + stadiumJ);
            } else if (K.find()) {
                System.out.println(positionK);   // VfB
                System.out.println("\u001B[32mKadermarktwert liegt bei " + k + " Mio.€\u001B[0m");
                System.out.println("Stadion: " + stadiumK);
            } else if (L.find()) {
                System.out.println(positionL);   // Heidenheim
                System.out.println("\u001B[32mKadermarktwert liegt bei " + l + " Mio.€\u001B[0m");
                System.out.println("Stadion: " + stadiumL);
            } else if (M.find()) {
                System.out.println(positionM);   // Bochum
                System.out.println("\u001B[32mKadermarktwert liegt bei " + m + " Mio.€\u001B[0m");
                System.out.println("Stadion: " + stadiumM);
            } else if (N.find()) {
                System.out.println(positionN);   // Union
                System.out.println("\u001B[32mKadermarktwert liegt bei " + n + " Mio.€\u001B[0m");
                System.out.println("Stadion: " + stadiumN);
            } else if (O.find()) {
                System.out.println(positionO);   // Wolfsburg
                System.out.println("\u001B[32mKadermarktwert liegt bei " + o + " Mio.€\u001B[0m");
                System.out.println("Stadion: " + stadiumO);
            } else if (P.find()) {
                System.out.println(positionP);   // Bremen
                System.out.println("\u001B[32mKadermarktwert liegt bei " + p + " Mio.€\u001B[0m");
                System.out.println("Stadion: " + stadiumP);
            } else if (Q.find()) {
                System.out.println(positionQ);   // Freiburg
                System.out.println("\u001B[32mKadermarktwert liegt bei " + q + " Mio.€\u001B[0m");
                System.out.println("Stadion: " + stadiumQ);
            } else if (R.find()) {
                System.out.println(positionR);   // Leverkusen
                System.out.println("\u001B[32mKadermarktwert liegt bei " + r + " Mio.€\u001B[0m");
                System.out.println("Stadion: " + stadiumR);
            } else if (TR.find()) {
                System.out.println("Torschützenliste:");
                System.out.println("1. Harry Kane (Bayern München) - \u001B[31m17 Tore\u001B[0m");
                System.out.println("2. Omar Marmoush (Eintracht Frankfurt) - \u001B[31m15 Tore\u001B[0m");
                System.out.println("3. Jonathan Burkardt (FSV Mainz 05) - \u001B[31m12 Tore\u001B[0m");
                System.out.println("4. Patrick Schick (Bayer 04 Leverkusen) - \u001B[31m12 Tore\u001B[0m");
                System.out.println("5. Tim Kleindienst (Borussia Mönchengladbach) - \u001B[31m12 Tore\u001B[0m");
                System.out.println("6. Florian Wirtz (Bayer 04 Leverkusen) - \u001B[31m10 Tore\u001B[0m");
            } else if (TAB.find()) {
                System.out.println("--------------------------------------------");
                System.out.println("\u001B[34mPlatz\tVerein\t\t\t\t\tSpiele\tS\tU\tN\tTore\t\tPunkte\u001B[0m");
                System.out.println("\u001B[34m1.\tBayern München [Champions League]\t" + spielTag + "\t15\t3\t1\t53:16\t+42\t47\u001B[0m");
                System.out.println("\u001B[34m2.\tBayer Leverkusen [Champions League]\t" + spielTag + "\t12\t5\t1\t44:24\t+20\t41\u001B[0m");
                System.out.println("\u001B[34m3.\tEintracht Frankfurt [Champions League]\t" + spielTag + "\t11\t3\t4\t42:24\t+18\t36\u001B[0m");
                System.out.println("\u001B[34m4.\tVfB Stuttgart [Champions League]\t" + spielTag + "\t9\t5\t4\t36:26\t+10\t32\u001B[0m");
                System.out.println("\u001B[33m5.\tRB Leipzig [Europa League]\t\t" + spielTag + "\t9\t4\t5\t32:27\t+5\t31\u001B[0m");
                System.out.println("\u001B[32m6.\tMainz 05 [Conference League]\t\t" + spielTag + "\t8\t4\t6\t31:23\t+8\t28\u001B[0m");
                System.out.println("7.\tVfL Wolfsburg\t\t\t\t" + spielTag + "\t8\t3\t7\t40:32\t+8\t27");
                System.out.println("8.\tSC Freiburg\t\t\t\t" + spielTag + "\t8\t3\t7\t25:34\t-9\t27");
                System.out.println("9.\tWerder Bremen\t\t\t\t" + spielTag + "\t7\t5\t6\t31:34\t-3\t26");
                System.out.println("10.\tBorussia Dortmund\t\t\t" + spielTag + "\t7\t4\t7\t32:31\t+1\t25");
                System.out.println("11.\tBorussia Mönchengladbach\t\t" + spielTag + "\t7\t3\t8\t27:29\t-2\t24");
                System.out.println("12.\tFC Augsburg\t\t\t\t" + spielTag + "\t6\t4\t8\t21:33\t-12\t22");
                System.out.println("13.\tUnion Berlin\t\t\t\t" + spielTag + "\t5\t5\t8\t16:24\t-8\t20");
                System.out.println("14.\tFC St. Pauli\t\t\t\t" + spielTag + "\t5\t2\t11\t14:21\t-7\t17");
                System.out.println("15.\tTSG Hoffenheim\t\t\t\t" + spielTag + "\t4\t5\t9\t23:35\t-12\t17");
                System.out.println("\u001B[33m16.\t1. FC Heidenheim [Relegation]\t\t" + spielTag + "\t4\t2\t12\t23:38\t-15\t14\u001B[0m");
                System.out.println("\u001B[31m17.\tHolstein Kiel [Abstieg]\t\t\t" + spielTag + "\t3\t2\t13\t26:46\t-20\t11\u001B[0m");
                System.out.println("\u001B[31m18.\tVfL Bochum [Abstieg]\t\t\t" + spielTag + "\t2\t4\t12\t17:40\t-23\t10\u001B[0m");
                System.out.println("--------------------------------------------");
            } else if (SP.find()) {
                System.out.println("Geben Sie den Namen des ersten Vereins ein:");
                String team1 = sc.nextLine();
                System.out.println("Geben Sie den Namen des zweiten Vereins ein:");
                if (isEnglish) {
                    System.out.println("Enter the name of the second club:");
                } else {
                    System.out.println("Geben Sie den Namen des zweiten Vereins ein:");
                }
                String team2 = sc.nextLine();
                boolean isChampionsLeague = isChampionsLeagueMatchup(team1, team2);
                boolean isInternational = isInternationalGame(team1, team2);
                int[] firstLegScore = simulateGame(team1, team2, sc, isChampionsLeague, isEnglish);
                if (isChampionsLeague) {
                    System.out.println("Simuliere Rückspiel...");
                    try {
                        Thread.sleep(4000); // 4 Sekunden Verzögerung
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                    int[] secondLegScore = simulateGame(team2, team1, sc, isChampionsLeague, isEnglish);
                    int aggregateScore1 = firstLegScore[0] + secondLegScore[1];
                    int aggregateScore2 = firstLegScore[1] + secondLegScore[0];
                    System.out.println("Gesamtergebnis:");
                    System.out.println(team1 + " " + aggregateScore1 + " - " + aggregateScore2 + " " + team2);
                    if (aggregateScore1 > aggregateScore2) {
                        System.out.println("\u001B[32m" + team1 + " gewinnt mit " + aggregateScore1 + " - " + aggregateScore2 + "\u001B[0m");
                        // Gewinner ist team1
                    } else if (aggregateScore2 > aggregateScore1) {
                        System.out.println("\u001B[32m" + team2 + " gewinnt mit " + aggregateScore2 + " - " + aggregateScore1 + "\u001B[0m");
                        // Gewinner ist team2
                    } else {
                        if (rand.nextBoolean()) {
                            System.out.println("\u001B[32m" + team1 + " gewinnt nach Elfmeterschießen\u001B[0m");
                            // Gewinner ist team1
                        } else {
                            System.out.println("\u001B[32m" + team2 + " gewinnt nach Elfmeterschießen\u001B[0m");
                            team1 = team2; // Gewinner ist team2
                        }
                    

                    }
                    System.out.println("Möchten Sie ein weiteres Champions-League-Spiel mit dem Gewinner simulieren? (ja/nein)");
                    String response = sc.nextLine();
                    if (response.equalsIgnoreCase("ja")) {
                        System.out.println("Geben Sie den Namen des neuen Gegners ein:");
                        String newOpponent = sc.nextLine();
                        simulateGame(team1, newOpponent, sc, true, isEnglish);
                    }
                }
            } else if (input.equalsIgnoreCase("stop")) {
                isValid = true;
            } else if (CL.find()) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            } else if (DEV.find()) {
               System.out.println("Developer Mode");
            }  else if (PE.find()) {
                System.out.println("Geben Sie den Namen des ersten Vereins ein:");
                String team1 = sc.nextLine();
                System.out.println("Geben Sie den Namen des zweiten Vereins ein:");
                String team2 = sc.nextLine();
                
                int team1Score = 0;
                int team2Score = 0;
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("--------------------------------------------");
                if (isEnglish) {
                    System.out.println("Referee: " + getRandomReferee(rand));
                 } else {
                System.out.println("Schiedsrichter: " + getRandomReferee(rand));
                System.out.println(" ");
                    String[] finale = {"Halbfinale", "Viertelfinale", "Achtelfinale"};
                    String[] finaleEnglish = {"Semi-Final", "Quarter-Final", "Round of 16"};
                    if (isEnglish) {
                        System.out.println("\u001B[34mUEFA Champions League - " + finaleEnglish[rand.nextInt(finaleEnglish.length)] + "\u001B[0m");
                    } else {
                        System.out.println("\u001B[34mUEFA Champions League - " + finale[rand.nextInt(finale.length)] + "\u001B[0m");
                    }
                    System.out.println(" ");
                    System.out.println("Elfmeterschießen:");
                    System.out.println(" ");
                    System.out.println(" ");

                System.out.println(team1 + " " + "-" +" " + team2);
                System.out.println(" ");
                                    for (int penalty = 1; penalty <= 5; penalty++) {
                                        System.out.println(getRandomPlayer(team1, rand) + ": Drücke enter um zu schießen");
                                        sc.nextLine();
                                        if (rand.nextBoolean()) {
                                            System.out.println("Tor!");
                                            team1Score++;
                                        } else {
                                            System.out.println("Verschossen!");
                                        }
                                        System.out.println(" ");
                                        System.out.println(getRandomPlayer(team2, rand) + ": Drücke Enter um zu schießen");
                                        sc.nextLine();
                                        if (rand.nextBoolean()) {
                                            System.out.println("Tor!");
                                            team2Score++;
                                        } else {
                                            System.out.println("Verschossen!");
                                        }
                                    }
                                    System.out.println("Endergebnis: " + team1 + " " + team1Score + " - " + team2Score + " " + team2);
                                
                        }}  else {
                                                    System.out.println("Ungültige Eingabe. Bitte versuchen Sie es erneut.");    
                                                }
                                            }
        }}
                                    
                            
    public static String Sponsor(Random rand) {
        String[] sponsor = {"\u001B[32mKrombacher\u001B[0m", "\u001B[32mHeineken\u001B[0m", "\u001B[32mMercedes-Benz\u001B[0m", "\u001B[32mTelekom\u001B[0m", "\u001B[32mo2\u001B[0m", "\u001B[32mBarclays\u001B[0m", "\u001B[32mAllianz\u001B[0m", "\u001B[32mHanseMerkur\u001B[0m", "\u001B[32mUber Eats\u001B[0m"}; 
        return sponsor[rand.nextInt(sponsor.length)];
    }
        

    public static String MatchStats (Random rand) {
        int possessionTeam1 = rand.nextInt(101);
        int possessionTeam2 = 100 - possessionTeam1;
        System.out.println("");
        System.out.println("Spielstatistiken:");
        String stats = String.format("\u001B[32mBallbesitz: %d%% - %d%%\nTorschüsse: %d - %d\nEcken: %d - %d\nxG: %.2f - %.2f\u001B[0m",
                 possessionTeam1, possessionTeam2,
                 rand.nextInt(20), rand.nextInt(20),
                 rand.nextInt(10), rand.nextInt(10),
                 rand.nextFloat() * 4.0, rand.nextFloat() * 4.0);
        return stats;
    }

    
    public static String Kommentator(Random rand) {
        System.out.print("Kommentator:" + " ");
        String[] kommentator = {"Tom Bartels", "Frank Buschmann", "Wolff Fuss", "Jan Platte"};
        return kommentator[rand.nextInt(kommentator.length)];
    }

    public static String isAusverkauft(Random rand) {
        String[] Isausverkauft = {"Das Stadion ist ausverkauft.", "Das Stadion ist nicht ausverkauft."};
        return Isausverkauft[rand.nextInt(Isausverkauft.length)];
    }

    public static boolean isInternationalGame(String team1, String team2) {
        String[] nationalmannschaften = {
            "Niederlande", "Deutschland", "England", "Spanien", "Frankreich", "Portugal"
        };
        for (String team : nationalmannschaften) {
            if (team1.equalsIgnoreCase(team) || team2.equalsIgnoreCase(team)) {
                return true;
            }
        }
        return false;

    }

    public static boolean isChampionsLeagueMatchup(String team1, String team2) {
        String[] championsLeagueTeams = {
            "Real Madrid", "Barcelona", "Liverpool", "Manchester City", "Manchester United", "Arsenal", "Atletico Madrid", 
            "Ajax", "PSG", "Inter", "Milan", "Juventus", "Chelsea", 
            "Tottenham Hotspur", "Leipzig", "Sevilla", "Porto", "Benfica", "Shakhtar Donetsk", "Celtic", "Rangers", 
            "Galatasaray", "Fenerbahce", "Besiktas", "Olympiakos", "Red Bull Salzburg", "Club Brugge", "Anderlecht", 
            "Zenit St. Petersburg", "CSKA Moskau", "Dynamo Kiew", "Spartak Moskau", "AS Monaco", "Lyon", "Marseille", 
            "Lazio", "Roma", "Napoli", "Sporting", "Villarreal", "Real Sociedad",  
            "Borussia Mönchengladbach", "Eintracht Frankfurt", "Legia Warschau", "Dinamo Zagreb", "Slavia Prag", 
            "Kopenhagen", "Midtjylland", "Young Boys", "Basel", "Rosenborg", "Molde", "HJK Helsinki", "Malmo", 
            "AIK Stockholm", "IFK Göteborg", "Brondby", "Sturm Graz", "Austria Wien", "Rapid Wien", "Ferencvaros", 
            "Partizan Belgrad", "Roter Stern Belgrad", "PAOK", "AEK Athen", "Panathinaikos", "Ludogorets", "Sheriff Tiraspol"
        };
        for (String team : championsLeagueTeams) {
            if (team1.equalsIgnoreCase(team) || team2.equalsIgnoreCase(team)) {
                return true;
            }
        }
        return false;
    }
    public static String isChampionsLeagueFinal() {
        String CLFinal = "UEFA Champions League - Finale";
        return CLFinal; 
    }
        
    public static String getRandomStadiumCL(Random rand) {
        String[] stadiums = {"Allianz Arena", "Signal Iduna Park","BayArena", "Estadio Santiago Bernabeu", "Camp Nou", "Anfield", "Etihad Stadium", "Old Trafford", "Emirates Stadium", "Metropolitano", "Johan Cruyff Arena", "Parc des Princes", "Estadio da Luz", "San Siro", "Stadio Olimpico", "Estadio Jose Alvalade"};
    
        return stadiums[rand.nextInt(stadiums.length)];
    }

    public static String getRandomStadiumBL(Random rand) {
        String[] stadiumsBL= {"Allianz Arena", "Signal Iduna Park", "Opel Arena", "WWK Arena", "Deutsche Bank Park", "Red Bull Arena", "PreZero Arena", "Borussia-Park", "Millerntor-Stadion", "Holstein-Stadion", "Mercedes-Benz Arena", "Voith-Arena", "Vonovia Ruhrstadion", "Stadion An der Alten Försterei", "Volkswagen Arena", "Weserstadion", "Schwarzwald-Stadion", "BayArena"};
        return stadiumsBL[rand.nextInt(stadiumsBL.length)];
    }
    public static int[] simulateGame(String team1, String team2, Scanner sc, boolean isChampionsLeague, boolean isEnglish) {
        Random rand = new Random();
        int score1 = rand.nextInt(6); // Ergebnis zwischen 0 und 6
        int score2 = rand.nextInt(6); // Ergebnis zwischen 0 und 6DP
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("--------------------------------------------");
        System.out.println("Schiedsrichter: " + getRandomReferee(rand));
        System.out.println(" ");
        if (isChampionsLeague) {
            String[] finale = {"Halbfinale", "Viertelfinale", "Achtelfinale"};
            System.out.println("\u001B[34mUEFA Champions League - " + finale[rand.nextInt(finale.length)] + "\u001B[0m");
            System.out.println(getRandomStadiumCL(rand));
            System.out.println(isAusverkauft(rand));
            System.out.println(Kommentator(rand));
            System.out.println(getWetter(rand));
            System.out.println(" ");
            System.out.print("Dieses Spiel der \u001B[34mUEFA Champions League\u001B[0m wird präsentiert von ");
            System.out.println(Sponsor(rand));
            System.out.println();
            System.out.println(" ");
            System.out.println(" ");
        
        } else if (isInternationalGame(team1, team2)) {
            String[] eurofinale = {"Halbfinale", "Viertelfinale", "Achtelfinale"};
            System.out.println("\u001B[34mUEFA EURO 2024 - " + eurofinale[rand.nextInt(eurofinale.length)] + "\u001B[0m");
            System.out.println(getRandomStadiumBL(rand));
            System.out.println(isAusverkauft(rand));
            System.out.println(Kommentator(rand));
            System.out.println(getWetter(rand));
            System.out.println(" ");
            System.out.print("Dieses Spiel wird präsentiert von ");
            System.out.println(Sponsor(rand));
            System.out.println();
            System.out.println(" ");
            System.out.println(" ");
        } else {
            System.out.println(getRandomStadiumBL(rand));
            System.out.println("\u001B[34mBundesliga\u001B[0m");
            System.out.println(isAusverkauft(rand));
            System.out.println(getWetter(rand));
            System.out.println(Kommentator(rand));
        }
                    try {
                        Thread.sleep(1500); // 2 Sekunden Verzögerung
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
        displayScorers(team1, score1, rand, isEnglish);
        displayRandomEvents(team1, team2, rand, isEnglish);
        displayScorers(team2, score2, rand, isEnglish);
        System.out.println(team1 + " " + score1 + " - " + score2 + " " + team2);
        System.out.println(" ");
        try {
            Thread.sleep(1500); // 2 Sekunden Verzögerung
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        } 
        if (score1 < score2) {
        System.out.println(manOfTheMatch(team2, rand, isEnglish));}
        else {
        System.out.println(manOfTheMatch(team1, rand, isEnglish));
        } try {
            Thread.sleep(1500); // 2 Sekunden Verzögerung
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println(MatchStats(rand));
        System.out.println("--------------------------------------------");


        return new int[]{score1, score2};
    }

    public static String getRandomReferee(Random rand) {
        String[] referees = {"Felix Brych", "Daniel Siebert", "Bibiana Steinhaus", "Deniz Aytekin", "Sascha Stegemann", "Guido Winkmann", "Benjamin Brand", "Robert Hartmann", "Tobias Stieler", "Marco Fritz", "Patrick Ittrich", "Christian Dingert", "Sven Jablonski", "Frank Willenborg", "Arne Aarnink", "Martin Petersen", "Tobias Reichel", "Florian Badstübner", "Sören Storks", "Günter Perl", "Jochen Drees", "Manuel Gräfe", "Patrick Kessel", "Christof Günsch", "Robert Schröder", "Harm Osmers", "Alexander Sather", "Philipp Hüwe", "Lukas Kircher", "Markus Schmidt", "Bastian Dankert", "Patrick Alt", "Sascha Thielert", "Tobias Welz", "Michael Bacher", "Arne Aarnink", "Robert Kampka", "Johannes Huber", "Sven Waschitzki", "Markus Wollenweber", "Tobias Christ", "Tobias Reichel", "Florian Badstübner"};
        return referees[rand.nextInt(referees.length)];
    }

    
    public static String getRandomGoal(String team, Random rand, boolean isEnglish) {
        String[] goalMSG = {
            "Er zieht aus 25 Metern mit dem starken Fuß ab und haut ihn in den Winkel.",
            "Kopfball nach einer Ecke geschlagen von " + getRandomPlayer(team, rand) + ".",
            "Direktabnahme nach einer Flanke von " + getRandomPlayer(team, rand) + ".",
            "Schlenzer aus 20 Metern ins lange Eck.",
            "Abstauber nach einem Abpraller vom Torwart.",
            "Freistoßtor aus 30 Metern.",
            "Volleyschuss aus der zweiten Reihe.",
            "Aus der Distanz ins Tor gehämmmert",
            "Nach einem Solo über das halbe Feld.",
            "Nach einem Doppelpass mit " + getRandomPlayer(team, rand) + ".",
            "Nach einem schnellen Konter.",
            "Nach einem langen Ball von " + getRandomPlayer(team, rand) + ".",
            "Nach einem Querpass von " + getRandomPlayer(team, rand) + ".",
            "Nach einem Steilpass von " + getRandomPlayer(team, rand) + ".",
            "Nach einem Eckball von " + getRandomPlayer(team, rand) + ".",
            "Nach einem Freistoß von " + getRandomPlayer(team, rand) + ".",
            "Nach einem Einwurf von " + getRandomPlayer(team, rand) + ".",
            "Nach einem langen Einwurf von " + getRandomPlayer(team, rand) + ".",
            "Nach einem Abpraller von der Latte.",
            "Nach einem Abpraller vom Pfosten.",
            "Nach einem Abpraller vom Torwart.",
            "Nach einem Abpraller von einem Verteidiger.",
            "Nach einem Abpraller von " + getRandomPlayer(team, rand) + ".",
            "Nach einem perfekt getimten Kopfball.",
            "Nach einem kraftvollen Schuss aus der zweiten Reihe.",
            "Nach einem präzisen Freistoß in den Winkel.",
            "Nach einem Abstauber im Fünfmeterraum.",
            "Nach einem sehenswerten Fallrückzieher.",
            "Nach einem kraftvollen Schuss aus der Drehung.",
            "Nach einem präzisen Schlenzer ins lange Eck.",
            "Nach einem sehenswerten Volley aus der Luft.",
            "Nach einem kraftvollen Schuss aus spitzem Winkel.",
            "Ein Tor wie das von Zidane im Champions League Finale 2002.",
            "Ein Tor wie das von Bale im Copa del Rey Finale.",
            "Ein Kopfball wie der von Drogba im Champions League Finale.",
            "Ein Tor wie der Strahl von Podolski gegen England.",
            "Ein Freistoß wie der von Kroos gegen Schweden.",
        };
        String[] goalMSG_EN = {
            "He shoots from 25 meters with his strong foot and puts it in the top corner.",
            "Header after a corner kick taken by " + getRandomPlayer(team, rand) + ".",
            "Direct shot after a cross from " + getRandomPlayer(team, rand) + ".",
            "Curler from 20 meters into the far corner.",
            "Tap-in after a rebound from the goalkeeper.",
            "Free kick goal from 30 meters.",
            "Volley shot from the second row.",
            "Hammered into the goal from a distance.",
            "After a solo run over half the field.",
            "After a one-two with " + getRandomPlayer(team, rand) + ".",
            "After a quick counterattack.",
            "After a long ball from " + getRandomPlayer(team, rand) + ".",
            "After a cross pass from " + getRandomPlayer(team, rand) + ".",
            "After a through ball from " + getRandomPlayer(team, rand) + ".",
            "After a corner kick from " + getRandomPlayer(team, rand) + ".",
            "After a free kick from " + getRandomPlayer(team, rand) + ".",
            "After a throw-in from " + getRandomPlayer(team, rand) + ".",
            "After a long throw-in from " + getRandomPlayer(team, rand) + ".",
            "After a rebound from the crossbar.",
            "After a rebound from the post.",
            "After a rebound from the goalkeeper.",
            "After a rebound from a defender.",
            "After a rebound from " + getRandomPlayer(team, rand) + ".",
            "After a perfectly timed header.",
            "After a powerful shot from the second row.",
            "After a precise free kick into the top corner.",
            "After a tap-in in the six-yard box.",
            "After a spectacular bicycle kick.",
            "After a powerful shot from the turn.",
            "After a precise curler into the far corner.",
            "After a spectacular volley from the air.",
            "After a powerful shot from a tight angle.",
            "A goal like Zidane's in the 2002 Champions League final.",
            "A goal like Bale's in the Copa del Rey final.",
            "A header like Drogba's in the Champions League final.",
            "A goal like Podolski's rocket against England.",
            "A free kick like Kroos' against Sweden.",
        };
        return isEnglish ? goalMSG_EN[rand.nextInt(goalMSG_EN.length)] : goalMSG[rand.nextInt(goalMSG.length)];
    }
    public static String getRandomPen(String team2, String team, Random rand, boolean isEnglish) {
        String[] penMSG = {
            "Handelfmeter! Der Schiedsrichter zeigt auf den Punkt.",
            "Elfmeter wegen Foul im Strafraum an " + getRandomPlayer(team2, rand) + ".",    
        };
        String[] penMSG_EN = {
            "Handball penalty! The referee points to the spot.",
            "Penalty for a foul in the box on " + getRandomPlayer(team2, rand) + ".",    
        };
        return isEnglish ? penMSG_EN[rand.nextInt(penMSG_EN.length)] : penMSG[rand.nextInt(penMSG.length)];
    }
       
    public static String getRandomVARDecision(String team, Random rand, boolean isEnglish) {
        String[] varDecisions = {
            "Tor zurückgenommen wegen Abseits von" + " " + getRandomPlayer(team, rand) + ".",
            "Tor zurückgenommen wegen Foulspiel von" + " " + getRandomPlayer(team, rand) + ".",
            "Tor zurückgenommen wegen Handspiel von" + " " + getRandomPlayer(team, rand) + ".",
        };
        String[] varDecisions_EN = {
            "Goal disallowed for offside by" + " " + getRandomPlayer(team, rand) + ".",
            "Goal disallowed for a foul by" + " " + getRandomPlayer(team, rand) + ".",
            "Goal disallowed for handball by" + " " + getRandomPlayer(team, rand) + ".",
        };
        return isEnglish ? varDecisions_EN[rand.nextInt(varDecisions_EN.length)] : varDecisions[rand.nextInt(varDecisions.length)];
    }


    public static String manOfTheMatch(String team, Random rand, boolean isEnglish) {
        String manofthematch = (Sponsor(rand) + " " + "Spieler des Spiels: " + getRandomPlayer(team, rand));
        return manofthematch;
    }

    public static String getWetter(Random rand) {
        String[] wetter = {"Regen", "Nieselregen", "Bewölkt", "Sonnig", "Gewitter", "Starker Regen", "Nebel"};
        return wetter[rand.nextInt(wetter.length)];
    }


    public static String getRandomComment(String team, Random rand, boolean isEnglish) {
        String[] comments = {
            "Strammer Schuss aus der Distanz von " + getRandomPlayer(team, rand) + ", aber der Torwart pariert mit viel Mühe.",
            "Super Pass von " + getRandomPlayer(team, rand) + ", aber " + getRandomPlayer(team, rand) + " verliert das 1 gegen 1 gegen den Torwart.",
            "Super Schuss von " + getRandomPlayer(team, rand) + ", aber der Ball geht knapp am Tor vorbei.",
            getRandomPlayer(team, rand) + " klärt zur Ecke.",
            "Beide Teams geben alles!",
            "Super Steckpass von " + getRandomPlayer(team, rand) + ", aber der Stürmer steht im Abseits.",
            getRandomPlayer(team, rand) + " schließt im Strafraum ab, aber der Torwart pariert Weltklasse.",
            "Toller Dribbling von " + getRandomPlayer(team, rand) + ", aber der Abschluss ist zu schwach.",
            "Flanke von " + getRandomPlayer(team, rand) + ", aber " + getRandomPlayer(team, rand) + " verpasst knapp.",
            "Starker Zweikampf von " + getRandomPlayer(team, rand) + " im Mittelfeld.",
            "Schöner Doppelpass zwischen " + getRandomPlayer(team, rand) + " und " + getRandomPlayer(team, rand) + ".",
            "Gefährlicher Freistoß von " + getRandomPlayer(team, rand) + ", aber der Torwart ist zur Stelle.",
            "Energischer Lauf von " + getRandomPlayer(team, rand) + " über die rechte Seite.",
            "Guter Versuch von " + getRandomPlayer(team, rand) + " aus der zweiten Reihe.",
            "Starke Parade vom Torwart nach einem Schuss von " + getRandomPlayer(team, rand) + ".",
            "Schöner Pass in die Tiefe von " + getRandomPlayer(team, rand) + ", aber " + getRandomPlayer(team, rand) + " steht im Abseits.",
            "Schöner Spielzug eingeleitet von " + getRandomPlayer(team, rand) + ".",
            "Guter Kopfball von " + getRandomPlayer(team, rand) + ", aber der Torwart hält sicher.",
            "Ein schneller Konter von " + getRandomPlayer(team, rand) + ", aber die Abwehr ist zur Stelle.",
             getRandomPlayer(team, rand)+ " steht völlig Frei aber trifft nur die Latte.",
             "Super Spielverlagerung von" + " " + getRandomPlayer(team, rand)
                }; 
        String[] comments_EN = {
            "Powerful shot from distance by " + getRandomPlayer(team, rand) + ", but the goalkeeper saves with great effort.",
            "Great pass from " + getRandomPlayer(team, rand) + ", but " + getRandomPlayer(team, rand) + " loses the 1-on-1 against the goalkeeper.",
            "Great shot from " + getRandomPlayer(team, rand) + ", but the ball goes just wide.",
            getRandomPlayer(team, rand) + " clears for a corner.",
            "Both teams are giving it their all!",
            "Great through ball from " + getRandomPlayer(team, rand) + ", but the striker is offside.",
            getRandomPlayer(team, rand) + " shoots in the box, but the goalkeeper makes a world-class save.",
            getRandomPlayer(team, rand) + " runs free on goal, but " + getRandomPlayer(team, rand) + " clears at the last second.",
            "Great dribbling by " + getRandomPlayer(team, rand) + ", but the finish is too weak.",
            "Cross from " + getRandomPlayer(team, rand) + ", but " + getRandomPlayer(team, rand) + " just misses.",
            "Strong tackle by " + getRandomPlayer(team, rand) + " in midfield.",
            "Nice one-two between " + getRandomPlayer(team, rand) + " and " + getRandomPlayer(team, rand) + ".",
            "Dangerous free kick from " + getRandomPlayer(team, rand) + ", but the goalkeeper is there.",
            "Energetic run by " + getRandomPlayer(team, rand) + " down the right side.",
            "Good attempt from " + getRandomPlayer(team, rand) + " from the second row.",
            "Great save by the goalkeeper after a shot from " + getRandomPlayer(team, rand) + ".",
            "Nice pass into the depth from " + getRandomPlayer(team, rand) + ", but " + getRandomPlayer(team, rand) + " is offside.",
            "Hard foul by " + getRandomPlayer(team, rand) + ", the referee shows yellow.",
            "Nice play initiated by " + getRandomPlayer(team, rand) + ".",
            "Good header from " + getRandomPlayer(team, rand) + ", but the goalkeeper saves comfortably.",
            "A quick counterattack by " + getRandomPlayer(team, rand) + ", but the defense is there.",
            "A tough tackle between " + getRandomPlayer(team, rand) + " and " + getRandomPlayer(team, rand) + ".",
        };
        return isEnglish ? comments_EN[rand.nextInt(comments_EN.length)] : comments[rand.nextInt(comments.length)];
    }

    public static void displayScorers(String team, int score, Random rand, boolean isEnglish) {
        
        try {
            Thread.sleep(1500); // 1,5 Sekunden Verzögerung
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
            System.out.println(getRandomComment(team, rand, isEnglish));
            try {
                Thread.sleep(1500); // 1,5 Sekunden Verzögerung
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            System.out.println(getRandomComment(team, rand, isEnglish));
            try {
                Thread.sleep(1500); // 1,5 Sekunden Verzögerung
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            System.out.println(getRandomComment(team, rand, isEnglish));
        
        for (int goal = 0; goal < score; goal++) {

            int minute = rand.nextInt(90) + 1; // 1-90 min
            System.out.println("\u001B[32m" + (isEnglish ? "Goal!" : "Tor!") + " " + "\u001B[0m");
            {try {
                Thread.sleep(1500); // 1,5 Sekunden Verzögerung
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            }
            System.out.println("\u001B[32m" +  getRandomPlayer(team, rand) + " - " + minute + "'\u001B[0m");
            {try {
                Thread.sleep(1500); // 1,5 Sekunden Verzögerung
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }		    
            }
            System.out.println(getRandomGoal(team, rand, isEnglish));
            try {
                Thread.sleep(1500); // 1,5 Sekunden Verzögerung
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            // VAR-Check mit einer kleinen Wahrscheinlichkeit
            if (rand.nextInt(100) < 20) { // 10% chance of VAR check
                System.out.println("\u001B[31mVAR-Check läuft...\u001B[0m");
                try {
                    Thread.sleep(2000); // 2 Sekunden Verzögerung
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                if (rand.nextBoolean()) {
                    System.out.println("\u001B[31m" + getRandomVARDecision(team, rand, isEnglish) + "\u001B[0m");
                    score--; // Tor zurückgenommen
                    System.out.println("\u001B[31m" + (isEnglish ? "Goal disallowed! The score remains unchanged." : "Tor zurückgenommen! Der Spielstand bleibt unverändert.") + "\u001B[0m");
                } else {
                    System.out.println("\u001B[32m" + (isEnglish ? "Goal confirmed!" : "Tor bestätigt!") + "\u001B[0m");
                }
                try {
                    Thread.sleep(1500); // 1,5 Sekunden Verzögerung
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
            // Zufällige Kommentare hinzufügen
            if (rand.nextInt(100) < 300) { // 50% chance of a random comment
                System.out.println(getRandomComment(team, rand, isEnglish));
                try {
                    Thread.sleep(1500); // 1,5 Sekunden Verzögerung
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        
        int elfmeterChance = rand.nextInt(100);
        if (elfmeterChance < 35) { // 10% chance of a penalty
            System.out.println("\u001B[31mVAR-Check läuft...\u001B[0m");
            try {
                Thread.sleep(2000); // 2 Sekunden Verzögerung
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            } if (rand.nextBoolean()) {
            System.out.println(" ");
            System.out.println("\u001B[32m" + getRandomPen(team, team, rand, isEnglish) + " \u001B[0m"); 
            System.out.println(" ");
            try {
                Thread.sleep(1500); // 1,5 Sekunden Verzögerung
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            if (rand.nextBoolean()) {
                System.out.println("\u001B[32m" + (isEnglish ? "Goal! " : "Tor! ") + getRandomPlayer(team, rand) + (isEnglish ? " converts the penalty." : " verwandelt den Elfmeter.") + "\u001B[0m");
                score++;
            } else {
                System.out.println("\u001B[31m" + (isEnglish ? "Missed! " : "Verschossen! ") + getRandomPlayer(team, rand) + (isEnglish ? " misses the penalty." : " verfehlt den Elfmeter.") + "\u001B[0m");
            }
            try {
                Thread.sleep(1500); // 1,5 Sekunden Verzögerung
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt(); }}}
            
        
    }

    public static String getRandomPlayer(String team, Random rand) {
        String[] bayernPlayers = {"Dayot Upamecano", "Minjae Kim", "Eric Dier", "Alphonso Davies", "Hiroki Ito", "Raphaël Guerreiro", "Sacha Boey", "Tarek Buchmann", "Josip Stanišić", "Adam Aznou", "Joshua Kimmich", "Leon Goretzka", "João Palhinha", "Michael Olise", "Konrad Laimer", "Noel Aseko Nkili", "Jamal Musiala", "Aleksandar Pavlović", "Serge Gnabry", "Harry Kane", "Leroy Sané", "Kingsley Coman", "Thomas Müller", "Mathys Tel", "Jonah Kusi-Asare", "Paul Wanner", "Frans Krätzig"};
        String[] bvbPlayers = {"Serhou Guirassy", "Jamie Gittens", "Donyell Malen", "Giovanni Reyna", "Emre Can", "Nico Schlotterbeck", "Yan Couto", "Maximilian Beier"};
        String[] freiburgPlayers = {"Mark Flekken", "Christian Günter", "Philipp Lienhart", "Nico Schlotterbeck", "Manuel Gulde", "Jonathan Schmid", "Nicolas Höfler", "Maximilian Eggestein", "Vincenzo Grifo", "Lucas Höler", "Nils Petersen"};
        String[] leverkusenPlayers = {"Jonathan Tah", "Edmond Tapsoba", "Mitchel Bakker", "Jeremie Frimpong",  "Kerem Demirbay", "Moussa Diaby", "Florian Wirtz", "Patrik Schick",};
        String[] mainzPlayers = {"Lasse Rieß", "Daniel Batz", "Phillipp Mwene", "Moritz Jenz", "Maxim Leitsch", "Stefan Bell", "Anthony Caci", "Danny da Costa", "Andreas Hanche-Olsen", "Silvan Widmer", "Aymen Barkok", "Kaishu Sano", "Jae-sung Lee", "Paul Nebel", "Hyunseok Hong", "Gabriel Vidović", "Nadiem Amiri", "Nikolas Veratschnig", "Dominik Kohr", "Daniel Gleiber", "Armindo Sieb", "Jonathan Burkardt", "Nelson Weiper"};
        String[] augsburgPlayers = {"Daniel Klein", "Robert Gumny", "Mads Pedersen", "Reece Oxford", "Chrislain Matsima", "Jeffrey Gouweleeuw", "Marius Wolf", "Dimitrios Giannoulis", "Cédric Zesiger", "Maximilian Bauer", "Keven Schlotterbeck", "Noahkai Banks", "Yusuf Kabadayı", "Elvis Rexhbecaj", "Arne Maier", "Masaya Okugawa", "Kristijan Jakić", "Tim Breithaupt", "Frank Onyeka", "Alexis Claude-Maurice", "Fredrik Jensen", "Mert Kömür", "Mahmut Kücüksahin", "Henri Koudossou", "Samuel Essende", "Steve Mounié", "Phillip Tietz"};
        String[] frankfurtPlayers = {"Omar Marmoush", "Daichi Kamada", "Hugo Ekitike", "Filip Kostic", "Christopher Lenz", "Evan N'Dicka", "Tuta", "Martin Hinteregger", "Erik Durm", "Stefan Ilsanker", "Makoto Hasebe", "Djibril Sow", "Dominik Kohr", "Aymen Barkok", "Timothy Chandler"};
        String[] leipzigPlayers = {"Lutsharel Geertruida", "Willi Orbán", "El Chadaille Bitshiabu", "Lukas Klostermann", "David Raum", "Castello Lukeba", "Benjamin Henrichs", "Lionel Voufack", "Eljif Elmas", "Amadou Haidara", "Xavi Simons", "Nicolas Seiwald", "Christoph Baumgartner", "Ridle Baku", "Arthur Vermeeren", "Assan Ouédraogo", "Xaver Schlager", "Faik Sakar", "Nuha Jatta", "Kevin Kampl", "Viggo Gebel", "Antonio Nusa", "Yussuf Poulsen", "Loïs Openda", "André Silva", "Robert Ramsak", "Benjamin Šeško"};
        String[] hoffenheimPlayers = {"Andrej Kramarić", "Ihlas Bebou", "Munas Dabbur", "Jacob Bruun Larsen", "Diadie Samassekou", "Florian Grillitsch", "Sebastian Rudy", "Dennis Geiger", "Mijat Gaćinović", "Robert Skov", "Kevin Akpoguma", "Kasim Adams", "Chris Richards", "Ryan Sessegnon"};
        String[] gladbachPlayers = {"Fabio Chiarodia", "Ko Itakura", "Marvin Friedrich", "Luca Netz", "Stefan Lainer", "Lukas Ullrich", "Joe Scally", "Nico Elvedi", "Kevin Stöger", "Julian Weigl", "Franck Honorat", "Florian Neuhaus", "Philipp Sander", "Nathan Ngoumou", "Noah Pesch", "Robin Hack", "Rocco Reitz", "Yvandro Borges Sanches", "Niklas Swider", "Tim Kleindienst", "Shio Fukuda", "Alassane Pléa", "Grant-Leon Ranos", "Tomáš Čvančara"};
        String[] stPauliPlayers = {"Johannes Eggestein", "Dapo Afolayan", "Jackson Irvine", "Scott Banks", "Noah Weißhaupt", "Elias Saad", "Daniel Sinani", "Morgan Guilavogui", "Eric Smith"};
        String[] kielPlayers = {"Thomas Dähne", "Marcel Engelhardt", "Marco Komenda", "Patrick Erras", "Carl Johansson", "Max Geschwill", "Timo Becker", "Lasse Rosenboom", "David Zec", "Dominik Javorček", "Colin Kleine-Bekel", "John Tolkin", "Marko Ivezić", "Steven Skrzybski", "Finn Porath", "Lewis Holtby", "Marvin Schulz", "Andu Kelati", "Nicolai Remberg", "Magnus Knudsen", "Aurel Wagbe", "Armin Gigović", "Benedikt Pichler", "Alexander Bernhardsson", "Shuto Machino", "Phil Harres", "Fiete Arp"};
        String[] stuttgartPlayers = {"Ameen Al-Dakhil", "Ramon Hendriks", "Josha Vagnoman", "Maximilian Mittelstädt", "Pascal Stenzel", "Leonidas Stergiou", "Dan-Axel Zagadou", "Jeff Chabot", "Anthony Rouault", "Anrie Chase", "Yannik Keitel", "Angelo Stiller", "Enzo Millot", "Atakan Karazor", "Chris Führich", "Nikolas Nartey", "Christopher Olivier", "Fabian Rieder", "Luca Raimund", "Jarzinho Malanga", "Ermedin Demirović", "El Bilal Touré", "Nick Woltemade", "Justin Diehl", "Jamie Leweling", "Wahid Faghir", "Thomas Kastanaras", "Jacob Bruun Larsen", "Deniz Undav", "Benjamin Boakye"};
        String[] heidenheimPlayers = {"Tim Kleindienst", "Christian Kühlwetter", "Robert Leipertz", "Denis Thomalla", "Patrick Schmidt"};
        String[] bochumPlayers = {"Paul Grave", "Cristian Gamboa", "Erhan Mašović", "Bernardo", "Jakov Medić", "Tim Oermann", "Ivan Ordets", "Mohammed Tolba", "Maximilian Wittek", "Noah Loosli", "Ibrahima Sissoko", "Lukas Daschner", "Anthony Losilla", "Dani de Wit", "Felix Passlack", "Niklas Jahn", "Matúš Bero", "Koji Miyoshi", "Mats Pannewig", "Lennart Koerdt", "Myron Boadu", "Samuel Bamba", "Gerrit Holtmann", "Moritz Broschinski", "Philipp Hofmann"};
        String[] unionPlayers = {"Carl Klaus", "Alexander Schwolow", "Yannic Stein", "Kevin Vogt", "Diogo Leite", "Danilho Doekhi", "Leopold Querfeld", "Tom Rothe", "Josip Juranovic", "Jérôme Roussillon", "Christopher Trimmel", "Rani Khedira", "Wooyeong Jeong", "András Schäfer", "Janik Haberer", "László Bénes", "Tim Skarke", "Robert Skov", "Lucas Tousart", "Aljoscha Kemlein", "Yorbe Vertessen", "Ivan Prtajin", "Kevin Volland", "Benedict Hollerbach", "Jordan", "Andrej Ilić", "David Preu"};
        String[] wolfsburgPlayers = {"Pavao Pervan", "Marius Müller", "Niklas Klinger", "Kilian Fischer", "Sebastiaan Bornauw", "Konstantinos Koulierakis", "Rogério", "Denis Vavro", "Joakim Mæhle", "Mathys Angely", "David Odogu", "Till Neininger", "Aster Vranckx", "Salih Özcan", "Jakub Kamiński", "Lovro Majer", "Bence Dardai", "Maximilian Arnold", "Yannick Gerhardt", "Mattias Svanberg", "Bennit Bröger", "Patrick Wimmer", "Kevin Paredes", "Andreas Skov Olsen", "Mohamed Amoura", "Lukas Nmecha", "Tiago Tomás", "Bartosz Białek", "Kevin Behrens", "Jonas Wind", "Jonathan Akaegbobi"};
        String[] bremenPlayers = {"Markus Kolke", "Mio Backhaus", "Anthony Jung", "Niklas Stark", "Amos Pieper", "Mitchell Weiser", "Miloš Veljković", "Derrick Köhn", "Julián Malatini", "Felix Agu", "Issa"};
        String[] realmadridPlayers = {"Kylian Mbappe", "Vinicius Jr", "Rodrygo", "Luka Modric", "Federico Valverde", "David Alaba", "Eder Militao", "Eduardo Camavinga", "Dani Carvajal", "Aurelien Tchouameni", "Brahim Diaz"};
        String[] barcaPlayers = {"Lamine Yamal", "Frenkie de Jong", "Pedri", "Dani Olmo", "Gavi", "Ansu Fati", "Eric Garcia", "Raphinha", "Ronald Araujo", "Riqui Puig", "Robert Lewandowski", "Jules Kounde","Alejandro Balde"};
        String[] liverpoolPlayers = {"Mohamed Salah", "Diogo Jota", "Cody Gakpo", "Ryan Gravenberch", "Trent Alexander-Arnold", "Virgil van Dijk", "Andrew Robertson", "Alexis MacAllister", "Ibrahima Konate", "Darwin Nunez", "Curtis Jones", "Harvey Elliott"};
        String[] mancityPlayers = {"Erling Haaland", "Phil Foden", "Jack Grealish", "Kevin De Bruyne", "Ruben Dias", "Kyle Walker", "Rodri", "Bernardo Silva", "Josko Gvardiol", "Savinho", "Jeremy Doku", "John Stones"};
        String[] manutdPlayers = {"Bruno Fernandes", "Marcus Rashford","Harry Maguire", "Aaron Wan-Bissaka", "Luke Shaw", "Antony", "Matthjis de Ligt", "Noussair Mazraoui", "Leny Yoro", "Rasmus Hojlund", "Joshua Zirkzee",};
        String[] arsenalPlayers = {"Bukayo Saka", "Gabriel Martinelli", "Ben White", "Kieran Tierney", "Thomas Partey", "Leandro Trossard", "Kai Havertz", "Gabriel", "Takehiro Tomiyasu", "Martin Odegaard"};
        String[] atleticoPlayers = {"Antoine Griezmann", "Marcos Llorente", "Koke", "Renan Lodi", "Jose Gimenez", "Stefan Savic", "Matheus Cunha", "Rodrigo de Paul", "Yannick Carrasco", "Mario Hermoso", "Julian Alvarez", "Alexander Sorloth"};
        String[] ajaxPlayers = {"Steven Berghuis" , "Brian Brobbey" , "Mika Godts" , "Devyne Rensch" , "Kenneth Taylor" , "Jordan Henderson" , "Juuri Baas" , "Kian Fitz-Jim" , "Chuba Akpom" , "Bertrand Traore" , "Wout Weghorst"};
        String[] psgPlayers = {"Randall Kolo Muani" ,"Marco Verratti" , "Achraf Hakimi" , "Presnel Kimpembe" , "Marquinhos" , "Joao Neves", "Goncalo Ramos", "Desire Doue", "Ousmane Dembele"};
        String[] legendsPlayers = {"Pelé", "Diego Maradona", "Johan Cruyff", "Zinedine Zidane", "Franz Beckenbauer", "Michel Platini", "Gerd Müller", "Ronaldo Nazário", "Ronaldinho", "Paolo Maldini", "Roberto Baggio"};
        String[] villarealPlayers = {"Gerard Moreno", "Paco Alcacer, Arnaut Dan, Yeremi Pino, Manu Trigueros, Dani Parejo, Pau Torres, Juan Foyth, Alfonso Pedraza, Mario Gaspar, Raul Albiol"};
        String[] realSociedadPlayers = {"Alexander Isak", "Mikel Oyarzabal", "David Silva", "Portu", "Mikel Merino", "Robin Le Normand", "Aritz Elustondo", "Joseba Zaldua", "Jon Guridi", "Ander Barrenetxea"};
        String[] lazioPlayers = {"Ciro Immobile", "Felipe Caicedo", "Luis Alberto", "Sergej Milinkovic-Savic", "Lucas Leiva", "Francesco Acerbi", "Manuel Lazzari", "Adam Marusic", "Patric", "Jean-Daniel Akpa Akpro"};
        String[] romaPlayers = {"Tammy Abraham", "Eldor Shomurodov", "Nicolo Zaniolo", "Lorenzo Pellegrini", "Jordan Veretout", "Roger Ibanez", "Chris Smalling", "Gianluca Mancini", "Rick Karsdorp", "Matteo Politano"};
        String[] napoliPlayers = {"Victor Osimhen", "Andrea Petagna", "Matteo Politano", "Eljif Elmas", "Fabian Ruiz", "Kalidou Koulibaly", "Kostas Manolas", "Giovanni Di Lorenzo", "Elseid Hysaj", "David Ospina"};
        String[] sportingPlayers = {"Pedro Goncalves", "Paulinho", "Joao Palhinha", "Matheus Nunes", "Viktor Gyökeres", "Zouhair Feddal", "Sebastian Coates", "Goncalo Inacio", "Pedro Porro", "Antonio Adan"};
        String[] benficaPlayers = {"Roman Yaremchuk", "Rafa Silva", "Gil Dias","Lucas Verissimo", "Nicolás Otamendi", "Orkun Kökcu", "Joao Mario", "Kerem Aktürkoglu",};       
        String[] acmilanplayers = {"Rafael Leao","Ismael Bennacer", "Fikayo Tomori", "Simon Kjaer", "Davide Calabria", "Theo Hernandez","Franck Kessie", "Alexis Saelemaekers",};
        String[] interPlayers = {"Lautaro Martinez", "Hakan Calhanoglu", "Marcelo Brozovic", "Nicolo Barella", "Stefan de Vrij", "Milan Skriniar", "Benjamin Pavard", "Matteo Darmian",};
        String[] juventusPlayers = {"Paulo Dybala","Manuel Locatelli", "Rodrigo Bentancur", "Danilo", "Juan Cuadrado", "Kenan Yildiz", "Dusan Vlahovic", "Alex Sandro"};
        String[] feyenoordPlayers = {"Santiago Gimenez", "Luis Sinisterra", "Mark Diemers", "Marcos Senesi", "Uros Spajic", "Tyrell Malacia", "Bart Nieuwkoop", "Nick Marsman"};
        String[] psvPlayers = {"Yorbe Vertessen", "Marco van Ginkel", "Ibrahim Sangare", "Olivier Boscagli","Armando Obispo"}; 
        String[] villaPlayers = {"Emiliano Martinez", "Matt Targett", "Tyrone Mings", "Ezri Konsa", "Matt Cash", "Douglas Luiz", "John McGinn", "Jacob Ramsey", "Danny Ings", "Ollie Watkins"};
        String[] germanyPlayers = {"Kai Havertz", "Jamal Musiala", "Serge Gnabry", "Joshua Kimmich", "Leon Goretzka", "Niklas Süle", "Antonio Rüdiger", "Robin Gosens", "Florian Wirtz", "Aleksander Pavlovic", "Angelo Stiller", "Felix Nmecha", "Niclas Füllkrug", "Leroy Sane", "Benjamin Henrichs", "Maximilian Mittelstädt", "Chris Führich", "Tim Kleindienst", "Deniz Undav"};
        String[] englandPlayers = {"Bukayo Saka", "Cole Palmer", "Phil Foden", "Jude Bellingham", "Callum Hudson-Odoi", "Conor Gallagher", "Marc Guehi", "John Stones", "Harry Maguire", "Harry Kane", "Kobbie Mainoo", "Kyle Walker"};
        String[] spainPlayers = {"Pedri", "Ferran Torres", "Mikel Oyarzabal", "Dani Olmo", "Marcos Llorente", "Rodri", "Pau Torres", "Eric Garcia", "Lamine Yamal", "Gavi", "Bryan Zaragoza"};
        String[] netherlandsPlayers = {"Brian Brobbey", "Cody Gakpo", "Ryan Gravenberch", "Jurrien Timber", "Devyne Rensch", "Tijarny Rijnders", "Matthjis de Ligt", "Virgil van Dijk", "Denzel Dumfries", "Xavi Simons", "Wout Weghorst", "Mats Wieffer"};
        String[] francePlayers = {"Kylian Mbappe", "Ousmane Dembele", "Michael Olise", "Aurelien Tchouameni", "Eduardo Camavinga", "Jules Kounde", "Dayot Upamecano", "William Saliba", "Bradley Barcola", "Antoine Griezmann", "Kingsley Coman", "Benjamin Pavard", "Lucas Hernandez", "Theo Hernandez"};
        String[] portugalPlayers = {"Pedro Goncalves", "Joao Palhinha", "Matheus Nunes", "Nuno Mendes", "Goncalo Ramos", "Rafael Leao", "Bernado Silva", "Bruno Fernandes", "Vitinha", "Joao Neves", "Joao Felix", "Ruben Dias", "Raphael Guerreiro", "Fransisco Conceicao"};

        
        if (team.equalsIgnoreCase("Bayern")) {
            return bayernPlayers[rand.nextInt(bayernPlayers.length)];
        } else if (team.equalsIgnoreCase("Dortmund")) {
            return bvbPlayers[rand.nextInt(bvbPlayers.length)];
        } else if (team.equalsIgnoreCase("Legenden")) {
            return legendsPlayers[rand.nextInt(legendsPlayers.length)];
        } else if (team.equalsIgnoreCase("Mainz")) {
            return mainzPlayers[rand.nextInt(mainzPlayers.length)];
        } else if (team.equalsIgnoreCase("Augsburg")) {
            return augsburgPlayers[rand.nextInt(augsburgPlayers.length)];
        } else if (team.equalsIgnoreCase("Frankfurt")) {
            return frankfurtPlayers[rand.nextInt(frankfurtPlayers.length)];
        } else if (team.equalsIgnoreCase("Leipzig")) {
            return leipzigPlayers[rand.nextInt(leipzigPlayers.length)];
        } else if (team.equalsIgnoreCase("Hoffenheim")) {
            return hoffenheimPlayers[rand.nextInt(hoffenheimPlayers.length)];
        } else if (team.equalsIgnoreCase("Gladbach")) {
            return gladbachPlayers[rand.nextInt(gladbachPlayers.length)];
        } else if (team.equalsIgnoreCase("St Pauli")) {
            return stPauliPlayers[rand.nextInt(stPauliPlayers.length)];
        } else if (team.equalsIgnoreCase("Kiel")) {
            return kielPlayers[rand.nextInt(kielPlayers.length)];
        } else if (team.equalsIgnoreCase("Stuttgart")) {
            return stuttgartPlayers[rand.nextInt(stuttgartPlayers.length)];
        } else if (team.equalsIgnoreCase("Heidenheim")) {
            return heidenheimPlayers[rand.nextInt(heidenheimPlayers.length)];
        } else if (team.equalsIgnoreCase("Bochum")) {
            return bochumPlayers[rand.nextInt(bochumPlayers.length)];
        } else if (team.equalsIgnoreCase("Union")) {
            return unionPlayers[rand.nextInt(unionPlayers.length)];
        } else if (team.equalsIgnoreCase("Wolfsburg")) {
            return wolfsburgPlayers[rand.nextInt(wolfsburgPlayers.length)];
        } else if (team.equalsIgnoreCase("Bremen")) {
            return bremenPlayers[rand.nextInt(bremenPlayers.length)];
        } else if (team.equalsIgnoreCase("Freiburg")) {
            return freiburgPlayers[rand.nextInt(freiburgPlayers.length)];
        } else if (team.equalsIgnoreCase("Leverkusen")) {
            return leverkusenPlayers[rand.nextInt(leverkusenPlayers.length)];
        } else if (team.equalsIgnoreCase("Real Madrid")) {
            return realmadridPlayers[rand.nextInt(realmadridPlayers.length)];
        } else if (team.equalsIgnoreCase("Barcelona")) {
            return barcaPlayers[rand.nextInt(barcaPlayers.length)];
        } else if (team.equalsIgnoreCase("Liverpool")) {
            return liverpoolPlayers[rand.nextInt(liverpoolPlayers.length)];
        } else if (team.equalsIgnoreCase("Manchester City")) {
            return mancityPlayers[rand.nextInt(mancityPlayers.length)];
        } else if (team.equalsIgnoreCase("Manchester United")) {
            return manutdPlayers[rand.nextInt(manutdPlayers.length)];
        } else if (team.equalsIgnoreCase("Arsenal")) {
            return arsenalPlayers[rand.nextInt(arsenalPlayers.length)];
        } else if (team.equalsIgnoreCase("Atletico Madrid")) {
            return atleticoPlayers[rand.nextInt(atleticoPlayers.length)];
        } else if (team.equalsIgnoreCase("Ajax")) {
            return ajaxPlayers[rand.nextInt(ajaxPlayers.length)];
        } else if (team.equalsIgnoreCase("PSG")) {
            return psgPlayers[rand.nextInt(psgPlayers.length)];
        } else if (team.equalsIgnoreCase("Villarreal")) {
            return villarealPlayers[rand.nextInt(villarealPlayers.length)];
        } else if (team.equalsIgnoreCase("Real Sociedad")) {
            return realSociedadPlayers[rand.nextInt(realSociedadPlayers.length)];
        } else if (team.equalsIgnoreCase("Lazio")) {
            return lazioPlayers[rand.nextInt(lazioPlayers.length)];
        } else if (team.equalsIgnoreCase("Roma")) {
            return romaPlayers[rand.nextInt(romaPlayers.length)];
        } else if (team.equalsIgnoreCase("Napoli")) {
            return napoliPlayers[rand.nextInt(napoliPlayers.length)];
        } else if (team.equalsIgnoreCase("Sporting")) {
            return sportingPlayers[rand.nextInt(sportingPlayers.length)];
        } else if (team.equalsIgnoreCase("Benfica")) {
            return benficaPlayers[rand.nextInt(benficaPlayers.length)];
        } else if (team.equalsIgnoreCase("AC Milan")) {
            return acmilanplayers[rand.nextInt(acmilanplayers.length)];
        } else if (team.equalsIgnoreCase("Inter")) {
            return interPlayers[rand.nextInt(interPlayers.length)];
        } else if (team.equalsIgnoreCase("Juventus")) {
            return juventusPlayers[rand.nextInt(juventusPlayers.length)];
        } else if (team.equalsIgnoreCase("Feyenoord")) {
            return feyenoordPlayers[rand.nextInt(feyenoordPlayers.length)];
        } else if (team.equalsIgnoreCase("PSV")) {
            return psvPlayers[rand.nextInt(psvPlayers.length)];
        } else if (team.equalsIgnoreCase("Villa")) {
            return villaPlayers[rand.nextInt(villaPlayers.length)];
        } else if (team.equalsIgnoreCase("Deutschland")) {
            return germanyPlayers[rand.nextInt(germanyPlayers.length)];
        } else if (team.equalsIgnoreCase("England")) {
            return englandPlayers[rand.nextInt(englandPlayers.length)];
        } else if (team.equalsIgnoreCase("Spanien")) {
            return spainPlayers[rand.nextInt(spainPlayers.length)];
        } else if (team.equalsIgnoreCase("Niederlande")) {
            return netherlandsPlayers[rand.nextInt(netherlandsPlayers.length)];
        } else if (team.equalsIgnoreCase("Frankreich")) {
            return francePlayers[rand.nextInt(francePlayers.length)];
        } else if (team.equalsIgnoreCase("Portugal")) {
            return portugalPlayers[rand.nextInt(portugalPlayers.length)];
        } else {
            return "";}
    }
    
    public static void displayRandomEvents(String team1, String team2, Random rand, boolean isEnglish) {
        try {
            Thread.sleep(1500); // 2 Sekunden Verzögerung
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        // String[] events = {"\uD83D\uDFE8"/*gelb */, "\uD83D\uDD34" /*rot */, "Auswechslung"};
        for (int minute = 60; minute <= 90; minute++) {
            int eventChance = rand.nextInt(125);
            String event;
            if (eventChance < 1) { // 1% chance rot
                event = "\uD83D\uDD34";
            } else if (eventChance < 2) { // 2% chance gelb
                event = "\uD83D\uDFE8";
            } else if (eventChance < 10) { // 15% wechsel
                event = "Auswechslung";
            } else if (eventChance < 2) { // 2% elf verschossen
                event = "\u001B[P]\u001B[32m";
            } else {
                continue;
            }
            String player = "";
            String substitute = "";
            if (rand.nextBoolean()) {
                player = getRandomPlayer(team1, rand);
                if (event.equals("Auswechslung")) {
                    substitute = getRandomPlayer(team1, rand);
                }
            } else {
                player = getRandomPlayer(team2, rand);
                if (event.equals("Auswechslung")) {
                    substitute = getRandomPlayer(team2, rand);
                }
            }

            if (event.equals("Auswechslung")) {
                System.out.println("\u001B[31m" + player + " \uD83D\uDD04 " + " " + substitute + " " + minute + "'" + "\u001B[0m");
            } else if (event.equals("\uD83D\uDFE8")) {
                System.out.println("\u001B[33m" + player + " " + event + " " + minute + "'" + "\u001B[0m");
            } else if (event.equals("\uD83D\uDD34")) {
                System.out.println("\u001B[31m" + player + " " + event + " " + minute + "'" + "\u001B[0m");
            } else if (event.equals("\u001B[P]\u001B[32m")) {
                System.out.println("\u001B[32m" + player + " " + event + " " + minute + "'" + "\u001B[0m");
            }
            if (event.equals("\u001B[P]\u001B[32m")) {
                System.out.println("\u001B[32m" + player + " " + event + " " + minute + "'" + "\u001B[0m");
            }
        }
    
    }
    private static String translate(String langFrom, String langTo, String text) throws IOException {
        // INSERT YOU URL HERE
        String urlStr = "https://script.google.com/macros/s/AKfycby3CNBl4r4tRbfnURms0JIkioNdMiqDPfXreeQUmsiGQJmgRmDST9WaMUzjs2Wrt07Ndg/exec" +
                "?q=" + URLEncoder.encode(text, "UTF-8") +
                "&target=" + langTo +
                "&source=" + langFrom;
        URL url = new URL(urlStr);
        StringBuilder response = new StringBuilder();
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        return response.toString();
    }
    
}





