package typingsJapgolly.googleAppsScript.GoogleAppsScript.Adsense.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedAdStyle extends js.Object {
  var adStyle: js.UndefOr[AdStyle] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object SavedAdStyle {
  @scala.inline
  def apply(adStyle: AdStyle = null, id: String = null, kind: String = null, name: String = null): SavedAdStyle = {
    val __obj = js.Dynamic.literal()
    if (adStyle != null) __obj.updateDynamic("adStyle")(adStyle.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedAdStyle]
  }
}

