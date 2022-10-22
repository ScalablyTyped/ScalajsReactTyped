package typingsJapgolly.materializeCss.M

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TapTarget
  extends StObject
     with Component[TapTargetOptions] {
  
  /**
    * Close Tap Target
    */
  def close(): Unit
  
  /**
    * If the tap target is open
    */
  var isOpen: Boolean
  
  /**
    * Open Tap Target
    */
  def open(): Unit
}
object TapTarget {
  
  inline def apply(
    close: Callback,
    destroy: Callback,
    el: Element,
    isOpen: Boolean,
    open: Callback,
    options: TapTargetOptions
  ): TapTarget = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, destroy = destroy.toJsFn, el = el.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], open = open.toJsFn, options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[TapTarget]
  }
  
  extension [Self <: TapTarget](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: Callback): Self = StObject.set(x, "open", value.toJsFn)
  }
}
