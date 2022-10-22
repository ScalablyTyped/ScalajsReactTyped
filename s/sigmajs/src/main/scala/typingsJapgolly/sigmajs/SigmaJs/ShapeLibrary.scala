package typingsJapgolly.sigmajs.SigmaJs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeLibrary extends StObject {
  
  def enumerate(): Any
}
object ShapeLibrary {
  
  inline def apply(enumerate: CallbackTo[Any]): ShapeLibrary = {
    val __obj = js.Dynamic.literal(enumerate = enumerate.toJsFn)
    __obj.asInstanceOf[ShapeLibrary]
  }
  
  extension [Self <: ShapeLibrary](x: Self) {
    
    inline def setEnumerate(value: CallbackTo[Any]): Self = StObject.set(x, "enumerate", value.toJsFn)
  }
}
