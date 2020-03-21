package typingsJapgolly.firebaseFirestore.firestoreProtoApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.OPERATOR_UNSPECIFIED
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.AND
*/
trait CompositeFilterOp extends js.Object

object CompositeFilterOp {
  @scala.inline
  def AND: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.AND = this.cast("AND")
  @scala.inline
  def OPERATOR_UNSPECIFIED: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.OPERATOR_UNSPECIFIED = this.cast("OPERATOR_UNSPECIFIED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

