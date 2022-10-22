package typingsJapgolly.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Identifier
  extends StObject
     with ExpressionBase
     with Expression
     with JSXAttributeName
     with JSXElementName
     with JSXObject
     with ModuleExportName
     with Property
     with PropertyName
     with TsEntityName
     with TsEnumMemberId
     with TsModuleName
     with TsThisTypeOrIdent {
  
  /// TypeScript only. Used in case of an optional parameter.
  var optional: Boolean
  
  @JSName("type")
  var type_Identifier: typingsJapgolly.swcWasm.swcWasmStrings.Identifier
  
  var value: String
}
object Identifier {
  
  inline def apply(optional: Boolean, span: Span, value: String): Identifier = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[Identifier]
  }
  
  extension [Self <: Identifier](x: Self) {
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.swcWasm.swcWasmStrings.Identifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
