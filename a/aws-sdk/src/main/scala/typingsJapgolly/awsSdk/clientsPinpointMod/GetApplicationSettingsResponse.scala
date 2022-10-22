package typingsJapgolly.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApplicationSettingsResponse extends StObject {
  
  var ApplicationSettingsResource: typingsJapgolly.awsSdk.clientsPinpointMod.ApplicationSettingsResource
}
object GetApplicationSettingsResponse {
  
  inline def apply(ApplicationSettingsResource: ApplicationSettingsResource): GetApplicationSettingsResponse = {
    val __obj = js.Dynamic.literal(ApplicationSettingsResource = ApplicationSettingsResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApplicationSettingsResponse]
  }
  
  extension [Self <: GetApplicationSettingsResponse](x: Self) {
    
    inline def setApplicationSettingsResource(value: ApplicationSettingsResource): Self = StObject.set(x, "ApplicationSettingsResource", value.asInstanceOf[js.Any])
  }
}
