package study.developia.validation.web.validation.form;

import lombok.Data;
import org.hibernate.validator.constraints.Range;
import study.developia.validation.domain.item.Item;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class ItemSaveForm {

    @NotBlank
    private String itemName;

    @NotNull
    @Range(min = 1000, max = 100000)
    private Integer price;

    @NotNull
    @Max(value = 9999)
    private Integer quantity;

    public Item save(ItemSaveForm form) {
        Item item = new Item();
        item.setItemName(form.getItemName());
        item.setPrice(form.getPrice());
        item.setQuantity(form.getQuantity());
        return item;
    }
}
