package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.created
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.updated
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.deleted
*/
trait ChangeType extends js.Object

object ChangeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def created: typingsJapgolly.microsoftGraph.microsoftGraphStrings.created = this.cast("created")
  @scala.inline
  def deleted: typingsJapgolly.microsoftGraph.microsoftGraphStrings.deleted = this.cast("deleted")
  @scala.inline
  def updated: typingsJapgolly.microsoftGraph.microsoftGraphStrings.updated = this.cast("updated")
}

