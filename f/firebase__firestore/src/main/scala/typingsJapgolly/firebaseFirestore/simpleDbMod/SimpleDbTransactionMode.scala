package typingsJapgolly.firebaseFirestore.simpleDbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.readonly
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.readwrite
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.`readonly-idempotent`
  - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.`readwrite-idempotent`
*/
trait SimpleDbTransactionMode extends js.Object

object SimpleDbTransactionMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def readonly: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.readonly = this.cast("readonly")
  @scala.inline
  def `readonly-idempotent`: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.`readonly-idempotent` = this.cast("readonly-idempotent")
  @scala.inline
  def readwrite: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.readwrite = this.cast("readwrite")
  @scala.inline
  def `readwrite-idempotent`: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.`readwrite-idempotent` = this.cast("readwrite-idempotent")
}

