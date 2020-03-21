package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.indexeddbPersistenceMod.IndexedDbLruDelegate
import typingsJapgolly.firebaseFirestore.indexeddbSchemaMod.DbTargetDocument
import typingsJapgolly.firebaseFirestore.indexeddbSchemaMod.DbTargetDocumentKey
import typingsJapgolly.firebaseFirestore.localSerializerMod.LocalSerializer
import typingsJapgolly.firebaseFirestore.lruGarbageCollectorMod.ActiveTargets
import typingsJapgolly.firebaseFirestore.persistenceMod.PersistenceTransaction
import typingsJapgolly.firebaseFirestore.persistencePromiseMod.PersistencePromise
import typingsJapgolly.firebaseFirestore.simpleDbMod.SimpleDbStore
import typingsJapgolly.firebaseFirestore.simpleDbMod.SimpleDbTransaction
import typingsJapgolly.firebaseFirestore.targetCacheMod.TargetCache
import typingsJapgolly.firebaseFirestore.typesMod.ListenSequenceNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/local/indexeddb_target_cache", JSImport.Namespace)
@js.native
object indexeddbTargetCacheMod extends js.Object {
  @js.native
  class IndexedDbTargetCache protected () extends TargetCache {
    def this(referenceDelegate: IndexedDbLruDelegate, serializer: LocalSerializer) = this()
    val referenceDelegate: js.Any = js.native
    var retrieveMetadata: js.Any = js.native
    var saveMetadata: js.Any = js.native
    var saveTargetData: js.Any = js.native
    var serializer: js.Any = js.native
    var targetIdGenerator: js.Any = js.native
    /**
      * In-place updates the provided metadata to account for values in the given
      * TargetData. Saving is done separately. Returns true if there were any
      * changes to the metadata.
      */
    var updateMetadataFromTargetData: js.Any = js.native
    /**
      * Drops any targets with sequence number less than or equal to the upper bound, excepting those
      * present in `activeTargetIds`. Document associations for the removed targets are also removed.
      * Returns the number of targets removed.
      */
    def removeTargets(txn: PersistenceTransaction, upperBound: ListenSequenceNumber, activeTargetIds: ActiveTargets): PersistencePromise[Double] = js.native
  }
  
  def documentTargetStore(txn: PersistenceTransaction): SimpleDbStore[DbTargetDocumentKey, DbTargetDocument] = js.native
  def getHighestListenSequenceNumber(txn: SimpleDbTransaction): PersistencePromise[ListenSequenceNumber] = js.native
}

