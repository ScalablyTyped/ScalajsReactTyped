package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUseCaseRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typingsJapgolly.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The identifier for the integration association.
    */
  var IntegrationAssociationId: typingsJapgolly.awsSdk.clientsConnectMod.IntegrationAssociationId
  
  /**
    * The identifier for the use case.
    */
  var UseCaseId: typingsJapgolly.awsSdk.clientsConnectMod.UseCaseId
}
object DeleteUseCaseRequest {
  
  inline def apply(InstanceId: InstanceId, IntegrationAssociationId: IntegrationAssociationId, UseCaseId: UseCaseId): DeleteUseCaseRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], IntegrationAssociationId = IntegrationAssociationId.asInstanceOf[js.Any], UseCaseId = UseCaseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUseCaseRequest]
  }
  
  extension [Self <: DeleteUseCaseRequest](x: Self) {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setIntegrationAssociationId(value: IntegrationAssociationId): Self = StObject.set(x, "IntegrationAssociationId", value.asInstanceOf[js.Any])
    
    inline def setUseCaseId(value: UseCaseId): Self = StObject.set(x, "UseCaseId", value.asInstanceOf[js.Any])
  }
}
