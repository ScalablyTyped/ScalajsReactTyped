package typingsJapgolly.chevrotainTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chevrotainTypes.mod.IToken
  - typingsJapgolly.chevrotainTypes.mod.CstNode
*/
trait CstElement extends StObject
object CstElement {
  
  inline def CstNode(children: CstChildrenDictionary, name: String): typingsJapgolly.chevrotainTypes.mod.CstNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.chevrotainTypes.mod.CstNode]
  }
  
  inline def IToken(image: String, startOffset: Double, tokenType: TokenType, tokenTypeIdx: Double): typingsJapgolly.chevrotainTypes.mod.IToken = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any], tokenTypeIdx = tokenTypeIdx.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.chevrotainTypes.mod.IToken]
  }
}
