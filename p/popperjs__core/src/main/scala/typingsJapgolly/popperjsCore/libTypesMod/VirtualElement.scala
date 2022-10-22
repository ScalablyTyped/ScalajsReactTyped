package typingsJapgolly.popperjsCore.libTypesMod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.DOMRect
import org.scalajs.dom.Element
import typingsJapgolly.std.ClientRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualElement extends StObject {
  
  var contextElement: js.UndefOr[Element] = js.undefined
  
  def getBoundingClientRect(): ClientRect | DOMRect
}
object VirtualElement {
  
  inline def apply(getBoundingClientRect: CallbackTo[ClientRect | DOMRect]): VirtualElement = {
    val __obj = js.Dynamic.literal(getBoundingClientRect = getBoundingClientRect.toJsFn)
    __obj.asInstanceOf[VirtualElement]
  }
  
  extension [Self <: VirtualElement](x: Self) {
    
    inline def setContextElement(value: Element): Self = StObject.set(x, "contextElement", value.asInstanceOf[js.Any])
    
    inline def setContextElementUndefined: Self = StObject.set(x, "contextElement", js.undefined)
    
    inline def setGetBoundingClientRect(value: CallbackTo[ClientRect | DOMRect]): Self = StObject.set(x, "getBoundingClientRect", value.toJsFn)
  }
}
