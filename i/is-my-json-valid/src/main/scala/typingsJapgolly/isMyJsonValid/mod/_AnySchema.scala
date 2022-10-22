package typingsJapgolly.isMyJsonValid.mod

import typingsJapgolly.isMyJsonValid.isMyJsonValidStrings.`null`
import typingsJapgolly.isMyJsonValid.isMyJsonValidStrings.boolean
import typingsJapgolly.isMyJsonValid.isMyJsonValidStrings.number
import typingsJapgolly.isMyJsonValid.isMyJsonValidStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _AnySchema extends StObject
object _AnySchema {
  
  inline def AnyOneOfSchema(oneOf: js.Array[AnySchema]): typingsJapgolly.isMyJsonValid.mod.AnyOneOfSchema = {
    val __obj = js.Dynamic.literal(oneOf = oneOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.isMyJsonValid.mod.AnyOneOfSchema]
  }
  
  inline def BooleanSchema(): typingsJapgolly.isMyJsonValid.mod.BooleanSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[typingsJapgolly.isMyJsonValid.mod.BooleanSchema]
  }
  
  inline def NullSchema(): typingsJapgolly.isMyJsonValid.mod.NullSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("null")
    __obj.asInstanceOf[typingsJapgolly.isMyJsonValid.mod.NullSchema]
  }
  
  inline def NullableBooleanSchema(`type`: js.Array[boolean | `null`]): typingsJapgolly.isMyJsonValid.mod.NullableBooleanSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.isMyJsonValid.mod.NullableBooleanSchema]
  }
  
  inline def NullableNumberSchema(`type`: js.Array[number | `null`]): typingsJapgolly.isMyJsonValid.mod.NullableNumberSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.isMyJsonValid.mod.NullableNumberSchema]
  }
  
  inline def NullableStringSchema(`type`: js.Array[string | `null`]): typingsJapgolly.isMyJsonValid.mod.NullableStringSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.isMyJsonValid.mod.NullableStringSchema]
  }
  
  inline def NumberSchema(): typingsJapgolly.isMyJsonValid.mod.NumberSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("number")
    __obj.asInstanceOf[typingsJapgolly.isMyJsonValid.mod.NumberSchema]
  }
  
  inline def StringSchema(): typingsJapgolly.isMyJsonValid.mod.StringSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typingsJapgolly.isMyJsonValid.mod.StringSchema]
  }
}
