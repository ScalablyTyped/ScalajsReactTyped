package typingsJapgolly.awsSdk.clientsMigrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApplicationResponse extends StObject {
  
  /**
    * A wrapper object holding the API Gateway endpoint type and stage name for the proxy. 
    */
  var ApiGatewayProxy: js.UndefOr[ApiGatewayProxyInput] = js.undefined
  
  /**
    * The unique identifier of the application.
    */
  var ApplicationId: js.UndefOr[typingsJapgolly.awsSdk.clientsMigrationhubrefactorspacesMod.ApplicationId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the application. The format for this ARN is arn:aws:refactor-spaces:region:account-id:resource-type/resource-id . For more information about ARNs, see  Amazon Resource Names (ARNs) in the Amazon Web Services General Reference.
    */
  var Arn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The Amazon Web Services account ID of application creator.
    */
  var CreatedByAccountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * A timestamp that indicates when the application is created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the environment in which the application is created.
    */
  var EnvironmentId: js.UndefOr[typingsJapgolly.awsSdk.clientsMigrationhubrefactorspacesMod.EnvironmentId] = js.undefined
  
  /**
    * A timestamp that indicates when the application was last updated. 
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the application.
    */
  var Name: js.UndefOr[ApplicationName] = js.undefined
  
  /**
    * The Amazon Web Services account ID of the application owner (which is always the same as the environment owner account ID).
    */
  var OwnerAccountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The proxy type of the proxy created within the application. 
    */
  var ProxyType: js.UndefOr[typingsJapgolly.awsSdk.clientsMigrationhubrefactorspacesMod.ProxyType] = js.undefined
  
  /**
    * The current state of the application. 
    */
  var State: js.UndefOr[ApplicationState] = js.undefined
  
  /**
    * The tags assigned to the application. A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key-value pair. 
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The ID of the Amazon VPC. 
    */
  var VpcId: js.UndefOr[typingsJapgolly.awsSdk.clientsMigrationhubrefactorspacesMod.VpcId] = js.undefined
}
object CreateApplicationResponse {
  
  inline def apply(): CreateApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateApplicationResponse]
  }
  
  extension [Self <: CreateApplicationResponse](x: Self) {
    
    inline def setApiGatewayProxy(value: ApiGatewayProxyInput): Self = StObject.set(x, "ApiGatewayProxy", value.asInstanceOf[js.Any])
    
    inline def setApiGatewayProxyUndefined: Self = StObject.set(x, "ApiGatewayProxy", js.undefined)
    
    inline def setApplicationId(value: ApplicationId): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
    
    inline def setArn(value: ResourceArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreatedByAccountId(value: AccountId): Self = StObject.set(x, "CreatedByAccountId", value.asInstanceOf[js.Any])
    
    inline def setCreatedByAccountIdUndefined: Self = StObject.set(x, "CreatedByAccountId", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setEnvironmentId(value: EnvironmentId): Self = StObject.set(x, "EnvironmentId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentIdUndefined: Self = StObject.set(x, "EnvironmentId", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setName(value: ApplicationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOwnerAccountId(value: AccountId): Self = StObject.set(x, "OwnerAccountId", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccountIdUndefined: Self = StObject.set(x, "OwnerAccountId", js.undefined)
    
    inline def setProxyType(value: ProxyType): Self = StObject.set(x, "ProxyType", value.asInstanceOf[js.Any])
    
    inline def setProxyTypeUndefined: Self = StObject.set(x, "ProxyType", js.undefined)
    
    inline def setState(value: ApplicationState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
