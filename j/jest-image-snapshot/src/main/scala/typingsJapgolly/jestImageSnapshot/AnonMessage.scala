package typingsJapgolly.jestImageSnapshot

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMessage extends js.Object {
  var pass: Boolean
  def message(): String
}

object AnonMessage {
  @scala.inline
  def apply(message: CallbackTo[String], pass: Boolean): AnonMessage = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any])
    __obj.updateDynamic("message")(message.toJsFn)
    __obj.asInstanceOf[AnonMessage]
  }
}

