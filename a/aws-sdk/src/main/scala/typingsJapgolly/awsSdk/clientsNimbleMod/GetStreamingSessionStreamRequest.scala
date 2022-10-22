package typingsJapgolly.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStreamingSessionStreamRequest extends StObject {
  
  /**
    * The streaming session ID.
    */
  var sessionId: String
  
  /**
    * The streaming session stream ID.
    */
  var streamId: String
  
  /**
    * The studio ID. 
    */
  var studioId: String
}
object GetStreamingSessionStreamRequest {
  
  inline def apply(sessionId: String, streamId: String, studioId: String): GetStreamingSessionStreamRequest = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any], studioId = studioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStreamingSessionStreamRequest]
  }
  
  extension [Self <: GetStreamingSessionStreamRequest](x: Self) {
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setStreamId(value: String): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    inline def setStudioId(value: String): Self = StObject.set(x, "studioId", value.asInstanceOf[js.Any])
  }
}
