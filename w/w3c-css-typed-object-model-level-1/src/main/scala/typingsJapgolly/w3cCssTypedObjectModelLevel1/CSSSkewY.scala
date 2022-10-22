package typingsJapgolly.w3cCssTypedObjectModelLevel1

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.DOMMatrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSSkewY
  extends StObject
     with CSSTransformComponent {
  
  var ay: CSSNumericValue
}
object CSSSkewY {
  
  inline def apply(ay: CSSNumericValue, is2D: Boolean, toMatrix: CallbackTo[DOMMatrix]): CSSSkewY = {
    val __obj = js.Dynamic.literal(ay = ay.asInstanceOf[js.Any], is2D = is2D.asInstanceOf[js.Any], toMatrix = toMatrix.toJsFn)
    __obj.asInstanceOf[CSSSkewY]
  }
  
  extension [Self <: CSSSkewY](x: Self) {
    
    inline def setAy(value: CSSNumericValue): Self = StObject.set(x, "ay", value.asInstanceOf[js.Any])
  }
}
