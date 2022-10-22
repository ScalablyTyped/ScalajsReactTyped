package typingsJapgolly.awsSdk.clientsLookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProjectRequest extends StObject {
  
  /**
    * ClientToken is an idempotency token that ensures a call to CreateProject completes only once. You choose the value to pass. For example, An issue might prevent you from getting a response from CreateProject. In this case, safely retry your call to CreateProject by using the same ClientToken parameter value.  If you don't supply a value for ClientToken, the AWS SDK you are using inserts a value for you. This prevents retries after a network error from making multiple project creation requests. You'll need to provide your own value for other use cases.  An error occurs if the other input parameters are not the same as in the first request. Using a different value for ClientToken is considered a new call to CreateProject. An idempotency token is active for 8 hours.
    */
  var ClientToken: js.UndefOr[typingsJapgolly.awsSdk.clientsLookoutvisionMod.ClientToken] = js.undefined
  
  /**
    * The name for the project.
    */
  var ProjectName: typingsJapgolly.awsSdk.clientsLookoutvisionMod.ProjectName
}
object CreateProjectRequest {
  
  inline def apply(ProjectName: ProjectName): CreateProjectRequest = {
    val __obj = js.Dynamic.literal(ProjectName = ProjectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectRequest]
  }
  
  extension [Self <: CreateProjectRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setProjectName(value: ProjectName): Self = StObject.set(x, "ProjectName", value.asInstanceOf[js.Any])
  }
}
