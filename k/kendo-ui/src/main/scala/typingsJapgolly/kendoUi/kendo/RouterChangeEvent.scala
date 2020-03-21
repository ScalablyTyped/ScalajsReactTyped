package typingsJapgolly.kendoUi.kendo

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterChangeEvent extends RouterEvent {
  var backButtonPressed: Boolean
  var params: js.Any
}

object RouterChangeEvent {
  @scala.inline
  def apply(
    backButtonPressed: Boolean,
    isDefaultPrevented: CallbackTo[Boolean],
    params: js.Any,
    preventDefault: js.Function,
    sender: Router,
    url: String
  ): RouterChangeEvent = {
    val __obj = js.Dynamic.literal(backButtonPressed = backButtonPressed.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    __obj.asInstanceOf[RouterChangeEvent]
  }
}

