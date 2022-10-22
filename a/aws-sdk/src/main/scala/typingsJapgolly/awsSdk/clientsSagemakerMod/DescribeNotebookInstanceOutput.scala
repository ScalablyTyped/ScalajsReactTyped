package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNotebookInstanceOutput extends StObject {
  
  /**
    * A list of the Elastic Inference (EI) instance types associated with this notebook instance. Currently only one EI instance type can be associated with a notebook instance. For more information, see Using Elastic Inference in Amazon SageMaker.
    */
  var AcceleratorTypes: js.UndefOr[NotebookInstanceAcceleratorTypes] = js.undefined
  
  /**
    * An array of up to three Git repositories associated with the notebook instance. These can be either the names of Git repositories stored as resources in your account, or the URL of Git repositories in Amazon Web Services CodeCommit or in any other Git repository. These repositories are cloned at the same level as the default repository of your notebook instance. For more information, see Associating Git Repositories with SageMaker Notebook Instances.
    */
  var AdditionalCodeRepositories: js.UndefOr[AdditionalCodeRepositoryNamesOrUrls] = js.undefined
  
  /**
    * A timestamp. Use this parameter to return the time when the notebook instance was created
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Git repository associated with the notebook instance as its default code repository. This can be either the name of a Git repository stored as a resource in your account, or the URL of a Git repository in Amazon Web Services CodeCommit or in any other Git repository. When you open a notebook instance, it opens in the directory that contains this repository. For more information, see Associating Git Repositories with SageMaker Notebook Instances.
    */
  var DefaultCodeRepository: js.UndefOr[CodeRepositoryNameOrUrl] = js.undefined
  
  /**
    * Describes whether SageMaker provides internet access to the notebook instance. If this value is set to Disabled, the notebook instance does not have internet access, and cannot connect to SageMaker training and endpoint services. For more information, see Notebook Instances Are Internet-Enabled by Default.
    */
  var DirectInternetAccess: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.DirectInternetAccess] = js.undefined
  
  /**
    * If status is Failed, the reason it failed.
    */
  var FailureReason: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.FailureReason] = js.undefined
  
  /**
    * Information on the IMDS configuration of the notebook instance
    */
  var InstanceMetadataServiceConfiguration: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.InstanceMetadataServiceConfiguration] = js.undefined
  
  /**
    * The type of ML compute instance running on the notebook instance.
    */
  var InstanceType: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.InstanceType] = js.undefined
  
  /**
    * The Amazon Web Services KMS key ID SageMaker uses to encrypt data when storing it on the ML storage volume attached to the instance. 
    */
  var KmsKeyId: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.KmsKeyId] = js.undefined
  
  /**
    * A timestamp. Use this parameter to retrieve the time when the notebook instance was last modified. 
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The network interface IDs that SageMaker created at the time of creating the instance. 
    */
  var NetworkInterfaceId: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.NetworkInterfaceId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the notebook instance.
    */
  var NotebookInstanceArn: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.NotebookInstanceArn] = js.undefined
  
  /**
    * Returns the name of a notebook instance lifecycle configuration. For information about notebook instance lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance 
    */
  var NotebookInstanceLifecycleConfigName: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.NotebookInstanceLifecycleConfigName] = js.undefined
  
  /**
    * The name of the SageMaker notebook instance. 
    */
  var NotebookInstanceName: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.NotebookInstanceName] = js.undefined
  
  /**
    * The status of the notebook instance.
    */
  var NotebookInstanceStatus: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.NotebookInstanceStatus] = js.undefined
  
  /**
    * The platform identifier of the notebook instance runtime environment.
    */
  var PlatformIdentifier: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.PlatformIdentifier] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role associated with the instance. 
    */
  var RoleArn: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.RoleArn] = js.undefined
  
  /**
    * Whether root access is enabled or disabled for users of the notebook instance.  Lifecycle configurations need root access to be able to set up a notebook instance. Because of this, lifecycle configurations associated with a notebook instance always run with root access even if you disable root access for users. 
    */
  var RootAccess: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.RootAccess] = js.undefined
  
  /**
    * The IDs of the VPC security groups.
    */
  var SecurityGroups: js.UndefOr[SecurityGroupIds] = js.undefined
  
  /**
    * The ID of the VPC subnet.
    */
  var SubnetId: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.SubnetId] = js.undefined
  
  /**
    * The URL that you use to connect to the Jupyter notebook that is running in your notebook instance. 
    */
  var Url: js.UndefOr[NotebookInstanceUrl] = js.undefined
  
  /**
    * The size, in GB, of the ML storage volume attached to the notebook instance.
    */
  var VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB] = js.undefined
}
object DescribeNotebookInstanceOutput {
  
  inline def apply(): DescribeNotebookInstanceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNotebookInstanceOutput]
  }
  
  extension [Self <: DescribeNotebookInstanceOutput](x: Self) {
    
    inline def setAcceleratorTypes(value: NotebookInstanceAcceleratorTypes): Self = StObject.set(x, "AcceleratorTypes", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorTypesUndefined: Self = StObject.set(x, "AcceleratorTypes", js.undefined)
    
    inline def setAcceleratorTypesVarargs(value: NotebookInstanceAcceleratorType*): Self = StObject.set(x, "AcceleratorTypes", js.Array(value*))
    
    inline def setAdditionalCodeRepositories(value: AdditionalCodeRepositoryNamesOrUrls): Self = StObject.set(x, "AdditionalCodeRepositories", value.asInstanceOf[js.Any])
    
    inline def setAdditionalCodeRepositoriesUndefined: Self = StObject.set(x, "AdditionalCodeRepositories", js.undefined)
    
    inline def setAdditionalCodeRepositoriesVarargs(value: CodeRepositoryNameOrUrl*): Self = StObject.set(x, "AdditionalCodeRepositories", js.Array(value*))
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDefaultCodeRepository(value: CodeRepositoryNameOrUrl): Self = StObject.set(x, "DefaultCodeRepository", value.asInstanceOf[js.Any])
    
    inline def setDefaultCodeRepositoryUndefined: Self = StObject.set(x, "DefaultCodeRepository", js.undefined)
    
    inline def setDirectInternetAccess(value: DirectInternetAccess): Self = StObject.set(x, "DirectInternetAccess", value.asInstanceOf[js.Any])
    
    inline def setDirectInternetAccessUndefined: Self = StObject.set(x, "DirectInternetAccess", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setInstanceMetadataServiceConfiguration(value: InstanceMetadataServiceConfiguration): Self = StObject.set(x, "InstanceMetadataServiceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setInstanceMetadataServiceConfigurationUndefined: Self = StObject.set(x, "InstanceMetadataServiceConfiguration", js.undefined)
    
    inline def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setNetworkInterfaceId(value: NetworkInterfaceId): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    
    inline def setNotebookInstanceArn(value: NotebookInstanceArn): Self = StObject.set(x, "NotebookInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setNotebookInstanceArnUndefined: Self = StObject.set(x, "NotebookInstanceArn", js.undefined)
    
    inline def setNotebookInstanceLifecycleConfigName(value: NotebookInstanceLifecycleConfigName): Self = StObject.set(x, "NotebookInstanceLifecycleConfigName", value.asInstanceOf[js.Any])
    
    inline def setNotebookInstanceLifecycleConfigNameUndefined: Self = StObject.set(x, "NotebookInstanceLifecycleConfigName", js.undefined)
    
    inline def setNotebookInstanceName(value: NotebookInstanceName): Self = StObject.set(x, "NotebookInstanceName", value.asInstanceOf[js.Any])
    
    inline def setNotebookInstanceNameUndefined: Self = StObject.set(x, "NotebookInstanceName", js.undefined)
    
    inline def setNotebookInstanceStatus(value: NotebookInstanceStatus): Self = StObject.set(x, "NotebookInstanceStatus", value.asInstanceOf[js.Any])
    
    inline def setNotebookInstanceStatusUndefined: Self = StObject.set(x, "NotebookInstanceStatus", js.undefined)
    
    inline def setPlatformIdentifier(value: PlatformIdentifier): Self = StObject.set(x, "PlatformIdentifier", value.asInstanceOf[js.Any])
    
    inline def setPlatformIdentifierUndefined: Self = StObject.set(x, "PlatformIdentifier", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setRootAccess(value: RootAccess): Self = StObject.set(x, "RootAccess", value.asInstanceOf[js.Any])
    
    inline def setRootAccessUndefined: Self = StObject.set(x, "RootAccess", js.undefined)
    
    inline def setSecurityGroups(value: SecurityGroupIds): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroups", js.Array(value*))
    
    inline def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    inline def setUrl(value: NotebookInstanceUrl): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
    
    inline def setVolumeSizeInGB(value: NotebookInstanceVolumeSizeInGB): Self = StObject.set(x, "VolumeSizeInGB", value.asInstanceOf[js.Any])
    
    inline def setVolumeSizeInGBUndefined: Self = StObject.set(x, "VolumeSizeInGB", js.undefined)
  }
}
