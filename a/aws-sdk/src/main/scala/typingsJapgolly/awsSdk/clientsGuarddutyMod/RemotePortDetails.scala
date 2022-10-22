package typingsJapgolly.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemotePortDetails extends StObject {
  
  /**
    * The port number of the remote connection.
    */
  var Port: js.UndefOr[Integer] = js.undefined
  
  /**
    * The port name of the remote connection.
    */
  var PortName: js.UndefOr[String] = js.undefined
}
object RemotePortDetails {
  
  inline def apply(): RemotePortDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemotePortDetails]
  }
  
  extension [Self <: RemotePortDetails](x: Self) {
    
    inline def setPort(value: Integer): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortName(value: String): Self = StObject.set(x, "PortName", value.asInstanceOf[js.Any])
    
    inline def setPortNameUndefined: Self = StObject.set(x, "PortName", js.undefined)
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
  }
}
