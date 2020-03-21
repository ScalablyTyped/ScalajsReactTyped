package typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.Types.SnapshotMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuerySnapshot_ extends js.Object {
  val docChanges: js.Array[DocumentChange]
  val docs: js.Array[DocumentSnapshot]
  val empty: Boolean
  val metadata: SnapshotMetadata
  val query: Query
  val size: Double
  def forEach(callback: js.Function1[/* snapshot */ DocumentSnapshot, _]): Unit
}

object QuerySnapshot_ {
  @scala.inline
  def apply(
    docChanges: js.Array[DocumentChange],
    docs: js.Array[DocumentSnapshot],
    empty: Boolean,
    forEach: js.Function1[/* snapshot */ DocumentSnapshot, js.Any] => Callback,
    metadata: SnapshotMetadata,
    query: Query,
    size: Double
  ): QuerySnapshot_ = {
    val __obj = js.Dynamic.literal(docChanges = docChanges.asInstanceOf[js.Any], docs = docs.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("forEach")(js.Any.fromFunction1((t0: js.Function1[
  /* snapshot */ typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.DocumentSnapshot, 
  js.Any]) => forEach(t0).runNow()))
    __obj.asInstanceOf[QuerySnapshot_]
  }
}

