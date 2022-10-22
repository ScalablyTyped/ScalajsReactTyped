package typingsJapgolly.aureliaTemplating.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LetExpression extends StObject {
  
  def createBinding(): LetBinding
}
object LetExpression {
  
  inline def apply(createBinding: CallbackTo[LetBinding]): LetExpression = {
    val __obj = js.Dynamic.literal(createBinding = createBinding.toJsFn)
    __obj.asInstanceOf[LetExpression]
  }
  
  extension [Self <: LetExpression](x: Self) {
    
    inline def setCreateBinding(value: CallbackTo[LetBinding]): Self = StObject.set(x, "createBinding", value.toJsFn)
  }
}
