package typingsJapgolly.jqueryNotify

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryNotifyInstance extends StObject {
  
  def close(): Unit
  
  var element: JQuery
  
  var isOpen: Boolean
  
  def open(): Unit
  
  var options: JQueryNotifyOptions
}
object JQueryNotifyInstance {
  
  inline def apply(close: Callback, element: JQuery, isOpen: Boolean, open: Callback, options: JQueryNotifyOptions): JQueryNotifyInstance = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, element = element.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], open = open.toJsFn, options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryNotifyInstance]
  }
  
  extension [Self <: JQueryNotifyInstance](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setElement(value: JQuery): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: Callback): Self = StObject.set(x, "open", value.toJsFn)
    
    inline def setOptions(value: JQueryNotifyOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
