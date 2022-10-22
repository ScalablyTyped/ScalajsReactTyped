package typingsJapgolly.estree.mod

import typingsJapgolly.estree.estreeStrings.`var`
import typingsJapgolly.estree.estreeStrings.const
import typingsJapgolly.estree.estreeStrings.let
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.estree.mod.FunctionDeclaration
  - typingsJapgolly.estree.mod.VariableDeclaration
  - typingsJapgolly.estree.mod.ClassDeclaration
*/
trait Declaration
  extends StObject
     with Statement
object Declaration {
  
  inline def ClassDeclaration(body: ClassBody): typingsJapgolly.estree.mod.ClassDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = null)
    __obj.updateDynamic("type")("ClassDeclaration")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.ClassDeclaration]
  }
  
  inline def FunctionDeclaration(body: BlockStatement, params: js.Array[Pattern]): typingsJapgolly.estree.mod.FunctionDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], id = null)
    __obj.updateDynamic("type")("FunctionDeclaration")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.FunctionDeclaration]
  }
  
  inline def VariableDeclaration(declarations: js.Array[VariableDeclarator], kind: `var` | let | const): typingsJapgolly.estree.mod.VariableDeclaration = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VariableDeclaration")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.VariableDeclaration]
  }
}
