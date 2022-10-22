package typingsJapgolly.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait App extends StObject {
  
  /**
    * The application's name.
    */
  var AppName: ResourceName
  
  /**
    * The application's port number, for example 80.
    */
  var Port: IPPortNumber
  
  /**
    * The IP protocol name or number. The name can be one of tcp, udp, or icmp. For information on possible numbers, see Protocol Numbers.
    */
  var Protocol: typingsJapgolly.awsSdk.clientsFmsMod.Protocol
}
object App {
  
  inline def apply(AppName: ResourceName, Port: IPPortNumber, Protocol: Protocol): App = {
    val __obj = js.Dynamic.literal(AppName = AppName.asInstanceOf[js.Any], Port = Port.asInstanceOf[js.Any], Protocol = Protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
  
  extension [Self <: App](x: Self) {
    
    inline def setAppName(value: ResourceName): Self = StObject.set(x, "AppName", value.asInstanceOf[js.Any])
    
    inline def setPort(value: IPPortNumber): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: Protocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
  }
}
