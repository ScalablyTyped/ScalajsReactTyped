package typingsJapgolly.awsSdk.clientsLicensemanagerusersubscriptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateUserResponse extends StObject {
  
  /**
    * Metadata that describes the associate user operation.
    */
  var InstanceUserSummary: typingsJapgolly.awsSdk.clientsLicensemanagerusersubscriptionsMod.InstanceUserSummary
}
object DisassociateUserResponse {
  
  inline def apply(InstanceUserSummary: InstanceUserSummary): DisassociateUserResponse = {
    val __obj = js.Dynamic.literal(InstanceUserSummary = InstanceUserSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateUserResponse]
  }
  
  extension [Self <: DisassociateUserResponse](x: Self) {
    
    inline def setInstanceUserSummary(value: InstanceUserSummary): Self = StObject.set(x, "InstanceUserSummary", value.asInstanceOf[js.Any])
  }
}
