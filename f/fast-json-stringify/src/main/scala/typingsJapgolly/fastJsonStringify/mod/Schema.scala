package typingsJapgolly.fastJsonStringify.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fastJsonStringify.mod.RefSchema
  - typingsJapgolly.fastJsonStringify.mod.StringSchema
  - typingsJapgolly.fastJsonStringify.mod.IntegerSchema
  - typingsJapgolly.fastJsonStringify.mod.NumberSchema
  - typingsJapgolly.fastJsonStringify.mod.NullSchema
  - typingsJapgolly.fastJsonStringify.mod.BooleanSchema
  - typingsJapgolly.fastJsonStringify.mod.ArraySchema
  - typingsJapgolly.fastJsonStringify.mod.TupleSchema
  - typingsJapgolly.fastJsonStringify.mod.ObjectSchema
*/
trait Schema extends StObject
object Schema {
  
  inline def ArraySchema(items: Schema | js.Object): typingsJapgolly.fastJsonStringify.mod.ArraySchema = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[typingsJapgolly.fastJsonStringify.mod.ArraySchema]
  }
  
  inline def BooleanSchema(): typingsJapgolly.fastJsonStringify.mod.BooleanSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[typingsJapgolly.fastJsonStringify.mod.BooleanSchema]
  }
  
  inline def IntegerSchema(): typingsJapgolly.fastJsonStringify.mod.IntegerSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("integer")
    __obj.asInstanceOf[typingsJapgolly.fastJsonStringify.mod.IntegerSchema]
  }
  
  inline def NullSchema(): typingsJapgolly.fastJsonStringify.mod.NullSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("null")
    __obj.asInstanceOf[typingsJapgolly.fastJsonStringify.mod.NullSchema]
  }
  
  inline def NumberSchema(): typingsJapgolly.fastJsonStringify.mod.NumberSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("number")
    __obj.asInstanceOf[typingsJapgolly.fastJsonStringify.mod.NumberSchema]
  }
  
  inline def ObjectSchema(): typingsJapgolly.fastJsonStringify.mod.ObjectSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("object")
    __obj.asInstanceOf[typingsJapgolly.fastJsonStringify.mod.ObjectSchema]
  }
  
  inline def RefSchema($ref: String): typingsJapgolly.fastJsonStringify.mod.RefSchema = {
    val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.fastJsonStringify.mod.RefSchema]
  }
  
  inline def StringSchema(): typingsJapgolly.fastJsonStringify.mod.StringSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typingsJapgolly.fastJsonStringify.mod.StringSchema]
  }
  
  inline def TupleSchema(items: js.Array[Schema]): typingsJapgolly.fastJsonStringify.mod.TupleSchema = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[typingsJapgolly.fastJsonStringify.mod.TupleSchema]
  }
}
