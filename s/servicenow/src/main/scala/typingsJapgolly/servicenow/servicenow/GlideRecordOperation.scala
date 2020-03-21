package typingsJapgolly.servicenow.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.servicenow.servicenowStrings.insert
  - typingsJapgolly.servicenow.servicenowStrings.update
  - typingsJapgolly.servicenow.servicenowStrings.delete
*/
trait GlideRecordOperation extends js.Object

object GlideRecordOperation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete: typingsJapgolly.servicenow.servicenowStrings.delete = this.cast("delete")
  @scala.inline
  def insert: typingsJapgolly.servicenow.servicenowStrings.insert = this.cast("insert")
  @scala.inline
  def update: typingsJapgolly.servicenow.servicenowStrings.update = this.cast("update")
}

