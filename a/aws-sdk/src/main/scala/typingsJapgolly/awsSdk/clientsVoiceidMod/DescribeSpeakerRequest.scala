package typingsJapgolly.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSpeakerRequest extends StObject {
  
  /**
    * The identifier of the domain that contains the speaker.
    */
  var DomainId: typingsJapgolly.awsSdk.clientsVoiceidMod.DomainId
  
  /**
    * The identifier of the speaker you are describing.
    */
  var SpeakerId: typingsJapgolly.awsSdk.clientsVoiceidMod.SpeakerId
}
object DescribeSpeakerRequest {
  
  inline def apply(DomainId: DomainId, SpeakerId: SpeakerId): DescribeSpeakerRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any], SpeakerId = SpeakerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSpeakerRequest]
  }
  
  extension [Self <: DescribeSpeakerRequest](x: Self) {
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setSpeakerId(value: SpeakerId): Self = StObject.set(x, "SpeakerId", value.asInstanceOf[js.Any])
  }
}
