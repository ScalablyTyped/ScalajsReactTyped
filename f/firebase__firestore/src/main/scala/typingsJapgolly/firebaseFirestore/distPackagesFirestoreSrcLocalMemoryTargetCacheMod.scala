package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreTypesMod.ListenSequenceNumber
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLocalLruGarbageCollectorMod.ActiveTargets
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLocalPersistenceMod.Persistence
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLocalPersistencePromiseMod.PersistencePromise
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransaction
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLocalTargetCacheMod.TargetCache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcLocalMemoryTargetCacheMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/local/memory_target_cache", "MemoryTargetCache")
  @js.native
  open class MemoryTargetCache protected ()
    extends StObject
       with TargetCache {
    def this(persistence: Persistence) = this()
    
    /** The highest sequence number encountered. */
    /* private */ var highestSequenceNumber: Any = js.native
    
    /** The highest numbered target ID encountered. */
    /* private */ var highestTargetId: Any = js.native
    
    /** The last received snapshot version. */
    /* private */ var lastRemoteSnapshotVersion: Any = js.native
    
    /* private */ val persistence: Any = js.native
    
    /**
      * A ordered bidirectional mapping between documents and the remote target
      * IDs.
      */
    /* private */ var references: Any = js.native
    
    def removeTargets(
      transaction: PersistenceTransaction,
      upperBound: ListenSequenceNumber,
      activeTargetIds: ActiveTargets
    ): PersistencePromise[Double] = js.native
    
    /* private */ var saveTargetData: Any = js.native
    
    /* private */ var targetCount: Any = js.native
    
    /* private */ var targetIdGenerator: Any = js.native
    
    /**
      * Maps a target to the data about that target
      */
    /* private */ var targets: Any = js.native
  }
}
