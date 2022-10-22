package typingsJapgolly.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangesListResponse extends StObject {
  
  /** The requested changes. */
  var changes: js.UndefOr[js.Array[Change]] = js.undefined
  
  var header: js.UndefOr[ResponseHeader] = js.undefined
  
  /** Type of resource. */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The presence of this field indicates that there exist more results following your last page of results in pagination order. To fetch them, make another list request using this value
    * as your pagination token. This lets you retrieve the complete contents of even very large collections one page at a time. However, if the contents of the collection change between
    * the first and last paginated list request, the set of all elements returned are an inconsistent view of the collection. You cannot retrieve a "snapshot" of collections larger than
    * the maximum page size.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ChangesListResponse {
  
  inline def apply(): ChangesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangesListResponse]
  }
  
  extension [Self <: ChangesListResponse](x: Self) {
    
    inline def setChanges(value: js.Array[Change]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesUndefined: Self = StObject.set(x, "changes", js.undefined)
    
    inline def setChangesVarargs(value: Change*): Self = StObject.set(x, "changes", js.Array(value*))
    
    inline def setHeader(value: ResponseHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
