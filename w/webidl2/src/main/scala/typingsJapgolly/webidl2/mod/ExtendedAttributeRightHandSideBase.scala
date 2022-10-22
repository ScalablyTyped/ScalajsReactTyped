package typingsJapgolly.webidl2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webidl2.mod.ExtendedAttributeRightHandSideIdentifier
  - typingsJapgolly.webidl2.mod.ExtendedAttributeRightHandSideString
  - typingsJapgolly.webidl2.mod.ExtendedAttributeRightHandSideDecimal
  - typingsJapgolly.webidl2.mod.ExtendedAttributeRightHandSideInteger
*/
trait ExtendedAttributeRightHandSideBase
  extends StObject
     with ExtendedAttributeRightHandSide
object ExtendedAttributeRightHandSideBase {
  
  inline def ExtendedAttributeRightHandSideDecimal(value: String): typingsJapgolly.webidl2.mod.ExtendedAttributeRightHandSideDecimal = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("decimal")
    __obj.asInstanceOf[typingsJapgolly.webidl2.mod.ExtendedAttributeRightHandSideDecimal]
  }
  
  inline def ExtendedAttributeRightHandSideIdentifier(value: String): typingsJapgolly.webidl2.mod.ExtendedAttributeRightHandSideIdentifier = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("identifier")
    __obj.asInstanceOf[typingsJapgolly.webidl2.mod.ExtendedAttributeRightHandSideIdentifier]
  }
  
  inline def ExtendedAttributeRightHandSideInteger(value: String): typingsJapgolly.webidl2.mod.ExtendedAttributeRightHandSideInteger = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("integer")
    __obj.asInstanceOf[typingsJapgolly.webidl2.mod.ExtendedAttributeRightHandSideInteger]
  }
  
  inline def ExtendedAttributeRightHandSideString(value: String): typingsJapgolly.webidl2.mod.ExtendedAttributeRightHandSideString = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typingsJapgolly.webidl2.mod.ExtendedAttributeRightHandSideString]
  }
}
