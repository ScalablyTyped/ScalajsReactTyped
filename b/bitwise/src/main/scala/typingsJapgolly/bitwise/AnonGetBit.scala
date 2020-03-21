package typingsJapgolly.bitwise

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.bitwise.typesMod.Bit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetBit extends js.Object {
  def getBit(int32: Double, position: Double): Bit
  def setBit(int32: Double, position: Double, value: Bit): Bit
  def toggleBit(int32: Double, position: Double): Double
}

object AnonGetBit {
  @scala.inline
  def apply(
    getBit: (Double, Double) => CallbackTo[Bit],
    setBit: (Double, Double, Bit) => CallbackTo[Bit],
    toggleBit: (Double, Double) => CallbackTo[Double]
  ): AnonGetBit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getBit")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => getBit(t0, t1).runNow()))
    __obj.updateDynamic("setBit")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: typingsJapgolly.bitwise.typesMod.Bit) => setBit(t0, t1, t2).runNow()))
    __obj.updateDynamic("toggleBit")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => toggleBit(t0, t1).runNow()))
    __obj.asInstanceOf[AnonGetBit]
  }
}

