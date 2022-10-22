package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the ResourceDeleting event.
  */
trait ASPxClientGanttResourceDeletingEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Specifies the resource key.
    */
  var key: Any
  
  /**
    * Specifies the resource values.
    */
  var values: Any
}
object ASPxClientGanttResourceDeletingEventArgs {
  
  inline def apply(cancel: Boolean, key: Any, values: Any): ASPxClientGanttResourceDeletingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGanttResourceDeletingEventArgs]
  }
  
  extension [Self <: ASPxClientGanttResourceDeletingEventArgs](x: Self) {
    
    inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
