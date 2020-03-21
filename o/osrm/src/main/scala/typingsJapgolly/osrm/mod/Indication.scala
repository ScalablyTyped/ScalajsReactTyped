package typingsJapgolly.osrm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.osrm.osrmStrings.uturn
  - typingsJapgolly.osrm.osrmStrings.`sharp right`
  - typingsJapgolly.osrm.osrmStrings.right
  - typingsJapgolly.osrm.osrmStrings.`slight rigth`
  - typingsJapgolly.osrm.osrmStrings.straight
  - typingsJapgolly.osrm.osrmStrings.`slight left`
  - typingsJapgolly.osrm.osrmStrings.left
  - typingsJapgolly.osrm.osrmStrings.`sharp left`
*/
trait Indication extends js.Object

object Indication {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def left: typingsJapgolly.osrm.osrmStrings.left = this.cast("left")
  @scala.inline
  def right: typingsJapgolly.osrm.osrmStrings.right = this.cast("right")
  @scala.inline
  def `sharp left`: typingsJapgolly.osrm.osrmStrings.`sharp left` = this.cast("sharp left")
  @scala.inline
  def `sharp right`: typingsJapgolly.osrm.osrmStrings.`sharp right` = this.cast("sharp right")
  @scala.inline
  def `slight left`: typingsJapgolly.osrm.osrmStrings.`slight left` = this.cast("slight left")
  @scala.inline
  def `slight rigth`: typingsJapgolly.osrm.osrmStrings.`slight rigth` = this.cast("slight rigth")
  @scala.inline
  def straight: typingsJapgolly.osrm.osrmStrings.straight = this.cast("straight")
  @scala.inline
  def uturn: typingsJapgolly.osrm.osrmStrings.uturn = this.cast("uturn")
}

