package typingsJapgolly.firebaseFirestore.localQueryEngineMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebaseFirestore.coreQueryMod.Query
import typingsJapgolly.firebaseFirestore.coreSnapshotVersionMod.SnapshotVersion
import typingsJapgolly.firebaseFirestore.localLocalDocumentsViewMod.LocalDocumentsView
import typingsJapgolly.firebaseFirestore.localPersistenceMod.PersistenceTransaction
import typingsJapgolly.firebaseFirestore.localPersistencePromiseMod.PersistencePromise
import typingsJapgolly.firebaseFirestore.modelCollectionsMod.DocumentKeySet_
import typingsJapgolly.firebaseFirestore.modelCollectionsMod.DocumentMap_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryEngine extends js.Object {
  /** Returns all local documents matching the specified query. */
  def getDocumentsMatchingQuery(
    transaction: PersistenceTransaction,
    query: Query,
    lastLimboFreeSnapshotVersion: SnapshotVersion,
    remoteKeys: DocumentKeySet_
  ): PersistencePromise[DocumentMap_]
  /** Sets the document view to query against. */
  def setLocalDocumentsView(localDocuments: LocalDocumentsView): Unit
}

object QueryEngine {
  @scala.inline
  def apply(
    getDocumentsMatchingQuery: (PersistenceTransaction, Query, SnapshotVersion, DocumentKeySet_) => CallbackTo[PersistencePromise[DocumentMap_]],
    setLocalDocumentsView: LocalDocumentsView => Callback
  ): QueryEngine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDocumentsMatchingQuery")(js.Any.fromFunction4((t0: typingsJapgolly.firebaseFirestore.localPersistenceMod.PersistenceTransaction, t1: typingsJapgolly.firebaseFirestore.coreQueryMod.Query, t2: typingsJapgolly.firebaseFirestore.coreSnapshotVersionMod.SnapshotVersion, t3: typingsJapgolly.firebaseFirestore.modelCollectionsMod.DocumentKeySet_) => getDocumentsMatchingQuery(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("setLocalDocumentsView")(js.Any.fromFunction1((t0: typingsJapgolly.firebaseFirestore.localLocalDocumentsViewMod.LocalDocumentsView) => setLocalDocumentsView(t0).runNow()))
    __obj.asInstanceOf[QueryEngine]
  }
}

