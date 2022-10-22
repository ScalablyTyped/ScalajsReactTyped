package typingsJapgolly.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApplicationSettingsResponse extends StObject {
  
  var ApplicationSettingsResource: typingsJapgolly.awsSdk.clientsPinpointMod.ApplicationSettingsResource
}
object UpdateApplicationSettingsResponse {
  
  inline def apply(ApplicationSettingsResource: ApplicationSettingsResource): UpdateApplicationSettingsResponse = {
    val __obj = js.Dynamic.literal(ApplicationSettingsResource = ApplicationSettingsResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationSettingsResponse]
  }
  
  extension [Self <: UpdateApplicationSettingsResponse](x: Self) {
    
    inline def setApplicationSettingsResource(value: ApplicationSettingsResource): Self = StObject.set(x, "ApplicationSettingsResource", value.asInstanceOf[js.Any])
  }
}
