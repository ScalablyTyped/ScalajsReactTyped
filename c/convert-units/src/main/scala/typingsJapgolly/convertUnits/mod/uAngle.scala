package typingsJapgolly.convertUnits.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.convertUnits.convertUnitsStrings.deg
  - typingsJapgolly.convertUnits.convertUnitsStrings.rad
  - typingsJapgolly.convertUnits.convertUnitsStrings.grad
  - typingsJapgolly.convertUnits.convertUnitsStrings.arcmin
  - typingsJapgolly.convertUnits.convertUnitsStrings.arcsec
*/
trait uAngle extends js.Object

object uAngle {
  @scala.inline
  def arcmin: typingsJapgolly.convertUnits.convertUnitsStrings.arcmin = this.cast("arcmin")
  @scala.inline
  def arcsec: typingsJapgolly.convertUnits.convertUnitsStrings.arcsec = this.cast("arcsec")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deg: typingsJapgolly.convertUnits.convertUnitsStrings.deg = this.cast("deg")
  @scala.inline
  def grad: typingsJapgolly.convertUnits.convertUnitsStrings.grad = this.cast("grad")
  @scala.inline
  def rad: typingsJapgolly.convertUnits.convertUnitsStrings.rad = this.cast("rad")
}

