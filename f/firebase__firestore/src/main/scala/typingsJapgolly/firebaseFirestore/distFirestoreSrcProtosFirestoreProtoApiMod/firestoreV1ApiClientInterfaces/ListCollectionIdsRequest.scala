package typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.firestoreV1ApiClientInterfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCollectionIdsRequest extends StObject {
  
  var pageSize: js.UndefOr[Double] = js.undefined
  
  var pageToken: js.UndefOr[String] = js.undefined
}
object ListCollectionIdsRequest {
  
  inline def apply(): ListCollectionIdsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCollectionIdsRequest]
  }
  
  extension [Self <: ListCollectionIdsRequest](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
