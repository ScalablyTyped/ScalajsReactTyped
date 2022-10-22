package typingsJapgolly.watsonDeveloperCloud.assistantV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Log. */
trait Log extends StObject {
  
  /** The language of the workspace where the message request was made. */
  var language: String
  
  /** A unique identifier for the logged event. */
  var log_id: String
  
  /** A request sent to the workspace, including the user input and context. */
  var request: MessageRequest
  
  /** The timestamp for receipt of the message. */
  var request_timestamp: String
  
  /** The response sent by the workspace, including the output text, detected intents and entities, and context. */
  var response: MessageResponse
  
  /** The timestamp for the system response to the message. */
  var response_timestamp: String
  
  /** The unique identifier of the workspace where the request was made. */
  var workspace_id: String
}
object Log {
  
  inline def apply(
    language: String,
    log_id: String,
    request: MessageRequest,
    request_timestamp: String,
    response: MessageResponse,
    response_timestamp: String,
    workspace_id: String
  ): Log = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], log_id = log_id.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], request_timestamp = request_timestamp.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], response_timestamp = response_timestamp.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Log]
  }
  
  extension [Self <: Log](x: Self) {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLog_id(value: String): Self = StObject.set(x, "log_id", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: MessageRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequest_timestamp(value: String): Self = StObject.set(x, "request_timestamp", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: MessageResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponse_timestamp(value: String): Self = StObject.set(x, "response_timestamp", value.asInstanceOf[js.Any])
    
    inline def setWorkspace_id(value: String): Self = StObject.set(x, "workspace_id", value.asInstanceOf[js.Any])
  }
}
