package th.co.orcsoft.product.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
public class ProductResp implements Serializable {

    private static final long serialVersionUID = -4880960165914915146L;

    private String id;
    private String productName;
    private String desc;
    private String image;

}
