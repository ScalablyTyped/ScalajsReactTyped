package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentNotebooksResult
  extends StObject
     with ResultStatus {
  
  var notebooks: js.Array[AgentNotebookInfo]
}
object AgentNotebooksResult {
  
  inline def apply(errorMessage: String, notebooks: js.Array[AgentNotebookInfo], success: Boolean): AgentNotebooksResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], notebooks = notebooks.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentNotebooksResult]
  }
  
  extension [Self <: AgentNotebooksResult](x: Self) {
    
    inline def setNotebooks(value: js.Array[AgentNotebookInfo]): Self = StObject.set(x, "notebooks", value.asInstanceOf[js.Any])
    
    inline def setNotebooksVarargs(value: AgentNotebookInfo*): Self = StObject.set(x, "notebooks", js.Array(value*))
  }
}
