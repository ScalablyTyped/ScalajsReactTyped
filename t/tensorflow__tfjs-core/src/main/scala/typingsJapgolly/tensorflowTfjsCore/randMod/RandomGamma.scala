package typingsJapgolly.tensorflowTfjsCore.randMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandomGamma extends js.Object {
  def nextValue(): Double
}

object RandomGamma {
  @scala.inline
  def apply(nextValue: CallbackTo[Double]): RandomGamma = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("nextValue")(nextValue.toJsFn)
    __obj.asInstanceOf[RandomGamma]
  }
}

