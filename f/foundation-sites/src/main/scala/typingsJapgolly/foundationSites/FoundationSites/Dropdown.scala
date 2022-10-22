package typingsJapgolly.foundationSites.FoundationSites

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://get.foundation/sites/docs/dropdown.html#javascript-reference
trait Dropdown extends StObject {
  
  def close(): Unit
  
  def open(): Unit
  
  def toggle(): Unit
}
object Dropdown {
  
  inline def apply(close: Callback, open: Callback, toggle: Callback): Dropdown = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, open = open.toJsFn, toggle = toggle.toJsFn)
    __obj.asInstanceOf[Dropdown]
  }
  
  extension [Self <: Dropdown](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setOpen(value: Callback): Self = StObject.set(x, "open", value.toJsFn)
    
    inline def setToggle(value: Callback): Self = StObject.set(x, "toggle", value.toJsFn)
  }
}
