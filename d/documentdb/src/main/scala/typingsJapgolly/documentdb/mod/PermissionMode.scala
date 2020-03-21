package typingsJapgolly.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.documentdb.documentdbStrings.None
  - typingsJapgolly.documentdb.documentdbStrings.Read
  - typingsJapgolly.documentdb.documentdbStrings.All
*/
trait PermissionMode extends js.Object

object PermissionMode {
  @scala.inline
  def All: typingsJapgolly.documentdb.documentdbStrings.All = this.cast("All")
  @scala.inline
  def None: typingsJapgolly.documentdb.documentdbStrings.None = this.cast("None")
  @scala.inline
  def Read: typingsJapgolly.documentdb.documentdbStrings.Read = this.cast("Read")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

