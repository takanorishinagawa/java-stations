package com.example.station10;

public class Main {
    public static void main(String[] args) {
        System.out.println("商品合計: 1000, 支払額: " + new Main().applyTaxAndShippingFee(1000));
        System.out.println("商品合計: 10000, 支払額: " + new Main().applyTaxAndShippingFee(10000));
        System.out.println("商品合計: 9999, 支払額: " + new Main().applyTaxAndShippingFee(9999));
    }

    float applyTaxAndShippingFee(int noTaxSubtotal) {
        float total = noTaxSubtotal;

        if (noTaxSubtotal < 10000) {
            total += 800;
        }

        total += total * 0.1;

        return total;
    }
}
