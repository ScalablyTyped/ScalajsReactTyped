package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.active
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.updated
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.deleted
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.ignored
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait Status extends js.Object

object Status {
  @scala.inline
  def active: typingsJapgolly.microsoftGraph.microsoftGraphStrings.active = this.cast("active")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deleted: typingsJapgolly.microsoftGraph.microsoftGraphStrings.deleted = this.cast("deleted")
  @scala.inline
  def ignored: typingsJapgolly.microsoftGraph.microsoftGraphStrings.ignored = this.cast("ignored")
  @scala.inline
  def unknownFutureValue: typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
  @scala.inline
  def updated: typingsJapgolly.microsoftGraph.microsoftGraphStrings.updated = this.cast("updated")
}

