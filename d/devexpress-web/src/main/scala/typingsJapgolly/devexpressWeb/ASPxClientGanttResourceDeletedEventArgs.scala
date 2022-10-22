package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the ResourceDeleted event.
  */
trait ASPxClientGanttResourceDeletedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Specifies the resource key.
    */
  var key: Any
  
  /**
    * Specifies the resource values.
    */
  var values: Any
}
object ASPxClientGanttResourceDeletedEventArgs {
  
  inline def apply(key: Any, values: Any): ASPxClientGanttResourceDeletedEventArgs = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGanttResourceDeletedEventArgs]
  }
  
  extension [Self <: ASPxClientGanttResourceDeletedEventArgs](x: Self) {
    
    inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
