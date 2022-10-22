package typingsJapgolly.esquery.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.esquery.mod.Descendant
  - typingsJapgolly.esquery.mod.Child
  - typingsJapgolly.esquery.mod.Sibling
  - typingsJapgolly.esquery.mod.Adjacent
*/
trait BinarySelector
  extends StObject
     with SubjectSelector
object BinarySelector {
  
  inline def Adjacent(left: SubjectSelector, right: SubjectSelector): typingsJapgolly.esquery.mod.Adjacent = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("adjacent")
    __obj.asInstanceOf[typingsJapgolly.esquery.mod.Adjacent]
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
  
  inline def Sibling(left: SubjectSelector, right: SubjectSelector): typingsJapgolly.esquery.mod.Sibling = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sibling")
    __obj.asInstanceOf[typingsJapgolly.esquery.mod.Sibling]
  }
}
