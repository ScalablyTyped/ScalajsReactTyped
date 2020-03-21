package typingsJapgolly.convertUnits.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.convertUnits.convertUnitsStrings.sSlashm
  - typingsJapgolly.convertUnits.convertUnitsStrings.minSlashkm
  - typingsJapgolly.convertUnits.convertUnitsStrings.sSlashft
*/
trait uPace extends js.Object

object uPace {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def minSlashkm: typingsJapgolly.convertUnits.convertUnitsStrings.minSlashkm = this.cast("min/km")
  @scala.inline
  def sSlashft: typingsJapgolly.convertUnits.convertUnitsStrings.sSlashft = this.cast("s/ft")
  @scala.inline
  def sSlashm: typingsJapgolly.convertUnits.convertUnitsStrings.sSlashm = this.cast("s/m")
}

