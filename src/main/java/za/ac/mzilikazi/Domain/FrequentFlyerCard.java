package za.ac.mzilikazi.Domain;

/**
 * Created by mandisi on 2016-04-16.
 */
public class FrequentFlyerCard {
    private String cardNumber;
    private String miles;
    private String mealCode;

    public FrequentFlyerCard() {
    }

    public FrequentFlyerCard(Builder builder){
        cardNumber = builder.cardNumber;
        miles = builder.miles;
        mealCode = builder.mealCode;
    }
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getMiles() {
        return miles;
    }

    public void setMiles(String miles) {
        this.miles = miles;
    }

    public String getMealCode() {
        return mealCode;
    }

    public void setMealCode(String mealCode) {
        this.mealCode = mealCode;
    }

    public class Builder{
        private String cardNumber;
        private String miles;
        private String mealCode;


        public Builder cardNumber(String value){
            this.cardNumber = value;
            return this;
        }

        public Builder miles(String value){
            this.miles = value;
            return this;
        }

        public Builder mealCode(String value){
            this.mealCode = value;
            return this;
        }
        public Builder copy(FrequentFlyerCard value){
            this.cardNumber = value.getCardNumber();
            this.miles = value.getMiles();
            this.mealCode = value.getMealCode();
            return this;
        }
        public FrequentFlyerCard build(){
            return new FrequentFlyerCard(this);
        }
    }
}
