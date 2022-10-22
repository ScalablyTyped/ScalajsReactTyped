package typingsJapgolly.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMulticastGroupsByFuotaTaskResponse extends StObject {
  
  var MulticastGroupList: js.UndefOr[MulticastGroupListByFuotaTask] = js.undefined
  
  /**
    * To retrieve the next set of results, the nextToken value from a previous response; otherwise null to receive the first set of results.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.NextToken] = js.undefined
}
object ListMulticastGroupsByFuotaTaskResponse {
  
  inline def apply(): ListMulticastGroupsByFuotaTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMulticastGroupsByFuotaTaskResponse]
  }
  
  extension [Self <: ListMulticastGroupsByFuotaTaskResponse](x: Self) {
    
    inline def setMulticastGroupList(value: MulticastGroupListByFuotaTask): Self = StObject.set(x, "MulticastGroupList", value.asInstanceOf[js.Any])
    
    inline def setMulticastGroupListUndefined: Self = StObject.set(x, "MulticastGroupList", js.undefined)
    
    inline def setMulticastGroupListVarargs(value: MulticastGroupByFuotaTask*): Self = StObject.set(x, "MulticastGroupList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
