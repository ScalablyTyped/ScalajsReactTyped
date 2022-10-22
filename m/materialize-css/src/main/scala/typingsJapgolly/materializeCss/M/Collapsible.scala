package typingsJapgolly.materializeCss.M

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collapsible
  extends StObject
     with Component[CollapsibleOptions] {
  
  /**
    * Close collapsible section
    * @param n Nth section to close
    */
  def close(n: Double): Unit
  
  /**
    * Open collapsible section
    * @param n Nth section to open
    */
  def open(n: Double): Unit
}
object Collapsible {
  
  inline def apply(
    close: Double => Callback,
    destroy: Callback,
    el: Element,
    open: Double => Callback,
    options: CollapsibleOptions
  ): Collapsible = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1((t0: Double) => close(t0).runNow()), destroy = destroy.toJsFn, el = el.asInstanceOf[js.Any], open = js.Any.fromFunction1((t0: Double) => open(t0).runNow()), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collapsible]
  }
  
  extension [Self <: Collapsible](x: Self) {
    
    inline def setClose(value: Double => Callback): Self = StObject.set(x, "close", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setOpen(value: Double => Callback): Self = StObject.set(x, "open", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
