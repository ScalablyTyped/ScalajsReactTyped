package typingsJapgolly.shopifyPrime.lineItemPropertyMod

import typingsJapgolly.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineItemProperty extends ShopifyObject {
  /**
    * The name of the note attribute.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The value of the note attribute.
    */
  var value: js.UndefOr[js.Any] = js.undefined
}

object LineItemProperty {
  @scala.inline
  def apply(
    admin_graphql_api_id: String = null,
    id: Int | Double = null,
    name: String = null,
    value: js.Any = null
  ): LineItemProperty = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineItemProperty]
  }
}

