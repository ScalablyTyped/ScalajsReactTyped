package typingsJapgolly.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortProbeAction extends StObject {
  
  /**
    * Indicates whether EC2 blocked the port probe to the instance, such as with an ACL.
    */
  var Blocked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of objects related to port probe details.
    */
  var PortProbeDetails: js.UndefOr[typingsJapgolly.awsSdk.clientsGuarddutyMod.PortProbeDetails] = js.undefined
}
object PortProbeAction {
  
  inline def apply(): PortProbeAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortProbeAction]
  }
  
  extension [Self <: PortProbeAction](x: Self) {
    
    inline def setBlocked(value: Boolean): Self = StObject.set(x, "Blocked", value.asInstanceOf[js.Any])
    
    inline def setBlockedUndefined: Self = StObject.set(x, "Blocked", js.undefined)
    
    inline def setPortProbeDetails(value: PortProbeDetails): Self = StObject.set(x, "PortProbeDetails", value.asInstanceOf[js.Any])
    
    inline def setPortProbeDetailsUndefined: Self = StObject.set(x, "PortProbeDetails", js.undefined)
    
    inline def setPortProbeDetailsVarargs(value: PortProbeDetail*): Self = StObject.set(x, "PortProbeDetails", js.Array(value*))
  }
}
