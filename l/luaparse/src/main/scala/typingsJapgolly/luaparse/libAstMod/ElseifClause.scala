package typingsJapgolly.luaparse.libAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElseifClause
  extends StObject
     with Base[typingsJapgolly.luaparse.luaparseStrings.ElseifClause]
     with _Node {
  
  var body: js.Array[Statement]
  
  var condition: Expression
}
object ElseifClause {
  
  inline def apply(body: js.Array[Statement], condition: Expression): ElseifClause = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ElseifClause")
    __obj.asInstanceOf[ElseifClause]
  }
  
  extension [Self <: ElseifClause](x: Self) {
    
    inline def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setCondition(value: Expression): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
  }
}
