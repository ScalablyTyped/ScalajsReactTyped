package typingsJapgolly.convertUnits.mod

import typingsJapgolly.convertUnits.convertUnitsStrings.mHz_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.convertUnits.convertUnitsStrings.Hz
  - typingsJapgolly.convertUnits.convertUnitsStrings.mHz_
  - typingsJapgolly.convertUnits.convertUnitsStrings.kHz
  - typingsJapgolly.convertUnits.convertUnitsStrings.MHz
  - typingsJapgolly.convertUnits.convertUnitsStrings.GHz
  - typingsJapgolly.convertUnits.convertUnitsStrings.THz
  - typingsJapgolly.convertUnits.convertUnitsStrings.rpm
  - typingsJapgolly.convertUnits.convertUnitsStrings.degSlashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.radSlashs
*/
trait uFrequency extends js.Object

object uFrequency {
  @scala.inline
  def GHz: typingsJapgolly.convertUnits.convertUnitsStrings.GHz = this.cast("GHz")
  @scala.inline
  def Hz: typingsJapgolly.convertUnits.convertUnitsStrings.Hz = this.cast("Hz")
  @scala.inline
  def MHz: typingsJapgolly.convertUnits.convertUnitsStrings.MHz = this.cast("MHz")
  @scala.inline
  def THz: typingsJapgolly.convertUnits.convertUnitsStrings.THz = this.cast("THz")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def degSlashs: typingsJapgolly.convertUnits.convertUnitsStrings.degSlashs = this.cast("deg/s")
  @scala.inline
  def kHz: typingsJapgolly.convertUnits.convertUnitsStrings.kHz = this.cast("kHz")
  @scala.inline
  def mHz: mHz_ = this.cast("mHz")
  @scala.inline
  def radSlashs: typingsJapgolly.convertUnits.convertUnitsStrings.radSlashs = this.cast("rad/s")
  @scala.inline
  def rpm: typingsJapgolly.convertUnits.convertUnitsStrings.rpm = this.cast("rpm")
}

