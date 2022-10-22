package typingsJapgolly.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.estree.mod.FunctionDeclaration
  - typingsJapgolly.estree.mod.FunctionExpression
  - typingsJapgolly.estree.mod.ArrowFunctionExpression
*/
trait Function extends StObject
object Function {
  
  inline def ArrowFunctionExpression(body: BlockStatement | Expression, expression: Boolean, params: js.Array[Pattern]): typingsJapgolly.estree.mod.ArrowFunctionExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrowFunctionExpression")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.ArrowFunctionExpression]
  }
  
  inline def FunctionDeclaration(body: BlockStatement, params: js.Array[Pattern]): typingsJapgolly.estree.mod.FunctionDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], id = null)
    __obj.updateDynamic("type")("FunctionDeclaration")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.FunctionDeclaration]
  }
  
  inline def FunctionExpression(body: BlockStatement, params: js.Array[Pattern]): typingsJapgolly.estree.mod.FunctionExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionExpression")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.FunctionExpression]
  }
}
