package typingsJapgolly.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortMapping extends StObject {
  
  /**
    * The port number on the application.
    */
  var applicationPort: NonSystemPort
  
  /**
    * A Boolean indicating whether to enable this port mapping on public IP.
    */
  var enableOnPublicIp: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The port number on the simulation job instance to use as a remote connection point. 
    */
  var jobPort: Port
}
object PortMapping {
  
  inline def apply(applicationPort: NonSystemPort, jobPort: Port): PortMapping = {
    val __obj = js.Dynamic.literal(applicationPort = applicationPort.asInstanceOf[js.Any], jobPort = jobPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortMapping]
  }
  
  extension [Self <: PortMapping](x: Self) {
    
    inline def setApplicationPort(value: NonSystemPort): Self = StObject.set(x, "applicationPort", value.asInstanceOf[js.Any])
    
    inline def setEnableOnPublicIp(value: Boolean): Self = StObject.set(x, "enableOnPublicIp", value.asInstanceOf[js.Any])
    
    inline def setEnableOnPublicIpUndefined: Self = StObject.set(x, "enableOnPublicIp", js.undefined)
    
    inline def setJobPort(value: Port): Self = StObject.set(x, "jobPort", value.asInstanceOf[js.Any])
  }
}
