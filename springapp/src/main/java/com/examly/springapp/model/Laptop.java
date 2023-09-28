package com.examly.springapp.model;

public class Laptop {
    private int laptopId;
        private String laptopBrand;
            private int laptopPrice;

                public Laptop() {
                    }

                        public Laptop(int laptopId, String laptopBrand, int laptopPrice) {
                                this.laptopId = laptopId;
                                        this.laptopBrand = laptopBrand;
                                                this.laptopPrice = laptopPrice;
                                                    }

                                                        // Getter method for laptopId
                                                            public int getLaptopId() {
                                                                    return laptopId;
                                                                        }

                                                                            // Setter method for laptopId
                                                                                public void setLaptopId(int laptopId) {
                                                                                        this.laptopId = laptopId;
                                                                                            }

                                                                                                // Getter method for laptopBrand
                                                                                                    public String getLaptopBrand() {
                                                                                                            return laptopBrand;
                                                                                                                }

                                                                                                                    // Setter method for laptopBrand
                                                                                                                        public void setLaptopBrand(String laptopBrand) {
                                                                                                                                this.laptopBrand = laptopBrand;
                                                                                                                                    }

                                                                                                                                        // Getter method for laptopPrice
                                                                                                                                            public int getLaptopPrice() {
                                                                                                                                                    return laptopPrice;
                                                                                                                                                        }

                                                                                                                                                            // Setter method for laptopPrice
                                                                                                                                                                public void setLaptopPrice(int laptopPrice) {
                                                                                                                                                                        this.laptopPrice = laptopPrice;
                                                                                                                                                                            }
                                                                                                                                                                            }
                                                                                                                                                                            