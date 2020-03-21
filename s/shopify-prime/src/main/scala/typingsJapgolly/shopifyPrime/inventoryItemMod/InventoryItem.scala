package typingsJapgolly.shopifyPrime.inventoryItemMod

import typingsJapgolly.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryItem extends ShopifyObject {
  var created_at: js.UndefOr[String] = js.undefined
  var sku: js.UndefOr[String] = js.undefined
  var tracked: js.UndefOr[Boolean] = js.undefined
  var updated_at: js.UndefOr[Double] = js.undefined
}

object InventoryItem {
  @scala.inline
  def apply(
    admin_graphql_api_id: String = null,
    created_at: String = null,
    id: Int | Double = null,
    sku: String = null,
    tracked: js.UndefOr[Boolean] = js.undefined,
    updated_at: Int | Double = null
  ): InventoryItem = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (sku != null) __obj.updateDynamic("sku")(sku.asInstanceOf[js.Any])
    if (!js.isUndefined(tracked)) __obj.updateDynamic("tracked")(tracked.asInstanceOf[js.Any])
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryItem]
  }
}

