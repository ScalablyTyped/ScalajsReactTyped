package typingsJapgolly.convertUnits.mod

import typingsJapgolly.convertUnits.convertUnitsStrings.mWh_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.convertUnits.convertUnitsStrings.Wh
  - typingsJapgolly.convertUnits.convertUnitsStrings.mWh_
  - typingsJapgolly.convertUnits.convertUnitsStrings.kWh
  - typingsJapgolly.convertUnits.convertUnitsStrings.MWh
  - typingsJapgolly.convertUnits.convertUnitsStrings.GWh
  - typingsJapgolly.convertUnits.convertUnitsStrings.J
  - typingsJapgolly.convertUnits.convertUnitsStrings.kJ
*/
trait uEnergy extends js.Object

object uEnergy {
  @scala.inline
  def GWh: typingsJapgolly.convertUnits.convertUnitsStrings.GWh = this.cast("GWh")
  @scala.inline
  def J: typingsJapgolly.convertUnits.convertUnitsStrings.J = this.cast("J")
  @scala.inline
  def MWh: typingsJapgolly.convertUnits.convertUnitsStrings.MWh = this.cast("MWh")
  @scala.inline
  def Wh: typingsJapgolly.convertUnits.convertUnitsStrings.Wh = this.cast("Wh")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def kJ: typingsJapgolly.convertUnits.convertUnitsStrings.kJ = this.cast("kJ")
  @scala.inline
  def kWh: typingsJapgolly.convertUnits.convertUnitsStrings.kWh = this.cast("kWh")
  @scala.inline
  def mWh: mWh_ = this.cast("mWh")
}

