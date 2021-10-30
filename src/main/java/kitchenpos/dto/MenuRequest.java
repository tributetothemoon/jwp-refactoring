package kitchenpos.dto;

import java.util.List;

public class MenuRequest {
    private String name;
    private Long price;
    private Long menuGroupId;
    private List<MenuProductRequest> menuProductRequests;

    public MenuRequest() {
    }

    public MenuRequest(String name, Long price, Long menuGroupId, List<MenuProductRequest> menuProductRequests) {
        this.name = name;
        this.price = price;
        this.menuGroupId = menuGroupId;
        this.menuProductRequests = menuProductRequests;
    }

    public String getName() {
        return name;
    }

    public Long getPrice() {
        return price;
    }

    public Long getMenuGroupId() {
        return menuGroupId;
    }

    public List<MenuProductRequest> getMenuProductRequests() {
        return menuProductRequests;
    }
}
