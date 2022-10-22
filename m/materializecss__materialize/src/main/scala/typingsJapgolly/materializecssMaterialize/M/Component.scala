package typingsJapgolly.materializecssMaterialize.M

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component[TOptions]
  extends StObject
     with ComponentBase[TOptions] {
  
  /**
    * Destroy plugin instance and teardown
    */
  def destroy(): Unit
}
object Component {
  
  inline def apply[TOptions](destroy: Callback, el: Element, options: TOptions): Component[TOptions] = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, el = el.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component[TOptions]]
  }
  
  extension [Self <: Component[?], TOptions](x: Self & Component[TOptions]) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
  }
}
