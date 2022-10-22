package typingsJapgolly.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceParameterBinding
  extends StObject
     with TypeDerived {
  
  var expression: Expression
  
  var parameterRef: ResourceParameter
}
object ResourceParameterBinding {
  
  inline def apply($parent: TypeDerived, $type: ElementType, expression: Expression, parameterRef: ResourceParameter): ResourceParameterBinding = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], parameterRef = parameterRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceParameterBinding]
  }
  
  extension [Self <: ResourceParameterBinding](x: Self) {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setParameterRef(value: ResourceParameter): Self = StObject.set(x, "parameterRef", value.asInstanceOf[js.Any])
  }
}
