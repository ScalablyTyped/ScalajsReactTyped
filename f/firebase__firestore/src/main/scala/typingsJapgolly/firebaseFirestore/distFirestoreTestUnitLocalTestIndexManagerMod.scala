package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.distFirestoreSrcCoreTargetMod.Target
import typingsJapgolly.firebaseFirestore.distFirestoreSrcLocalIndexManagerMod.IndexManager
import typingsJapgolly.firebaseFirestore.distFirestoreSrcLocalIndexManagerMod.IndexType
import typingsJapgolly.firebaseFirestore.distFirestoreSrcLocalPersistenceMod.Persistence
import typingsJapgolly.firebaseFirestore.distFirestoreSrcModelCollectionsMod.DocumentMap_
import typingsJapgolly.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey
import typingsJapgolly.firebaseFirestore.distFirestoreSrcModelFieldIndexMod.FieldIndex
import typingsJapgolly.firebaseFirestore.distFirestoreSrcModelFieldIndexMod.IndexOffset
import typingsJapgolly.firebaseFirestore.distFirestoreSrcModelPathMod.ResourcePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreTestUnitLocalTestIndexManagerMod {
  
  @JSImport("@firebase/firestore/dist/firestore/test/unit/local/test_index_manager", "TestIndexManager")
  @js.native
  open class TestIndexManager protected () extends StObject {
    def this(persistence: Persistence, indexManager: IndexManager) = this()
    
    def addFieldIndex(index: FieldIndex): js.Promise[Unit] = js.native
    
    def addToCollectionParentIndex(collectionPath: ResourcePath): js.Promise[Unit] = js.native
    
    def deleteFieldIndex(index: FieldIndex): js.Promise[Unit] = js.native
    
    def getCollectionParents(collectionId: String): js.Promise[js.Array[ResourcePath]] = js.native
    
    def getDocumentsMatchingTarget(target: Target): js.Promise[js.Array[DocumentKey] | Null] = js.native
    
    def getFieldIndexes(): js.Promise[js.Array[FieldIndex]] = js.native
    def getFieldIndexes(collectionGroup: String): js.Promise[js.Array[FieldIndex]] = js.native
    
    def getIndexType(target: Target): js.Promise[IndexType] = js.native
    
    def getNextCollectionGroupToUpdate(): js.Promise[String | Null] = js.native
    
    var indexManager: IndexManager = js.native
    
    var persistence: Persistence = js.native
    
    def updateCollectionGroup(collectionGroup: String, offset: IndexOffset): js.Promise[Unit] = js.native
    
    def updateIndexEntries(documents: DocumentMap_): js.Promise[Unit] = js.native
  }
}
