package typingsJapgolly.googleAppsScript.GoogleAppsScript.Adsense.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Payments extends js.Object {
  var items: js.UndefOr[js.Array[Payment]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object Payments {
  @scala.inline
  def apply(items: js.Array[Payment] = null, kind: String = null): Payments = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payments]
  }
}

