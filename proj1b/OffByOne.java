public class OffByOne implements CharacterComparator {

    @Override
    public boolean equalChars(char x, char y) {
        int dis = (int) x - (int) y;
        return (Math.abs(dis) == 1);
    }
}
