package typingsJapgolly.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentDelete extends StObject {
  
  /** The resource name of the Document that was deleted. */
  var document: js.UndefOr[String] = js.undefined
  
  /** The read timestamp at which the delete was observed. Greater or equal to the `commit_time` of the delete. */
  var readTime: js.UndefOr[String] = js.undefined
  
  /** A set of target IDs for targets that previously matched this entity. */
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
    
    inline def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setRemovedTargetIds(value: js.Array[Double]): Self = StObject.set(x, "removedTargetIds", value.asInstanceOf[js.Any])
    
    inline def setRemovedTargetIdsUndefined: Self = StObject.set(x, "removedTargetIds", js.undefined)
    
    inline def setRemovedTargetIdsVarargs(value: Double*): Self = StObject.set(x, "removedTargetIds", js.Array(value*))
  }
}
