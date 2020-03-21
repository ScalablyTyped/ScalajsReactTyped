package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofxhttpRpc extends js.Object {
  def dispatch(): Double
}

object TypeofxhttpRpc {
  @scala.inline
  def apply(dispatch: CallbackTo[Double]): TypeofxhttpRpc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispatch")(dispatch.toJsFn)
    __obj.asInstanceOf[TypeofxhttpRpc]
  }
}

