package typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddSheetRequest extends js.Object {
  var properties: js.UndefOr[SheetProperties] = js.undefined
}

object AddSheetRequest {
  @scala.inline
  def apply(properties: SheetProperties = null): AddSheetRequest = {
    val __obj = js.Dynamic.literal()
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddSheetRequest]
  }
}

