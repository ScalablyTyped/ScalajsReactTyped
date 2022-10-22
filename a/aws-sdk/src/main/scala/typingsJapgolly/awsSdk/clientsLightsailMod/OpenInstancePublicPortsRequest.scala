package typingsJapgolly.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenInstancePublicPortsRequest extends StObject {
  
  /**
    * The name of the instance for which to open ports.
    */
  var instanceName: ResourceName
  
  /**
    * An object to describe the ports to open for the specified instance.
    */
  var portInfo: PortInfo
}
object OpenInstancePublicPortsRequest {
  
  inline def apply(instanceName: ResourceName, portInfo: PortInfo): OpenInstancePublicPortsRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any], portInfo = portInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenInstancePublicPortsRequest]
  }
  
  extension [Self <: OpenInstancePublicPortsRequest](x: Self) {
    
    inline def setInstanceName(value: ResourceName): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
    
    inline def setPortInfo(value: PortInfo): Self = StObject.set(x, "portInfo", value.asInstanceOf[js.Any])
  }
}
