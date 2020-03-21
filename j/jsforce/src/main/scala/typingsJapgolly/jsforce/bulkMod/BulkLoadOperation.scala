package typingsJapgolly.jsforce.bulkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jsforce.jsforceStrings.insert
  - typingsJapgolly.jsforce.jsforceStrings.update
  - typingsJapgolly.jsforce.jsforceStrings.upsert
  - typingsJapgolly.jsforce.jsforceStrings.delete
  - typingsJapgolly.jsforce.jsforceStrings.hardDelete
*/
trait BulkLoadOperation extends js.Object

object BulkLoadOperation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete: typingsJapgolly.jsforce.jsforceStrings.delete = this.cast("delete")
  @scala.inline
  def hardDelete: typingsJapgolly.jsforce.jsforceStrings.hardDelete = this.cast("hardDelete")
  @scala.inline
  def insert: typingsJapgolly.jsforce.jsforceStrings.insert = this.cast("insert")
  @scala.inline
  def update: typingsJapgolly.jsforce.jsforceStrings.update = this.cast("update")
  @scala.inline
  def upsert: typingsJapgolly.jsforce.jsforceStrings.upsert = this.cast("upsert")
}

