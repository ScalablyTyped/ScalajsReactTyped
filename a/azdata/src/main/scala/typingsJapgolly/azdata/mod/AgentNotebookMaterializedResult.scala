package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentNotebookMaterializedResult
  extends StObject
     with ResultStatus {
  
  var notebookMaterialized: String
}
object AgentNotebookMaterializedResult {
  
  inline def apply(errorMessage: String, notebookMaterialized: String, success: Boolean): AgentNotebookMaterializedResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], notebookMaterialized = notebookMaterialized.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentNotebookMaterializedResult]
  }
  
  extension [Self <: AgentNotebookMaterializedResult](x: Self) {
    
    inline def setNotebookMaterialized(value: String): Self = StObject.set(x, "notebookMaterialized", value.asInstanceOf[js.Any])
  }
}
