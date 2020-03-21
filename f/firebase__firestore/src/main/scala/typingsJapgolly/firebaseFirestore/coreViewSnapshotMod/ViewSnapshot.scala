package typingsJapgolly.firebaseFirestore.coreViewSnapshotMod

import typingsJapgolly.firebaseFirestore.coreQueryMod.Query
import typingsJapgolly.firebaseFirestore.modelCollectionsMod.DocumentKeySet_
import typingsJapgolly.firebaseFirestore.modelDocumentSetMod.DocumentSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/core/view_snapshot", "ViewSnapshot")
@js.native
class ViewSnapshot protected () extends js.Object {
  def this(
    query: Query,
    docs: DocumentSet,
    oldDocs: DocumentSet,
    docChanges: js.Array[DocumentViewChange],
    mutatedKeys: DocumentKeySet_,
    fromCache: Boolean,
    syncStateChanged: Boolean,
    excludesMetadataChanges: Boolean
  ) = this()
  val docChanges: js.Array[DocumentViewChange] = js.native
  val docs: DocumentSet = js.native
  val excludesMetadataChanges: Boolean = js.native
  val fromCache: Boolean = js.native
  val mutatedKeys: DocumentKeySet_ = js.native
  val oldDocs: DocumentSet = js.native
  val query: Query = js.native
  val syncStateChanged: Boolean = js.native
  def hasPendingWrites(): Boolean = js.native
  def isEqual(other: ViewSnapshot): Boolean = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/src/core/view_snapshot", "ViewSnapshot")
@js.native
object ViewSnapshot extends js.Object {
  /** Returns a view snapshot as if all documents in the snapshot were added. */
  def fromInitialDocuments(query: Query, documents: DocumentSet, mutatedKeys: DocumentKeySet_, fromCache: Boolean): ViewSnapshot = js.native
}

