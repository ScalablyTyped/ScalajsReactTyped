package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemarketingListsListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#remarketingListsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Remarketing list collection. */
  var remarketingLists: js.UndefOr[js.Array[RemarketingList]] = js.undefined
}
object RemarketingListsListResponse {
  
  inline def apply(): RemarketingListsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemarketingListsListResponse]
  }
  
  extension [Self <: RemarketingListsListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRemarketingLists(value: js.Array[RemarketingList]): Self = StObject.set(x, "remarketingLists", value.asInstanceOf[js.Any])
    
    inline def setRemarketingListsUndefined: Self = StObject.set(x, "remarketingLists", js.undefined)
    
    inline def setRemarketingListsVarargs(value: RemarketingList*): Self = StObject.set(x, "remarketingLists", js.Array(value*))
  }
}
