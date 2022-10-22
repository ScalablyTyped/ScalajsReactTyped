package typingsJapgolly.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.solidityParserAntlr.mod.AssemblyCall
  - typingsJapgolly.solidityParserAntlr.mod.AssemblyLiteral
*/
trait AssemblyExpression
  extends StObject
     with AssemblyItem
object AssemblyExpression {
  
  inline def AssemblyCall(arguments: js.Array[AssemblyExpression], functionName: String): typingsJapgolly.solidityParserAntlr.mod.AssemblyCall = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssemblyCall")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.AssemblyCall]
  }
  
  inline def AssemblyLiteral(): typingsJapgolly.solidityParserAntlr.mod.AssemblyLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblyLiteral")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.AssemblyLiteral]
  }
}
