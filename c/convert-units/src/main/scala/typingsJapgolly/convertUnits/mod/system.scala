package typingsJapgolly.convertUnits.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.convertUnits.convertUnitsStrings.metric
  - typingsJapgolly.convertUnits.convertUnitsStrings.imperial
  - typingsJapgolly.convertUnits.convertUnitsStrings.bits
  - typingsJapgolly.convertUnits.convertUnitsStrings.bytes
*/
trait system extends js.Object

object system {
  @scala.inline
  def bits: typingsJapgolly.convertUnits.convertUnitsStrings.bits = this.cast("bits")
  @scala.inline
  def bytes: typingsJapgolly.convertUnits.convertUnitsStrings.bytes = this.cast("bytes")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def imperial: typingsJapgolly.convertUnits.convertUnitsStrings.imperial = this.cast("imperial")
  @scala.inline
  def metric: typingsJapgolly.convertUnits.convertUnitsStrings.metric = this.cast("metric")
}

