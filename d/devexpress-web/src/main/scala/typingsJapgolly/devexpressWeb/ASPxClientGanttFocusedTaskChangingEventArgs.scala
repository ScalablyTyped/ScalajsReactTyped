package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the FocusedTaskChanging event.
  */
trait ASPxClientGanttFocusedTaskChangingEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Returns the task key.
    */
  var key: Any
  
  /**
    * Returns the task data.
    */
  var values: Any
}
object ASPxClientGanttFocusedTaskChangingEventArgs {
  
  inline def apply(cancel: Boolean, key: Any, values: Any): ASPxClientGanttFocusedTaskChangingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGanttFocusedTaskChangingEventArgs]
  }
  
  extension [Self <: ASPxClientGanttFocusedTaskChangingEventArgs](x: Self) {
    
    inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
