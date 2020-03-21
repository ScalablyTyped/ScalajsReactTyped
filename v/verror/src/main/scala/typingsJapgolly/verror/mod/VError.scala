package typingsJapgolly.verror.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VError extends Error {
  def cause(): js.UndefOr[js.Error]
}

object VError {
  @scala.inline
  def apply(cause: CallbackTo[js.UndefOr[js.Error]], message: String, name: String, stack: String = null): VError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("cause")(cause.toJsFn)
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[VError]
  }
}

