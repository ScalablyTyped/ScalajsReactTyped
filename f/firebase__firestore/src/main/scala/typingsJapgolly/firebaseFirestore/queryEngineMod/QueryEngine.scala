package typingsJapgolly.firebaseFirestore.queryEngineMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebaseFirestore.collectionsMod.DocumentKeySet_
import typingsJapgolly.firebaseFirestore.collectionsMod.DocumentMap_
import typingsJapgolly.firebaseFirestore.localDocumentsViewMod.LocalDocumentsView
import typingsJapgolly.firebaseFirestore.persistenceMod.PersistenceTransaction
import typingsJapgolly.firebaseFirestore.persistencePromiseMod.PersistencePromise
import typingsJapgolly.firebaseFirestore.queryMod.Query
import typingsJapgolly.firebaseFirestore.snapshotVersionMod.SnapshotVersion
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
    __obj.updateDynamic("getDocumentsMatchingQuery")(js.Any.fromFunction4((t0: typingsJapgolly.firebaseFirestore.persistenceMod.PersistenceTransaction, t1: typingsJapgolly.firebaseFirestore.queryMod.Query, t2: typingsJapgolly.firebaseFirestore.snapshotVersionMod.SnapshotVersion, t3: typingsJapgolly.firebaseFirestore.collectionsMod.DocumentKeySet_) => getDocumentsMatchingQuery(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("setLocalDocumentsView")(js.Any.fromFunction1((t0: typingsJapgolly.firebaseFirestore.localDocumentsViewMod.LocalDocumentsView) => setLocalDocumentsView(t0).runNow()))
    __obj.asInstanceOf[QueryEngine]
  }
}

