package typingsJapgolly.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectDomainTransferFromAnotherAwsAccountRequest extends StObject {
  
  /**
    * The name of the domain that was specified when another Amazon Web Services account submitted a TransferDomainToAnotherAwsAccount request. 
    */
  var DomainName: typingsJapgolly.awsSdk.clientsRoute53domainsMod.DomainName
}
object RejectDomainTransferFromAnotherAwsAccountRequest {
  
  inline def apply(DomainName: DomainName): RejectDomainTransferFromAnotherAwsAccountRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectDomainTransferFromAnotherAwsAccountRequest]
  }
  
  extension [Self <: RejectDomainTransferFromAnotherAwsAccountRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
