package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateInstanceStorageConfigRequest extends StObject {
  
  /**
    * The existing association identifier that uniquely identifies the resource type and storage config for the given instance ID.
    */
  var AssociationId: typingsJapgolly.awsSdk.clientsConnectMod.AssociationId
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typingsJapgolly.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * A valid resource type.
    */
  var ResourceType: InstanceStorageResourceType
  
  var StorageConfig: InstanceStorageConfig
}
object UpdateInstanceStorageConfigRequest {
  
  inline def apply(
    AssociationId: AssociationId,
    InstanceId: InstanceId,
    ResourceType: InstanceStorageResourceType,
    StorageConfig: InstanceStorageConfig
  ): UpdateInstanceStorageConfigRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], StorageConfig = StorageConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInstanceStorageConfigRequest]
  }
  
  extension [Self <: UpdateInstanceStorageConfigRequest](x: Self) {
    
    inline def setAssociationId(value: AssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: InstanceStorageResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setStorageConfig(value: InstanceStorageConfig): Self = StObject.set(x, "StorageConfig", value.asInstanceOf[js.Any])
  }
}
