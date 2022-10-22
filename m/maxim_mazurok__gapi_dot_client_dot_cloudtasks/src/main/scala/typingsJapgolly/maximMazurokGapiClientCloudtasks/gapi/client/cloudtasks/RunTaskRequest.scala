package typingsJapgolly.maximMazurokGapiClientCloudtasks.gapi.client.cloudtasks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunTaskRequest extends StObject {
  
  /**
    * The response_view specifies which subset of the Task will be returned. By default response_view is BASIC; not all information is retrieved by default because some data, such as
    * payloads, might be desirable to return only when needed because of its large size or because of the sensitivity of data that it contains. Authorization for FULL requires
    * `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/) permission on the Task resource.
    */
  var responseView: js.UndefOr[String] = js.undefined
}
object RunTaskRequest {
  
  inline def apply(): RunTaskRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunTaskRequest]
  }
  
  extension [Self <: RunTaskRequest](x: Self) {
    
    inline def setResponseView(value: String): Self = StObject.set(x, "responseView", value.asInstanceOf[js.Any])
    
    inline def setResponseViewUndefined: Self = StObject.set(x, "responseView", js.undefined)
  }
}
