//: GetPassword/GenPass.java

package GetPassword;

import java.util.Random;

/** Class implements the generation of the password
 * @author deadboy
 * @author leo13pard@ya.ru
 * @version 1.0
 */

class GenPass {
    private String Password = "";
    private int Sloj, dlina;

    GenPass(int Sloj, int dlina) {
        this.Sloj = Sloj;
        this.dlina = dlina;
        Pass();
    }
    String GetPassword() {
        /** @return generated password.*/
        return Password;
    }
    private void Pass() {
        Random r = new Random();
        switch (Integer.valueOf(String.valueOf(Sloj))) {
            case 1: {
                for (int i = 0; i < dlina; i++) Password += r.nextInt(10);
                break;
            }
            case 2: {
                for (int i = 0; i < dlina; i++) Password += (char) (r.nextInt(26) + 97);
                break;
            }
            case 3: {
                for (int i = 0; i < dlina; i++) {
                    if (r.nextBoolean()) Password += r.nextInt(9);
                    else Password += (char) (r.nextInt(26) + 97);
                }
                break;
            }
            case 4: {
                for (int i = 0; i < dlina; i++) {
                    switch (r.nextInt(3)) {
                        case 0: {
                            Password += r.nextInt(10);
                            break;
                        }
                        case 1: {
                            Password += (char) (r.nextInt(26) + 97);
                            break;
                        }
                        case 2: {
                            Password += (char) (r.nextInt(26) + 65);
                            break;
                        }
                    }
                }
                break;
            }
            case 5: {
                for (int i = 0; i < dlina; i++) {
                    switch (r.nextInt(4)) {
                        case 0: {
                            Password += r.nextInt(10);
                            break;
                        }
                        case 1: {
                            Password += (char) (r.nextInt(26) + 97);
                            break;
                        }
                        case 2: {
                            Password += (char) (r.nextInt(26) + 65);
                            break;
                        }
                        case 3: {
                            Password += (char) (r.nextInt(65) + 1039);
                            break;
                        }
                    }
                }
                break;
            }
        }
    }
}
