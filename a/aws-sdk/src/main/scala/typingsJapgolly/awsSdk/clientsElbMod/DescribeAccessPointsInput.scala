package typingsJapgolly.awsSdk.clientsElbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccessPointsInput extends StObject {
  
  /**
    * The names of the load balancers.
    */
  var LoadBalancerNames: js.UndefOr[typingsJapgolly.awsSdk.clientsElbMod.LoadBalancerNames] = js.undefined
  
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[typingsJapgolly.awsSdk.clientsElbMod.Marker] = js.undefined
  
  /**
    * The maximum number of results to return with this call (a number from 1 to 400). The default is 400.
    */
  var PageSize: js.UndefOr[typingsJapgolly.awsSdk.clientsElbMod.PageSize] = js.undefined
}
object DescribeAccessPointsInput {
  
  inline def apply(): DescribeAccessPointsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccessPointsInput]
  }
  
  extension [Self <: DescribeAccessPointsInput](x: Self) {
    
    inline def setLoadBalancerNames(value: LoadBalancerNames): Self = StObject.set(x, "LoadBalancerNames", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerNamesUndefined: Self = StObject.set(x, "LoadBalancerNames", js.undefined)
    
    inline def setLoadBalancerNamesVarargs(value: AccessPointName*): Self = StObject.set(x, "LoadBalancerNames", js.Array(value*))
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setPageSize(value: PageSize): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
  }
}
