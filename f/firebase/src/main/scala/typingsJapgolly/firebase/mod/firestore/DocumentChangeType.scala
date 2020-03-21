package typingsJapgolly.firebase.mod.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebase.firebaseStrings.added
  - typingsJapgolly.firebase.firebaseStrings.removed
  - typingsJapgolly.firebase.firebaseStrings.modified
*/
trait DocumentChangeType extends js.Object

object DocumentChangeType {
  @scala.inline
  def added: typingsJapgolly.firebase.firebaseStrings.added = this.cast("added")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def modified: typingsJapgolly.firebase.firebaseStrings.modified = this.cast("modified")
  @scala.inline
  def removed: typingsJapgolly.firebase.firebaseStrings.removed = this.cast("removed")
}

