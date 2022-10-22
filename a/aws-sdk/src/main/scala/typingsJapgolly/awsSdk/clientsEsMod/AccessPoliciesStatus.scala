package typingsJapgolly.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessPoliciesStatus extends StObject {
  
  /**
    * The access policy configured for the Elasticsearch domain. Access policies may be resource-based, IP-based, or IAM-based. See  Configuring Access Policiesfor more information.
    */
  var Options: PolicyDocument
  
  /**
    * The status of the access policy for the Elasticsearch domain. See OptionStatus for the status information that's included. 
    */
  var Status: OptionStatus
}
object AccessPoliciesStatus {
  
  inline def apply(Options: PolicyDocument, Status: OptionStatus): AccessPoliciesStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessPoliciesStatus]
  }
  
  extension [Self <: AccessPoliciesStatus](x: Self) {
    
    inline def setOptions(value: PolicyDocument): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
