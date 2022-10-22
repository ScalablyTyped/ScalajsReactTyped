package typingsJapgolly.maximMazurokGapiClientCloudbilling.gapi.client.cloudbilling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProjectBillingInfoResponse extends StObject {
  
  /**
    * A token to retrieve the next page of results. To retrieve the next page, call `ListProjectBillingInfo` again with the `page_token` field set to this value. This field is empty if
    * there are no more results to retrieve.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** A list of `ProjectBillingInfo` resources representing the projects associated with the billing account. */
  var projectBillingInfo: js.UndefOr[js.Array[ProjectBillingInfo]] = js.undefined
}
object ListProjectBillingInfoResponse {
  
  inline def apply(): ListProjectBillingInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProjectBillingInfoResponse]
  }
  
  extension [Self <: ListProjectBillingInfoResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setProjectBillingInfo(value: js.Array[ProjectBillingInfo]): Self = StObject.set(x, "projectBillingInfo", value.asInstanceOf[js.Any])
    
    inline def setProjectBillingInfoUndefined: Self = StObject.set(x, "projectBillingInfo", js.undefined)
    
    inline def setProjectBillingInfoVarargs(value: ProjectBillingInfo*): Self = StObject.set(x, "projectBillingInfo", js.Array(value*))
  }
}
