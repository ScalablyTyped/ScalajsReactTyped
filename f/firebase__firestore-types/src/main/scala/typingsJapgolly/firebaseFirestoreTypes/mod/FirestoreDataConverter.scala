package typingsJapgolly.firebaseFirestoreTypes.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirestoreDataConverter[T] extends js.Object {
  def fromFirestore(snapshot: QueryDocumentSnapshot[DocumentData], options: SnapshotOptions): T
  def toFirestore(modelObject: T): DocumentData
}

object FirestoreDataConverter {
  @scala.inline
  def apply[T](
    fromFirestore: (QueryDocumentSnapshot[DocumentData], SnapshotOptions) => CallbackTo[T],
    toFirestore: T => CallbackTo[DocumentData]
  ): FirestoreDataConverter[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromFirestore")(js.Any.fromFunction2((t0: typingsJapgolly.firebaseFirestoreTypes.mod.QueryDocumentSnapshot[typingsJapgolly.firebaseFirestoreTypes.mod.DocumentData], t1: typingsJapgolly.firebaseFirestoreTypes.mod.SnapshotOptions) => fromFirestore(t0, t1).runNow()))
    __obj.updateDynamic("toFirestore")(js.Any.fromFunction1((t0: T) => toFirestore(t0).runNow()))
    __obj.asInstanceOf[FirestoreDataConverter[T]]
  }
}

