package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the ResourceUnassigned event.
  */
trait ASPxClientGanttResourceUnassignedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Specifies the resource assignment key.
    */
  var key: Any
  
  /**
    * Specifies the resource values.
    */
  var values: Any
}
object ASPxClientGanttResourceUnassignedEventArgs {
  
  inline def apply(key: Any, values: Any): ASPxClientGanttResourceUnassignedEventArgs = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGanttResourceUnassignedEventArgs]
  }
  
  extension [Self <: ASPxClientGanttResourceUnassignedEventArgs](x: Self) {
    
    inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
