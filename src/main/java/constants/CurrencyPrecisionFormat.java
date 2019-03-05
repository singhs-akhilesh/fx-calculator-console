package constants;

public enum CurrencyPrecisionFormat {
    AUD(2),
    CAD(2),
    CNY(2),
    CZK(2),
    DKK(2),
    EUR(2),
    GBP(2),
    JPY(0),
    NOK(2),
    NZD(2),
    USD(2);

    public int precision;
    CurrencyPrecisionFormat(int precision){
        this.precision = precision;
    }

}
