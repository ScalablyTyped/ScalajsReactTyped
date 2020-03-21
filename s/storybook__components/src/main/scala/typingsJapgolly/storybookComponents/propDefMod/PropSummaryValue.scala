package typingsJapgolly.storybookComponents.propDefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropSummaryValue extends js.Object {
  var detail: js.UndefOr[String] = js.native
  var summary: String = js.native
}

object PropSummaryValue {
  @scala.inline
  def apply(summary: String, detail: String = null): PropSummaryValue = {
    val __obj = js.Dynamic.literal(summary = summary.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropSummaryValue]
  }
}

