package typingsJapgolly.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAccessRequest extends StObject {
  
  /**
    * A unique identifier that is required to identify specific groups within your directory. The users of the group that you associate have access to your Amazon S3 or Amazon EFS resources over the enabled protocols using Transfer Family. If you know the group name, you can view the SID values by running the following command using Windows PowerShell.  Get-ADGroup -Filter {samAccountName -like "YourGroupName*"} -Properties * | Select SamAccountName,ObjectSid  In that command, replace YourGroupName with the name of your Active Directory group. The regular expression used to validate this parameter is a string of characters consisting of uppercase and lowercase alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@:/-
    */
  var ExternalId: typingsJapgolly.awsSdk.clientsTransferMod.ExternalId
  
  /**
    * The landing directory (folder) for a user when they log in to the server using the client. A HomeDirectory example is /bucket_name/home/mydirectory.
    */
  var HomeDirectory: js.UndefOr[typingsJapgolly.awsSdk.clientsTransferMod.HomeDirectory] = js.undefined
  
  /**
    * Logical directory mappings that specify what Amazon S3 or Amazon EFS paths and keys should be visible to your user and how you want to make them visible. You must specify the Entry and Target pair, where Entry shows how the path is made visible and Target is the actual Amazon S3 or Amazon EFS path. If you only specify a target, it is displayed as is. You also must ensure that your Identity and Access Management (IAM) role provides access to paths in Target. This value can be set only when HomeDirectoryType is set to LOGICAL. The following is an Entry and Target pair example.  [ { "Entry": "/directory1", "Target": "/bucket_name/home/mydirectory" } ]  In most cases, you can use this value instead of the session policy to lock down your user to the designated home directory ("chroot"). To do this, you can set Entry to / and set Target to the HomeDirectory parameter value. The following is an Entry and Target pair example for chroot.  [ { "Entry": "/", "Target": "/bucket_name/home/mydirectory" } ] 
    */
  var HomeDirectoryMappings: js.UndefOr[typingsJapgolly.awsSdk.clientsTransferMod.HomeDirectoryMappings] = js.undefined
  
  /**
    * The type of landing directory (folder) that you want your users' home directory to be when they log in to the server. If you set it to PATH, the user will see the absolute Amazon S3 bucket or EFS paths as is in their file transfer protocol clients. If you set it LOGICAL, you need to provide mappings in the HomeDirectoryMappings for how you want to make Amazon S3 or Amazon EFS paths visible to your users.
    */
  var HomeDirectoryType: js.UndefOr[typingsJapgolly.awsSdk.clientsTransferMod.HomeDirectoryType] = js.undefined
  
  /**
    * A session policy for your user so that you can use the same Identity and Access Management (IAM) role across multiple users. This policy scopes down a user's access to portions of their Amazon S3 bucket. Variables that you can use inside this policy include ${Transfer:UserName}, ${Transfer:HomeDirectory}, and ${Transfer:HomeBucket}.  This policy applies only when the domain of ServerId is Amazon S3. Amazon EFS does not use session policies. For session policies, Transfer Family stores the policy as a JSON blob, instead of the Amazon Resource Name (ARN) of the policy. You save the policy as a JSON blob and pass it in the Policy argument. For an example of a session policy, see Example session policy. For more information, see AssumeRole in the Security Token Service API Reference. 
    */
  var Policy: js.UndefOr[typingsJapgolly.awsSdk.clientsTransferMod.Policy] = js.undefined
  
  var PosixProfile: js.UndefOr[typingsJapgolly.awsSdk.clientsTransferMod.PosixProfile] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that controls your users' access to your Amazon S3 bucket or Amazon EFS file system. The policies attached to this role determine the level of access that you want to provide your users when transferring files into and out of your Amazon S3 bucket or Amazon EFS file system. The IAM role should also contain a trust relationship that allows the server to access your resources when servicing your users' transfer requests.
    */
  var Role: typingsJapgolly.awsSdk.clientsTransferMod.Role
  
  /**
    * A system-assigned unique identifier for a server instance. This is the specific server that you added your user to.
    */
  var ServerId: typingsJapgolly.awsSdk.clientsTransferMod.ServerId
}
object CreateAccessRequest {
  
  inline def apply(ExternalId: ExternalId, Role: Role, ServerId: ServerId): CreateAccessRequest = {
    val __obj = js.Dynamic.literal(ExternalId = ExternalId.asInstanceOf[js.Any], Role = Role.asInstanceOf[js.Any], ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccessRequest]
  }
  
  extension [Self <: CreateAccessRequest](x: Self) {
    
    inline def setExternalId(value: ExternalId): Self = StObject.set(x, "ExternalId", value.asInstanceOf[js.Any])
    
    inline def setHomeDirectory(value: HomeDirectory): Self = StObject.set(x, "HomeDirectory", value.asInstanceOf[js.Any])
    
    inline def setHomeDirectoryMappings(value: HomeDirectoryMappings): Self = StObject.set(x, "HomeDirectoryMappings", value.asInstanceOf[js.Any])
    
    inline def setHomeDirectoryMappingsUndefined: Self = StObject.set(x, "HomeDirectoryMappings", js.undefined)
    
    inline def setHomeDirectoryMappingsVarargs(value: HomeDirectoryMapEntry*): Self = StObject.set(x, "HomeDirectoryMappings", js.Array(value*))
    
    inline def setHomeDirectoryType(value: HomeDirectoryType): Self = StObject.set(x, "HomeDirectoryType", value.asInstanceOf[js.Any])
    
    inline def setHomeDirectoryTypeUndefined: Self = StObject.set(x, "HomeDirectoryType", js.undefined)
    
    inline def setHomeDirectoryUndefined: Self = StObject.set(x, "HomeDirectory", js.undefined)
    
    inline def setPolicy(value: Policy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
    
    inline def setPosixProfile(value: PosixProfile): Self = StObject.set(x, "PosixProfile", value.asInstanceOf[js.Any])
    
    inline def setPosixProfileUndefined: Self = StObject.set(x, "PosixProfile", js.undefined)
    
    inline def setRole(value: Role): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
  }
}
