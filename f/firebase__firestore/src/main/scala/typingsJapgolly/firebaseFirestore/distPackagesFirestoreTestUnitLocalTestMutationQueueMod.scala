package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.Query
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreTypesMod.BatchId
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLocalMutationQueueMod.MutationQueue
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLocalPersistenceMod.Persistence
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcModelCollectionsMod.DocumentKeySet_
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcModelMutationBatchMod.MutationBatch
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcModelMutationMod.Mutation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreTestUnitLocalTestMutationQueueMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/test/unit/local/test_mutation_queue", "TestMutationQueue")
  @js.native
  open class TestMutationQueue protected () extends StObject {
    def this(persistence: Persistence, queue: MutationQueue) = this()
    
    def addMutationBatch(mutations: js.Array[Mutation]): js.Promise[MutationBatch] = js.native
    
    def checkEmpty(): js.Promise[Boolean] = js.native
    
    def countBatches(): js.Promise[Double] = js.native
    
    def getAllMutationBatches(): js.Promise[js.Array[MutationBatch]] = js.native
    
    def getAllMutationBatchesAffectingDocumentKey(documentKey: DocumentKey): js.Promise[js.Array[MutationBatch]] = js.native
    
    def getAllMutationBatchesAffectingDocumentKeys(documentKeys: DocumentKeySet_): js.Promise[js.Array[MutationBatch]] = js.native
    
    def getAllMutationBatchesAffectingQuery(query: Query): js.Promise[js.Array[MutationBatch]] = js.native
    
    def getNextMutationBatchAfterBatchId(batchId: BatchId): js.Promise[MutationBatch | Null] = js.native
    
    def lookupMutationBatch(batchId: BatchId): js.Promise[MutationBatch | Null] = js.native
    
    var persistence: Persistence = js.native
    
    var queue: MutationQueue = js.native
    
    def removeMutationBatch(batch: MutationBatch): js.Promise[Unit] = js.native
  }
}
