package typingsJapgolly.w3cCssTypedObjectModelLevel1

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.DOMMatrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSTranslate
  extends StObject
     with CSSTransformComponent {
  
  var x: CSSNumericValue
  
  var y: CSSNumericValue
  
  var z: CSSNumericValue
}
object CSSTranslate {
  
  inline def apply(
    is2D: Boolean,
    toMatrix: CallbackTo[DOMMatrix],
    x: CSSNumericValue,
    y: CSSNumericValue,
    z: CSSNumericValue
  ): CSSTranslate = {
    val __obj = js.Dynamic.literal(is2D = is2D.asInstanceOf[js.Any], toMatrix = toMatrix.toJsFn, x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSTranslate]
  }
  
  extension [Self <: CSSTranslate](x: Self) {
    
    inline def setX(value: CSSNumericValue): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: CSSNumericValue): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: CSSNumericValue): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
