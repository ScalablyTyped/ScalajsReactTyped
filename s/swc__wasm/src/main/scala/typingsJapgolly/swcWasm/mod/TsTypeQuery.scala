package typingsJapgolly.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsTypeQuery
  extends StObject
     with Node
     with HasSpan
     with TsType {
  
  var exprName: TsTypeQueryExpr
  
  var typeArguments: js.UndefOr[TsTypeParameterInstantiation] = js.undefined
  
  @JSName("type")
  var type_TsTypeQuery: typingsJapgolly.swcWasm.swcWasmStrings.TsTypeQuery
}
object TsTypeQuery {
  
  inline def apply(exprName: TsTypeQueryExpr, span: Span): TsTypeQuery = {
    val __obj = js.Dynamic.literal(exprName = exprName.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypeQuery")
    __obj.asInstanceOf[TsTypeQuery]
  }
  
  extension [Self <: TsTypeQuery](x: Self) {
    
    inline def setExprName(value: TsTypeQueryExpr): Self = StObject.set(x, "exprName", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.swcWasm.swcWasmStrings.TsTypeQuery): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeArguments(value: TsTypeParameterInstantiation): Self = StObject.set(x, "typeArguments", value.asInstanceOf[js.Any])
    
    inline def setTypeArgumentsUndefined: Self = StObject.set(x, "typeArguments", js.undefined)
  }
}
