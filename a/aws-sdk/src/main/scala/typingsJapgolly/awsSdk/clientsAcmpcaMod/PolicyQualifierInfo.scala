package typingsJapgolly.awsSdk.clientsAcmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyQualifierInfo extends StObject {
  
  /**
    * Identifies the qualifier modifying a CertPolicyId.
    */
  var PolicyQualifierId: typingsJapgolly.awsSdk.clientsAcmpcaMod.PolicyQualifierId
  
  /**
    * Defines the qualifier type. ACM Private CA supports the use of a URI for a CPS qualifier in this field.
    */
  var Qualifier: typingsJapgolly.awsSdk.clientsAcmpcaMod.Qualifier
}
object PolicyQualifierInfo {
  
  inline def apply(PolicyQualifierId: PolicyQualifierId, Qualifier: Qualifier): PolicyQualifierInfo = {
    val __obj = js.Dynamic.literal(PolicyQualifierId = PolicyQualifierId.asInstanceOf[js.Any], Qualifier = Qualifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyQualifierInfo]
  }
  
  extension [Self <: PolicyQualifierInfo](x: Self) {
    
    inline def setPolicyQualifierId(value: PolicyQualifierId): Self = StObject.set(x, "PolicyQualifierId", value.asInstanceOf[js.Any])
    
    inline def setQualifier(value: Qualifier): Self = StObject.set(x, "Qualifier", value.asInstanceOf[js.Any])
  }
}
