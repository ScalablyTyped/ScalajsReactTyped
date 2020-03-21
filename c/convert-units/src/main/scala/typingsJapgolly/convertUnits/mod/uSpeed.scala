package typingsJapgolly.convertUnits.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.convertUnits.convertUnitsStrings.mSlashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.kmSlashh
  - typingsJapgolly.convertUnits.convertUnitsStrings.mSlashh
  - typingsJapgolly.convertUnits.convertUnitsStrings.knot
  - typingsJapgolly.convertUnits.convertUnitsStrings.ftSlashs
*/
trait uSpeed extends js.Object

object uSpeed {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ftSlashs: typingsJapgolly.convertUnits.convertUnitsStrings.ftSlashs = this.cast("ft/s")
  @scala.inline
  def kmSlashh: typingsJapgolly.convertUnits.convertUnitsStrings.kmSlashh = this.cast("km/h")
  @scala.inline
  def knot: typingsJapgolly.convertUnits.convertUnitsStrings.knot = this.cast("knot")
  @scala.inline
  def mSlashh: typingsJapgolly.convertUnits.convertUnitsStrings.mSlashh = this.cast("m/h")
  @scala.inline
  def mSlashs: typingsJapgolly.convertUnits.convertUnitsStrings.mSlashs = this.cast("m/s")
}

