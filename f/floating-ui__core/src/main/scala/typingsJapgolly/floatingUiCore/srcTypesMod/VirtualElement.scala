package typingsJapgolly.floatingUiCore.srcTypesMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualElement extends StObject {
  
  var contextElement: js.UndefOr[Any] = js.undefined
  
  def getBoundingClientRect(): ClientRectObject
}
object VirtualElement {
  
  inline def apply(getBoundingClientRect: CallbackTo[ClientRectObject]): VirtualElement = {
    val __obj = js.Dynamic.literal(getBoundingClientRect = getBoundingClientRect.toJsFn)
    __obj.asInstanceOf[VirtualElement]
  }
  
  extension [Self <: VirtualElement](x: Self) {
    
    inline def setContextElement(value: Any): Self = StObject.set(x, "contextElement", value.asInstanceOf[js.Any])
    
    inline def setContextElementUndefined: Self = StObject.set(x, "contextElement", js.undefined)
    
    inline def setGetBoundingClientRect(value: CallbackTo[ClientRectObject]): Self = StObject.set(x, "getBoundingClientRect", value.toJsFn)
  }
}
