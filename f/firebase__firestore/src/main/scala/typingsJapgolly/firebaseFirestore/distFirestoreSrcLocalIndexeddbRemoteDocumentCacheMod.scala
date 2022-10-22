package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.distFirestoreSrcLocalLocalSerializerMod.LocalSerializer
import typingsJapgolly.firebaseFirestore.distFirestoreSrcLocalRemoteDocumentCacheMod.RemoteDocumentCache
import typingsJapgolly.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey
import typingsJapgolly.firebaseFirestore.distFirestoreSrcModelDocumentMod.MutableDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreSrcLocalIndexeddbRemoteDocumentCacheMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/local/indexeddb_remote_document_cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dbKeyComparator(l: DocumentKey, r: DocumentKey): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dbKeyComparator")(l.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def newIndexedDbRemoteDocumentCache(serializer: LocalSerializer): IndexedDbRemoteDocumentCache = ^.asInstanceOf[js.Dynamic].applyDynamic("newIndexedDbRemoteDocumentCache")(serializer.asInstanceOf[js.Any]).asInstanceOf[IndexedDbRemoteDocumentCache]
  
  trait DocumentSizeEntry extends StObject {
    
    var document: MutableDocument
    
    var size: Double
  }
  object DocumentSizeEntry {
    
    inline def apply(document: MutableDocument, size: Double): DocumentSizeEntry = {
      val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentSizeEntry]
    }
    
    extension [Self <: DocumentSizeEntry](x: Self) {
      
      inline def setDocument(value: MutableDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  type IndexedDbRemoteDocumentCache = RemoteDocumentCache
}
