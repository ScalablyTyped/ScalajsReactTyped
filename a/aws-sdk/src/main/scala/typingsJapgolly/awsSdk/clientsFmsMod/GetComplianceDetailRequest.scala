package typingsJapgolly.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetComplianceDetailRequest extends StObject {
  
  /**
    * The Amazon Web Services account that owns the resources that you want to get the details for.
    */
  var MemberAccount: AWSAccountId
  
  /**
    * The ID of the policy that you want to get the details for. PolicyId is returned by PutPolicy and by ListPolicies.
    */
  var PolicyId: typingsJapgolly.awsSdk.clientsFmsMod.PolicyId
}
object GetComplianceDetailRequest {
  
  inline def apply(MemberAccount: AWSAccountId, PolicyId: PolicyId): GetComplianceDetailRequest = {
    val __obj = js.Dynamic.literal(MemberAccount = MemberAccount.asInstanceOf[js.Any], PolicyId = PolicyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComplianceDetailRequest]
  }
  
  extension [Self <: GetComplianceDetailRequest](x: Self) {
    
    inline def setMemberAccount(value: AWSAccountId): Self = StObject.set(x, "MemberAccount", value.asInstanceOf[js.Any])
    
    inline def setPolicyId(value: PolicyId): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
  }
}
