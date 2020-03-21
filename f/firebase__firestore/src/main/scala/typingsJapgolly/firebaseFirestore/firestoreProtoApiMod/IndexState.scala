package typingsJapgolly.firebaseFirestore.firestoreProtoApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.STATE_UNSPECIFIED
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.CREATING
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.READY
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.ERROR
*/
trait IndexState extends js.Object

object IndexState {
  @scala.inline
  def CREATING: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.CREATING = this.cast("CREATING")
  @scala.inline
  def ERROR: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.ERROR = this.cast("ERROR")
  @scala.inline
  def READY: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.READY = this.cast("READY")
  @scala.inline
  def STATE_UNSPECIFIED: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.STATE_UNSPECIFIED = this.cast("STATE_UNSPECIFIED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

