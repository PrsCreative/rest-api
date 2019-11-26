package th.co.orcsoft.product.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper=false)
public class ProductReq  implements Serializable {

    private static final long serialVersionUID = -4880960165914915146L;

    private String id;
    private String productName;
    private String price;

}
