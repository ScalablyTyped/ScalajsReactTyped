package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitterExpandEvent extends SplitterEvent {
  var pane: js.UndefOr[Element] = js.undefined
}

object SplitterExpandEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Splitter,
    pane: Element = null
  ): SplitterExpandEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitterExpandEvent]
  }
}

