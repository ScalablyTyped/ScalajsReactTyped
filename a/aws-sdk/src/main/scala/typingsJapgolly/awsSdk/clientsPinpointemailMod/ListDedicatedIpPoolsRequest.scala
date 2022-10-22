package typingsJapgolly.awsSdk.clientsPinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDedicatedIpPoolsRequest extends StObject {
  
  /**
    * A token returned from a previous call to ListDedicatedIpPools to indicate the position in the list of dedicated IP pools.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsPinpointemailMod.NextToken] = js.undefined
  
  /**
    * The number of results to show in a single call to ListDedicatedIpPools. If the number of results is larger than the number you specified in this parameter, then the response includes a NextToken element, which you can use to obtain additional results.
    */
  var PageSize: js.UndefOr[MaxItems] = js.undefined
}
object ListDedicatedIpPoolsRequest {
  
  inline def apply(): ListDedicatedIpPoolsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDedicatedIpPoolsRequest]
  }
  
  extension [Self <: ListDedicatedIpPoolsRequest](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPageSize(value: MaxItems): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
  }
}
