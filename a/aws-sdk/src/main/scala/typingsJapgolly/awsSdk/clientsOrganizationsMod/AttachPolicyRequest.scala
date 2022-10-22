package typingsJapgolly.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachPolicyRequest extends StObject {
  
  /**
    * The unique identifier (ID) of the policy that you want to attach to the target. You can get the ID for the policy by calling the ListPolicies operation. The regex pattern for a policy ID string requires "p-" followed by from 8 to 128 lowercase or uppercase letters, digits, or the underscore character (_).
    */
  var PolicyId: typingsJapgolly.awsSdk.clientsOrganizationsMod.PolicyId
  
  /**
    * The unique identifier (ID) of the root, OU, or account that you want to attach the policy to. You can get the ID by calling the ListRoots, ListOrganizationalUnitsForParent, or ListAccounts operations. The regex pattern for a target ID string requires one of the following:    Root - A string that begins with "r-" followed by from 4 to 32 lowercase letters or digits.    Account - A string that consists of exactly 12 digits.    Organizational unit (OU) - A string that begins with "ou-" followed by from 4 to 32 lowercase letters or digits (the ID of the root that the OU is in). This string is followed by a second "-" dash and from 8 to 32 additional lowercase letters or digits.  
    */
  var TargetId: PolicyTargetId
}
object AttachPolicyRequest {
  
  inline def apply(PolicyId: PolicyId, TargetId: PolicyTargetId): AttachPolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyId = PolicyId.asInstanceOf[js.Any], TargetId = TargetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachPolicyRequest]
  }
  
  extension [Self <: AttachPolicyRequest](x: Self) {
    
    inline def setPolicyId(value: PolicyId): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
    
    inline def setTargetId(value: PolicyTargetId): Self = StObject.set(x, "TargetId", value.asInstanceOf[js.Any])
  }
}
