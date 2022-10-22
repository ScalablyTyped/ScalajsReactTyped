package typingsJapgolly.esquery.mod

import typingsJapgolly.esquery.esqueryStrings.adjacent
import typingsJapgolly.esquery.esqueryStrings.child
import typingsJapgolly.esquery.esqueryStrings.descendant
import typingsJapgolly.esquery.esqueryStrings.sibling
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinarySelectorAtom
  extends StObject
     with SubjectSelectorAtom {
  
  var left: SubjectSelector
  
  var right: SubjectSelector
  
  @JSName("type")
  var type_BinarySelectorAtom: child | sibling | adjacent | descendant
}
object BinarySelectorAtom {
  
  inline def apply(left: SubjectSelector, right: SubjectSelector, `type`: child | sibling | adjacent | descendant): BinarySelectorAtom = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinarySelectorAtom]
  }
  
  extension [Self <: BinarySelectorAtom](x: Self) {
    
    inline def setLeft(value: SubjectSelector): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: SubjectSelector): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: child | sibling | adjacent | descendant): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
