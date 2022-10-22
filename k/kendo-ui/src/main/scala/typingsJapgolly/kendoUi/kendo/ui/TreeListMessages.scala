package typingsJapgolly.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeListMessages extends StObject {
  
  var commands: js.UndefOr[TreeListMessagesCommands] = js.undefined
  
  var loading: js.UndefOr[String] = js.undefined
  
  var noRows: js.UndefOr[String] = js.undefined
  
  var requestFailed: js.UndefOr[String] = js.undefined
  
  var retry: js.UndefOr[String] = js.undefined
}
object TreeListMessages {
  
  inline def apply(): TreeListMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeListMessages]
  }
  
  extension [Self <: TreeListMessages](x: Self) {
    
    inline def setCommands(value: TreeListMessagesCommands): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
    
    inline def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setNoRows(value: String): Self = StObject.set(x, "noRows", value.asInstanceOf[js.Any])
    
    inline def setNoRowsUndefined: Self = StObject.set(x, "noRows", js.undefined)
    
    inline def setRequestFailed(value: String): Self = StObject.set(x, "requestFailed", value.asInstanceOf[js.Any])
    
    inline def setRequestFailedUndefined: Self = StObject.set(x, "requestFailed", js.undefined)
    
    inline def setRetry(value: String): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
  }
}
