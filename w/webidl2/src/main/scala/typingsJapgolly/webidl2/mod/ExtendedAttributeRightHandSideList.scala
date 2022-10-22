package typingsJapgolly.webidl2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webidl2.mod.ExtendedAttributeRightHandSideIdentifierList
  - typingsJapgolly.webidl2.mod.ExtendedAttributeRightHandSideStringList
  - typingsJapgolly.webidl2.mod.ExtendedAttributeRightHandSideDecimalList
  - typingsJapgolly.webidl2.mod.ExtendedAttributeRightHandSideIntegerList
*/
trait ExtendedAttributeRightHandSideList
  extends StObject
     with ExtendedAttributeRightHandSide
object ExtendedAttributeRightHandSideList {
  
  inline def ExtendedAttributeRightHandSideDecimalList(value: js.Array[ExtendedAttributeRightHandSideDecimal]): typingsJapgolly.webidl2.mod.ExtendedAttributeRightHandSideDecimalList = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("decimal-list")
    __obj.asInstanceOf[typingsJapgolly.webidl2.mod.ExtendedAttributeRightHandSideDecimalList]
  }
  
  inline def ExtendedAttributeRightHandSideIdentifierList(value: js.Array[ExtendedAttributeRightHandSideIdentifier]): typingsJapgolly.webidl2.mod.ExtendedAttributeRightHandSideIdentifierList = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("identifier-list")
    __obj.asInstanceOf[typingsJapgolly.webidl2.mod.ExtendedAttributeRightHandSideIdentifierList]
  }
  
  inline def ExtendedAttributeRightHandSideIntegerList(value: js.Array[ExtendedAttributeRightHandSideInteger]): typingsJapgolly.webidl2.mod.ExtendedAttributeRightHandSideIntegerList = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("integer-list")
    __obj.asInstanceOf[typingsJapgolly.webidl2.mod.ExtendedAttributeRightHandSideIntegerList]
  }
  
  inline def ExtendedAttributeRightHandSideStringList(value: js.Array[ExtendedAttributeRightHandSideString]): typingsJapgolly.webidl2.mod.ExtendedAttributeRightHandSideStringList = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("string-list")
    __obj.asInstanceOf[typingsJapgolly.webidl2.mod.ExtendedAttributeRightHandSideStringList]
  }
}
