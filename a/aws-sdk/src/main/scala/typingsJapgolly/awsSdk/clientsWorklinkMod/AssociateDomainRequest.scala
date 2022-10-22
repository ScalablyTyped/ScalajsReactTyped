package typingsJapgolly.awsSdk.clientsWorklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateDomainRequest extends StObject {
  
  /**
    * The ARN of an issued ACM certificate that is valid for the domain being associated.
    */
  var AcmCertificateArn: typingsJapgolly.awsSdk.clientsWorklinkMod.AcmCertificateArn
  
  /**
    * The name to display.
    */
  var DisplayName: js.UndefOr[typingsJapgolly.awsSdk.clientsWorklinkMod.DisplayName] = js.undefined
  
  /**
    * The fully qualified domain name (FQDN).
    */
  var DomainName: typingsJapgolly.awsSdk.clientsWorklinkMod.DomainName
  
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var FleetArn: typingsJapgolly.awsSdk.clientsWorklinkMod.FleetArn
}
object AssociateDomainRequest {
  
  inline def apply(AcmCertificateArn: AcmCertificateArn, DomainName: DomainName, FleetArn: FleetArn): AssociateDomainRequest = {
    val __obj = js.Dynamic.literal(AcmCertificateArn = AcmCertificateArn.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], FleetArn = FleetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateDomainRequest]
  }
  
  extension [Self <: AssociateDomainRequest](x: Self) {
    
    inline def setAcmCertificateArn(value: AcmCertificateArn): Self = StObject.set(x, "AcmCertificateArn", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
  }
}
