package typingsJapgolly.firebase.mod.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var brand: js.UndefOr[String] = js.undefined
  var category: js.UndefOr[String] = js.undefined
  var creative_name: js.UndefOr[String] = js.undefined
  var creative_slot: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var location_id: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var price: js.UndefOr[Currency] = js.undefined
  var quantity: js.UndefOr[Double] = js.undefined
}

object Item {
  @scala.inline
  def apply(
    brand: String = null,
    category: String = null,
    creative_name: String = null,
    creative_slot: String = null,
    id: String = null,
    location_id: String = null,
    name: String = null,
    price: Currency = null,
    quantity: Int | Double = null
  ): Item = {
    val __obj = js.Dynamic.literal()
    if (brand != null) __obj.updateDynamic("brand")(brand.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (creative_name != null) __obj.updateDynamic("creative_name")(creative_name.asInstanceOf[js.Any])
    if (creative_slot != null) __obj.updateDynamic("creative_slot")(creative_slot.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (location_id != null) __obj.updateDynamic("location_id")(location_id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
}

