package typingsJapgolly.reactWidgets

import typingsJapgolly.reactWidgets.reactWidgetsStrings.clear
import typingsJapgolly.reactWidgets.reactWidgetsStrings.input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLastSearchTerm extends js.Object {
  var action: clear | input
  var lastSearchTerm: js.UndefOr[String] = js.undefined
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object AnonLastSearchTerm {
  @scala.inline
  def apply(action: clear | input, lastSearchTerm: String = null, originalEvent: js.Any = null): AnonLastSearchTerm = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    if (lastSearchTerm != null) __obj.updateDynamic("lastSearchTerm")(lastSearchTerm.asInstanceOf[js.Any])
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLastSearchTerm]
  }
}

