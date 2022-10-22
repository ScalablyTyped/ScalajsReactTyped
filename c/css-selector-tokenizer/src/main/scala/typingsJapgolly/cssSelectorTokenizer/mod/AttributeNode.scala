package typingsJapgolly.cssSelectorTokenizer.mod

import typingsJapgolly.cssSelectorTokenizer.cssSelectorTokenizerStrings.attribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeNode
  extends StObject
     with BaseNode
     with SelectorNodeType {
  
  var content: String
  
  var `type`: attribute
}
object AttributeNode {
  
  inline def apply(content: String): AttributeNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("attribute")
    __obj.asInstanceOf[AttributeNode]
  }
  
  extension [Self <: AttributeNode](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setType(value: attribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
