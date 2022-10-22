package typingsJapgolly.awsSdk.clientsMigrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEnvironmentResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the environment.
    */
  var Arn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * A timestamp that indicates when the environment is created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A description of the environment.
    */
  var Description: js.UndefOr[typingsJapgolly.awsSdk.clientsMigrationhubrefactorspacesMod.Description] = js.undefined
  
  /**
    * The unique identifier of the environment.
    */
  var EnvironmentId: js.UndefOr[typingsJapgolly.awsSdk.clientsMigrationhubrefactorspacesMod.EnvironmentId] = js.undefined
  
  /**
    * A timestamp that indicates when the environment was last updated. 
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the environment.
    */
  var Name: js.UndefOr[EnvironmentName] = js.undefined
  
  /**
    * The network fabric type of the environment.
    */
  var NetworkFabricType: js.UndefOr[typingsJapgolly.awsSdk.clientsMigrationhubrefactorspacesMod.NetworkFabricType] = js.undefined
  
  /**
    * The Amazon Web Services account ID of environment owner.
    */
  var OwnerAccountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The current state of the environment. 
    */
  var State: js.UndefOr[EnvironmentState] = js.undefined
  
  /**
    * The tags assigned to the created environment. A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key-value pair..
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateEnvironmentResponse {
  
  inline def apply(): CreateEnvironmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEnvironmentResponse]
  }
  
  extension [Self <: CreateEnvironmentResponse](x: Self) {
    
    inline def setArn(value: ResourceArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEnvironmentId(value: EnvironmentId): Self = StObject.set(x, "EnvironmentId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentIdUndefined: Self = StObject.set(x, "EnvironmentId", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setName(value: EnvironmentName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNetworkFabricType(value: NetworkFabricType): Self = StObject.set(x, "NetworkFabricType", value.asInstanceOf[js.Any])
    
    inline def setNetworkFabricTypeUndefined: Self = StObject.set(x, "NetworkFabricType", js.undefined)
    
    inline def setOwnerAccountId(value: AccountId): Self = StObject.set(x, "OwnerAccountId", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccountIdUndefined: Self = StObject.set(x, "OwnerAccountId", js.undefined)
    
    inline def setState(value: EnvironmentState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
