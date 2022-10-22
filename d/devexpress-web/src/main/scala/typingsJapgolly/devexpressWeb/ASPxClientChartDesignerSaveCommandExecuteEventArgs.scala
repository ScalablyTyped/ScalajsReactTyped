package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxClientChartDesignerSaveCommandExecuteEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  var handled: Boolean
}
object ASPxClientChartDesignerSaveCommandExecuteEventArgs {
  
  inline def apply(handled: Boolean): ASPxClientChartDesignerSaveCommandExecuteEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientChartDesignerSaveCommandExecuteEventArgs]
  }
  
  extension [Self <: ASPxClientChartDesignerSaveCommandExecuteEventArgs](x: Self) {
    
    inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
  }
}
