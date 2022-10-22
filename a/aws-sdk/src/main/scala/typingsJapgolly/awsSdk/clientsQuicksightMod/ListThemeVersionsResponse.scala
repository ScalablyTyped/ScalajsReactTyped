package typingsJapgolly.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListThemeVersionsResponse extends StObject {
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
  
  /**
    * A structure containing a list of all the versions of the specified theme.
    */
  var ThemeVersionSummaryList: js.UndefOr[typingsJapgolly.awsSdk.clientsQuicksightMod.ThemeVersionSummaryList] = js.undefined
}
object ListThemeVersionsResponse {
  
  inline def apply(): ListThemeVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThemeVersionsResponse]
  }
  
  extension [Self <: ListThemeVersionsResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setThemeVersionSummaryList(value: ThemeVersionSummaryList): Self = StObject.set(x, "ThemeVersionSummaryList", value.asInstanceOf[js.Any])
    
    inline def setThemeVersionSummaryListUndefined: Self = StObject.set(x, "ThemeVersionSummaryList", js.undefined)
    
    inline def setThemeVersionSummaryListVarargs(value: ThemeVersionSummary*): Self = StObject.set(x, "ThemeVersionSummaryList", js.Array(value*))
  }
}
