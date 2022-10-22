package typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaListAccountSummariesResponse extends StObject {
  
  /** Account summaries of all accounts the caller has access to. */
  var accountSummaries: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaAccountSummary]] = js.undefined
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaListAccountSummariesResponse {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaListAccountSummariesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaListAccountSummariesResponse]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaListAccountSummariesResponse](x: Self) {
    
    inline def setAccountSummaries(value: js.Array[GoogleAnalyticsAdminV1alphaAccountSummary]): Self = StObject.set(x, "accountSummaries", value.asInstanceOf[js.Any])
    
    inline def setAccountSummariesUndefined: Self = StObject.set(x, "accountSummaries", js.undefined)
    
    inline def setAccountSummariesVarargs(value: GoogleAnalyticsAdminV1alphaAccountSummary*): Self = StObject.set(x, "accountSummaries", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
