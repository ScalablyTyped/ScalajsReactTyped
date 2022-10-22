package typingsJapgolly.azdata.mod.nb

import japgolly.scalajs.react.Callback
import typingsJapgolly.vscode.Thenable
import typingsJapgolly.vscode.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookExecuteProvider extends StObject {
  
  def getExecuteManager(notebookUri: Uri): Thenable[ExecuteManager]
  
  def handleNotebookClosed(notebookUri: Uri): Unit
  
  val providerId: String
}
object NotebookExecuteProvider {
  
  inline def apply(
    getExecuteManager: Uri => Thenable[ExecuteManager],
    handleNotebookClosed: Uri => Callback,
    providerId: String
  ): NotebookExecuteProvider = {
    val __obj = js.Dynamic.literal(getExecuteManager = js.Any.fromFunction1(getExecuteManager), handleNotebookClosed = js.Any.fromFunction1((t0: Uri) => handleNotebookClosed(t0).runNow()), providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookExecuteProvider]
  }
  
  extension [Self <: NotebookExecuteProvider](x: Self) {
    
    inline def setGetExecuteManager(value: Uri => Thenable[ExecuteManager]): Self = StObject.set(x, "getExecuteManager", js.Any.fromFunction1(value))
    
    inline def setHandleNotebookClosed(value: Uri => Callback): Self = StObject.set(x, "handleNotebookClosed", js.Any.fromFunction1((t0: Uri) => value(t0).runNow()))
    
    inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
  }
}
