package typingsJapgolly.cssSelectorTokenizer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.cssSelectorTokenizer.mod.ElementNode
  - typingsJapgolly.cssSelectorTokenizer.mod.ClassNode
  - typingsJapgolly.cssSelectorTokenizer.mod.SpacingNode
  - typingsJapgolly.cssSelectorTokenizer.mod.IdNode
  - typingsJapgolly.cssSelectorTokenizer.mod.PseudoClassNode
  - typingsJapgolly.cssSelectorTokenizer.mod.NestedPseudoClassNode
  - typingsJapgolly.cssSelectorTokenizer.mod.UniversalNode
  - typingsJapgolly.cssSelectorTokenizer.mod.AttributeNode
  - typingsJapgolly.cssSelectorTokenizer.mod.CommentNode
  - typingsJapgolly.cssSelectorTokenizer.mod.OperatorNode
  - typingsJapgolly.cssSelectorTokenizer.mod.InvalidNode
  - typingsJapgolly.cssSelectorTokenizer.mod.PseudoElementNode
*/
trait SelectorNodeType
  extends StObject
     with AnySelectorNode
object SelectorNodeType {
  
  inline def AttributeNode(content: String): typingsJapgolly.cssSelectorTokenizer.mod.AttributeNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("attribute")
    __obj.asInstanceOf[typingsJapgolly.cssSelectorTokenizer.mod.AttributeNode]
  }
  
  inline def ClassNode(name: String): typingsJapgolly.cssSelectorTokenizer.mod.ClassNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("class")
    __obj.asInstanceOf[typingsJapgolly.cssSelectorTokenizer.mod.ClassNode]
  }
  
  inline def CommentNode(content: String): typingsJapgolly.cssSelectorTokenizer.mod.CommentNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("comment")
    __obj.asInstanceOf[typingsJapgolly.cssSelectorTokenizer.mod.CommentNode]
  }
  
  inline def ElementNode(name: String): typingsJapgolly.cssSelectorTokenizer.mod.ElementNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[typingsJapgolly.cssSelectorTokenizer.mod.ElementNode]
  }
  
  inline def IdNode(name: String): typingsJapgolly.cssSelectorTokenizer.mod.IdNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("id")
    __obj.asInstanceOf[typingsJapgolly.cssSelectorTokenizer.mod.IdNode]
  }
  
  inline def InvalidNode(value: String): typingsJapgolly.cssSelectorTokenizer.mod.InvalidNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("invalid")
    __obj.asInstanceOf[typingsJapgolly.cssSelectorTokenizer.mod.InvalidNode]
  }
  
  inline def NestedPseudoClassNode(name: String, nodes: js.Array[SelectorNode]): typingsJapgolly.cssSelectorTokenizer.mod.NestedPseudoClassNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("nested-pseudo-class")
    __obj.asInstanceOf[typingsJapgolly.cssSelectorTokenizer.mod.NestedPseudoClassNode]
  }
  
  inline def OperatorNode(operator: String): typingsJapgolly.cssSelectorTokenizer.mod.OperatorNode = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("operator")
    __obj.asInstanceOf[typingsJapgolly.cssSelectorTokenizer.mod.OperatorNode]
  }
  
  inline def PseudoClassNode(name: String): typingsJapgolly.cssSelectorTokenizer.mod.PseudoClassNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pseudo-class")
    __obj.asInstanceOf[typingsJapgolly.cssSelectorTokenizer.mod.PseudoClassNode]
  }
  
  inline def PseudoElementNode(name: String): typingsJapgolly.cssSelectorTokenizer.mod.PseudoElementNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pseudo-element")
    __obj.asInstanceOf[typingsJapgolly.cssSelectorTokenizer.mod.PseudoElementNode]
  }
  
  inline def SpacingNode(value: String): typingsJapgolly.cssSelectorTokenizer.mod.SpacingNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("spacing")
    __obj.asInstanceOf[typingsJapgolly.cssSelectorTokenizer.mod.SpacingNode]
  }
  
  inline def UniversalNode(): typingsJapgolly.cssSelectorTokenizer.mod.UniversalNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("universal")
    __obj.asInstanceOf[typingsJapgolly.cssSelectorTokenizer.mod.UniversalNode]
  }
}
