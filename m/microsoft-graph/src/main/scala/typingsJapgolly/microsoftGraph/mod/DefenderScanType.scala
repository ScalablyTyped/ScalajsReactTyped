package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.userDefined
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.disabled
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.quick
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.full
*/
trait DefenderScanType extends js.Object

object DefenderScanType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disabled: typingsJapgolly.microsoftGraph.microsoftGraphStrings.disabled = this.cast("disabled")
  @scala.inline
  def full: typingsJapgolly.microsoftGraph.microsoftGraphStrings.full = this.cast("full")
  @scala.inline
  def quick: typingsJapgolly.microsoftGraph.microsoftGraphStrings.quick = this.cast("quick")
  @scala.inline
  def userDefined: typingsJapgolly.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

