package typingsJapgolly.rsocketCore.rsocketleaseMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaseHandler extends js.Object {
  def errorMessage(): String
  def use(): Boolean
}

object LeaseHandler {
  @scala.inline
  def apply(errorMessage: CallbackTo[String], use: CallbackTo[Boolean]): LeaseHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errorMessage")(errorMessage.toJsFn)
    __obj.updateDynamic("use")(use.toJsFn)
    __obj.asInstanceOf[LeaseHandler]
  }
}

