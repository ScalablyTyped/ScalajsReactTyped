package typingsJapgolly.sqlFormatter.libSrcParserAstMod

import typingsJapgolly.sqlFormatter.libSrcParserAstMod.NodeType.function_call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionCallNode
  extends StObject
     with BaseNode
     with AstNode {
  
  var nameKw: KeywordNode
  
  var parenthesis: ParenthesisNode
  
  var `type`: function_call
}
object FunctionCallNode {
  
  inline def apply(nameKw: KeywordNode, parenthesis: ParenthesisNode, `type`: function_call): FunctionCallNode = {
    val __obj = js.Dynamic.literal(nameKw = nameKw.asInstanceOf[js.Any], parenthesis = parenthesis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionCallNode]
  }
  
  extension [Self <: FunctionCallNode](x: Self) {
    
    inline def setNameKw(value: KeywordNode): Self = StObject.set(x, "nameKw", value.asInstanceOf[js.Any])
    
    inline def setParenthesis(value: ParenthesisNode): Self = StObject.set(x, "parenthesis", value.asInstanceOf[js.Any])
    
    inline def setType(value: function_call): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
