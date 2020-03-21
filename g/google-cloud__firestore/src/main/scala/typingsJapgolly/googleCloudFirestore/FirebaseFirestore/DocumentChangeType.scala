package typingsJapgolly.googleCloudFirestore.FirebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.added
  - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.removed
  - typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.modified
*/
trait DocumentChangeType extends js.Object

object DocumentChangeType {
  @scala.inline
  def added: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.added = this.cast("added")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def modified: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.modified = this.cast("modified")
  @scala.inline
  def removed: typingsJapgolly.googleCloudFirestore.googleCloudFirestoreStrings.removed = this.cast("removed")
}

