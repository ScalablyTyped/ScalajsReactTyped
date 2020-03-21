package typingsJapgolly.stompit.socketMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketError extends Error {
  def isApplicationError(): Boolean
  def isProtocolError(): Boolean
  def isTransportError(): Boolean
}

object SocketError {
  @scala.inline
  def apply(
    isApplicationError: CallbackTo[Boolean],
    isProtocolError: CallbackTo[Boolean],
    isTransportError: CallbackTo[Boolean],
    message: String,
    name: String,
    stack: String = null
  ): SocketError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("isApplicationError")(isApplicationError.toJsFn)
    __obj.updateDynamic("isProtocolError")(isProtocolError.toJsFn)
    __obj.updateDynamic("isTransportError")(isTransportError.toJsFn)
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketError]
  }
}

