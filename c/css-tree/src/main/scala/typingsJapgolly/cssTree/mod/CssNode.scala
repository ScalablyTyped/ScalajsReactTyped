package typingsJapgolly.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.cssTree.mod.AnPlusB
  - typingsJapgolly.cssTree.mod.Atrule
  - typingsJapgolly.cssTree.mod.AtrulePrelude
  - typingsJapgolly.cssTree.mod.AttributeSelector
  - typingsJapgolly.cssTree.mod.Block
  - typingsJapgolly.cssTree.mod.Brackets
  - typingsJapgolly.cssTree.mod.CDC
  - typingsJapgolly.cssTree.mod.CDO
  - typingsJapgolly.cssTree.mod.ClassSelector
  - typingsJapgolly.cssTree.mod.Combinator
  - typingsJapgolly.cssTree.mod.Comment
  - typingsJapgolly.cssTree.mod.Declaration
  - typingsJapgolly.cssTree.mod.DeclarationList
  - typingsJapgolly.cssTree.mod.Dimension
  - typingsJapgolly.cssTree.mod.FunctionNode
  - typingsJapgolly.cssTree.mod.Hash
  - typingsJapgolly.cssTree.mod.IdSelector
  - typingsJapgolly.cssTree.mod.Identifier
  - typingsJapgolly.cssTree.mod.MediaFeature
  - typingsJapgolly.cssTree.mod.MediaQuery
  - typingsJapgolly.cssTree.mod.MediaQueryList
  - typingsJapgolly.cssTree.mod.Nth
  - typingsJapgolly.cssTree.mod.NumberNode
  - typingsJapgolly.cssTree.mod.Operator
  - typingsJapgolly.cssTree.mod.Parentheses
  - typingsJapgolly.cssTree.mod.Percentage
  - typingsJapgolly.cssTree.mod.PseudoClassSelector
  - typingsJapgolly.cssTree.mod.PseudoElementSelector
  - typingsJapgolly.cssTree.mod.Ratio
  - typingsJapgolly.cssTree.mod.Raw
  - typingsJapgolly.cssTree.mod.Rule
  - typingsJapgolly.cssTree.mod.Selector
  - typingsJapgolly.cssTree.mod.SelectorList
  - typingsJapgolly.cssTree.mod.StringNode
  - typingsJapgolly.cssTree.mod.StyleSheet
  - typingsJapgolly.cssTree.mod.TypeSelector
  - typingsJapgolly.cssTree.mod.UnicodeRange
  - typingsJapgolly.cssTree.mod.Url_
  - typingsJapgolly.cssTree.mod.Value
  - typingsJapgolly.cssTree.mod.WhiteSpace
*/
trait CssNode extends StObject
object CssNode {
  
  inline def AnPlusB(): typingsJapgolly.cssTree.mod.AnPlusB = {
    val __obj = js.Dynamic.literal(a = null, b = null)
    __obj.updateDynamic("type")("AnPlusB")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.AnPlusB]
  }
  
  inline def Atrule(name: String): typingsJapgolly.cssTree.mod.Atrule = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], block = null, prelude = null)
    __obj.updateDynamic("type")("Atrule")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.Atrule]
  }
  
  inline def AtrulePrelude(children: typingsJapgolly.cssTree.mod.List[CssNode]): typingsJapgolly.cssTree.mod.AtrulePrelude = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AtrulePrelude")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.AtrulePrelude]
  }
  
  inline def AttributeSelector(name: Identifier): typingsJapgolly.cssTree.mod.AttributeSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], flags = null, matcher = null, value = null)
    __obj.updateDynamic("type")("AttributeSelector")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.AttributeSelector]
  }
  
  inline def Block(children: typingsJapgolly.cssTree.mod.List[CssNode]): typingsJapgolly.cssTree.mod.Block = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Block")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.Block]
  }
  
  inline def Brackets(children: typingsJapgolly.cssTree.mod.List[CssNode]): typingsJapgolly.cssTree.mod.Brackets = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Brackets")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.Brackets]
  }
  
  inline def CDC(): typingsJapgolly.cssTree.mod.CDC = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CDC")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.CDC]
  }
  
  inline def CDO(): typingsJapgolly.cssTree.mod.CDO = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CDO")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.CDO]
  }
  
  inline def ClassSelector(name: String): typingsJapgolly.cssTree.mod.ClassSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassSelector")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.ClassSelector]
  }
  
  inline def Combinator(name: String): typingsJapgolly.cssTree.mod.Combinator = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Combinator")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.Combinator]
  }
  
  inline def Comment(value: String): typingsJapgolly.cssTree.mod.Comment = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Comment")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.Comment]
  }
  
  inline def Declaration(important: Boolean | String, property: String, value: Value | Raw): typingsJapgolly.cssTree.mod.Declaration = {
    val __obj = js.Dynamic.literal(important = important.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Declaration")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.Declaration]
  }
  
  inline def DeclarationList(children: typingsJapgolly.cssTree.mod.List[CssNode]): typingsJapgolly.cssTree.mod.DeclarationList = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclarationList")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.DeclarationList]
  }
  
  inline def Dimension(unit: String, value: String): typingsJapgolly.cssTree.mod.Dimension = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Dimension")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.Dimension]
  }
  
  inline def FunctionNode(children: typingsJapgolly.cssTree.mod.List[CssNode], name: String): typingsJapgolly.cssTree.mod.FunctionNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Function")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.FunctionNode]
  }
  
  inline def Hash(value: String): typingsJapgolly.cssTree.mod.Hash = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Hash")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.Hash]
  }
  
  inline def IdSelector(name: String): typingsJapgolly.cssTree.mod.IdSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IdSelector")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.IdSelector]
  }
  
  inline def Identifier(name: String): typingsJapgolly.cssTree.mod.Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.Identifier]
  }
  
  inline def MediaFeature(name: String): typingsJapgolly.cssTree.mod.MediaFeature = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = null)
    __obj.updateDynamic("type")("MediaFeature")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.MediaFeature]
  }
  
  inline def MediaQuery(children: typingsJapgolly.cssTree.mod.List[CssNode]): typingsJapgolly.cssTree.mod.MediaQuery = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MediaQuery")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.MediaQuery]
  }
  
  inline def MediaQueryList(children: typingsJapgolly.cssTree.mod.List[CssNode]): typingsJapgolly.cssTree.mod.MediaQueryList = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MediaQueryList")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.MediaQueryList]
  }
  
  inline def Nth(nth: AnPlusB | Identifier): typingsJapgolly.cssTree.mod.Nth = {
    val __obj = js.Dynamic.literal(nth = nth.asInstanceOf[js.Any], selector = null)
    __obj.updateDynamic("type")("Nth")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.Nth]
  }
  
  inline def NumberNode(value: String): typingsJapgolly.cssTree.mod.NumberNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Number")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.NumberNode]
  }
  
  inline def Operator(value: String): typingsJapgolly.cssTree.mod.Operator = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Operator")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.Operator]
  }
  
  inline def Parentheses(children: typingsJapgolly.cssTree.mod.List[CssNode]): typingsJapgolly.cssTree.mod.Parentheses = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Parentheses")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.Parentheses]
  }
  
  inline def Percentage(value: String): typingsJapgolly.cssTree.mod.Percentage = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Percentage")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.Percentage]
  }
  
  inline def PseudoClassSelector(name: String): typingsJapgolly.cssTree.mod.PseudoClassSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], children = null)
    __obj.updateDynamic("type")("PseudoClassSelector")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.PseudoClassSelector]
  }
  
  inline def PseudoElementSelector(name: String): typingsJapgolly.cssTree.mod.PseudoElementSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], children = null)
    __obj.updateDynamic("type")("PseudoElementSelector")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.PseudoElementSelector]
  }
  
  inline def Ratio(left: String, right: String): typingsJapgolly.cssTree.mod.Ratio = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Ratio")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.Ratio]
  }
  
  inline def Raw(value: String): typingsJapgolly.cssTree.mod.Raw = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Raw")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.Raw]
  }
  
  inline def Rule(block: Block, prelude: SelectorList | Raw): typingsJapgolly.cssTree.mod.Rule = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], prelude = prelude.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Rule")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.Rule]
  }
  
  inline def Selector(children: typingsJapgolly.cssTree.mod.List[CssNode]): typingsJapgolly.cssTree.mod.Selector = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Selector")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.Selector]
  }
  
  inline def SelectorList(children: typingsJapgolly.cssTree.mod.List[CssNode]): typingsJapgolly.cssTree.mod.SelectorList = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SelectorList")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.SelectorList]
  }
  
  inline def StringNode(value: String): typingsJapgolly.cssTree.mod.StringNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("String")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.StringNode]
  }
  
  inline def StyleSheet(children: typingsJapgolly.cssTree.mod.List[CssNode]): typingsJapgolly.cssTree.mod.StyleSheet = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StyleSheet")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.StyleSheet]
  }
  
  inline def TypeSelector(name: String): typingsJapgolly.cssTree.mod.TypeSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeSelector")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.TypeSelector]
  }
  
  inline def UnicodeRange(value: String): typingsJapgolly.cssTree.mod.UnicodeRange = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UnicodeRange")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.UnicodeRange]
  }
  
  inline def Url_(value: StringNode | Raw): typingsJapgolly.cssTree.mod.Url_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Url")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.Url_]
  }
  
  inline def Value(children: typingsJapgolly.cssTree.mod.List[CssNode]): typingsJapgolly.cssTree.mod.Value = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Value")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.Value]
  }
  
  inline def WhiteSpace(value: String): typingsJapgolly.cssTree.mod.WhiteSpace = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WhiteSpace")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.WhiteSpace]
  }
}
