package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the ResourceInserting event.
  */
trait ASPxClientGanttResourceInsertingEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Specifies the resource values.
    */
  var values: Any
}
object ASPxClientGanttResourceInsertingEventArgs {
  
  inline def apply(cancel: Boolean, values: Any): ASPxClientGanttResourceInsertingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGanttResourceInsertingEventArgs]
  }
  
  extension [Self <: ASPxClientGanttResourceInsertingEventArgs](x: Self) {
    
    inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
