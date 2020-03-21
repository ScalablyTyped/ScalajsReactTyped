package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofcallControl extends js.Object {
  def call_control(): Double
}

object TypeofcallControl {
  @scala.inline
  def apply(call_control: CallbackTo[Double]): TypeofcallControl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("call_control")(call_control.toJsFn)
    __obj.asInstanceOf[TypeofcallControl]
  }
}

