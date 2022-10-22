package typingsJapgolly.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleFirestoreAdminV1ListIndexesResponse extends StObject {
  
  /** The requested indexes. */
  var indexes: js.UndefOr[js.Array[GoogleFirestoreAdminV1Index]] = js.undefined
  
  /** A page token that may be used to request another page of results. If blank, this is the last page. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleFirestoreAdminV1ListIndexesResponse {
  
  inline def apply(): GoogleFirestoreAdminV1ListIndexesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleFirestoreAdminV1ListIndexesResponse]
  }
  
  extension [Self <: GoogleFirestoreAdminV1ListIndexesResponse](x: Self) {
    
    inline def setIndexes(value: js.Array[GoogleFirestoreAdminV1Index]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
    
    inline def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
    
    inline def setIndexesVarargs(value: GoogleFirestoreAdminV1Index*): Self = StObject.set(x, "indexes", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
