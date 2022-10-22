package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridView.BatchEditTemplateCellFocused event.
  */
trait ASPxClientGridViewBatchEditTemplateCellFocusedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the currently processed column.
    */
  var column: ASPxClientGridViewColumn
  
  /**
    * Gets or sets a value specifying whether the event was handled.
    */
  var handled: Boolean
}
object ASPxClientGridViewBatchEditTemplateCellFocusedEventArgs {
  
  inline def apply(column: ASPxClientGridViewColumn, handled: Boolean): ASPxClientGridViewBatchEditTemplateCellFocusedEventArgs = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewBatchEditTemplateCellFocusedEventArgs]
  }
  
  extension [Self <: ASPxClientGridViewBatchEditTemplateCellFocusedEventArgs](x: Self) {
    
    inline def setColumn(value: ASPxClientGridViewColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
  }
}
