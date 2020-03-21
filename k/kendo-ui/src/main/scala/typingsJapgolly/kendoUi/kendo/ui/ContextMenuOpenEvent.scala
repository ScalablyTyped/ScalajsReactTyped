package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.kendoUi.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuOpenEvent extends ContextMenuEvent {
  var event: js.UndefOr[JQueryEventObject] = js.undefined
  var item: js.UndefOr[Element] = js.undefined
  var target: js.UndefOr[Element] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ContextMenuOpenEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: ContextMenu,
    event: JQueryEventObject = null,
    item: Element = null,
    target: Element = null,
    `type`: String = null
  ): ContextMenuOpenEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenuOpenEvent]
  }
}

