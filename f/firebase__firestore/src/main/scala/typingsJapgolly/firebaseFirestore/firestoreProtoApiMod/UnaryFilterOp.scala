package typingsJapgolly.firebaseFirestore.firestoreProtoApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.OPERATOR_UNSPECIFIED
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.IS_NAN
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.IS_NULL
*/
trait UnaryFilterOp extends js.Object

object UnaryFilterOp {
  @scala.inline
  def IS_NAN: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.IS_NAN = this.cast("IS_NAN")
  @scala.inline
  def IS_NULL: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.IS_NULL = this.cast("IS_NULL")
  @scala.inline
  def OPERATOR_UNSPECIFIED: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.OPERATOR_UNSPECIFIED = this.cast("OPERATOR_UNSPECIFIED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

