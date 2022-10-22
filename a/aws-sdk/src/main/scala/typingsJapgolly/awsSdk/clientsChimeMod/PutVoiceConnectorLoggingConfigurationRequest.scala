package typingsJapgolly.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutVoiceConnectorLoggingConfigurationRequest extends StObject {
  
  /**
    * The logging configuration details to add.
    */
  var LoggingConfiguration: typingsJapgolly.awsSdk.clientsChimeMod.LoggingConfiguration
  
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString
}
object PutVoiceConnectorLoggingConfigurationRequest {
  
  inline def apply(LoggingConfiguration: LoggingConfiguration, VoiceConnectorId: NonEmptyString): PutVoiceConnectorLoggingConfigurationRequest = {
    val __obj = js.Dynamic.literal(LoggingConfiguration = LoggingConfiguration.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutVoiceConnectorLoggingConfigurationRequest]
  }
  
  extension [Self <: PutVoiceConnectorLoggingConfigurationRequest](x: Self) {
    
    inline def setLoggingConfiguration(value: LoggingConfiguration): Self = StObject.set(x, "LoggingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
