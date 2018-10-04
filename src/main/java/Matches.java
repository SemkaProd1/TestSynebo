public class Matches {

    int minMatches(int squares) {

        int remainingSide;

        int matches = 0;

        int side = 1;

        while ((side * side) <= squares) {

            matches = 2 * (side * side + side);
            remainingSide = squares - side * side;
            if (remainingSide > 0) {
                matches = matches + 2 * remainingSide + 1;
            }
            if (remainingSide > side) {
                matches = matches + 1;
            }
            side++;
        }
        return matches;
    }
}