package typingsJapgolly.materializecssMaterialize.M

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Openable extends StObject {
  
  def close(): Unit
  
  var isOpen: Boolean
  
  def open(): Unit
}
object Openable {
  
  inline def apply(close: Callback, isOpen: Boolean, open: Callback): Openable = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, isOpen = isOpen.asInstanceOf[js.Any], open = open.toJsFn)
    __obj.asInstanceOf[Openable]
  }
  
  extension [Self <: Openable](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: Callback): Self = StObject.set(x, "open", value.toJsFn)
  }
}
