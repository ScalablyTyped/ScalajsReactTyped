package typingsJapgolly.awsSdk.clientsEmrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartApplicationRequest extends StObject {
  
  /**
    * The ID of the application to start.
    */
  var applicationId: ApplicationId
}
object StartApplicationRequest {
  
  inline def apply(applicationId: ApplicationId): StartApplicationRequest = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartApplicationRequest]
  }
  
  extension [Self <: StartApplicationRequest](x: Self) {
    
    inline def setApplicationId(value: ApplicationId): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
  }
}
