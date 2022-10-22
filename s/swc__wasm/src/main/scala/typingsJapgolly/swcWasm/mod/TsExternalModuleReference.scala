package typingsJapgolly.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsExternalModuleReference
  extends StObject
     with Node
     with HasSpan
     with TsModuleReference {
  
  var expression: StringLiteral
  
  @JSName("type")
  var type_TsExternalModuleReference: typingsJapgolly.swcWasm.swcWasmStrings.TsExternalModuleReference
}
object TsExternalModuleReference {
  
  inline def apply(expression: StringLiteral, span: Span): TsExternalModuleReference = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsExternalModuleReference")
    __obj.asInstanceOf[TsExternalModuleReference]
  }
  
  extension [Self <: TsExternalModuleReference](x: Self) {
    
    inline def setExpression(value: StringLiteral): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.swcWasm.swcWasmStrings.TsExternalModuleReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
