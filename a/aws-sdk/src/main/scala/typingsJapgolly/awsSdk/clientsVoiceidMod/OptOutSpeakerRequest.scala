package typingsJapgolly.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptOutSpeakerRequest extends StObject {
  
  /**
    * The identifier of the domain containing the speaker.
    */
  var DomainId: typingsJapgolly.awsSdk.clientsVoiceidMod.DomainId
  
  /**
    * The identifier of the speaker you want opted-out.
    */
  var SpeakerId: typingsJapgolly.awsSdk.clientsVoiceidMod.SpeakerId
}
object OptOutSpeakerRequest {
  
  inline def apply(DomainId: DomainId, SpeakerId: SpeakerId): OptOutSpeakerRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any], SpeakerId = SpeakerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptOutSpeakerRequest]
  }
  
  extension [Self <: OptOutSpeakerRequest](x: Self) {
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setSpeakerId(value: SpeakerId): Self = StObject.set(x, "SpeakerId", value.asInstanceOf[js.Any])
  }
}
