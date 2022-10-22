package typingsJapgolly.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFindingsResponse extends StObject {
  
  /** Findings matching the list request. */
  var listFindingsResults: js.UndefOr[js.Array[ListFindingsResult]] = js.undefined
  
  /** Token to retrieve the next page of results, or empty if there are no more results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Time used for executing the list request. */
  var readTime: js.UndefOr[String] = js.undefined
  
  /** The total number of findings matching the query. */
  var totalSize: js.UndefOr[Double] = js.undefined
}
object ListFindingsResponse {
  
  inline def apply(): ListFindingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFindingsResponse]
  }
  
  extension [Self <: ListFindingsResponse](x: Self) {
    
    inline def setListFindingsResults(value: js.Array[ListFindingsResult]): Self = StObject.set(x, "listFindingsResults", value.asInstanceOf[js.Any])
    
    inline def setListFindingsResultsUndefined: Self = StObject.set(x, "listFindingsResults", js.undefined)
    
    inline def setListFindingsResultsVarargs(value: ListFindingsResult*): Self = StObject.set(x, "listFindingsResults", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
