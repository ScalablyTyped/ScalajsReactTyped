package typingsJapgolly.firebaseFirestoreTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.added
  - typingsJapgolly.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.removed
  - typingsJapgolly.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.modified
*/
trait DocumentChangeType extends js.Object

object DocumentChangeType {
  @scala.inline
  def added: typingsJapgolly.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.added = this.cast("added")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def modified: typingsJapgolly.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.modified = this.cast("modified")
  @scala.inline
  def removed: typingsJapgolly.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.removed = this.cast("removed")
}

