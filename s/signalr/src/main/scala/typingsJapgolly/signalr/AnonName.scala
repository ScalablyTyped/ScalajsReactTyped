package typingsJapgolly.signalr

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: String
  def supportsKeepAlive(): Boolean
}

object AnonName {
  @scala.inline
  def apply(name: String, supportsKeepAlive: CallbackTo[Boolean]): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("supportsKeepAlive")(supportsKeepAlive.toJsFn)
    __obj.asInstanceOf[AnonName]
  }
}

