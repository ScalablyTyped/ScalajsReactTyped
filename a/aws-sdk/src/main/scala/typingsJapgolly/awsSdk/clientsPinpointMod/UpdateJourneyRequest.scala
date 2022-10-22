package typingsJapgolly.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateJourneyRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
  
  /**
    * The unique identifier for the journey.
    */
  var JourneyId: string
  
  var WriteJourneyRequest: typingsJapgolly.awsSdk.clientsPinpointMod.WriteJourneyRequest
}
object UpdateJourneyRequest {
  
  inline def apply(ApplicationId: string, JourneyId: string, WriteJourneyRequest: WriteJourneyRequest): UpdateJourneyRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], JourneyId = JourneyId.asInstanceOf[js.Any], WriteJourneyRequest = WriteJourneyRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJourneyRequest]
  }
  
  extension [Self <: UpdateJourneyRequest](x: Self) {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setJourneyId(value: string): Self = StObject.set(x, "JourneyId", value.asInstanceOf[js.Any])
    
    inline def setWriteJourneyRequest(value: WriteJourneyRequest): Self = StObject.set(x, "WriteJourneyRequest", value.asInstanceOf[js.Any])
  }
}
