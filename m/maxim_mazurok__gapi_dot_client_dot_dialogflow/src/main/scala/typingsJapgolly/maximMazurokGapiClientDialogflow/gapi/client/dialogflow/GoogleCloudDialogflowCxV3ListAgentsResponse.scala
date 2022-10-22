package typingsJapgolly.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3ListAgentsResponse extends StObject {
  
  /** The list of agents. There will be a maximum number of items returned based on the page_size field in the request. */
  var agents: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3Agent]] = js.undefined
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3ListAgentsResponse {
  
  inline def apply(): GoogleCloudDialogflowCxV3ListAgentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ListAgentsResponse]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3ListAgentsResponse](x: Self) {
    
    inline def setAgents(value: js.Array[GoogleCloudDialogflowCxV3Agent]): Self = StObject.set(x, "agents", value.asInstanceOf[js.Any])
    
    inline def setAgentsUndefined: Self = StObject.set(x, "agents", js.undefined)
    
    inline def setAgentsVarargs(value: GoogleCloudDialogflowCxV3Agent*): Self = StObject.set(x, "agents", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
