public class AlyansHero extends Hero{
    public AlyansHero(String name) {
        super(name);
    }

    @Override //аннотация на метод, используемый в родительском классе, если изменить название метода в род классе, аннотация выдаст ошибку
    public String getPhrase(){
        return "Раньше я (" + super.getName() + ") бы сказал " + super.getPhrase() + ", a теперь: За Альянс!";
    }
}
