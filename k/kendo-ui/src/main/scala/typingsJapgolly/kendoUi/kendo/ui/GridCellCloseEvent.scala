package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.JQuery
import typingsJapgolly.kendoUi.kendo.data.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridCellCloseEvent extends GridEvent {
  var container: js.UndefOr[JQuery] = js.undefined
  var model: js.UndefOr[Model] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object GridCellCloseEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Grid,
    container: JQuery = null,
    model: Model = null,
    `type`: String = null
  ): GridCellCloseEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridCellCloseEvent]
  }
}

