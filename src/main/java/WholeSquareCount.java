
class WholeSquareCount {

    public int solution(int A, int B) {

        int cnt = 0;

        for (int i = A; i <= B; i++)

            for (int j = 1; j * j <= i; j++)
                if (j * j == i)
                    cnt++;
        return cnt;
    }
}