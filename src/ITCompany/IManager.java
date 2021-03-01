package ITCompany;

public interface IManager extends IWorker {
    String manage();
    void setDoingDuration(int day);
    void setPenalty(int penalty);
    void setBonus(int bonus);
}
