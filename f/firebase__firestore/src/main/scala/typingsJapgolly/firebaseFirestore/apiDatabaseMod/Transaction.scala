package typingsJapgolly.firebaseFirestore.apiDatabaseMod

import typingsJapgolly.firebaseFirestore.apiFieldPathMod.FieldPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/api/database", "Transaction")
@js.native
class Transaction protected ()
  extends typingsJapgolly.firebaseFirestoreTypes.mod.Transaction {
  def this(
    _firestore: Firestore,
    _transaction: typingsJapgolly.firebaseFirestore.coreTransactionMod.Transaction
  ) = this()
  var _firestore: js.Any = js.native
  var _transaction: js.Any = js.native
  def update(
    documentRef: typingsJapgolly.firebaseFirestoreTypes.mod.DocumentReference[_],
    field: FieldPath,
    value: js.Any,
    moreFieldsAndValues: js.Any*
  ): Transaction = js.native
}

