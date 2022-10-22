package typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod

import typingsJapgolly.tokeyCssSelectorParser.anon.First
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.NamespacedNode
  - typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Attribute
  - typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Id
  - typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Class
  - typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.PseudoClass
  - typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.PseudoElement
  - typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Nesting
*/
trait FunctionalSelector
  extends StObject
     with _SelectorNode
object FunctionalSelector {
  
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
