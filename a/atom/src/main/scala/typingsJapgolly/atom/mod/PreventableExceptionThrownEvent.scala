package typingsJapgolly.atom.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreventableExceptionThrownEvent extends ExceptionThrownEvent {
  def preventDefault(): Unit
}

object PreventableExceptionThrownEvent {
  @scala.inline
  def apply(
    column: Double,
    line: Double,
    message: String,
    originalError: js.Error,
    preventDefault: Callback,
    url: String
  ): PreventableExceptionThrownEvent = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], originalError = originalError.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("preventDefault")(preventDefault.toJsFn)
    __obj.asInstanceOf[PreventableExceptionThrownEvent]
  }
}

