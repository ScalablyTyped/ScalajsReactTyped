package typingsJapgolly.servicenowLondon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.servicenowLondon.servicenowLondonStrings.insert
  - typingsJapgolly.servicenowLondon.servicenowLondonStrings.update
  - typingsJapgolly.servicenowLondon.servicenowLondonStrings.delete
*/
trait GlideRecordOperation extends js.Object

object GlideRecordOperation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete: typingsJapgolly.servicenowLondon.servicenowLondonStrings.delete = this.cast("delete")
  @scala.inline
  def insert: typingsJapgolly.servicenowLondon.servicenowLondonStrings.insert = this.cast("insert")
  @scala.inline
  def update: typingsJapgolly.servicenowLondon.servicenowLondonStrings.update = this.cast("update")
}

