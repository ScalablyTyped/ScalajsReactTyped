package typingsJapgolly.cssTree.mod

import typingsJapgolly.cssTree.cssTreeStrings.Function
import typingsJapgolly.cssTree.cssTreeStrings.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  - typingsJapgolly.cssTree.mod.HexColor
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
  - typingsJapgolly.cssTree.mod.Url
  - typingsJapgolly.cssTree.mod.ValuePlain
  - typingsJapgolly.cssTree.mod.WhiteSpace
*/
trait CssNodePlain extends js.Object

object CssNodePlain {
  @scala.inline
  def AtrulePlain(
    name: String,
    `type`: typingsJapgolly.cssTree.cssTreeStrings.Atrule,
    block: BlockPlain = null,
    loc: CssLocation = null,
    prelude: AtrulePreludePlain | Raw = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (block != null) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (prelude != null) __obj.updateDynamic("prelude")(prelude.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def FunctionNodePlain(children: js.Array[CssNodePlain], name: String, `type`: Function, loc: CssLocation = null): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def Percentage(`type`: typingsJapgolly.cssTree.cssTreeStrings.Percentage, value: String, loc: CssLocation = null): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def NthPlain(
    nth: AnPlusB | Identifier,
    `type`: typingsJapgolly.cssTree.cssTreeStrings.Nth,
    loc: CssLocation = null,
    selector: SelectorListPlain = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(nth = nth.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def Comment(`type`: typingsJapgolly.cssTree.cssTreeStrings.Comment, value: String, loc: CssLocation = null): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def StyleSheetPlain(
    children: js.Array[CssNodePlain],
    `type`: typingsJapgolly.cssTree.cssTreeStrings.StyleSheet,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def MediaQueryListPlain(
    children: js.Array[CssNodePlain],
    `type`: typingsJapgolly.cssTree.cssTreeStrings.MediaQueryList,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def MediaQueryPlain(
    children: js.Array[CssNodePlain],
    `type`: typingsJapgolly.cssTree.cssTreeStrings.MediaQuery,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def Url(
    `type`: typingsJapgolly.cssTree.cssTreeStrings.Url,
    value: StringNode | Raw,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def ClassSelector(
    name: String,
    `type`: typingsJapgolly.cssTree.cssTreeStrings.ClassSelector,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def DeclarationListPlain(
    children: js.Array[CssNodePlain],
    `type`: typingsJapgolly.cssTree.cssTreeStrings.DeclarationList,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def BracketsPlain(
    children: js.Array[CssNodePlain],
    `type`: typingsJapgolly.cssTree.cssTreeStrings.Brackets,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def MediaFeature(
    name: String,
    `type`: typingsJapgolly.cssTree.cssTreeStrings.MediaFeature,
    loc: CssLocation = null,
    value: Identifier | NumberNode | Dimension | Ratio = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def ParenthesesPlain(
    children: js.Array[CssNodePlain],
    `type`: typingsJapgolly.cssTree.cssTreeStrings.Parentheses,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def AttributeSelector(
    name: Identifier,
    `type`: typingsJapgolly.cssTree.cssTreeStrings.AttributeSelector,
    flags: String = null,
    loc: CssLocation = null,
    matcher: String = null,
    value: StringNode | Identifier = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (matcher != null) __obj.updateDynamic("matcher")(matcher.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def PseudoElementSelectorPlain(
    name: String,
    `type`: typingsJapgolly.cssTree.cssTreeStrings.PseudoElementSelector,
    children: js.Array[CssNodePlain] = null,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def Dimension(
    `type`: typingsJapgolly.cssTree.cssTreeStrings.Dimension,
    unit: String,
    value: String,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def CDO(`type`: typingsJapgolly.cssTree.cssTreeStrings.CDO, loc: CssLocation = null): CssNodePlain = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def Operator(`type`: typingsJapgolly.cssTree.cssTreeStrings.Operator, value: String, loc: CssLocation = null): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def Ratio(
    left: String,
    right: String,
    `type`: typingsJapgolly.cssTree.cssTreeStrings.Ratio,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def SelectorListPlain(
    children: js.Array[CssNodePlain],
    `type`: typingsJapgolly.cssTree.cssTreeStrings.SelectorList,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def NumberNode(`type`: Number, value: String, loc: CssLocation = null): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def HexColor(`type`: typingsJapgolly.cssTree.cssTreeStrings.HexColor, value: String, loc: CssLocation = null): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def Raw(`type`: typingsJapgolly.cssTree.cssTreeStrings.Raw, value: String, loc: CssLocation = null): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def WhiteSpace(`type`: typingsJapgolly.cssTree.cssTreeStrings.WhiteSpace, value: String, loc: CssLocation = null): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def BlockPlain(
    children: js.Array[CssNodePlain],
    `type`: typingsJapgolly.cssTree.cssTreeStrings.Block,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def ValuePlain(
    children: js.Array[CssNodePlain],
    `type`: typingsJapgolly.cssTree.cssTreeStrings.Value,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def AtrulePreludePlain(
    children: js.Array[CssNodePlain],
    `type`: typingsJapgolly.cssTree.cssTreeStrings.AtrulePrelude,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def CDC(`type`: typingsJapgolly.cssTree.cssTreeStrings.CDC, loc: CssLocation = null): CssNodePlain = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def TypeSelector(name: String, `type`: typingsJapgolly.cssTree.cssTreeStrings.TypeSelector, loc: CssLocation = null): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def StringNode(`type`: typingsJapgolly.cssTree.cssTreeStrings.String, value: String, loc: CssLocation = null): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def PseudoClassSelectorPlain(
    name: String,
    `type`: typingsJapgolly.cssTree.cssTreeStrings.PseudoClassSelector,
    children: js.Array[CssNodePlain] = null,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def Identifier(name: String, `type`: typingsJapgolly.cssTree.cssTreeStrings.Identifier, loc: CssLocation = null): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def AnPlusB(
    `type`: typingsJapgolly.cssTree.cssTreeStrings.AnPlusB,
    a: String = null,
    b: String = null,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (a != null) __obj.updateDynamic("a")(a.asInstanceOf[js.Any])
    if (b != null) __obj.updateDynamic("b")(b.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def SelectorPlain(
    children: js.Array[CssNodePlain],
    `type`: typingsJapgolly.cssTree.cssTreeStrings.Selector,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def DeclarationPlain(
    important: Boolean | String,
    property: String,
    `type`: typingsJapgolly.cssTree.cssTreeStrings.Declaration,
    value: ValuePlain | Raw,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(important = important.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def Combinator(name: String, `type`: typingsJapgolly.cssTree.cssTreeStrings.Combinator, loc: CssLocation = null): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def IdSelector(name: String, `type`: typingsJapgolly.cssTree.cssTreeStrings.IdSelector, loc: CssLocation = null): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def UnicodeRange(
    `type`: typingsJapgolly.cssTree.cssTreeStrings.UnicodeRange,
    value: String,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def RulePlain(
    block: BlockPlain,
    prelude: SelectorListPlain | Raw,
    `type`: typingsJapgolly.cssTree.cssTreeStrings.Rule,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], prelude = prelude.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
}

