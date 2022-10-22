package typingsJapgolly.esquery.mod

import typingsJapgolly.esquery.esqueryStrings.sibling
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sibling
  extends StObject
     with BinarySelectorAtom
     with BinarySelector
     with Selector {
  
  @JSName("type")
  var type_Sibling: sibling
}
object Sibling {
  
  inline def apply(left: SubjectSelector, right: SubjectSelector): Sibling = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sibling")
    __obj.asInstanceOf[Sibling]
  }
  
  extension [Self <: Sibling](x: Self) {
    
    inline def setType(value: sibling): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
