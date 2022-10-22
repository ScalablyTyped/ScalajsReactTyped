package typingsJapgolly.webidl2.mod

import typingsJapgolly.webidl2.webidl2Strings.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendedAttributeRightHandSideInteger
  extends StObject
     with ExtendedAttributeRightHandSideBase {
  
  var `type`: integer
  
  var value: String
}
object ExtendedAttributeRightHandSideInteger {
  
  inline def apply(value: String): ExtendedAttributeRightHandSideInteger = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("integer")
    __obj.asInstanceOf[ExtendedAttributeRightHandSideInteger]
  }
  
  extension [Self <: ExtendedAttributeRightHandSideInteger](x: Self) {
    
    inline def setType(value: integer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
