package typingsJapgolly.firebaseFirestore.viewSnapshotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/core/view_snapshot", "DocumentChangeSet")
@js.native
class DocumentChangeSet () extends js.Object {
  var changeMap: js.Any = js.native
  def getChanges(): js.Array[DocumentViewChange] = js.native
  def track(change: DocumentViewChange): Unit = js.native
}

