package typingsJapgolly.convertUnits.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.convertUnits.convertUnitsStrings.V
  - typingsJapgolly.convertUnits.convertUnitsStrings.mV
  - typingsJapgolly.convertUnits.convertUnitsStrings.kV
*/
trait uVoltage extends js.Object

object uVoltage {
  @scala.inline
  def V: typingsJapgolly.convertUnits.convertUnitsStrings.V = this.cast("V")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def kV: typingsJapgolly.convertUnits.convertUnitsStrings.kV = this.cast("kV")
  @scala.inline
  def mV: typingsJapgolly.convertUnits.convertUnitsStrings.mV = this.cast("mV")
}

