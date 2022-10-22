package typingsJapgolly.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConfigsRequest extends StObject {
  
  /**
    * Maximum number of Configs returned.
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * Next token returned in the request of a previous ListConfigs call. Used to get the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListConfigsRequest {
  
  inline def apply(): ListConfigsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConfigsRequest]
  }
  
  extension [Self <: ListConfigsRequest](x: Self) {
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
