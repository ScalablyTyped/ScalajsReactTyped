package typingsJapgolly.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMonitoredResourcesResponse extends StObject {
  
  /**
    *  Information about the resource that is being monitored, including the name of the resource, the type of resource, and whether or not permission is given to DevOps Guru to access that resource. 
    */
  var MonitoredResourceIdentifiers: typingsJapgolly.awsSdk.clientsDevopsguruMod.MonitoredResourceIdentifiers
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[UuidNextToken] = js.undefined
}
object ListMonitoredResourcesResponse {
  
  inline def apply(MonitoredResourceIdentifiers: MonitoredResourceIdentifiers): ListMonitoredResourcesResponse = {
    val __obj = js.Dynamic.literal(MonitoredResourceIdentifiers = MonitoredResourceIdentifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMonitoredResourcesResponse]
  }
  
  extension [Self <: ListMonitoredResourcesResponse](x: Self) {
    
    inline def setMonitoredResourceIdentifiers(value: MonitoredResourceIdentifiers): Self = StObject.set(x, "MonitoredResourceIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setMonitoredResourceIdentifiersVarargs(value: MonitoredResourceIdentifier*): Self = StObject.set(x, "MonitoredResourceIdentifiers", js.Array(value*))
    
    inline def setNextToken(value: UuidNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
