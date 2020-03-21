package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBoxDragEvent extends ListBoxEvent {
  var dataItems: js.UndefOr[js.Any] = js.undefined
  var draggableEvent: js.UndefOr[js.Any] = js.undefined
  var items: js.UndefOr[JQuery] = js.undefined
}

object ListBoxDragEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: ListBox,
    dataItems: js.Any = null,
    draggableEvent: js.Any = null,
    items: JQuery = null
  ): ListBoxDragEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (dataItems != null) __obj.updateDynamic("dataItems")(dataItems.asInstanceOf[js.Any])
    if (draggableEvent != null) __obj.updateDynamic("draggableEvent")(draggableEvent.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBoxDragEvent]
  }
}

