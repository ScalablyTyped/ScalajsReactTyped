package typingsJapgolly.axeCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.axeCore.axeCoreStrings.inapplicable
  - typingsJapgolly.axeCore.axeCoreStrings.passes
  - typingsJapgolly.axeCore.axeCoreStrings.incomplete
  - typingsJapgolly.axeCore.axeCoreStrings.violations
*/
trait resultGroups extends js.Object

object resultGroups {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inapplicable: typingsJapgolly.axeCore.axeCoreStrings.inapplicable = this.cast("inapplicable")
  @scala.inline
  def incomplete: typingsJapgolly.axeCore.axeCoreStrings.incomplete = this.cast("incomplete")
  @scala.inline
  def passes: typingsJapgolly.axeCore.axeCoreStrings.passes = this.cast("passes")
  @scala.inline
  def violations: typingsJapgolly.axeCore.axeCoreStrings.violations = this.cast("violations")
}

