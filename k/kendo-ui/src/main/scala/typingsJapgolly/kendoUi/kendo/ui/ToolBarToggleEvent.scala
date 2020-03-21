package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolBarToggleEvent extends ToolBarEvent {
  var checked: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[JQuery] = js.undefined
}

object ToolBarToggleEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: ToolBar,
    checked: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    target: JQuery = null
  ): ToolBarToggleEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolBarToggleEvent]
  }
}

