package typingsJapgolly.esquery.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.esquery.mod.NthSelector
  - typingsJapgolly.esquery.mod.BinarySelector
  - typingsJapgolly.esquery.mod.MultiSelector
  - typingsJapgolly.esquery.mod.Identifier
  - typingsJapgolly.esquery.mod.Wildcard
  - typingsJapgolly.esquery.mod.Attribute
*/
trait SubjectSelector extends StObject
object SubjectSelector {
  
  inline def Adjacent(left: SubjectSelector, right: SubjectSelector): typingsJapgolly.esquery.mod.Adjacent = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("adjacent")
    __obj.asInstanceOf[typingsJapgolly.esquery.mod.Adjacent]
  }
  
  inline def Attribute(name: String): typingsJapgolly.esquery.mod.Attribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("attribute")
    __obj.asInstanceOf[typingsJapgolly.esquery.mod.Attribute]
  }
  
  inline def Child(left: SubjectSelector, right: SubjectSelector): typingsJapgolly.esquery.mod.Child = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("child")
    __obj.asInstanceOf[typingsJapgolly.esquery.mod.Child]
  }
  
  inline def Descendant(left: SubjectSelector, right: SubjectSelector): typingsJapgolly.esquery.mod.Descendant = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("descendant")
    __obj.asInstanceOf[typingsJapgolly.esquery.mod.Descendant]
  }
  
  inline def Has(selectors: js.Array[SubjectSelector]): typingsJapgolly.esquery.mod.Has = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("has")
    __obj.asInstanceOf[typingsJapgolly.esquery.mod.Has]
  }
  
  inline def Identifier(value: String): typingsJapgolly.esquery.mod.Identifier = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("identifier")
    __obj.asInstanceOf[typingsJapgolly.esquery.mod.Identifier]
  }
  
  inline def Matches_(selectors: js.Array[SubjectSelector]): typingsJapgolly.esquery.mod.Matches_ = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("matches")
    __obj.asInstanceOf[typingsJapgolly.esquery.mod.Matches_]
  }
  
  inline def Negation(selectors: js.Array[SubjectSelector]): typingsJapgolly.esquery.mod.Negation = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("not")
    __obj.asInstanceOf[typingsJapgolly.esquery.mod.Negation]
  }
  
  inline def NthChild(index: NumericLiteral): typingsJapgolly.esquery.mod.NthChild = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("nth-child")
    __obj.asInstanceOf[typingsJapgolly.esquery.mod.NthChild]
  }
  
  inline def NthLastChild(index: NumericLiteral): typingsJapgolly.esquery.mod.NthLastChild = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("nth-last-child")
    __obj.asInstanceOf[typingsJapgolly.esquery.mod.NthLastChild]
  }
  
  inline def Sequence(selectors: js.Array[SubjectSelector]): typingsJapgolly.esquery.mod.Sequence = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("compound")
    __obj.asInstanceOf[typingsJapgolly.esquery.mod.Sequence]
  }
  
  inline def Sibling(left: SubjectSelector, right: SubjectSelector): typingsJapgolly.esquery.mod.Sibling = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sibling")
    __obj.asInstanceOf[typingsJapgolly.esquery.mod.Sibling]
  }
  
  inline def Wildcard(): typingsJapgolly.esquery.mod.Wildcard = {
    val __obj = js.Dynamic.literal(value = "*")
    __obj.updateDynamic("type")("wildcard")
    __obj.asInstanceOf[typingsJapgolly.esquery.mod.Wildcard]
  }
}
