package typingsJapgolly.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateVPCWithHostedZoneResponse extends StObject {
  
  /**
    * A complex type that describes the changes made to your hosted zone.
    */
  var ChangeInfo: typingsJapgolly.awsSdk.clientsRoute53Mod.ChangeInfo
}
object AssociateVPCWithHostedZoneResponse {
  
  inline def apply(ChangeInfo: ChangeInfo): AssociateVPCWithHostedZoneResponse = {
    val __obj = js.Dynamic.literal(ChangeInfo = ChangeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateVPCWithHostedZoneResponse]
  }
  
  extension [Self <: AssociateVPCWithHostedZoneResponse](x: Self) {
    
    inline def setChangeInfo(value: ChangeInfo): Self = StObject.set(x, "ChangeInfo", value.asInstanceOf[js.Any])
  }
}
