package typingsJapgolly.luaparse.libAstMod

import typingsJapgolly.luaparse.luaparseStrings.Numbersign
import typingsJapgolly.luaparse.luaparseStrings.Tilde
import typingsJapgolly.luaparse.luaparseStrings.`-_`
import typingsJapgolly.luaparse.luaparseStrings.not
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnaryExpression
  extends StObject
     with Base[typingsJapgolly.luaparse.luaparseStrings.UnaryExpression]
     with Expression {
  
  var argument: Expression
  
  var operator: not | `-_` | Tilde | Numbersign
}
object UnaryExpression {
  
  inline def apply(argument: Expression, operator: not | `-_` | Tilde | Numbersign): UnaryExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UnaryExpression")
    __obj.asInstanceOf[UnaryExpression]
  }
  
  extension [Self <: UnaryExpression](x: Self) {
    
    inline def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: not | `-_` | Tilde | Numbersign): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
  }
}
