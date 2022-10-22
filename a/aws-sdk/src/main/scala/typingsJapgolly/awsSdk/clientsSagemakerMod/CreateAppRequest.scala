package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAppRequest extends StObject {
  
  /**
    * The name of the app.
    */
  var AppName: typingsJapgolly.awsSdk.clientsSagemakerMod.AppName
  
  /**
    * The type of app.
    */
  var AppType: typingsJapgolly.awsSdk.clientsSagemakerMod.AppType
  
  /**
    * The domain ID.
    */
  var DomainId: typingsJapgolly.awsSdk.clientsSagemakerMod.DomainId
  
  /**
    * The instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance.  The value of InstanceType passed as part of the ResourceSpec in the CreateApp call overrides the value passed as part of the ResourceSpec configured for the user profile or the domain. If InstanceType is not specified in any of those three ResourceSpec values for a KernelGateway app, the CreateApp call fails with a request validation error. 
    */
  var ResourceSpec: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.ResourceSpec] = js.undefined
  
  /**
    * Each tag consists of a key and an optional value. Tag keys must be unique per resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The user profile name.
    */
  var UserProfileName: typingsJapgolly.awsSdk.clientsSagemakerMod.UserProfileName
}
object CreateAppRequest {
  
  inline def apply(AppName: AppName, AppType: AppType, DomainId: DomainId, UserProfileName: UserProfileName): CreateAppRequest = {
    val __obj = js.Dynamic.literal(AppName = AppName.asInstanceOf[js.Any], AppType = AppType.asInstanceOf[js.Any], DomainId = DomainId.asInstanceOf[js.Any], UserProfileName = UserProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppRequest]
  }
  
  extension [Self <: CreateAppRequest](x: Self) {
    
    inline def setAppName(value: AppName): Self = StObject.set(x, "AppName", value.asInstanceOf[js.Any])
    
    inline def setAppType(value: AppType): Self = StObject.set(x, "AppType", value.asInstanceOf[js.Any])
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setResourceSpec(value: ResourceSpec): Self = StObject.set(x, "ResourceSpec", value.asInstanceOf[js.Any])
    
    inline def setResourceSpecUndefined: Self = StObject.set(x, "ResourceSpec", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setUserProfileName(value: UserProfileName): Self = StObject.set(x, "UserProfileName", value.asInstanceOf[js.Any])
  }
}
