package typingsJapgolly.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackResourceDetail extends StObject {
  
  /**
    * User defined description associated with the resource.
    */
  var Description: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.Description] = js.undefined
  
  /**
    * Information about whether the resource's actual configuration differs, or has drifted, from its expected configuration, as defined in the stack template and any values specified as template parameters. For more information, see Detecting Unregulated Configuration Changes to Stacks and Resources.
    */
  var DriftInformation: js.UndefOr[StackResourceDriftInformation] = js.undefined
  
  /**
    * Time the status was updated.
    */
  var LastUpdatedTimestamp: js.Date
  
  /**
    * The logical name of the resource specified in the template.
    */
  var LogicalResourceId: typingsJapgolly.awsSdk.clientsCloudformationMod.LogicalResourceId
  
  /**
    * The content of the Metadata attribute declared for the resource. For more information, see Metadata Attribute in the CloudFormation User Guide.
    */
  var Metadata: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.Metadata] = js.undefined
  
  /**
    * Contains information about the module from which the resource was created, if the resource was created from a module included in the stack template.
    */
  var ModuleInfo: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.ModuleInfo] = js.undefined
  
  /**
    * The name or unique identifier that corresponds to a physical instance ID of a resource supported by CloudFormation.
    */
  var PhysicalResourceId: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.PhysicalResourceId] = js.undefined
  
  /**
    * Current status of the resource.
    */
  var ResourceStatus: typingsJapgolly.awsSdk.clientsCloudformationMod.ResourceStatus
  
  /**
    * Success/failure message associated with the resource.
    */
  var ResourceStatusReason: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.ResourceStatusReason] = js.undefined
  
  /**
    * Type of resource. For more information, go to Amazon Web Services Resource Types Reference in the CloudFormation User Guide.
    */
  var ResourceType: typingsJapgolly.awsSdk.clientsCloudformationMod.ResourceType
  
  /**
    * Unique identifier of the stack.
    */
  var StackId: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.StackId] = js.undefined
  
  /**
    * The name associated with the stack.
    */
  var StackName: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.StackName] = js.undefined
}
object StackResourceDetail {
  
  inline def apply(
    LastUpdatedTimestamp: js.Date,
    LogicalResourceId: LogicalResourceId,
    ResourceStatus: ResourceStatus,
    ResourceType: ResourceType
  ): StackResourceDetail = {
    val __obj = js.Dynamic.literal(LastUpdatedTimestamp = LastUpdatedTimestamp.asInstanceOf[js.Any], LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], ResourceStatus = ResourceStatus.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackResourceDetail]
  }
  
  extension [Self <: StackResourceDetail](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDriftInformation(value: StackResourceDriftInformation): Self = StObject.set(x, "DriftInformation", value.asInstanceOf[js.Any])
    
    inline def setDriftInformationUndefined: Self = StObject.set(x, "DriftInformation", js.undefined)
    
    inline def setLastUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLogicalResourceId(value: LogicalResourceId): Self = StObject.set(x, "LogicalResourceId", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    inline def setModuleInfo(value: ModuleInfo): Self = StObject.set(x, "ModuleInfo", value.asInstanceOf[js.Any])
    
    inline def setModuleInfoUndefined: Self = StObject.set(x, "ModuleInfo", js.undefined)
    
    inline def setPhysicalResourceId(value: PhysicalResourceId): Self = StObject.set(x, "PhysicalResourceId", value.asInstanceOf[js.Any])
    
    inline def setPhysicalResourceIdUndefined: Self = StObject.set(x, "PhysicalResourceId", js.undefined)
    
    inline def setResourceStatus(value: ResourceStatus): Self = StObject.set(x, "ResourceStatus", value.asInstanceOf[js.Any])
    
    inline def setResourceStatusReason(value: ResourceStatusReason): Self = StObject.set(x, "ResourceStatusReason", value.asInstanceOf[js.Any])
    
    inline def setResourceStatusReasonUndefined: Self = StObject.set(x, "ResourceStatusReason", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setStackId(value: StackId): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    inline def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
    
    inline def setStackName(value: StackName): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
    
    inline def setStackNameUndefined: Self = StObject.set(x, "StackName", js.undefined)
  }
}
