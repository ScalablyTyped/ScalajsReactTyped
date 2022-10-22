package typingsJapgolly.aureliaBinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BindingExpression extends StObject {
  
  def createBinding(target: Any): Binding
}
object BindingExpression {
  
  inline def apply(createBinding: Any => Binding): BindingExpression = {
    val __obj = js.Dynamic.literal(createBinding = js.Any.fromFunction1(createBinding))
    __obj.asInstanceOf[BindingExpression]
  }
  
  extension [Self <: BindingExpression](x: Self) {
    
    inline def setCreateBinding(value: Any => Binding): Self = StObject.set(x, "createBinding", js.Any.fromFunction1(value))
  }
}
