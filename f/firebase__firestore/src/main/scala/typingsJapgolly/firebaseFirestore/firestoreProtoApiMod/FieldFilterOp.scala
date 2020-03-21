package typingsJapgolly.firebaseFirestore.firestoreProtoApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.OPERATOR_UNSPECIFIED
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.LESS_THAN
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.LESS_THAN_OR_EQUAL
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.GREATER_THAN
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.GREATER_THAN_OR_EQUAL
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.EQUAL
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.ARRAY_CONTAINS
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.IN
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.ARRAY_CONTAINS_ANY
*/
trait FieldFilterOp extends js.Object

object FieldFilterOp {
  @scala.inline
  def ARRAY_CONTAINS: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.ARRAY_CONTAINS = this.cast("ARRAY_CONTAINS")
  @scala.inline
  def ARRAY_CONTAINS_ANY: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.ARRAY_CONTAINS_ANY = this.cast("ARRAY_CONTAINS_ANY")
  @scala.inline
  def EQUAL: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.EQUAL = this.cast("EQUAL")
  @scala.inline
  def GREATER_THAN: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.GREATER_THAN = this.cast("GREATER_THAN")
  @scala.inline
  def GREATER_THAN_OR_EQUAL: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.GREATER_THAN_OR_EQUAL = this.cast("GREATER_THAN_OR_EQUAL")
  @scala.inline
  def IN: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.IN = this.cast("IN")
  @scala.inline
  def LESS_THAN: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.LESS_THAN = this.cast("LESS_THAN")
  @scala.inline
  def LESS_THAN_OR_EQUAL: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.LESS_THAN_OR_EQUAL = this.cast("LESS_THAN_OR_EQUAL")
  @scala.inline
  def OPERATOR_UNSPECIFIED: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.OPERATOR_UNSPECIFIED = this.cast("OPERATOR_UNSPECIFIED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

