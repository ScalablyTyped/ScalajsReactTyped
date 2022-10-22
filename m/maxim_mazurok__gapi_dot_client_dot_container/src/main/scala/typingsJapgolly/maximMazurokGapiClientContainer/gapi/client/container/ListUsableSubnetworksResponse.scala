package typingsJapgolly.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUsableSubnetworksResponse extends StObject {
  
  /**
    * This token allows you to get the next page of results for list requests. If the number of results is larger than `page_size`, use the `next_page_token` as a value for the query
    * parameter `page_token` in the next request. The value will become empty when there are no more pages.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** A list of usable subnetworks in the specified network project. */
  var subnetworks: js.UndefOr[js.Array[UsableSubnetwork]] = js.undefined
}
object ListUsableSubnetworksResponse {
  
  inline def apply(): ListUsableSubnetworksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUsableSubnetworksResponse]
  }
  
  extension [Self <: ListUsableSubnetworksResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSubnetworks(value: js.Array[UsableSubnetwork]): Self = StObject.set(x, "subnetworks", value.asInstanceOf[js.Any])
    
    inline def setSubnetworksUndefined: Self = StObject.set(x, "subnetworks", js.undefined)
    
    inline def setSubnetworksVarargs(value: UsableSubnetwork*): Self = StObject.set(x, "subnetworks", js.Array(value*))
  }
}
