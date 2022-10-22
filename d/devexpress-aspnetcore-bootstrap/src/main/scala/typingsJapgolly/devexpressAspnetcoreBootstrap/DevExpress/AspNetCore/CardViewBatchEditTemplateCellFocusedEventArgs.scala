package typingsJapgolly.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardViewBatchEditTemplateCellFocusedEventArgs
  extends StObject
     with EventArgs {
  
  val column: BootstrapCardViewColumn
  
  var handled: Boolean
}
object CardViewBatchEditTemplateCellFocusedEventArgs {
  
  inline def apply(column: BootstrapCardViewColumn, handled: Boolean, sender: Control): CardViewBatchEditTemplateCellFocusedEventArgs = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardViewBatchEditTemplateCellFocusedEventArgs]
  }
  
  extension [Self <: CardViewBatchEditTemplateCellFocusedEventArgs](x: Self) {
    
    inline def setColumn(value: BootstrapCardViewColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
  }
}
