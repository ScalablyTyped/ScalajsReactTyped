package typingsJapgolly.cssSelectorTokenizer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.cssSelectorTokenizer.mod.ItemNode
  - typingsJapgolly.cssSelectorTokenizer.mod.NestedItemNode
  - typingsJapgolly.cssSelectorTokenizer.mod.StringNode
  - typingsJapgolly.cssSelectorTokenizer.mod.CommentNode
  - typingsJapgolly.cssSelectorTokenizer.mod.UrlNode
  - typingsJapgolly.cssSelectorTokenizer.mod.InvalidNode
*/
trait ValueNodeType
  extends StObject
     with AnyValueNode
object ValueNodeType {
  
  inline def CommentNode(content: String): typingsJapgolly.cssSelectorTokenizer.mod.CommentNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("comment")
    __obj.asInstanceOf[typingsJapgolly.cssSelectorTokenizer.mod.CommentNode]
  }
  
  inline def InvalidNode(value: String): typingsJapgolly.cssSelectorTokenizer.mod.InvalidNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("invalid")
    __obj.asInstanceOf[typingsJapgolly.cssSelectorTokenizer.mod.InvalidNode]
  }
  
  inline def ItemNode(name: String): typingsJapgolly.cssSelectorTokenizer.mod.ItemNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("item")
    __obj.asInstanceOf[typingsJapgolly.cssSelectorTokenizer.mod.ItemNode]
  }
  
  inline def NestedItemNode(name: String, nodes: js.Array[ValueNode]): typingsJapgolly.cssSelectorTokenizer.mod.NestedItemNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("nested-item")
    __obj.asInstanceOf[typingsJapgolly.cssSelectorTokenizer.mod.NestedItemNode]
  }
  
  inline def StringNode(stringType: String, value: String): typingsJapgolly.cssSelectorTokenizer.mod.StringNode = {
    val __obj = js.Dynamic.literal(stringType = stringType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typingsJapgolly.cssSelectorTokenizer.mod.StringNode]
  }
  
  inline def UrlNode(url: String): typingsJapgolly.cssSelectorTokenizer.mod.UrlNode = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("url")
    __obj.asInstanceOf[typingsJapgolly.cssSelectorTokenizer.mod.UrlNode]
  }
}
