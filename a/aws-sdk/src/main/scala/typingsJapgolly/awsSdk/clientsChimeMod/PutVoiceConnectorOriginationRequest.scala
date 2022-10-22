package typingsJapgolly.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutVoiceConnectorOriginationRequest extends StObject {
  
  /**
    * The origination setting details to add.
    */
  var Origination: typingsJapgolly.awsSdk.clientsChimeMod.Origination
  
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString
}
object PutVoiceConnectorOriginationRequest {
  
  inline def apply(Origination: Origination, VoiceConnectorId: NonEmptyString): PutVoiceConnectorOriginationRequest = {
    val __obj = js.Dynamic.literal(Origination = Origination.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutVoiceConnectorOriginationRequest]
  }
  
  extension [Self <: PutVoiceConnectorOriginationRequest](x: Self) {
    
    inline def setOrigination(value: Origination): Self = StObject.set(x, "Origination", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
