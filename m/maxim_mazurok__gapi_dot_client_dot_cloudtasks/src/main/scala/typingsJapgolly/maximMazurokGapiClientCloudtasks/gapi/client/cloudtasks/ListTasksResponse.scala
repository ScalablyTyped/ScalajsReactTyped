package typingsJapgolly.maximMazurokGapiClientCloudtasks.gapi.client.cloudtasks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTasksResponse extends StObject {
  
  /**
    * A token to retrieve next page of results. To return the next page of results, call ListTasks with this value as the page_token. If the next_page_token is empty, there are no more
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of tasks. */
  var tasks: js.UndefOr[js.Array[Task]] = js.undefined
}
object ListTasksResponse {
  
  inline def apply(): ListTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTasksResponse]
  }
  
  extension [Self <: ListTasksResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTasks(value: js.Array[Task]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
    
    inline def setTasksVarargs(value: Task*): Self = StObject.set(x, "tasks", js.Array(value*))
  }
}
