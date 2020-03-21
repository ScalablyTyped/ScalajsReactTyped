package typingsJapgolly.rcPicker.timeBodyMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyOperationRef extends js.Object {
  def onUpDown(diff: Double): Unit
}

object BodyOperationRef {
  @scala.inline
  def apply(onUpDown: Double => Callback): BodyOperationRef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onUpDown")(js.Any.fromFunction1((t0: scala.Double) => onUpDown(t0).runNow()))
    __obj.asInstanceOf[BodyOperationRef]
  }
}

