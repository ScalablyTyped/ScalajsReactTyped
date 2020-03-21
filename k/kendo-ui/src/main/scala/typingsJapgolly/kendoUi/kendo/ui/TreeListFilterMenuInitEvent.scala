package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListFilterMenuInitEvent extends TreeListEvent {
  var container: js.UndefOr[JQuery] = js.undefined
  var field: js.UndefOr[String] = js.undefined
}

object TreeListFilterMenuInitEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: TreeList,
    container: JQuery = null,
    field: String = null
  ): TreeListFilterMenuInitEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeListFilterMenuInitEvent]
  }
}

