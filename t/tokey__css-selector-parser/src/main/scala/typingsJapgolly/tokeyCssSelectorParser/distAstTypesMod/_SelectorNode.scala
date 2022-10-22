package typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod

import typingsJapgolly.tokeyCssSelectorParser.anon.First
import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Greaterthansign
import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Plussign
import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Tilde
import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.space
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _SelectorNode extends StObject
object _SelectorNode {
  
  inline def Attribute(end: Double, start: Double, value: String): typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Attribute = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("attribute")
    __obj.asInstanceOf[typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Attribute]
  }
  
  inline def Class(dotComments: SelectorNodes, end: Double, start: Double, value: String): typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Class = {
    val __obj = js.Dynamic.literal(dotComments = dotComments.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("class")
    __obj.asInstanceOf[typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Class]
  }
  
  inline def Combinator(
    after: String,
    before: String,
    combinator: space | Plussign | Tilde | Greaterthansign,
    end: Double,
    invalid: Boolean,
    start: Double,
    value: String
  ): typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Combinator = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], combinator = combinator.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("combinator")
    __obj.asInstanceOf[typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Combinator]
  }
  
  inline def Comment(after: String, before: String, end: Double, start: Double, value: String): typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Comment = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("comment")
    __obj.asInstanceOf[typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Comment]
  }
  
  inline def CompoundSelector(
    after: String,
    before: String,
    end: Double,
    invalid: Boolean,
    nodes: js.Array[
      SimpleSelector | Nesting | CommentWithNoSpacing | Invalid | PseudoElement | typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.CompoundSelector | Selector
    ],
    start: Double
  ): typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.CompoundSelector = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("compound_selector")
    __obj.asInstanceOf[typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.CompoundSelector]
  }
  
  inline def Id(end: Double, start: Double, value: String): typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Id = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("id")
    __obj.asInstanceOf[typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Id]
  }
  
  inline def Nesting(end: Double, start: Double): typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Nesting = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = "&")
    __obj.updateDynamic("type")("nesting")
    __obj.asInstanceOf[typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Nesting]
  }
  
  inline def Nth(after: String, before: String, end: Double, nodes: js.Array[NthNode], start: Double): typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Nth = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("nth")
    __obj.asInstanceOf[typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Nth]
  }
  
  inline def PseudoClass(colonComments: js.Array[Comment], end: Double, start: Double, value: String): typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.PseudoClass = {
    val __obj = js.Dynamic.literal(colonComments = colonComments.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pseudo_class")
    __obj.asInstanceOf[typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.PseudoClass]
  }
  
  inline def PseudoElement(colonComments: First, end: Double, start: Double, value: String): typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.PseudoElement = {
    val __obj = js.Dynamic.literal(colonComments = colonComments.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pseudo_element")
    __obj.asInstanceOf[typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.PseudoElement]
  }
  
  inline def Selector(after: String, before: String, end: Double, nodes: SelectorNodes, start: Double): typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Selector = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("selector")
    __obj.asInstanceOf[typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Selector]
  }
  
  inline def Type(end: Double, start: Double, value: String): typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Type = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Type]
  }
  
  inline def Universal(end: Double, start: Double, value: String): typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Universal = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("universal")
    __obj.asInstanceOf[typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Universal]
  }
}
