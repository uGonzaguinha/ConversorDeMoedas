package br.com.conversormoedas.Moeda;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

public class Moeda {
    @SerializedName("base_code")
    private String baseCode;

    @SerializedName("conversion_rates")
    private Map<String, Double> conversionRates;

    public String getBaseCode() {
        return baseCode;
    }

    public Map<String, Double> getConversionRates() {
        return conversionRates;
    }
}