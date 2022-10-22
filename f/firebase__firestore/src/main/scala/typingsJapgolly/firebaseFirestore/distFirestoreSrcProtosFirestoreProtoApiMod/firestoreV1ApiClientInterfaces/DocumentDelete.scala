package typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.firestoreV1ApiClientInterfaces

import typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentDelete extends StObject {
  
  var document: js.UndefOr[String] = js.undefined
  
  var readTime: js.UndefOr[Timestamp] = js.undefined
  
  var removedTargetIds: js.UndefOr[js.Array[Double]] = js.undefined
}
object DocumentDelete {
  
  inline def apply(): DocumentDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentDelete]
  }
  
  extension [Self <: DocumentDelete](x: Self) {
    
    inline def setDocument(value: String): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setReadTime(value: Timestamp): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setRemovedTargetIds(value: js.Array[Double]): Self = StObject.set(x, "removedTargetIds", value.asInstanceOf[js.Any])
    
    inline def setRemovedTargetIdsUndefined: Self = StObject.set(x, "removedTargetIds", js.undefined)
    
    inline def setRemovedTargetIdsVarargs(value: Double*): Self = StObject.set(x, "removedTargetIds", js.Array(value*))
  }
}
