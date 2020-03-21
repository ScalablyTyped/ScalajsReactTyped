package typingsJapgolly.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BillingInfoList extends js.Object {
  /** A list of billing info relevant for your account. */
  var items: js.UndefOr[js.Array[BillingInfo]] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
}

object BillingInfoList {
  @scala.inline
  def apply(items: js.Array[BillingInfo] = null, kind: String = null): BillingInfoList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingInfoList]
  }
}

