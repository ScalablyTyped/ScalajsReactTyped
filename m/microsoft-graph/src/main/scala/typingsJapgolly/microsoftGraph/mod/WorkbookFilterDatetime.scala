package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookFilterDatetime extends js.Object {
  var date: js.UndefOr[String] = js.undefined
  var specificity: js.UndefOr[String] = js.undefined
}

object WorkbookFilterDatetime {
  @scala.inline
  def apply(date: String = null, specificity: String = null): WorkbookFilterDatetime = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (specificity != null) __obj.updateDynamic("specificity")(specificity.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookFilterDatetime]
  }
}

