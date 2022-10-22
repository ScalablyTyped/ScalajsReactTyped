package typingsJapgolly.cookieclicker

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.DOMRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element extends StObject {
  
  /**
    * Same as `getBoundingClientRect`, but applies `Game.scale`
    */
  def getBounds(): DOMRect
}
object Element {
  
  inline def apply(getBounds: CallbackTo[DOMRect]): Element = {
    val __obj = js.Dynamic.literal(getBounds = getBounds.toJsFn)
    __obj.asInstanceOf[Element]
  }
  
  extension [Self <: Element](x: Self) {
    
    inline def setGetBounds(value: CallbackTo[DOMRect]): Self = StObject.set(x, "getBounds", value.toJsFn)
  }
}
