package typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaDataDataTableCols extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object GaDataDataTableCols {
  @scala.inline
  def apply(id: String = null, label: String = null, `type`: String = null): GaDataDataTableCols = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GaDataDataTableCols]
  }
}

