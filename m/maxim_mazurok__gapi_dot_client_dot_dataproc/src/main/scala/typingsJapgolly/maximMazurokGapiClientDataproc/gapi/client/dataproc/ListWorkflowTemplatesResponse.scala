package typingsJapgolly.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkflowTemplatesResponse extends StObject {
  
  /**
    * Output only. This token is included in the response if there are more results to fetch. To fetch additional results, provide this value as the page_token in a subsequent
    * ListWorkflowTemplatesRequest.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Output only. WorkflowTemplates list. */
  var templates: js.UndefOr[js.Array[WorkflowTemplate]] = js.undefined
}
object ListWorkflowTemplatesResponse {
  
  inline def apply(): ListWorkflowTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkflowTemplatesResponse]
  }
  
  extension [Self <: ListWorkflowTemplatesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTemplates(value: js.Array[WorkflowTemplate]): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    inline def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
    
    inline def setTemplatesVarargs(value: WorkflowTemplate*): Self = StObject.set(x, "templates", js.Array(value*))
  }
}
