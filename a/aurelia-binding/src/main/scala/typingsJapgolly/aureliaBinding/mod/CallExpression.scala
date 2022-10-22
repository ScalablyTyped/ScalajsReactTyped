package typingsJapgolly.aureliaBinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallExpression extends StObject {
  
  def createBinding(target: Any): Binding
}
object CallExpression {
  
  inline def apply(createBinding: Any => Binding): CallExpression = {
    val __obj = js.Dynamic.literal(createBinding = js.Any.fromFunction1(createBinding))
    __obj.asInstanceOf[CallExpression]
  }
  
  extension [Self <: CallExpression](x: Self) {
    
    inline def setCreateBinding(value: Any => Binding): Self = StObject.set(x, "createBinding", js.Any.fromFunction1(value))
  }
}
