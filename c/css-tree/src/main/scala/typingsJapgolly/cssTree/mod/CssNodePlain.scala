package typingsJapgolly.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.cssTree.mod.AnPlusB
  - typingsJapgolly.cssTree.mod.AtrulePlain
  - typingsJapgolly.cssTree.mod.AtrulePreludePlain
  - typingsJapgolly.cssTree.mod.AttributeSelector
  - typingsJapgolly.cssTree.mod.BlockPlain
  - typingsJapgolly.cssTree.mod.BracketsPlain
  - typingsJapgolly.cssTree.mod.CDC
  - typingsJapgolly.cssTree.mod.CDO
  - typingsJapgolly.cssTree.mod.ClassSelector
  - typingsJapgolly.cssTree.mod.Combinator
  - typingsJapgolly.cssTree.mod.Comment
  - typingsJapgolly.cssTree.mod.DeclarationPlain
  - typingsJapgolly.cssTree.mod.DeclarationListPlain
  - typingsJapgolly.cssTree.mod.Dimension
  - typingsJapgolly.cssTree.mod.FunctionNodePlain
  - typingsJapgolly.cssTree.mod.Hash
  - typingsJapgolly.cssTree.mod.IdSelector
  - typingsJapgolly.cssTree.mod.Identifier
  - typingsJapgolly.cssTree.mod.MediaFeature
  - typingsJapgolly.cssTree.mod.MediaQueryPlain
  - typingsJapgolly.cssTree.mod.MediaQueryListPlain
  - typingsJapgolly.cssTree.mod.NthPlain
  - typingsJapgolly.cssTree.mod.NumberNode
  - typingsJapgolly.cssTree.mod.Operator
  - typingsJapgolly.cssTree.mod.ParenthesesPlain
  - typingsJapgolly.cssTree.mod.Percentage
  - typingsJapgolly.cssTree.mod.PseudoClassSelectorPlain
  - typingsJapgolly.cssTree.mod.PseudoElementSelectorPlain
  - typingsJapgolly.cssTree.mod.Ratio
  - typingsJapgolly.cssTree.mod.Raw
  - typingsJapgolly.cssTree.mod.RulePlain
  - typingsJapgolly.cssTree.mod.SelectorPlain
  - typingsJapgolly.cssTree.mod.SelectorListPlain
  - typingsJapgolly.cssTree.mod.StringNode
  - typingsJapgolly.cssTree.mod.StyleSheetPlain
  - typingsJapgolly.cssTree.mod.TypeSelector
  - typingsJapgolly.cssTree.mod.UnicodeRange
  - typingsJapgolly.cssTree.mod.Url_
  - typingsJapgolly.cssTree.mod.ValuePlain
  - typingsJapgolly.cssTree.mod.WhiteSpace
*/
trait CssNodePlain extends StObject
object CssNodePlain {
  
  inline def AnPlusB(): typingsJapgolly.cssTree.mod.AnPlusB = {
    val __obj = js.Dynamic.literal(a = null, b = null)
    __obj.updateDynamic("type")("AnPlusB")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.AnPlusB]
  }
  
  inline def AtrulePlain(name: String): typingsJapgolly.cssTree.mod.AtrulePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], block = null, prelude = null)
    __obj.updateDynamic("type")("Atrule")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.AtrulePlain]
  }
  
  inline def AtrulePreludePlain(children: js.Array[CssNodePlain]): typingsJapgolly.cssTree.mod.AtrulePreludePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AtrulePrelude")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.AtrulePreludePlain]
  }
  
  inline def AttributeSelector(name: Identifier): typingsJapgolly.cssTree.mod.AttributeSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], flags = null, matcher = null, value = null)
    __obj.updateDynamic("type")("AttributeSelector")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.AttributeSelector]
  }
  
  inline def BlockPlain(children: js.Array[CssNodePlain]): typingsJapgolly.cssTree.mod.BlockPlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Block")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.BlockPlain]
  }
  
  inline def BracketsPlain(children: js.Array[CssNodePlain]): typingsJapgolly.cssTree.mod.BracketsPlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Brackets")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.BracketsPlain]
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
  
  inline def DeclarationListPlain(children: js.Array[CssNodePlain]): typingsJapgolly.cssTree.mod.DeclarationListPlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclarationList")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.DeclarationListPlain]
  }
  
  inline def DeclarationPlain(important: Boolean | String, property: String, value: ValuePlain | Raw): typingsJapgolly.cssTree.mod.DeclarationPlain = {
    val __obj = js.Dynamic.literal(important = important.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Declaration")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.DeclarationPlain]
  }
  
  inline def Dimension(unit: String, value: String): typingsJapgolly.cssTree.mod.Dimension = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Dimension")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.Dimension]
  }
  
  inline def FunctionNodePlain(children: js.Array[CssNodePlain], name: String): typingsJapgolly.cssTree.mod.FunctionNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Function")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.FunctionNodePlain]
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
  
  inline def MediaQueryListPlain(children: js.Array[CssNodePlain]): typingsJapgolly.cssTree.mod.MediaQueryListPlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MediaQueryList")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.MediaQueryListPlain]
  }
  
  inline def MediaQueryPlain(children: js.Array[CssNodePlain]): typingsJapgolly.cssTree.mod.MediaQueryPlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MediaQuery")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.MediaQueryPlain]
  }
  
  inline def NthPlain(nth: AnPlusB | Identifier): typingsJapgolly.cssTree.mod.NthPlain = {
    val __obj = js.Dynamic.literal(nth = nth.asInstanceOf[js.Any], selector = null)
    __obj.updateDynamic("type")("Nth")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.NthPlain]
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
  
  inline def ParenthesesPlain(children: js.Array[CssNodePlain]): typingsJapgolly.cssTree.mod.ParenthesesPlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Parentheses")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.ParenthesesPlain]
  }
  
  inline def Percentage(value: String): typingsJapgolly.cssTree.mod.Percentage = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Percentage")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.Percentage]
  }
  
  inline def PseudoClassSelectorPlain(name: String): typingsJapgolly.cssTree.mod.PseudoClassSelectorPlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], children = null)
    __obj.updateDynamic("type")("PseudoClassSelector")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.PseudoClassSelectorPlain]
  }
  
  inline def PseudoElementSelectorPlain(name: String): typingsJapgolly.cssTree.mod.PseudoElementSelectorPlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], children = null)
    __obj.updateDynamic("type")("PseudoElementSelector")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.PseudoElementSelectorPlain]
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
  
  inline def RulePlain(block: BlockPlain, prelude: SelectorListPlain | Raw): typingsJapgolly.cssTree.mod.RulePlain = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], prelude = prelude.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Rule")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.RulePlain]
  }
  
  inline def SelectorListPlain(children: js.Array[CssNodePlain]): typingsJapgolly.cssTree.mod.SelectorListPlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SelectorList")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.SelectorListPlain]
  }
  
  inline def SelectorPlain(children: js.Array[CssNodePlain]): typingsJapgolly.cssTree.mod.SelectorPlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Selector")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.SelectorPlain]
  }
  
  inline def StringNode(value: String): typingsJapgolly.cssTree.mod.StringNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("String")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.StringNode]
  }
  
  inline def StyleSheetPlain(children: js.Array[CssNodePlain]): typingsJapgolly.cssTree.mod.StyleSheetPlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StyleSheet")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.StyleSheetPlain]
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
  
  inline def ValuePlain(children: js.Array[CssNodePlain]): typingsJapgolly.cssTree.mod.ValuePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Value")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.ValuePlain]
  }
  
  inline def WhiteSpace(value: String): typingsJapgolly.cssTree.mod.WhiteSpace = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WhiteSpace")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.WhiteSpace]
  }
}
