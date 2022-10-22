package typingsJapgolly.materializeCss.M

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Modal
  extends StObject
     with Component[ModalOptions]
     with Openable {
  
  /**
    * ID of the modal element
    */
  var id: String
}
object Modal {
  
  inline def apply(
    close: Callback,
    destroy: Callback,
    el: Element,
    id: String,
    isOpen: Boolean,
    open: Callback,
    options: ModalOptions
  ): Modal = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, destroy = destroy.toJsFn, el = el.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], open = open.toJsFn, options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modal]
  }
  
  extension [Self <: Modal](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
