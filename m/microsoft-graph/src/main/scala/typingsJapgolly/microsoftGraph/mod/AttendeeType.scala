package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.required
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.optional
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.resource
*/
trait AttendeeType extends js.Object

object AttendeeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def optional: typingsJapgolly.microsoftGraph.microsoftGraphStrings.optional = this.cast("optional")
  @scala.inline
  def required: typingsJapgolly.microsoftGraph.microsoftGraphStrings.required = this.cast("required")
  @scala.inline
  def resource: typingsJapgolly.microsoftGraph.microsoftGraphStrings.resource = this.cast("resource")
}

