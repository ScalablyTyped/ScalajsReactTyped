package typingsJapgolly.firebaseFirestore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.pending
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.acknowledged
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.rejected
*/
trait MutationBatchState extends js.Object

object MutationBatchState {
  @scala.inline
  def acknowledged: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.acknowledged = this.cast("acknowledged")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pending: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.pending = this.cast("pending")
  @scala.inline
  def rejected: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.rejected = this.cast("rejected")
}

