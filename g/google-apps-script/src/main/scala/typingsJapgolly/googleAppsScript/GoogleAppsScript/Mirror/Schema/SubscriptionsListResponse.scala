package typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionsListResponse extends js.Object {
  var items: js.UndefOr[js.Array[Subscription]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object SubscriptionsListResponse {
  @scala.inline
  def apply(items: js.Array[Subscription] = null, kind: String = null): SubscriptionsListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionsListResponse]
  }
}

