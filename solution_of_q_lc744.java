
public class solution_of_q_lc744 {
    public static void main(String[] args) {
        char[] letters  = {'c', 'f', 'j'};
        char target = 'h';
        char ans = nextGreatestLetter(letters, target);
        System.out.println(ans);
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return letters[start % letters.length];
    }
}
