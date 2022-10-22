package typingsJapgolly.w3cCssTypedObjectModelLevel1

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.DOMMatrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSMatrixComponent
  extends StObject
     with CSSTransformComponent {
  
  var matrix: DOMMatrix
}
object CSSMatrixComponent {
  
  inline def apply(is2D: Boolean, matrix: DOMMatrix, toMatrix: CallbackTo[DOMMatrix]): CSSMatrixComponent = {
    val __obj = js.Dynamic.literal(is2D = is2D.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], toMatrix = toMatrix.toJsFn)
    __obj.asInstanceOf[CSSMatrixComponent]
  }
  
  extension [Self <: CSSMatrixComponent](x: Self) {
    
    inline def setMatrix(value: DOMMatrix): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
  }
}
