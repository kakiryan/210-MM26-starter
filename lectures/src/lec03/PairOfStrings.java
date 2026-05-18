package lec03;

public class PairOfStrings implements Pair<String>{

    private String _first;
    private String _second;

    @Override
    public String getFirst() {
        return _first;
    }

    @Override
    public String getSecond() {
        return _second;
    }
}
