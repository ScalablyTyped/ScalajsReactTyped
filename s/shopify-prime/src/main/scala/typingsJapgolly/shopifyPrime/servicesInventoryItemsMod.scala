package typingsJapgolly.shopifyPrime

import typingsJapgolly.shopifyPrime.infrastructureMod.BaseService
import typingsJapgolly.shopifyPrime.inventoryItemMod.InventoryItem
import typingsJapgolly.shopifyPrime.inventoryItemsMod.InventoryItemListOptions
import typingsJapgolly.shopifyPrime.optionsBaseMod.FieldOptions
import typingsJapgolly.std.Location_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/inventory_items", JSImport.Namespace)
@js.native
object servicesInventoryItemsMod extends js.Object {
  @js.native
  class InventoryItems protected () extends BaseService {
    def this(shopDomain: String, accessToken: String) = this()
    /**
      * Gets a inventory item with the given id.
      * @param id Id of the inventory item being retrieved.
      * @param options Options for filtering the result.
      */
    def get(id: Double): js.Promise[Location_] = js.native
    def get(id: Double, options: FieldOptions): js.Promise[Location_] = js.native
    /**
      * Gets a list of up to 250 of the shop's inventory items.
      * @param options Options for filtering the result.
      */
    def list(options: InventoryItemListOptions): js.Promise[js.Array[InventoryItem]] = js.native
    /**
      * Updates an inventory item with the given id.
      * @param id The inventory items's id.
      * @param inventoryItem The updated inventory item.
      */
    def update(id: Double, inventoryItem: InventoryItem): js.Promise[InventoryItem] = js.native
  }
  
  @js.native
  class default protected () extends InventoryItems {
    def this(shopDomain: String, accessToken: String) = this()
  }
  
}

