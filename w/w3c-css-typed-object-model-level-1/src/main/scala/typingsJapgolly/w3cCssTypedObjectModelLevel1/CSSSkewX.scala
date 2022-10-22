package typingsJapgolly.w3cCssTypedObjectModelLevel1

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.DOMMatrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSSkewX
  extends StObject
     with CSSTransformComponent {
  
  var ax: CSSNumericValue
}
object CSSSkewX {
  
  inline def apply(ax: CSSNumericValue, is2D: Boolean, toMatrix: CallbackTo[DOMMatrix]): CSSSkewX = {
    val __obj = js.Dynamic.literal(ax = ax.asInstanceOf[js.Any], is2D = is2D.asInstanceOf[js.Any], toMatrix = toMatrix.toJsFn)
    __obj.asInstanceOf[CSSSkewX]
  }
  
  extension [Self <: CSSSkewX](x: Self) {
    
    inline def setAx(value: CSSNumericValue): Self = StObject.set(x, "ax", value.asInstanceOf[js.Any])
  }
}
