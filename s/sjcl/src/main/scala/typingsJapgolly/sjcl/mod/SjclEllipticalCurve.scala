package typingsJapgolly.sjcl.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclEllipticalCurve extends js.Object {
  def fromBits(bits: BitArray_): SjclEllipticalPoint
}

object SjclEllipticalCurve {
  @scala.inline
  def apply(fromBits: BitArray_ => CallbackTo[SjclEllipticalPoint]): SjclEllipticalCurve = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromBits")(js.Any.fromFunction1((t0: typingsJapgolly.sjcl.mod.BitArray_) => fromBits(t0).runNow()))
    __obj.asInstanceOf[SjclEllipticalCurve]
  }
}

