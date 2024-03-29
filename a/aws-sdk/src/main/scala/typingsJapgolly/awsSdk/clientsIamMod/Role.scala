package typingsJapgolly.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Role extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) specifying the role. For more information about ARNs and how to use them in policies, see IAM identifiers in the IAM User Guide guide. 
    */
  var Arn: arnType
  
  /**
    * The policy that grants an entity permission to assume the role.
    */
  var AssumeRolePolicyDocument: js.UndefOr[policyDocumentType] = js.undefined
  
  /**
    * The date and time, in ISO 8601 date-time format, when the role was created.
    */
  var CreateDate: js.Date
  
  /**
    * A description of the role that you provide.
    */
  var Description: js.UndefOr[roleDescriptionType] = js.undefined
  
  /**
    * The maximum session duration (in seconds) for the specified role. Anyone who uses the CLI, or API to assume the role can specify the duration using the optional DurationSeconds API parameter or duration-seconds CLI parameter.
    */
  var MaxSessionDuration: js.UndefOr[roleMaxSessionDurationType] = js.undefined
  
  /**
    *  The path to the role. For more information about paths, see IAM identifiers in the IAM User Guide. 
    */
  var Path: pathType
  
  /**
    * The ARN of the policy used to set the permissions boundary for the role. For more information about permissions boundaries, see Permissions boundaries for IAM identities  in the IAM User Guide.
    */
  var PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary] = js.undefined
  
  /**
    *  The stable and unique string identifying the role. For more information about IDs, see IAM identifiers in the IAM User Guide. 
    */
  var RoleId: idType
  
  /**
    * Contains information about the last time that an IAM role was used. This includes the date and time and the Region in which the role was last used. Activity is only reported for the trailing 400 days. This period can be shorter if your Region began supporting these features within the last year. The role might have been used more than 400 days ago. For more information, see Regions where data is tracked in the IAM User Guide.
    */
  var RoleLastUsed: js.UndefOr[typingsJapgolly.awsSdk.clientsIamMod.RoleLastUsed] = js.undefined
  
  /**
    * The friendly name that identifies the role.
    */
  var RoleName: roleNameType
  
  /**
    * A list of tags that are attached to the role. For more information about tagging, see Tagging IAM resources in the IAM User Guide.
    */
  var Tags: js.UndefOr[tagListType] = js.undefined
}
object Role {
  
  inline def apply(Arn: arnType, CreateDate: js.Date, Path: pathType, RoleId: idType, RoleName: roleNameType): Role = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], CreateDate = CreateDate.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], RoleId = RoleId.asInstanceOf[js.Any], RoleName = RoleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Role]
  }
  
  extension [Self <: Role](x: Self) {
    
    inline def setArn(value: arnType): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setAssumeRolePolicyDocument(value: policyDocumentType): Self = StObject.set(x, "AssumeRolePolicyDocument", value.asInstanceOf[js.Any])
    
    inline def setAssumeRolePolicyDocumentUndefined: Self = StObject.set(x, "AssumeRolePolicyDocument", js.undefined)
    
    inline def setCreateDate(value: js.Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: roleDescriptionType): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setMaxSessionDuration(value: roleMaxSessionDurationType): Self = StObject.set(x, "MaxSessionDuration", value.asInstanceOf[js.Any])
    
    inline def setMaxSessionDurationUndefined: Self = StObject.set(x, "MaxSessionDuration", js.undefined)
    
    inline def setPath(value: pathType): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setPermissionsBoundary(value: AttachedPermissionsBoundary): Self = StObject.set(x, "PermissionsBoundary", value.asInstanceOf[js.Any])
    
    inline def setPermissionsBoundaryUndefined: Self = StObject.set(x, "PermissionsBoundary", js.undefined)
    
    inline def setRoleId(value: idType): Self = StObject.set(x, "RoleId", value.asInstanceOf[js.Any])
    
    inline def setRoleLastUsed(value: RoleLastUsed): Self = StObject.set(x, "RoleLastUsed", value.asInstanceOf[js.Any])
    
    inline def setRoleLastUsedUndefined: Self = StObject.set(x, "RoleLastUsed", js.undefined)
    
    inline def setRoleName(value: roleNameType): Self = StObject.set(x, "RoleName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: tagListType): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
