package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.anon.TrackRemovals
import typingsJapgolly.firebaseFirestore.distFirestoreSrcCoreSnapshotVersionMod.SnapshotVersion
import typingsJapgolly.firebaseFirestore.distFirestoreSrcLocalIndexManagerMod.IndexManager
import typingsJapgolly.firebaseFirestore.distFirestoreSrcLocalPersistenceMod.Persistence
import typingsJapgolly.firebaseFirestore.distFirestoreSrcLocalRemoteDocumentChangeBufferMod.RemoteDocumentChangeBuffer
import typingsJapgolly.firebaseFirestore.distFirestoreSrcModelCollectionsMod.DocumentKeySet_
import typingsJapgolly.firebaseFirestore.distFirestoreSrcModelCollectionsMod.MutableDocumentMap_
import typingsJapgolly.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey
import typingsJapgolly.firebaseFirestore.distFirestoreSrcModelDocumentMod.MutableDocument
import typingsJapgolly.firebaseFirestore.distFirestoreSrcModelFieldIndexMod.IndexOffset
import typingsJapgolly.firebaseFirestore.distFirestoreSrcModelPathMod.ResourcePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreTestUnitLocalTestRemoteDocumentCacheMod {
  
  @JSImport("@firebase/firestore/dist/firestore/test/unit/local/test_remote_document_cache", "TestRemoteDocumentCache")
  @js.native
  open class TestRemoteDocumentCache protected () extends StObject {
    def this(persistence: Persistence) = this()
    
    /**
      * Reads all of the documents first so we can safely add them and keep the size calculation in
      * sync.
      */
    def addEntries(documents: js.Array[MutableDocument]): js.Promise[Unit] = js.native
    
    /**
      * Adds a single document using the document's version as its read time.
      * Reads the document first to track the document size internally.
      */
    def addEntry(document: MutableDocument): js.Promise[Unit] = js.native
    
    /* private */ val cache: Any = js.native
    
    def getAllFromCollection(collection: ResourcePath, offset: IndexOffset): js.Promise[MutableDocumentMap_] = js.native
    
    def getAllFromCollectionGroup(collectionGroup: String, offset: IndexOffset, limit: Double): js.Promise[MutableDocumentMap_] = js.native
    
    def getEntries(documentKeys: DocumentKeySet_): js.Promise[MutableDocumentMap_] = js.native
    
    def getEntry(documentKey: DocumentKey): js.Promise[MutableDocument] = js.native
    
    def getSize(): js.Promise[Double] = js.native
    
    def newChangeBuffer(): RemoteDocumentChangeBuffer = js.native
    def newChangeBuffer(options: TrackRemovals): RemoteDocumentChangeBuffer = js.native
    
    /* private */ val persistence: Any = js.native
    
    def removeEntry(documentKey: DocumentKey): js.Promise[Unit] = js.native
    def removeEntry(documentKey: DocumentKey, version: SnapshotVersion): js.Promise[Unit] = js.native
    
    def setIndexManager(indexManager: IndexManager): Unit = js.native
  }
}
