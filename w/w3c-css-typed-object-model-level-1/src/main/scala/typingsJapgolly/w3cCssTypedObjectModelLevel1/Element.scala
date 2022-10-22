package typingsJapgolly.w3cCssTypedObjectModelLevel1

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element extends StObject {
  
  def computedStyleMap(): StylePropertyMapReadOnly
}
object Element {
  
  inline def apply(computedStyleMap: CallbackTo[StylePropertyMapReadOnly]): Element = {
    val __obj = js.Dynamic.literal(computedStyleMap = computedStyleMap.toJsFn)
    __obj.asInstanceOf[Element]
  }
  
  extension [Self <: Element](x: Self) {
    
    inline def setComputedStyleMap(value: CallbackTo[StylePropertyMapReadOnly]): Self = StObject.set(x, "computedStyleMap", value.toJsFn)
  }
}
