package typingsJapgolly.awsSdk.clientsSmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAppValidationConfigurationRequest extends StObject {
  
  /**
    * The ID of the application.
    */
  var appId: AppIdWithValidation
}
object GetAppValidationConfigurationRequest {
  
  inline def apply(appId: AppIdWithValidation): GetAppValidationConfigurationRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppValidationConfigurationRequest]
  }
  
  extension [Self <: GetAppValidationConfigurationRequest](x: Self) {
    
    inline def setAppId(value: AppIdWithValidation): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
  }
}
