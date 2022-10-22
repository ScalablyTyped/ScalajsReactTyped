package typingsJapgolly.googleGax.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.googleGax.googleGaxStrings.bool
import typingsJapgolly.googleGax.googleGaxStrings.bytes
import typingsJapgolly.googleGax.googleGaxStrings.double
import typingsJapgolly.googleGax.googleGaxStrings.fixed32
import typingsJapgolly.googleGax.googleGaxStrings.fixed64
import typingsJapgolly.googleGax.googleGaxStrings.float
import typingsJapgolly.googleGax.googleGaxStrings.int32
import typingsJapgolly.googleGax.googleGaxStrings.int64
import typingsJapgolly.googleGax.googleGaxStrings.sfixed32
import typingsJapgolly.googleGax.googleGaxStrings.sfixed64
import typingsJapgolly.googleGax.googleGaxStrings.sint32
import typingsJapgolly.googleGax.googleGaxStrings.sint64
import typingsJapgolly.googleGax.googleGaxStrings.string
import typingsJapgolly.googleGax.googleGaxStrings.uint32
import typingsJapgolly.googleGax.googleGaxStrings.uint64
import typingsJapgolly.protobufjs.mod.Buffer
import typingsJapgolly.protobufjs.mod.Constructor
import typingsJapgolly.protobufjs.mod.FieldDecorator
import typingsJapgolly.protobufjs.mod.IMapField
import typingsJapgolly.protobufjs.mod.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax", "protobuf.MapField")
@js.native
open class MapField protected ()
  extends typingsJapgolly.protobufjs.mod.MapField {
  /**
    * Constructs a new map field instance.
    * @param name Unique name within its namespace
    * @param id Unique id within its namespace
    * @param keyType Key type
    * @param type Value type
    * @param [options] Declared options
    * @param [comment] Comment associated with this field
    */
  def this(name: String, id: Double, keyType: String, `type`: String) = this()
  def this(name: String, id: Double, keyType: String, `type`: String, options: StringDictionary[Any]) = this()
  def this(
    name: String,
    id: Double,
    keyType: String,
    `type`: String,
    options: StringDictionary[Any],
    comment: String
  ) = this()
  def this(name: String, id: Double, keyType: String, `type`: String, options: Unit, comment: String) = this()
}
/* static members */
object MapField {
  
  @JSImport("google-gax", "protobuf.MapField")
  @js.native
  val ^ : js.Any = js.native
  
  inline def d[T /* <: StringDictionary[
    Double | Long | String | Boolean | js.typedarray.Uint8Array | Buffer | js.Array[Double] | typingsJapgolly.protobufjs.mod.Message[js.Object]
  ] */](
    fieldId: Double,
    fieldKeyType: int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | bool | string,
    fieldValueType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | bool | string | bytes
  ): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldKeyType.asInstanceOf[js.Any], fieldValueType.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  /**
    * Map field decorator (TypeScript).
    * @param fieldId Field id
    * @param fieldKeyType Field key type
    * @param fieldValueType Field value type
    * @returns Decorator function
    */
  inline def d[T /* <: StringDictionary[
    Double | Long | String | Boolean | js.typedarray.Uint8Array | Buffer | js.Array[Double] | typingsJapgolly.protobufjs.mod.Message[js.Object]
  ] */](
    fieldId: Double,
    fieldKeyType: int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | bool | string,
    fieldValueType: js.Object
  ): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldKeyType.asInstanceOf[js.Any], fieldValueType.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d[T /* <: StringDictionary[
    Double | Long | String | Boolean | js.typedarray.Uint8Array | Buffer | js.Array[Double] | typingsJapgolly.protobufjs.mod.Message[js.Object]
  ] */](
    fieldId: Double,
    fieldKeyType: int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | bool | string,
    fieldValueType: Constructor[js.Object]
  ): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldKeyType.asInstanceOf[js.Any], fieldValueType.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  
  /**
    * Constructs a map field from a map field descriptor.
    * @param name Field name
    * @param json Map field descriptor
    * @returns Created map field
    * @throws {TypeError} If arguments are invalid
    */
  inline def fromJSON(name: String, json: IMapField): typingsJapgolly.protobufjs.mod.MapField = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(name.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.protobufjs.mod.MapField]
}
