package typingsJapgolly.documentdb.mod

import typingsJapgolly.documentdb.documentdbStrings.all_
import typingsJapgolly.documentdb.documentdbStrings.create_
import typingsJapgolly.documentdb.documentdbStrings.delete_
import typingsJapgolly.documentdb.documentdbStrings.replace_
import typingsJapgolly.documentdb.documentdbStrings.update_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.documentdb.documentdbStrings.All
  - typingsJapgolly.documentdb.documentdbStrings.Create
  - typingsJapgolly.documentdb.documentdbStrings.Update
  - typingsJapgolly.documentdb.documentdbStrings.Delete
  - typingsJapgolly.documentdb.documentdbStrings.Replace
  - typingsJapgolly.documentdb.documentdbStrings.all_
  - typingsJapgolly.documentdb.documentdbStrings.create_
  - typingsJapgolly.documentdb.documentdbStrings.update_
  - typingsJapgolly.documentdb.documentdbStrings.delete_
  - typingsJapgolly.documentdb.documentdbStrings.replace_
*/
trait TriggerOperation extends js.Object

object TriggerOperation {
  @scala.inline
  def All: typingsJapgolly.documentdb.documentdbStrings.All = this.cast("All")
  @scala.inline
  def Create: typingsJapgolly.documentdb.documentdbStrings.Create = this.cast("Create")
  @scala.inline
  def Delete: typingsJapgolly.documentdb.documentdbStrings.Delete = this.cast("Delete")
  @scala.inline
  def Replace: typingsJapgolly.documentdb.documentdbStrings.Replace = this.cast("Replace")
  @scala.inline
  def Update: typingsJapgolly.documentdb.documentdbStrings.Update = this.cast("Update")
  @scala.inline
  def all: all_ = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def create: create_ = this.cast("create")
  @scala.inline
  def delete: delete_ = this.cast("delete")
  @scala.inline
  def replace: replace_ = this.cast("replace")
  @scala.inline
  def update: update_ = this.cast("update")
}

