## Opis
Repozytorium zawiera kilka rozwiązanych zagadek adwentowych ze strony https://adventofcode.com/2020. Pierwsze trzy zostały rozkodowane na poziomie podstawowym oraz rozszerzonym. 

### Day 1
Zadanie polegało na znalezieniu w podanym pliku tekstowym dwóch liczb sumujących się do 2020 oraz wyznaczeniu iloczynu tych liczb. Część druga polegała na rozbudowaniu programu tak, 
aby był w stanie znaleźć 3 liczby ```a,b,c```, które spełniają warunek: ```a+b+c=2020``` oraz na wyjściu również wyświetlić ich iloczyn.

### Day 2
W podanym pliku tekstowym były wypisane hasła w następującej postaci (jeden pod drugim):
```
1-3 a: abcde
1-3 b: cdefg
2-9 c: ccccccccc
```
**Poziom podstawowy**: Każdy wiersz zawiera zasady dotyczące haseł, a następnie hasło. Zasady te wskazują minimalną i maksymalną liczbę razy wystąpień
danej litery w haśle (aby było ono ważne). Na przykład ```1-3 a``` oznacza, że hasło musi zawierać literę ```a``` co najmniej raz i co najwyżej 3 razy.
**Poziom rozszerzony**: Teraz cyfry na początku linii opisują położenie danej litery. Dokładnie jedna z tych pozycji musi zawierać wskazaną literę.

Przykład: hasło ```abcde``` jest poprawne, ponieważ litera ```a``` występuje na pierwszej pozycji, natomiast nie występuje na pozycji nr 3.

### Day 3
Dany jest plik wejściowy o następującej budowie:
```
..##.......
#...#...#..
.#....#..#.
..#.#...#.#
.#...##..#.
..#.##.....
.#.#.#....#
.#........#
#.##...#...
#...##....#
.#..#...#.#
```
**#** - oznacza drzewo, **.** - jego brak.

**Poziom podstawowy**: Rozpoczynamy drogę z lewego górnego rogu. Kolejne pole, na które możemy przeskoczyć leży od nas w odległości 3 jednostek w prawo i 1 w dół. Tym sposobem należy
dotrzeć do prawego dolnego wierzchołka. Program powinien zliczyć, ile drzew napotkaliśmy po drodze.

**Poziom rozszerzony**: Należy policzyć, ile drzew napotkamy, jeśli będziemy się poruszać następującymi metodami:
- 1 w prawo, 1 w dół,
- 3 w prawo, 1 w dół (treść zadania podstawowego),
- 5 w prawo, 1 w dół,
- 7 w prawo, 1 w dół,
- 1 w prawo, 2 w dół.

Jako wynik ostateczny należało podać iloczyn wartości otrzymanych dla ww. metod.
