package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.available
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.required
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.uninstall
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.availableWithoutEnrollment
*/
trait InstallIntent extends js.Object

object InstallIntent {
  @scala.inline
  def available: typingsJapgolly.microsoftGraph.microsoftGraphStrings.available = this.cast("available")
  @scala.inline
  def availableWithoutEnrollment: typingsJapgolly.microsoftGraph.microsoftGraphStrings.availableWithoutEnrollment = this.cast("availableWithoutEnrollment")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def required: typingsJapgolly.microsoftGraph.microsoftGraphStrings.required = this.cast("required")
  @scala.inline
  def uninstall: typingsJapgolly.microsoftGraph.microsoftGraphStrings.uninstall = this.cast("uninstall")
}

