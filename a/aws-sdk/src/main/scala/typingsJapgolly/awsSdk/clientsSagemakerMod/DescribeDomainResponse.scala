package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainResponse extends StObject {
  
  /**
    * Specifies the VPC used for non-EFS traffic. The default value is PublicInternetOnly.    PublicInternetOnly - Non-EFS traffic is through a VPC managed by Amazon SageMaker, which allows direct internet access    VpcOnly - All Studio traffic is through the specified VPC and subnets  
    */
  var AppNetworkAccessType: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.AppNetworkAccessType] = js.undefined
  
  /**
    * The entity that creates and manages the required security groups for inter-app communication in VPCOnly mode. Required when CreateDomain.AppNetworkAccessType is VPCOnly and DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn is provided.
    */
  var AppSecurityGroupManagement: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.AppSecurityGroupManagement] = js.undefined
  
  /**
    * The domain's authentication mode.
    */
  var AuthMode: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.AuthMode] = js.undefined
  
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Settings which are applied to UserProfiles in this domain if settings are not explicitly specified in a given UserProfile. 
    */
  var DefaultUserSettings: js.UndefOr[UserSettings] = js.undefined
  
  /**
    * The domain's Amazon Resource Name (ARN).
    */
  var DomainArn: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.DomainArn] = js.undefined
  
  /**
    * The domain ID.
    */
  var DomainId: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.DomainId] = js.undefined
  
  /**
    * The domain name.
    */
  var DomainName: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.DomainName] = js.undefined
  
  /**
    * A collection of Domain settings.
    */
  var DomainSettings: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.DomainSettings] = js.undefined
  
  /**
    * The failure reason.
    */
  var FailureReason: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.FailureReason] = js.undefined
  
  /**
    * The ID of the Amazon Elastic File System (EFS) managed by this Domain.
    */
  var HomeEfsFileSystemId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * Use KmsKeyId.
    */
  var HomeEfsFileSystemKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  
  /**
    * The Amazon Web Services KMS customer managed key used to encrypt the EFS volume attached to the domain.
    */
  var KmsKeyId: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.KmsKeyId] = js.undefined
  
  /**
    * The last modified time.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the security group that authorizes traffic between the RSessionGateway apps and the RStudioServerPro app.
    */
  var SecurityGroupIdForDomainBoundary: js.UndefOr[SecurityGroupId] = js.undefined
  
  /**
    * The IAM Identity Center managed application instance ID.
    */
  var SingleSignOnManagedApplicationInstanceId: js.UndefOr[String256] = js.undefined
  
  /**
    * The status.
    */
  var Status: js.UndefOr[DomainStatus] = js.undefined
  
  /**
    * The VPC subnets that Studio uses for communication.
    */
  var SubnetIds: js.UndefOr[Subnets] = js.undefined
  
  /**
    * The domain's URL.
    */
  var Url: js.UndefOr[String1024] = js.undefined
  
  /**
    * The ID of the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
    */
  var VpcId: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.VpcId] = js.undefined
}
object DescribeDomainResponse {
  
  inline def apply(): DescribeDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDomainResponse]
  }
  
  extension [Self <: DescribeDomainResponse](x: Self) {
    
    inline def setAppNetworkAccessType(value: AppNetworkAccessType): Self = StObject.set(x, "AppNetworkAccessType", value.asInstanceOf[js.Any])
    
    inline def setAppNetworkAccessTypeUndefined: Self = StObject.set(x, "AppNetworkAccessType", js.undefined)
    
    inline def setAppSecurityGroupManagement(value: AppSecurityGroupManagement): Self = StObject.set(x, "AppSecurityGroupManagement", value.asInstanceOf[js.Any])
    
    inline def setAppSecurityGroupManagementUndefined: Self = StObject.set(x, "AppSecurityGroupManagement", js.undefined)
    
    inline def setAuthMode(value: AuthMode): Self = StObject.set(x, "AuthMode", value.asInstanceOf[js.Any])
    
    inline def setAuthModeUndefined: Self = StObject.set(x, "AuthMode", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDefaultUserSettings(value: UserSettings): Self = StObject.set(x, "DefaultUserSettings", value.asInstanceOf[js.Any])
    
    inline def setDefaultUserSettingsUndefined: Self = StObject.set(x, "DefaultUserSettings", js.undefined)
    
    inline def setDomainArn(value: DomainArn): Self = StObject.set(x, "DomainArn", value.asInstanceOf[js.Any])
    
    inline def setDomainArnUndefined: Self = StObject.set(x, "DomainArn", js.undefined)
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setDomainIdUndefined: Self = StObject.set(x, "DomainId", js.undefined)
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    inline def setDomainSettings(value: DomainSettings): Self = StObject.set(x, "DomainSettings", value.asInstanceOf[js.Any])
    
    inline def setDomainSettingsUndefined: Self = StObject.set(x, "DomainSettings", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setHomeEfsFileSystemId(value: ResourceId): Self = StObject.set(x, "HomeEfsFileSystemId", value.asInstanceOf[js.Any])
    
    inline def setHomeEfsFileSystemIdUndefined: Self = StObject.set(x, "HomeEfsFileSystemId", js.undefined)
    
    inline def setHomeEfsFileSystemKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "HomeEfsFileSystemKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setHomeEfsFileSystemKmsKeyIdUndefined: Self = StObject.set(x, "HomeEfsFileSystemKmsKeyId", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setSecurityGroupIdForDomainBoundary(value: SecurityGroupId): Self = StObject.set(x, "SecurityGroupIdForDomainBoundary", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdForDomainBoundaryUndefined: Self = StObject.set(x, "SecurityGroupIdForDomainBoundary", js.undefined)
    
    inline def setSingleSignOnManagedApplicationInstanceId(value: String256): Self = StObject.set(x, "SingleSignOnManagedApplicationInstanceId", value.asInstanceOf[js.Any])
    
    inline def setSingleSignOnManagedApplicationInstanceIdUndefined: Self = StObject.set(x, "SingleSignOnManagedApplicationInstanceId", js.undefined)
    
    inline def setStatus(value: DomainStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setSubnetIds(value: Subnets): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
    
    inline def setUrl(value: String1024): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
