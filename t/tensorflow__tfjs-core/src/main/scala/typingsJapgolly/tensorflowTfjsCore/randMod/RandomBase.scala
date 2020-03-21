package typingsJapgolly.tensorflowTfjsCore.randMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandomBase extends js.Object {
  def nextValue(): Double
}

object RandomBase {
  @scala.inline
  def apply(nextValue: CallbackTo[Double]): RandomBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("nextValue")(nextValue.toJsFn)
    __obj.asInstanceOf[RandomBase]
  }
}

