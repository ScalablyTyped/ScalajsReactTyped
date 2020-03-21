package typingsJapgolly.firebaseDatabaseTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.value
  - typingsJapgolly.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_added
  - typingsJapgolly.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_changed
  - typingsJapgolly.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_moved
  - typingsJapgolly.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_removed
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def child_added: typingsJapgolly.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_added = this.cast("child_added")
  @scala.inline
  def child_changed: typingsJapgolly.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_changed = this.cast("child_changed")
  @scala.inline
  def child_moved: typingsJapgolly.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_moved = this.cast("child_moved")
  @scala.inline
  def child_removed: typingsJapgolly.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_removed = this.cast("child_removed")
  @scala.inline
  def value: typingsJapgolly.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.value = this.cast("value")
}

