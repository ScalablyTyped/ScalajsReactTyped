package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridPageEvent extends GridEvent {
  var page: js.UndefOr[Double] = js.undefined
}

object GridPageEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Grid,
    page: Int | Double = null
  ): GridPageEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridPageEvent]
  }
}

