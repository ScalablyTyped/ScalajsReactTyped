package typingsJapgolly.axeCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.axeCore.axeCoreStrings.minor
  - typingsJapgolly.axeCore.axeCoreStrings.moderate
  - typingsJapgolly.axeCore.axeCoreStrings.serious
  - typingsJapgolly.axeCore.axeCoreStrings.critical
*/
trait ImpactValue extends js.Object

object ImpactValue {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def critical: typingsJapgolly.axeCore.axeCoreStrings.critical = this.cast("critical")
  @scala.inline
  def minor: typingsJapgolly.axeCore.axeCoreStrings.minor = this.cast("minor")
  @scala.inline
  def moderate: typingsJapgolly.axeCore.axeCoreStrings.moderate = this.cast("moderate")
  @scala.inline
  def serious: typingsJapgolly.axeCore.axeCoreStrings.serious = this.cast("serious")
}

