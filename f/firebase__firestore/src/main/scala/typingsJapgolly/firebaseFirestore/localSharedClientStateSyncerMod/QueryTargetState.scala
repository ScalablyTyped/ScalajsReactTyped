package typingsJapgolly.firebaseFirestore.localSharedClientStateSyncerMod

import typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.current_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.`not-current`
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.current_
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.rejected
*/
trait QueryTargetState extends js.Object

object QueryTargetState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def current: current_ = this.cast("current")
  @scala.inline
  def `not-current`: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.`not-current` = this.cast("not-current")
  @scala.inline
  def rejected: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.rejected = this.cast("rejected")
}

