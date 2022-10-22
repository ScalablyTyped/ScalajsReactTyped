package typingsJapgolly.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateAwsAccountFromPartnerAccountRequest extends StObject {
  
  /**
    * The partner account ID to disassociate from the AWS account.
    */
  var PartnerAccountId: typingsJapgolly.awsSdk.clientsIotwirelessMod.PartnerAccountId
  
  /**
    * The partner type.
    */
  var PartnerType: typingsJapgolly.awsSdk.clientsIotwirelessMod.PartnerType
}
object DisassociateAwsAccountFromPartnerAccountRequest {
  
  inline def apply(PartnerAccountId: PartnerAccountId, PartnerType: PartnerType): DisassociateAwsAccountFromPartnerAccountRequest = {
    val __obj = js.Dynamic.literal(PartnerAccountId = PartnerAccountId.asInstanceOf[js.Any], PartnerType = PartnerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateAwsAccountFromPartnerAccountRequest]
  }
  
  extension [Self <: DisassociateAwsAccountFromPartnerAccountRequest](x: Self) {
    
    inline def setPartnerAccountId(value: PartnerAccountId): Self = StObject.set(x, "PartnerAccountId", value.asInstanceOf[js.Any])
    
    inline def setPartnerType(value: PartnerType): Self = StObject.set(x, "PartnerType", value.asInstanceOf[js.Any])
  }
}
