package typingsJapgolly.firebaseFirestore.indexManagerMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebaseFirestore.pathMod.ResourcePath
import typingsJapgolly.firebaseFirestore.persistenceMod.PersistenceTransaction
import typingsJapgolly.firebaseFirestore.persistencePromiseMod.PersistencePromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexManager extends js.Object {
  /**
    * Creates an index entry mapping the collectionId (last segment of the path)
    * to the parent path (either the containing document location or the empty
    * path for root-level collections). Index entries can be retrieved via
    * getCollectionParents().
    *
    * NOTE: Currently we don't remove index entries. If this ends up being an
    * issue we can devise some sort of GC strategy.
    */
  def addToCollectionParentIndex(transaction: PersistenceTransaction, collectionPath: ResourcePath): PersistencePromise[Unit]
  /**
    * Retrieves all parent locations containing the given collectionId, as a
    * list of paths (each path being either a document location or the empty
    * path for a root-level collection).
    */
  def getCollectionParents(transaction: PersistenceTransaction, collectionId: String): PersistencePromise[js.Array[ResourcePath]]
}

object IndexManager {
  @scala.inline
  def apply(
    addToCollectionParentIndex: (PersistenceTransaction, ResourcePath) => CallbackTo[PersistencePromise[Unit]],
    getCollectionParents: (PersistenceTransaction, String) => CallbackTo[PersistencePromise[js.Array[ResourcePath]]]
  ): IndexManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addToCollectionParentIndex")(js.Any.fromFunction2((t0: typingsJapgolly.firebaseFirestore.persistenceMod.PersistenceTransaction, t1: typingsJapgolly.firebaseFirestore.pathMod.ResourcePath) => addToCollectionParentIndex(t0, t1).runNow()))
    __obj.updateDynamic("getCollectionParents")(js.Any.fromFunction2((t0: typingsJapgolly.firebaseFirestore.persistenceMod.PersistenceTransaction, t1: java.lang.String) => getCollectionParents(t0, t1).runNow()))
    __obj.asInstanceOf[IndexManager]
  }
}

