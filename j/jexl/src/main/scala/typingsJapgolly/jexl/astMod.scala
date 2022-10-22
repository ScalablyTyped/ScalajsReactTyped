package typingsJapgolly.jexl

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jexl.jexlStrings.functions
import typingsJapgolly.jexl.jexlStrings.transforms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object astMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jexl.anon.Operator
    - typingsJapgolly.jexl.anon.Left
    - typingsJapgolly.jexl.anon.Alternate
    - typingsJapgolly.jexl.anon.Expr
    - typingsJapgolly.jexl.anon.Type
    - typingsJapgolly.jexl.anon.Value
    - typingsJapgolly.jexl.anon.TypeValue
    - typingsJapgolly.jexl.anon.From
    - typingsJapgolly.jexl.anon.Args
  */
  trait Ast extends StObject
  object Ast {
    
    inline def Alternate(alternate: Ast, consequent: Ast, test: Ast): typingsJapgolly.jexl.anon.Alternate = {
      val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("ConditionalExpression")
      __obj.asInstanceOf[typingsJapgolly.jexl.anon.Alternate]
    }
    
    inline def Args(args: js.Array[Ast], name: String, pool: functions | transforms): typingsJapgolly.jexl.anon.Args = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("FunctionCall")
      __obj.asInstanceOf[typingsJapgolly.jexl.anon.Args]
    }
    
    inline def Expr(expr: Ast, relative: Boolean, subject: Ast): typingsJapgolly.jexl.anon.Expr = {
      val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("FilterExpression")
      __obj.asInstanceOf[typingsJapgolly.jexl.anon.Expr]
    }
    
    inline def From(value: String): typingsJapgolly.jexl.anon.From = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Identifier")
      __obj.asInstanceOf[typingsJapgolly.jexl.anon.From]
    }
    
    inline def Left(left: Ast, operator: String, right: Ast): typingsJapgolly.jexl.anon.Left = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("BinaryExpression")
      __obj.asInstanceOf[typingsJapgolly.jexl.anon.Left]
    }
    
    inline def Operator(operator: String, right: Ast): typingsJapgolly.jexl.anon.Operator = {
      val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("UnaryExpression")
      __obj.asInstanceOf[typingsJapgolly.jexl.anon.Operator]
    }
    
    inline def Type(value: String | Double | Boolean): typingsJapgolly.jexl.anon.Type = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Literal")
      __obj.asInstanceOf[typingsJapgolly.jexl.anon.Type]
    }
    
    inline def TypeValue(value: StringDictionary[Ast]): typingsJapgolly.jexl.anon.TypeValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("ObjectLiteral")
      __obj.asInstanceOf[typingsJapgolly.jexl.anon.TypeValue]
    }
    
    inline def Value(value: js.Array[Ast]): typingsJapgolly.jexl.anon.Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("ArrayLiteral")
      __obj.asInstanceOf[typingsJapgolly.jexl.anon.Value]
    }
  }
}
