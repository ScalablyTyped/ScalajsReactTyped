package typingsJapgolly.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedPolicyDetail extends StObject {
  
  var Arn: js.UndefOr[arnType] = js.undefined
  
  /**
    * The number of principal entities (users, groups, and roles) that the policy is attached to.
    */
  var AttachmentCount: js.UndefOr[attachmentCountType] = js.undefined
  
  /**
    * The date and time, in ISO 8601 date-time format, when the policy was created.
    */
  var CreateDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier for the version of the policy that is set as the default (operative) version. For more information about policy versions, see Versioning for managed policies in the IAM User Guide. 
    */
  var DefaultVersionId: js.UndefOr[policyVersionIdType] = js.undefined
  
  /**
    * A friendly description of the policy.
    */
  var Description: js.UndefOr[policyDescriptionType] = js.undefined
  
  /**
    * Specifies whether the policy can be attached to an IAM user, group, or role.
    */
  var IsAttachable: js.UndefOr[booleanType] = js.undefined
  
  /**
    * The path to the policy. For more information about paths, see IAM identifiers in the IAM User Guide.
    */
  var Path: js.UndefOr[policyPathType] = js.undefined
  
  /**
    * The number of entities (users and roles) for which the policy is used as the permissions boundary.  For more information about permissions boundaries, see Permissions boundaries for IAM identities  in the IAM User Guide.
    */
  var PermissionsBoundaryUsageCount: js.UndefOr[attachmentCountType] = js.undefined
  
  /**
    * The stable and unique string identifying the policy. For more information about IDs, see IAM identifiers in the IAM User Guide.
    */
  var PolicyId: js.UndefOr[idType] = js.undefined
  
  /**
    * The friendly name (not ARN) identifying the policy.
    */
  var PolicyName: js.UndefOr[policyNameType] = js.undefined
  
  /**
    * A list containing information about the versions of the policy.
    */
  var PolicyVersionList: js.UndefOr[policyDocumentVersionListType] = js.undefined
  
  /**
    * The date and time, in ISO 8601 date-time format, when the policy was last updated. When a policy has only one version, this field contains the date and time when the policy was created. When a policy has more than one version, this field contains the date and time when the most recent policy version was created.
    */
  var UpdateDate: js.UndefOr[js.Date] = js.undefined
}
object ManagedPolicyDetail {
  
  inline def apply(): ManagedPolicyDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedPolicyDetail]
  }
  
  extension [Self <: ManagedPolicyDetail](x: Self) {
    
    inline def setArn(value: arnType): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setAttachmentCount(value: attachmentCountType): Self = StObject.set(x, "AttachmentCount", value.asInstanceOf[js.Any])
    
    inline def setAttachmentCountUndefined: Self = StObject.set(x, "AttachmentCount", js.undefined)
    
    inline def setCreateDate(value: js.Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    inline def setDefaultVersionId(value: policyVersionIdType): Self = StObject.set(x, "DefaultVersionId", value.asInstanceOf[js.Any])
    
    inline def setDefaultVersionIdUndefined: Self = StObject.set(x, "DefaultVersionId", js.undefined)
    
    inline def setDescription(value: policyDescriptionType): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setIsAttachable(value: booleanType): Self = StObject.set(x, "IsAttachable", value.asInstanceOf[js.Any])
    
    inline def setIsAttachableUndefined: Self = StObject.set(x, "IsAttachable", js.undefined)
    
    inline def setPath(value: policyPathType): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
    
    inline def setPermissionsBoundaryUsageCount(value: attachmentCountType): Self = StObject.set(x, "PermissionsBoundaryUsageCount", value.asInstanceOf[js.Any])
    
    inline def setPermissionsBoundaryUsageCountUndefined: Self = StObject.set(x, "PermissionsBoundaryUsageCount", js.undefined)
    
    inline def setPolicyId(value: idType): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
    
    inline def setPolicyIdUndefined: Self = StObject.set(x, "PolicyId", js.undefined)
    
    inline def setPolicyName(value: policyNameType): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
    
    inline def setPolicyVersionList(value: policyDocumentVersionListType): Self = StObject.set(x, "PolicyVersionList", value.asInstanceOf[js.Any])
    
    inline def setPolicyVersionListUndefined: Self = StObject.set(x, "PolicyVersionList", js.undefined)
    
    inline def setPolicyVersionListVarargs(value: PolicyVersion*): Self = StObject.set(x, "PolicyVersionList", js.Array(value*))
    
    inline def setUpdateDate(value: js.Date): Self = StObject.set(x, "UpdateDate", value.asInstanceOf[js.Any])
    
    inline def setUpdateDateUndefined: Self = StObject.set(x, "UpdateDate", js.undefined)
  }
}
