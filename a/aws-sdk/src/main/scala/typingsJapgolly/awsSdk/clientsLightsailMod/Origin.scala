package typingsJapgolly.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Origin extends StObject {
  
  /**
    * The name of the origin resource.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The protocol that your Amazon Lightsail distribution uses when establishing a connection with your origin to pull content.
    */
  var protocolPolicy: js.UndefOr[OriginProtocolPolicyEnum] = js.undefined
  
  /**
    * The AWS Region name of the origin resource.
    */
  var regionName: js.UndefOr[RegionName] = js.undefined
  
  /**
    * The resource type of the origin resource (e.g., Instance).
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
}
object Origin {
  
  inline def apply(): Origin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Origin]
  }
  
  extension [Self <: Origin](x: Self) {
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProtocolPolicy(value: OriginProtocolPolicyEnum): Self = StObject.set(x, "protocolPolicy", value.asInstanceOf[js.Any])
    
    inline def setProtocolPolicyUndefined: Self = StObject.set(x, "protocolPolicy", js.undefined)
    
    inline def setRegionName(value: RegionName): Self = StObject.set(x, "regionName", value.asInstanceOf[js.Any])
    
    inline def setRegionNameUndefined: Self = StObject.set(x, "regionName", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
