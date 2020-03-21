package typingsJapgolly.sjcl.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclPointJacobian extends js.Object {
  def add(T: SjclEllipticalPoint): SjclPointJacobian
  def doubl(): SjclPointJacobian
  def isValid(): Boolean
  def mult(k: BigNumber, affine: SjclEllipticalPoint): SjclPointJacobian
  def mult2(k1: BigNumber, affine: SjclEllipticalPoint, k2: BigNumber, affine2: SjclEllipticalPoint): SjclPointJacobian
  def negate(): SjclPointJacobian
  def toAffine(): SjclEllipticalPoint
}

object SjclPointJacobian {
  @scala.inline
  def apply(
    add: SjclEllipticalPoint => CallbackTo[SjclPointJacobian],
    doubl: CallbackTo[SjclPointJacobian],
    isValid: CallbackTo[Boolean],
    mult: (BigNumber, SjclEllipticalPoint) => CallbackTo[SjclPointJacobian],
    mult2: (BigNumber, SjclEllipticalPoint, BigNumber, SjclEllipticalPoint) => CallbackTo[SjclPointJacobian],
    negate: CallbackTo[SjclPointJacobian],
    toAffine: CallbackTo[SjclEllipticalPoint]
  ): SjclPointJacobian = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: typingsJapgolly.sjcl.mod.SjclEllipticalPoint) => add(t0).runNow()))
    __obj.updateDynamic("doubl")(doubl.toJsFn)
    __obj.updateDynamic("isValid")(isValid.toJsFn)
    __obj.updateDynamic("mult")(js.Any.fromFunction2((t0: typingsJapgolly.sjcl.mod.BigNumber, t1: typingsJapgolly.sjcl.mod.SjclEllipticalPoint) => mult(t0, t1).runNow()))
    __obj.updateDynamic("mult2")(js.Any.fromFunction4((t0: typingsJapgolly.sjcl.mod.BigNumber, t1: typingsJapgolly.sjcl.mod.SjclEllipticalPoint, t2: typingsJapgolly.sjcl.mod.BigNumber, t3: typingsJapgolly.sjcl.mod.SjclEllipticalPoint) => mult2(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("negate")(negate.toJsFn)
    __obj.updateDynamic("toAffine")(toAffine.toJsFn)
    __obj.asInstanceOf[SjclPointJacobian]
  }
}

