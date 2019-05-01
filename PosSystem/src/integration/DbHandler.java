package integration;
import util.DiscountRule;
import util.ItemIdentifier;

public class DbHandler {
    private ItemRegistry itemRegistry;
    private DiscountRegistry discountRegistry;

    public DbHandler(){
        itemRegistry = new ItemRegistry();
        discountRegistry = new DiscountRegistry();
    }

    /**
     *
     * @param itemIdentifier
     * @return
     */
    public ItemDTO getItemDTO(ItemIdentifier itemIdentifier) {
        if (itemRegistry.getItemList().containsKey(itemIdentifier)) {
            return itemRegistry.getItemList().get(itemIdentifier);
        } else {
            System.out.println("Item does no exist!");
            return null;
        }
    }

    /**
     *
     * @param customerId
     * @return
     */
    public DiscountRule getDiscountRules(String customerId){
        if(discountRegistry.getPersonalDiscountList().containsKey(customerId)){
            return discountRegistry.getPersonalDiscountList().get(customerId);
        } else {
            System.out.println("Customer has no discount!");
            return null;
        }
    }

    /**
     *
     * @param saleDTO
     */
    public void registerSalesInformation(SaleDTO saleDTO){
        System.out.println("Sends file to external system");
    }
}
