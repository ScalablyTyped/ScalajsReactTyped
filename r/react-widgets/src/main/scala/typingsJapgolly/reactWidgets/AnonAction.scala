package typingsJapgolly.reactWidgets

import typingsJapgolly.reactWidgets.reactWidgetsStrings.insert
import typingsJapgolly.reactWidgets.reactWidgetsStrings.remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAction extends js.Object {
  var action: insert | remove
  var dataItem: js.Any
  var lastValue: js.UndefOr[js.Array[_]] = js.undefined
  var originalEvent: js.UndefOr[js.Any] = js.undefined
  var searchTerm: js.UndefOr[String] = js.undefined
}

object AnonAction {
  @scala.inline
  def apply(
    action: insert | remove,
    dataItem: js.Any,
    lastValue: js.Array[_] = null,
    originalEvent: js.Any = null,
    searchTerm: String = null
  ): AnonAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], dataItem = dataItem.asInstanceOf[js.Any])
    if (lastValue != null) __obj.updateDynamic("lastValue")(lastValue.asInstanceOf[js.Any])
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent.asInstanceOf[js.Any])
    if (searchTerm != null) __obj.updateDynamic("searchTerm")(searchTerm.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAction]
  }
}

