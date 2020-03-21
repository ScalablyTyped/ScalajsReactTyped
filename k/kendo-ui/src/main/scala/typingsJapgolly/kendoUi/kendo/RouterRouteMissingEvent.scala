package typingsJapgolly.kendoUi.kendo

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterRouteMissingEvent extends RouterEvent {
  var params: js.Any
}

object RouterRouteMissingEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    params: js.Any,
    preventDefault: js.Function,
    sender: Router,
    url: String
  ): RouterRouteMissingEvent = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    __obj.asInstanceOf[RouterRouteMissingEvent]
  }
}

