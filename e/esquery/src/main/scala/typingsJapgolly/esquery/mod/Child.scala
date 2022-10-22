package typingsJapgolly.esquery.mod

import typingsJapgolly.esquery.esqueryStrings.child
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Child
  extends StObject
     with BinarySelectorAtom
     with BinarySelector
     with Selector {
  
  @JSName("type")
  var type_Child: child
}
object Child {
  
  inline def apply(left: SubjectSelector, right: SubjectSelector): Child = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("child")
    __obj.asInstanceOf[Child]
  }
  
  extension [Self <: Child](x: Self) {
    
    inline def setType(value: child): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
