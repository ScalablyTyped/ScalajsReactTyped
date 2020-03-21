package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.valid
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.expired
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.invalid
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.assignedToExternalMDM
*/
trait VppTokenState extends js.Object

object VppTokenState {
  @scala.inline
  def assignedToExternalMDM: typingsJapgolly.microsoftGraph.microsoftGraphStrings.assignedToExternalMDM = this.cast("assignedToExternalMDM")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def expired: typingsJapgolly.microsoftGraph.microsoftGraphStrings.expired = this.cast("expired")
  @scala.inline
  def invalid: typingsJapgolly.microsoftGraph.microsoftGraphStrings.invalid = this.cast("invalid")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def valid: typingsJapgolly.microsoftGraph.microsoftGraphStrings.valid = this.cast("valid")
}

