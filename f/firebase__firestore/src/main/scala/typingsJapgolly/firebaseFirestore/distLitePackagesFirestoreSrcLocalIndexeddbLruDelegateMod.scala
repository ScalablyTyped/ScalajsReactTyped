package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcCoreTypesMod.ListenSequenceNumber
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcCoreTypesMod.TargetId
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLocalLruGarbageCollectorMod.ActiveTargets
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLocalLruGarbageCollectorMod.LruDelegate
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLocalLruGarbageCollectorMod.LruGarbageCollector
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLocalPersistenceMod.ReferenceDelegate
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLocalPersistencePromiseMod.PersistencePromise
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransaction
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLocalTargetDataMod.TargetData
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcModelDocumentKeyMod.DocumentKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLitePackagesFirestoreSrcLocalIndexeddbLruDelegateMod {
  
  trait IndexedDbLruDelegate
    extends StObject
       with ReferenceDelegate
       with LruDelegate
  object IndexedDbLruDelegate {
    
    inline def apply(
      addReference: (PersistenceTransaction, TargetId, DocumentKey) => PersistencePromise[Unit],
      forEachOrphanedDocumentSequenceNumber: (PersistenceTransaction, js.Function1[/* sequenceNumber */ ListenSequenceNumber, Unit]) => PersistencePromise[Unit],
      forEachTarget: (PersistenceTransaction, js.Function1[/* target */ TargetData, Unit]) => PersistencePromise[Unit],
      garbageCollector: LruGarbageCollector,
      getCacheSize: PersistenceTransaction => PersistencePromise[Double],
      getSequenceNumberCount: PersistenceTransaction => PersistencePromise[Double],
      markPotentiallyOrphaned: (PersistenceTransaction, DocumentKey) => PersistencePromise[Unit],
      removeOrphanedDocuments: (PersistenceTransaction, ListenSequenceNumber) => PersistencePromise[Double],
      removeReference: (PersistenceTransaction, TargetId, DocumentKey) => PersistencePromise[Unit],
      removeTarget: (PersistenceTransaction, TargetData) => PersistencePromise[Unit],
      removeTargets: (PersistenceTransaction, ListenSequenceNumber, ActiveTargets) => PersistencePromise[Double],
      updateLimboDocument: (PersistenceTransaction, DocumentKey) => PersistencePromise[Unit]
    ): IndexedDbLruDelegate = {
      val __obj = js.Dynamic.literal(addReference = js.Any.fromFunction3(addReference), forEachOrphanedDocumentSequenceNumber = js.Any.fromFunction2(forEachOrphanedDocumentSequenceNumber), forEachTarget = js.Any.fromFunction2(forEachTarget), garbageCollector = garbageCollector.asInstanceOf[js.Any], getCacheSize = js.Any.fromFunction1(getCacheSize), getSequenceNumberCount = js.Any.fromFunction1(getSequenceNumberCount), markPotentiallyOrphaned = js.Any.fromFunction2(markPotentiallyOrphaned), removeOrphanedDocuments = js.Any.fromFunction2(removeOrphanedDocuments), removeReference = js.Any.fromFunction3(removeReference), removeTarget = js.Any.fromFunction2(removeTarget), removeTargets = js.Any.fromFunction3(removeTargets), updateLimboDocument = js.Any.fromFunction2(updateLimboDocument))
      __obj.asInstanceOf[IndexedDbLruDelegate]
    }
  }
}
