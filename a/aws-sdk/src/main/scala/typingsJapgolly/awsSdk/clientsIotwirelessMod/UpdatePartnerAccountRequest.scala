package typingsJapgolly.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePartnerAccountRequest extends StObject {
  
  /**
    * The ID of the partner account to update.
    */
  var PartnerAccountId: typingsJapgolly.awsSdk.clientsIotwirelessMod.PartnerAccountId
  
  /**
    * The partner type.
    */
  var PartnerType: typingsJapgolly.awsSdk.clientsIotwirelessMod.PartnerType
  
  /**
    * The Sidewalk account credentials.
    */
  var Sidewalk: SidewalkUpdateAccount
}
object UpdatePartnerAccountRequest {
  
  inline def apply(PartnerAccountId: PartnerAccountId, PartnerType: PartnerType, Sidewalk: SidewalkUpdateAccount): UpdatePartnerAccountRequest = {
    val __obj = js.Dynamic.literal(PartnerAccountId = PartnerAccountId.asInstanceOf[js.Any], PartnerType = PartnerType.asInstanceOf[js.Any], Sidewalk = Sidewalk.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePartnerAccountRequest]
  }
  
  extension [Self <: UpdatePartnerAccountRequest](x: Self) {
    
    inline def setPartnerAccountId(value: PartnerAccountId): Self = StObject.set(x, "PartnerAccountId", value.asInstanceOf[js.Any])
    
    inline def setPartnerType(value: PartnerType): Self = StObject.set(x, "PartnerType", value.asInstanceOf[js.Any])
    
    inline def setSidewalk(value: SidewalkUpdateAccount): Self = StObject.set(x, "Sidewalk", value.asInstanceOf[js.Any])
  }
}
