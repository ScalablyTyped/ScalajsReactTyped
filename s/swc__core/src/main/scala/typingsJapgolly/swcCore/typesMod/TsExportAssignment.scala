package typingsJapgolly.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsExportAssignment
  extends StObject
     with Node
     with HasSpan
     with ModuleDeclaration {
  
  var expression: Expression
  
  @JSName("type")
  var type_TsExportAssignment: typingsJapgolly.swcCore.swcCoreStrings.TsExportAssignment
}
object TsExportAssignment {
  
  inline def apply(expression: Expression, span: Span): TsExportAssignment = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsExportAssignment")
    __obj.asInstanceOf[TsExportAssignment]
  }
  
  extension [Self <: TsExportAssignment](x: Self) {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.swcCore.swcCoreStrings.TsExportAssignment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
