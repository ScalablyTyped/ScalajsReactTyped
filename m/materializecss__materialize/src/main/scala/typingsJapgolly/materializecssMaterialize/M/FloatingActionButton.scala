package typingsJapgolly.materializecssMaterialize.M

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FloatingActionButton
  extends StObject
     with Component[FloatingActionButtonOptions]
     with Openable
object FloatingActionButton {
  
  inline def apply(
    close: Callback,
    destroy: Callback,
    el: Element,
    isOpen: Boolean,
    open: Callback,
    options: FloatingActionButtonOptions
  ): FloatingActionButton = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, destroy = destroy.toJsFn, el = el.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], open = open.toJsFn, options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatingActionButton]
  }
}
