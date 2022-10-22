package typingsJapgolly.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptGrantRequest extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the grant.
    */
  var GrantArn: Arn
}
object AcceptGrantRequest {
  
  inline def apply(GrantArn: Arn): AcceptGrantRequest = {
    val __obj = js.Dynamic.literal(GrantArn = GrantArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptGrantRequest]
  }
  
  extension [Self <: AcceptGrantRequest](x: Self) {
    
    inline def setGrantArn(value: Arn): Self = StObject.set(x, "GrantArn", value.asInstanceOf[js.Any])
  }
}
