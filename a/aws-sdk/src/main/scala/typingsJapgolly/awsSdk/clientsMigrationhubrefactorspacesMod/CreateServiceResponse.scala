package typingsJapgolly.awsSdk.clientsMigrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServiceResponse extends StObject {
  
  /**
    * The ID of the application that the created service belongs to. 
    */
  var ApplicationId: js.UndefOr[typingsJapgolly.awsSdk.clientsMigrationhubrefactorspacesMod.ApplicationId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the service.
    */
  var Arn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The Amazon Web Services account ID of the service creator.
    */
  var CreatedByAccountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * A timestamp that indicates when the service is created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the created service.
    */
  var Description: js.UndefOr[typingsJapgolly.awsSdk.clientsMigrationhubrefactorspacesMod.Description] = js.undefined
  
  /**
    * The endpoint type of the service.
    */
  var EndpointType: js.UndefOr[ServiceEndpointType] = js.undefined
  
  /**
    * The unique identifier of the environment.
    */
  var EnvironmentId: js.UndefOr[typingsJapgolly.awsSdk.clientsMigrationhubrefactorspacesMod.EnvironmentId] = js.undefined
  
  /**
    * The configuration for the Lambda endpoint type.
    */
  var LambdaEndpoint: js.UndefOr[LambdaEndpointInput] = js.undefined
  
  /**
    * A timestamp that indicates when the service was last updated. 
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the service.
    */
  var Name: js.UndefOr[ServiceName] = js.undefined
  
  /**
    * The Amazon Web Services account ID of the service owner.
    */
  var OwnerAccountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The unique identifier of the service.
    */
  var ServiceId: js.UndefOr[typingsJapgolly.awsSdk.clientsMigrationhubrefactorspacesMod.ServiceId] = js.undefined
  
  /**
    * The current state of the service. 
    */
  var State: js.UndefOr[ServiceState] = js.undefined
  
  /**
    * The tags assigned to the created service. A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key-value pair.. 
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The configuration for the URL endpoint type. 
    */
  var UrlEndpoint: js.UndefOr[UrlEndpointInput] = js.undefined
  
  /**
    * The ID of the VPC. 
    */
  var VpcId: js.UndefOr[typingsJapgolly.awsSdk.clientsMigrationhubrefactorspacesMod.VpcId] = js.undefined
}
object CreateServiceResponse {
  
  inline def apply(): CreateServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateServiceResponse]
  }
  
  extension [Self <: CreateServiceResponse](x: Self) {
    
    inline def setApplicationId(value: ApplicationId): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
    
    inline def setArn(value: ResourceArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreatedByAccountId(value: AccountId): Self = StObject.set(x, "CreatedByAccountId", value.asInstanceOf[js.Any])
    
    inline def setCreatedByAccountIdUndefined: Self = StObject.set(x, "CreatedByAccountId", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEndpointType(value: ServiceEndpointType): Self = StObject.set(x, "EndpointType", value.asInstanceOf[js.Any])
    
    inline def setEndpointTypeUndefined: Self = StObject.set(x, "EndpointType", js.undefined)
    
    inline def setEnvironmentId(value: EnvironmentId): Self = StObject.set(x, "EnvironmentId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentIdUndefined: Self = StObject.set(x, "EnvironmentId", js.undefined)
    
    inline def setLambdaEndpoint(value: LambdaEndpointInput): Self = StObject.set(x, "LambdaEndpoint", value.asInstanceOf[js.Any])
    
    inline def setLambdaEndpointUndefined: Self = StObject.set(x, "LambdaEndpoint", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setName(value: ServiceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOwnerAccountId(value: AccountId): Self = StObject.set(x, "OwnerAccountId", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccountIdUndefined: Self = StObject.set(x, "OwnerAccountId", js.undefined)
    
    inline def setServiceId(value: ServiceId): Self = StObject.set(x, "ServiceId", value.asInstanceOf[js.Any])
    
    inline def setServiceIdUndefined: Self = StObject.set(x, "ServiceId", js.undefined)
    
    inline def setState(value: ServiceState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setUrlEndpoint(value: UrlEndpointInput): Self = StObject.set(x, "UrlEndpoint", value.asInstanceOf[js.Any])
    
    inline def setUrlEndpointUndefined: Self = StObject.set(x, "UrlEndpoint", js.undefined)
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
