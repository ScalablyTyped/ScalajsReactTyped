package typingsJapgolly.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortProbeDetail extends StObject {
  
  /**
    * The local IP information of the connection.
    */
  var LocalIpDetails: js.UndefOr[typingsJapgolly.awsSdk.clientsGuarddutyMod.LocalIpDetails] = js.undefined
  
  /**
    * The local port information of the connection.
    */
  var LocalPortDetails: js.UndefOr[typingsJapgolly.awsSdk.clientsGuarddutyMod.LocalPortDetails] = js.undefined
  
  /**
    * The remote IP information of the connection.
    */
  var RemoteIpDetails: js.UndefOr[typingsJapgolly.awsSdk.clientsGuarddutyMod.RemoteIpDetails] = js.undefined
}
object PortProbeDetail {
  
  inline def apply(): PortProbeDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortProbeDetail]
  }
  
  extension [Self <: PortProbeDetail](x: Self) {
    
    inline def setLocalIpDetails(value: LocalIpDetails): Self = StObject.set(x, "LocalIpDetails", value.asInstanceOf[js.Any])
    
    inline def setLocalIpDetailsUndefined: Self = StObject.set(x, "LocalIpDetails", js.undefined)
    
    inline def setLocalPortDetails(value: LocalPortDetails): Self = StObject.set(x, "LocalPortDetails", value.asInstanceOf[js.Any])
    
    inline def setLocalPortDetailsUndefined: Self = StObject.set(x, "LocalPortDetails", js.undefined)
    
    inline def setRemoteIpDetails(value: RemoteIpDetails): Self = StObject.set(x, "RemoteIpDetails", value.asInstanceOf[js.Any])
    
    inline def setRemoteIpDetailsUndefined: Self = StObject.set(x, "RemoteIpDetails", js.undefined)
  }
}
