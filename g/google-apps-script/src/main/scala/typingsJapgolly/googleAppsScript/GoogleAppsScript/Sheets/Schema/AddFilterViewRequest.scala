package typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddFilterViewRequest extends js.Object {
  var filter: js.UndefOr[FilterView] = js.undefined
}

object AddFilterViewRequest {
  @scala.inline
  def apply(filter: FilterView = null): AddFilterViewRequest = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddFilterViewRequest]
  }
}

