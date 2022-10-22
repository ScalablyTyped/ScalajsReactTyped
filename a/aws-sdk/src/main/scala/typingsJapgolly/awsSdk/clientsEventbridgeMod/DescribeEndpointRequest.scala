package typingsJapgolly.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEndpointRequest extends StObject {
  
  /**
    * The primary Region of the endpoint you want to get information about. For example "HomeRegion": "us-east-1".
    */
  var HomeRegion: js.UndefOr[typingsJapgolly.awsSdk.clientsEventbridgeMod.HomeRegion] = js.undefined
  
  /**
    * The name of the endpoint you want to get information about. For example, "Name":"us-east-2-custom_bus_A-endpoint".
    */
  var Name: EndpointName
}
object DescribeEndpointRequest {
  
  inline def apply(Name: EndpointName): DescribeEndpointRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndpointRequest]
  }
  
  extension [Self <: DescribeEndpointRequest](x: Self) {
    
    inline def setHomeRegion(value: HomeRegion): Self = StObject.set(x, "HomeRegion", value.asInstanceOf[js.Any])
    
    inline def setHomeRegionUndefined: Self = StObject.set(x, "HomeRegion", js.undefined)
    
    inline def setName(value: EndpointName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
