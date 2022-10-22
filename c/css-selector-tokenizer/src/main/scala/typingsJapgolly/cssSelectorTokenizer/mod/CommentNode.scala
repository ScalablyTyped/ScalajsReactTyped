package typingsJapgolly.cssSelectorTokenizer.mod

import typingsJapgolly.cssSelectorTokenizer.cssSelectorTokenizerStrings.comment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentNode
  extends StObject
     with BaseNode
     with SelectorNodeType
     with ValueNodeType {
  
  var content: String
  
  var `type`: comment
}
object CommentNode {
  
  inline def apply(content: String): CommentNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("comment")
    __obj.asInstanceOf[CommentNode]
  }
  
  extension [Self <: CommentNode](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setType(value: comment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
