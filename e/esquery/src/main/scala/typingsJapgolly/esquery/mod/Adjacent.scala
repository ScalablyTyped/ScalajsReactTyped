package typingsJapgolly.esquery.mod

import typingsJapgolly.esquery.esqueryStrings.adjacent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Adjacent
  extends StObject
     with BinarySelectorAtom
     with BinarySelector
     with Selector {
  
  @JSName("type")
  var type_Adjacent: adjacent
}
object Adjacent {
  
  inline def apply(left: SubjectSelector, right: SubjectSelector): Adjacent = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("adjacent")
    __obj.asInstanceOf[Adjacent]
  }
  
  extension [Self <: Adjacent](x: Self) {
    
    inline def setType(value: adjacent): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
