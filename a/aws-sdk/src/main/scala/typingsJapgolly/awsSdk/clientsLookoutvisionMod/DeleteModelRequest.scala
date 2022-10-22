package typingsJapgolly.awsSdk.clientsLookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteModelRequest extends StObject {
  
  /**
    * ClientToken is an idempotency token that ensures a call to DeleteModel completes only once. You choose the value to pass. For example, an issue might prevent you from getting a response from DeleteModel. In this case, safely retry your call to DeleteModel by using the same ClientToken parameter value. If you don't supply a value for ClientToken, the AWS SDK you are using inserts a value for you. This prevents retries after a network error from making multiple model deletion requests. You'll need to provide your own value for other use cases.  An error occurs if the other input parameters are not the same as in the first request. Using a different value for ClientToken is considered a new call to DeleteModel. An idempotency token is active for 8 hours.
    */
  var ClientToken: js.UndefOr[typingsJapgolly.awsSdk.clientsLookoutvisionMod.ClientToken] = js.undefined
  
  /**
    * The version of the model that you want to delete.
    */
  var ModelVersion: ModelVersionNoLatest
  
  /**
    * The name of the project that contains the model that you want to delete.
    */
  var ProjectName: typingsJapgolly.awsSdk.clientsLookoutvisionMod.ProjectName
}
object DeleteModelRequest {
  
  inline def apply(ModelVersion: ModelVersionNoLatest, ProjectName: ProjectName): DeleteModelRequest = {
    val __obj = js.Dynamic.literal(ModelVersion = ModelVersion.asInstanceOf[js.Any], ProjectName = ProjectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteModelRequest]
  }
  
  extension [Self <: DeleteModelRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setModelVersion(value: ModelVersionNoLatest): Self = StObject.set(x, "ModelVersion", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: ProjectName): Self = StObject.set(x, "ProjectName", value.asInstanceOf[js.Any])
  }
}
