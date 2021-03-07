package EndTerm;

public interface IPediatr extends IDoctor {
    String manage();
    void setDoingDuration(int day);
    void setPenalty(int penalty);
    void setBonus(int bonus);
}
