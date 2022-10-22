package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcCoreTypesMod.BatchId
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcCoreTypesMod.MutationBatchState
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcCoreTypesMod.TargetId
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLocalSharedClientStateMod.ClientId
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreError
import typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.current_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLitePackagesFirestoreSrcLocalSharedClientStateSyncerMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.`not-current`
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.current_
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.rejected
  */
  trait QueryTargetState extends StObject
  object QueryTargetState {
    
    inline def current: current_ = "current".asInstanceOf[current_]
    
    inline def `not-current`: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.`not-current` = "not-current".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.`not-current`]
    
    inline def rejected: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.rejected = "rejected".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.rejected]
  }
  
  @js.native
  trait SharedClientStateSyncer extends StObject {
    
    /** Adds or removes Watch targets for queries from different tabs. */
    def applyActiveTargetsChange(added: js.Array[TargetId], removed: js.Array[TargetId]): js.Promise[Unit] = js.native
    
    /** Applies a mutation state to an existing batch.  */
    def applyBatchState(batchId: BatchId, state: MutationBatchState): js.Promise[Unit] = js.native
    def applyBatchState(batchId: BatchId, state: MutationBatchState, error: FirestoreError): js.Promise[Unit] = js.native
    
    /** Applies a query target change from a different tab. */
    def applyTargetState(targetId: TargetId, state: QueryTargetState): js.Promise[Unit] = js.native
    def applyTargetState(targetId: TargetId, state: QueryTargetState, error: FirestoreError): js.Promise[Unit] = js.native
    
    /** Returns the IDs of the clients that are currently active. */
    def getActiveClients(): js.Promise[js.Array[ClientId]] = js.native
    
    /**
      * Retrieves newly changed documents from remote document cache and raises
      * snapshots if needed.
      */
    def synchronizeWithChangedDocuments(collectionGroup: String): js.Promise[Unit] = js.native
  }
}
