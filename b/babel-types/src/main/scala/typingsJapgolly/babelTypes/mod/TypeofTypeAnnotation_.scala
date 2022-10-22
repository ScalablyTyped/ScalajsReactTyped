package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.TypeofTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTypeAnnotation_
  extends StObject
     with Node
     with Flow
     with FlowTypeAnnotation {
  
  var argument: FlowTypeAnnotation
  
  @JSName("type")
  var type_TypeofTypeAnnotation_ : TypeofTypeAnnotation
}
object TypeofTypeAnnotation_ {
  
  inline def apply(argument: FlowTypeAnnotation, end: Double, loc: SourceLocation, start: Double): TypeofTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeofTypeAnnotation")
    __obj.asInstanceOf[TypeofTypeAnnotation_]
  }
  
  extension [Self <: TypeofTypeAnnotation_](x: Self) {
    
    inline def setArgument(value: FlowTypeAnnotation): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setType(value: TypeofTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
