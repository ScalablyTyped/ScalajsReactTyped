package typingsJapgolly.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resource extends StObject {
  
  /**
    * The IAM access key details (IAM user information) of a user that engaged in the activity that prompted GuardDuty to generate a finding.
    */
  var AccessKeyDetails: js.UndefOr[typingsJapgolly.awsSdk.clientsGuarddutyMod.AccessKeyDetails] = js.undefined
  
  var ContainerDetails: js.UndefOr[Container] = js.undefined
  
  /**
    * Contains list of scanned and skipped EBS volumes with details.
    */
  var EbsVolumeDetails: js.UndefOr[typingsJapgolly.awsSdk.clientsGuarddutyMod.EbsVolumeDetails] = js.undefined
  
  /**
    * Contains information about the details of the ECS Cluster.
    */
  var EcsClusterDetails: js.UndefOr[typingsJapgolly.awsSdk.clientsGuarddutyMod.EcsClusterDetails] = js.undefined
  
  /**
    * Details about the EKS cluster involved in a Kubernetes finding.
    */
  var EksClusterDetails: js.UndefOr[typingsJapgolly.awsSdk.clientsGuarddutyMod.EksClusterDetails] = js.undefined
  
  /**
    * The information about the EC2 instance associated with the activity that prompted GuardDuty to generate a finding.
    */
  var InstanceDetails: js.UndefOr[typingsJapgolly.awsSdk.clientsGuarddutyMod.InstanceDetails] = js.undefined
  
  /**
    * Details about the Kubernetes user and workload involved in a Kubernetes finding.
    */
  var KubernetesDetails: js.UndefOr[typingsJapgolly.awsSdk.clientsGuarddutyMod.KubernetesDetails] = js.undefined
  
  /**
    * The type of Amazon Web Services resource.
    */
  var ResourceType: js.UndefOr[String] = js.undefined
  
  /**
    * Contains information on the S3 bucket.
    */
  var S3BucketDetails: js.UndefOr[typingsJapgolly.awsSdk.clientsGuarddutyMod.S3BucketDetails] = js.undefined
}
object Resource {
  
  inline def apply(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  
  extension [Self <: Resource](x: Self) {
    
    inline def setAccessKeyDetails(value: AccessKeyDetails): Self = StObject.set(x, "AccessKeyDetails", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyDetailsUndefined: Self = StObject.set(x, "AccessKeyDetails", js.undefined)
    
    inline def setContainerDetails(value: Container): Self = StObject.set(x, "ContainerDetails", value.asInstanceOf[js.Any])
    
    inline def setContainerDetailsUndefined: Self = StObject.set(x, "ContainerDetails", js.undefined)
    
    inline def setEbsVolumeDetails(value: EbsVolumeDetails): Self = StObject.set(x, "EbsVolumeDetails", value.asInstanceOf[js.Any])
    
    inline def setEbsVolumeDetailsUndefined: Self = StObject.set(x, "EbsVolumeDetails", js.undefined)
    
    inline def setEcsClusterDetails(value: EcsClusterDetails): Self = StObject.set(x, "EcsClusterDetails", value.asInstanceOf[js.Any])
    
    inline def setEcsClusterDetailsUndefined: Self = StObject.set(x, "EcsClusterDetails", js.undefined)
    
    inline def setEksClusterDetails(value: EksClusterDetails): Self = StObject.set(x, "EksClusterDetails", value.asInstanceOf[js.Any])
    
    inline def setEksClusterDetailsUndefined: Self = StObject.set(x, "EksClusterDetails", js.undefined)
    
    inline def setInstanceDetails(value: InstanceDetails): Self = StObject.set(x, "InstanceDetails", value.asInstanceOf[js.Any])
    
    inline def setInstanceDetailsUndefined: Self = StObject.set(x, "InstanceDetails", js.undefined)
    
    inline def setKubernetesDetails(value: KubernetesDetails): Self = StObject.set(x, "KubernetesDetails", value.asInstanceOf[js.Any])
    
    inline def setKubernetesDetailsUndefined: Self = StObject.set(x, "KubernetesDetails", js.undefined)
    
    inline def setResourceType(value: String): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setS3BucketDetails(value: S3BucketDetails): Self = StObject.set(x, "S3BucketDetails", value.asInstanceOf[js.Any])
    
    inline def setS3BucketDetailsUndefined: Self = StObject.set(x, "S3BucketDetails", js.undefined)
    
    inline def setS3BucketDetailsVarargs(value: S3BucketDetail*): Self = StObject.set(x, "S3BucketDetails", js.Array(value*))
  }
}
