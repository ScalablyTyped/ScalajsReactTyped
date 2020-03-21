package typingsJapgolly.googleCloudFirestore.FirebaseFirestore

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirestoreDataConverter[T] extends js.Object {
  /**
    * Called by the Firestore SDK to convert Firestore data into an object of
    * type T.
    */
  def fromFirestore(data: DocumentData): T
  /**
    * Called by the Firestore SDK to convert a custom model object of type T
    * into a plain Javascript object (suitable for writing directly to the
    * Firestore database).
    */
  def toFirestore(modelObject: T): DocumentData
}

object FirestoreDataConverter {
  @scala.inline
  def apply[T](fromFirestore: DocumentData => CallbackTo[T], toFirestore: T => CallbackTo[DocumentData]): FirestoreDataConverter[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromFirestore")(js.Any.fromFunction1((t0: typingsJapgolly.googleCloudFirestore.FirebaseFirestore.DocumentData) => fromFirestore(t0).runNow()))
    __obj.updateDynamic("toFirestore")(js.Any.fromFunction1((t0: T) => toFirestore(t0).runNow()))
    __obj.asInstanceOf[FirestoreDataConverter[T]]
  }
}

