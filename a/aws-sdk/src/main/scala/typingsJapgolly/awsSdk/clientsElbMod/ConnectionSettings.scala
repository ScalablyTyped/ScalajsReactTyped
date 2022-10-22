package typingsJapgolly.awsSdk.clientsElbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionSettings extends StObject {
  
  /**
    * The time, in seconds, that the connection is allowed to be idle (no data has been sent over the connection) before it is closed by the load balancer.
    */
  var IdleTimeout: typingsJapgolly.awsSdk.clientsElbMod.IdleTimeout
}
object ConnectionSettings {
  
  inline def apply(IdleTimeout: IdleTimeout): ConnectionSettings = {
    val __obj = js.Dynamic.literal(IdleTimeout = IdleTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionSettings]
  }
  
  extension [Self <: ConnectionSettings](x: Self) {
    
    inline def setIdleTimeout(value: IdleTimeout): Self = StObject.set(x, "IdleTimeout", value.asInstanceOf[js.Any])
  }
}
