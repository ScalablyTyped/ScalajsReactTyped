package typingsJapgolly.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGroupPolicyResponse extends StObject {
  
  /**
    * The group the policy is associated with.
    */
  var GroupName: groupNameType
  
  /**
    * The policy document. IAM stores policies in JSON format. However, resources that were created using CloudFormation templates can be formatted in YAML. CloudFormation always converts a YAML policy to JSON format before submitting it to IAM.
    */
  var PolicyDocument: policyDocumentType
  
  /**
    * The name of the policy.
    */
  var PolicyName: policyNameType
}
object GetGroupPolicyResponse {
  
  inline def apply(GroupName: groupNameType, PolicyDocument: policyDocumentType, PolicyName: policyNameType): GetGroupPolicyResponse = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any], PolicyDocument = PolicyDocument.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGroupPolicyResponse]
  }
  
  extension [Self <: GetGroupPolicyResponse](x: Self) {
    
    inline def setGroupName(value: groupNameType): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setPolicyDocument(value: policyDocumentType): Self = StObject.set(x, "PolicyDocument", value.asInstanceOf[js.Any])
    
    inline def setPolicyName(value: policyNameType): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
  }
}
