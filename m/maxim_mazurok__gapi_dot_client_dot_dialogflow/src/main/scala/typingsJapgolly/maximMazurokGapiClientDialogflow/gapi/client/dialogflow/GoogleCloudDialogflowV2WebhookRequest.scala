package typingsJapgolly.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2WebhookRequest extends StObject {
  
  /** Optional. The contents of the original request that was passed to `[Streaming]DetectIntent` call. */
  var originalDetectIntentRequest: js.UndefOr[GoogleCloudDialogflowV2OriginalDetectIntentRequest] = js.undefined
  
  /** The result of the conversational query or event processing. Contains the same value as `[Streaming]DetectIntentResponse.query_result`. */
  var queryResult: js.UndefOr[GoogleCloudDialogflowV2QueryResult] = js.undefined
  
  /** The unique identifier of the response. Contains the same value as `[Streaming]DetectIntentResponse.response_id`. */
  var responseId: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier of detectIntent request session. Can be used to identify end-user inside webhook implementation. Format: `projects//agent/sessions/`, or
    * `projects//agent/environments//users//sessions/`.
    */
  var session: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2WebhookRequest {
  
  inline def apply(): GoogleCloudDialogflowV2WebhookRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2WebhookRequest]
  }
  
  extension [Self <: GoogleCloudDialogflowV2WebhookRequest](x: Self) {
    
    inline def setOriginalDetectIntentRequest(value: GoogleCloudDialogflowV2OriginalDetectIntentRequest): Self = StObject.set(x, "originalDetectIntentRequest", value.asInstanceOf[js.Any])
    
    inline def setOriginalDetectIntentRequestUndefined: Self = StObject.set(x, "originalDetectIntentRequest", js.undefined)
    
    inline def setQueryResult(value: GoogleCloudDialogflowV2QueryResult): Self = StObject.set(x, "queryResult", value.asInstanceOf[js.Any])
    
    inline def setQueryResultUndefined: Self = StObject.set(x, "queryResult", js.undefined)
    
    inline def setResponseId(value: String): Self = StObject.set(x, "responseId", value.asInstanceOf[js.Any])
    
    inline def setResponseIdUndefined: Self = StObject.set(x, "responseId", js.undefined)
    
    inline def setSession(value: String): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
