package typingsJapgolly.googleAppsScript.GoogleAppsScript.Adsense.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alerts extends js.Object {
  var items: js.UndefOr[js.Array[Alert]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object Alerts {
  @scala.inline
  def apply(items: js.Array[Alert] = null, kind: String = null): Alerts = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alerts]
  }
}

