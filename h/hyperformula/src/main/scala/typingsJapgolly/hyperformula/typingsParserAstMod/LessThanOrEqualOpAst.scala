package typingsJapgolly.hyperformula.typingsParserAstMod

import typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.LESS_THAN_OR_EQUAL_OP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LessThanOrEqualOpAst
  extends StObject
     with BinaryOpAst
     with Ast {
  
  var `type`: LESS_THAN_OR_EQUAL_OP
}
object LessThanOrEqualOpAst {
  
  inline def apply(left: Ast, right: Ast, `type`: LESS_THAN_OR_EQUAL_OP): LessThanOrEqualOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LessThanOrEqualOpAst]
  }
  
  extension [Self <: LessThanOrEqualOpAst](x: Self) {
    
    inline def setType(value: LESS_THAN_OR_EQUAL_OP): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
