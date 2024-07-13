class Pizza {
    private int price;
    private Boolean veg;
    private int extrachessprice = 100;
    private int extratoopingsprice = 150;
    private int backpack = 20;
    private  int basepizzaPrice;
    private boolean isExtraCheseAdded=false;
    private boolean isExtraToppingAdded=false;
    private boolean isOptedforTakeWay=false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basepizzaPrice=this.price;

    }

    public void addExtraCheese() {
        isExtraCheseAdded =true;

        this.price += extrachessprice;
    }

    public void addExtraToppings() {
        isExtraToppingAdded=true;
        this.price += extratoopingsprice;
    }

    public void takeaway() {
        isOptedforTakeWay=true;
        this.price += backpack;
    }

    public void getBill() {
        String bill ="";
        System.out.println("Pizza: "+basepizzaPrice);
       if(isExtraCheseAdded){
        bill+="Extra Cheese Added: "+extrachessprice+ "\n";
       }
       if (isExtraToppingAdded){
           bill+= "Extra Topping Added: "+extratoopingsprice+"\n";
       }
        if (isOptedforTakeWay){
            bill+= "Take Away: "+backpack+"\n";
        }
        bill+="Bill: "+this.price+"\n";
        System.out.println(bill);
    }
}