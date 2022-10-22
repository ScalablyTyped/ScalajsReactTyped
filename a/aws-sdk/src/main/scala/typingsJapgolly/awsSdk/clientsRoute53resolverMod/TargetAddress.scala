package typingsJapgolly.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetAddress extends StObject {
  
  /**
    * One IP address that you want to forward DNS queries to. You can specify only IPv4 addresses.
    */
  var Ip: typingsJapgolly.awsSdk.clientsRoute53resolverMod.Ip
  
  /**
    * The port at Ip that you want to forward DNS queries to.
    */
  var Port: js.UndefOr[typingsJapgolly.awsSdk.clientsRoute53resolverMod.Port] = js.undefined
}
object TargetAddress {
  
  inline def apply(Ip: Ip): TargetAddress = {
    val __obj = js.Dynamic.literal(Ip = Ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetAddress]
  }
  
  extension [Self <: TargetAddress](x: Self) {
    
    inline def setIp(value: Ip): Self = StObject.set(x, "Ip", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Port): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
  }
}
