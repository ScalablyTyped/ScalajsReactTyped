package typingsJapgolly.firebaseAdmin.admin.database

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.value
  - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.child_added
  - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.child_changed
  - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.child_moved
  - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.child_removed
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def child_added: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.child_added = this.cast("child_added")
  @scala.inline
  def child_changed: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.child_changed = this.cast("child_changed")
  @scala.inline
  def child_moved: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.child_moved = this.cast("child_moved")
  @scala.inline
  def child_removed: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.child_removed = this.cast("child_removed")
  @scala.inline
  def value: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.value = this.cast("value")
}

