package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.BlockStatement
import typingsJapgolly.babelTypes.babelTypesStrings.ClassBody
import typingsJapgolly.babelTypes.babelTypesStrings.Identifier
import typingsJapgolly.babelTypes.babelTypesStrings.StringLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.mod.Noop_
  - typingsJapgolly.babelTypes.mod.Placeholder_
  - typingsJapgolly.babelTypes.mod.V8IntrinsicIdentifier_
*/
trait Miscellaneous
  extends StObject
     with _Node
object Miscellaneous {
  
  inline def Noop_(): typingsJapgolly.babelTypes.mod.Noop_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("Noop")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.Noop_]
  }
  
  inline def Placeholder_(
    expectedNode: Identifier | StringLiteral | typingsJapgolly.babelTypes.babelTypesStrings.Expression | typingsJapgolly.babelTypes.babelTypesStrings.Statement | typingsJapgolly.babelTypes.babelTypesStrings.Declaration | BlockStatement | ClassBody | typingsJapgolly.babelTypes.babelTypesStrings.Pattern,
    name: Identifier_
  ): typingsJapgolly.babelTypes.mod.Placeholder_ = {
    val __obj = js.Dynamic.literal(expectedNode = expectedNode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("Placeholder")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.Placeholder_]
  }
  
  inline def V8IntrinsicIdentifier_(name: String): typingsJapgolly.babelTypes.mod.V8IntrinsicIdentifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("V8IntrinsicIdentifier")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.V8IntrinsicIdentifier_]
  }
}
