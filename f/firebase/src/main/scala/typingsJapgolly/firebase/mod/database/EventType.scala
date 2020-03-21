package typingsJapgolly.firebase.mod.database

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebase.firebaseStrings.value
  - typingsJapgolly.firebase.firebaseStrings.child_added
  - typingsJapgolly.firebase.firebaseStrings.child_changed
  - typingsJapgolly.firebase.firebaseStrings.child_moved
  - typingsJapgolly.firebase.firebaseStrings.child_removed
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def child_added: typingsJapgolly.firebase.firebaseStrings.child_added = this.cast("child_added")
  @scala.inline
  def child_changed: typingsJapgolly.firebase.firebaseStrings.child_changed = this.cast("child_changed")
  @scala.inline
  def child_moved: typingsJapgolly.firebase.firebaseStrings.child_moved = this.cast("child_moved")
  @scala.inline
  def child_removed: typingsJapgolly.firebase.firebaseStrings.child_removed = this.cast("child_removed")
  @scala.inline
  def value: typingsJapgolly.firebase.firebaseStrings.value = this.cast("value")
}

