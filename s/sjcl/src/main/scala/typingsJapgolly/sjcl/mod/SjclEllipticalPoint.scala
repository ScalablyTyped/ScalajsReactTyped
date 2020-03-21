package typingsJapgolly.sjcl.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclEllipticalPoint extends js.Object {
  def isValid(): Boolean
  def mult(k: BigNumber): SjclEllipticalPoint
  def mult2(k: BigNumber, k2: BigNumber, affine2: SjclEllipticalPoint): SjclEllipticalPoint
  def multiples(): js.Array[SjclEllipticalPoint]
  def negate(): SjclEllipticalPoint
  def toBits(): BitArray_
  def toJac(): SjclPointJacobian
}

object SjclEllipticalPoint {
  @scala.inline
  def apply(
    isValid: CallbackTo[Boolean],
    mult: BigNumber => CallbackTo[SjclEllipticalPoint],
    mult2: (BigNumber, BigNumber, SjclEllipticalPoint) => CallbackTo[SjclEllipticalPoint],
    multiples: CallbackTo[js.Array[SjclEllipticalPoint]],
    negate: CallbackTo[SjclEllipticalPoint],
    toBits: CallbackTo[BitArray_],
    toJac: CallbackTo[SjclPointJacobian]
  ): SjclEllipticalPoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isValid")(isValid.toJsFn)
    __obj.updateDynamic("mult")(js.Any.fromFunction1((t0: typingsJapgolly.sjcl.mod.BigNumber) => mult(t0).runNow()))
    __obj.updateDynamic("mult2")(js.Any.fromFunction3((t0: typingsJapgolly.sjcl.mod.BigNumber, t1: typingsJapgolly.sjcl.mod.BigNumber, t2: typingsJapgolly.sjcl.mod.SjclEllipticalPoint) => mult2(t0, t1, t2).runNow()))
    __obj.updateDynamic("multiples")(multiples.toJsFn)
    __obj.updateDynamic("negate")(negate.toJsFn)
    __obj.updateDynamic("toBits")(toBits.toJsFn)
    __obj.updateDynamic("toJac")(toJac.toJsFn)
    __obj.asInstanceOf[SjclEllipticalPoint]
  }
}

