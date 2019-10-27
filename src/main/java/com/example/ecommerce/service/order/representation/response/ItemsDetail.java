package com.example.ecommerce.service.order.representation.response;

import com.example.ecommerce.model.order.SoldProduct;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemsDetail {
    private String cartId;
    private List<SoldProduct> itemsSold;

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public void setItemsSold(List<SoldProduct> itemsSold) {
        this.itemsSold = itemsSold;
    }
}
