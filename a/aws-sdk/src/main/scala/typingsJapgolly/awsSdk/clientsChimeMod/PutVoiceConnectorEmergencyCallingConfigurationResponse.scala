package typingsJapgolly.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutVoiceConnectorEmergencyCallingConfigurationResponse extends StObject {
  
  /**
    * The emergency calling configuration details.
    */
  var EmergencyCallingConfiguration: js.UndefOr[typingsJapgolly.awsSdk.clientsChimeMod.EmergencyCallingConfiguration] = js.undefined
}
object PutVoiceConnectorEmergencyCallingConfigurationResponse {
  
  inline def apply(): PutVoiceConnectorEmergencyCallingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutVoiceConnectorEmergencyCallingConfigurationResponse]
  }
  
  extension [Self <: PutVoiceConnectorEmergencyCallingConfigurationResponse](x: Self) {
    
    inline def setEmergencyCallingConfiguration(value: EmergencyCallingConfiguration): Self = StObject.set(x, "EmergencyCallingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEmergencyCallingConfigurationUndefined: Self = StObject.set(x, "EmergencyCallingConfiguration", js.undefined)
  }
}
