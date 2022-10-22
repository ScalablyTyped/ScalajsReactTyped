package typingsJapgolly.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListHotTabletsResponse extends StObject {
  
  /**
    * List of hot tablets in the tables of the requested cluster that fall within the requested time range. Hot tablets are ordered by node cpu usage percent. If there are multiple hot
    * tablets that correspond to the same tablet within a 15-minute interval, only the hot tablet with the highest node cpu usage will be included in the response.
    */
  var hotTablets: js.UndefOr[js.Array[HotTablet]] = js.undefined
  
  /** Set if not all hot tablets could be returned in a single response. Pass this value to `page_token` in another request to get the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListHotTabletsResponse {
  
  inline def apply(): ListHotTabletsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHotTabletsResponse]
  }
  
  extension [Self <: ListHotTabletsResponse](x: Self) {
    
    inline def setHotTablets(value: js.Array[HotTablet]): Self = StObject.set(x, "hotTablets", value.asInstanceOf[js.Any])
    
    inline def setHotTabletsUndefined: Self = StObject.set(x, "hotTablets", js.undefined)
    
    inline def setHotTabletsVarargs(value: HotTablet*): Self = StObject.set(x, "hotTablets", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
