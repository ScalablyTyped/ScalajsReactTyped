package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLocalDocumentOverlayCacheMod.DocumentOverlayCache
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLocalPersistenceMod.Persistence
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcModelCollectionsMod.DocumentKeySet_
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcModelCollectionsMod.MutationMap
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcModelCollectionsMod.OverlayMap
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcModelMutationMod.Mutation
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcModelOverlayMod.Overlay
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcModelPathMod.ResourcePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreTestUnitLocalTestDocumentOverlayCacheMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/test/unit/local/test_document_overlay_cache", "TestDocumentOverlayCache")
  @js.native
  open class TestDocumentOverlayCache protected () extends StObject {
    def this(persistence: Persistence, cache: DocumentOverlayCache) = this()
    
    /* private */ var cache: Any = js.native
    
    def getOverlay(key: DocumentKey): js.Promise[Overlay | Null] = js.native
    
    def getOverlayMutation(docKey: String): js.Promise[Mutation | Null] = js.native
    
    def getOverlays(keys: js.Array[DocumentKey]): js.Promise[OverlayMap] = js.native
    
    def getOverlaysForCollection(path: ResourcePath, sinceBatchId: Double): js.Promise[OverlayMap] = js.native
    
    def getOverlaysForCollectionGroup(collectionGroup: String, sinceBatchId: Double, count: Double): js.Promise[OverlayMap] = js.native
    
    /* private */ var persistence: Any = js.native
    
    def removeOverlaysForBatchId(documentKeys: DocumentKeySet_, batchId: Double): js.Promise[Unit] = js.native
    
    def saveOverlays(largestBatch: Double, data: MutationMap): js.Promise[Unit] = js.native
  }
}
