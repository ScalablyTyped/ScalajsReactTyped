package typingsJapgolly.apolloProtobufjs.minimalMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloProtobufjs.apolloProtobufjsStrings.bool
import typingsJapgolly.apolloProtobufjs.apolloProtobufjsStrings.bytes
import typingsJapgolly.apolloProtobufjs.apolloProtobufjsStrings.double
import typingsJapgolly.apolloProtobufjs.apolloProtobufjsStrings.fixed32
import typingsJapgolly.apolloProtobufjs.apolloProtobufjsStrings.fixed64
import typingsJapgolly.apolloProtobufjs.apolloProtobufjsStrings.float
import typingsJapgolly.apolloProtobufjs.apolloProtobufjsStrings.int32
import typingsJapgolly.apolloProtobufjs.apolloProtobufjsStrings.int64
import typingsJapgolly.apolloProtobufjs.apolloProtobufjsStrings.optional
import typingsJapgolly.apolloProtobufjs.apolloProtobufjsStrings.repeated
import typingsJapgolly.apolloProtobufjs.apolloProtobufjsStrings.required
import typingsJapgolly.apolloProtobufjs.apolloProtobufjsStrings.sfixed32
import typingsJapgolly.apolloProtobufjs.apolloProtobufjsStrings.sfixed64
import typingsJapgolly.apolloProtobufjs.apolloProtobufjsStrings.sint32
import typingsJapgolly.apolloProtobufjs.apolloProtobufjsStrings.sint64
import typingsJapgolly.apolloProtobufjs.apolloProtobufjsStrings.string
import typingsJapgolly.apolloProtobufjs.apolloProtobufjsStrings.uint32
import typingsJapgolly.apolloProtobufjs.apolloProtobufjsStrings.uint64
import typingsJapgolly.apolloProtobufjs.mod.Constructor
import typingsJapgolly.apolloProtobufjs.mod.FieldDecorator
import typingsJapgolly.apolloProtobufjs.mod.IField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs/minimal", "Field")
@js.native
open class Field protected ()
  extends typingsJapgolly.apolloProtobufjs.mod.Field {
  /**
    * Constructs a new message field instance. Note that {@link MapField|map fields} have their own class.
    * @param name Unique name within its namespace
    * @param id Unique id within its namespace
    * @param type Value type
    * @param [rule="optional"] Field rule
    * @param [extend] Extended type if different from parent
    * @param [options] Declared options
    */
  def this(name: String, id: Double, `type`: String) = this()
  def this(name: String, id: Double, `type`: String, rule: String) = this()
  def this(name: String, id: Double, `type`: String, rule: StringDictionary[Any]) = this()
  def this(name: String, id: Double, `type`: String, rule: String, extend: String) = this()
  def this(name: String, id: Double, `type`: String, rule: String, extend: StringDictionary[Any]) = this()
  def this(name: String, id: Double, `type`: String, rule: StringDictionary[Any], extend: String) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: StringDictionary[Any],
    extend: StringDictionary[Any]
  ) = this()
  def this(name: String, id: Double, `type`: String, rule: Unit, extend: String) = this()
  def this(name: String, id: Double, `type`: String, rule: Unit, extend: StringDictionary[Any]) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: String,
    extend: String,
    options: StringDictionary[Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: String,
    extend: StringDictionary[Any],
    options: StringDictionary[Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: String,
    extend: Unit,
    options: StringDictionary[Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: StringDictionary[Any],
    extend: String,
    options: StringDictionary[Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: StringDictionary[Any],
    extend: StringDictionary[Any],
    options: StringDictionary[Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: StringDictionary[Any],
    extend: Unit,
    options: StringDictionary[Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: Unit,
    extend: String,
    options: StringDictionary[Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: Unit,
    extend: StringDictionary[Any],
    options: StringDictionary[Any]
  ) = this()
  def this(name: String, id: Double, `type`: String, rule: Unit, extend: Unit, options: StringDictionary[Any]) = this()
}
/* static members */
object Field {
  
  @JSImport("@apollo/protobufjs/minimal", "Field")
  @js.native
  val ^ : js.Any = js.native
  
  inline def d[T /* <: Double | (js.Array[Boolean | js.typedarray.Uint8Array | Double | String]) | String | Boolean | js.typedarray.Uint8Array */](
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes
  ): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d[T /* <: Double | (js.Array[Boolean | js.typedarray.Uint8Array | Double | String]) | String | Boolean | js.typedarray.Uint8Array */](
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes,
    fieldRule: optional | required | repeated
  ): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d[T /* <: Double | (js.Array[Boolean | js.typedarray.Uint8Array | Double | String]) | String | Boolean | js.typedarray.Uint8Array */](
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes,
    fieldRule: optional | required | repeated,
    defaultValue: T
  ): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d[T /* <: Double | (js.Array[Boolean | js.typedarray.Uint8Array | Double | String]) | String | Boolean | js.typedarray.Uint8Array */](
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes,
    fieldRule: Unit,
    defaultValue: T
  ): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d[T /* <: typingsJapgolly.apolloProtobufjs.mod.Message[T] */](fieldId: Double, fieldType: String): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d[T /* <: typingsJapgolly.apolloProtobufjs.mod.Message[T] */](fieldId: Double, fieldType: String, fieldRule: optional | required | repeated): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  /**
    * Field decorator (TypeScript).
    * @param fieldId Field id
    * @param fieldType Field type
    * @param [fieldRule="optional"] Field rule
    * @param [defaultValue] Default value
    * @returns Decorator function
    */
  inline def d[T /* <: Double | (js.Array[Boolean | js.typedarray.Uint8Array | Double | String]) | String | Boolean | js.typedarray.Uint8Array */](fieldId: Double, fieldType: js.Object): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d[T /* <: Double | (js.Array[Boolean | js.typedarray.Uint8Array | Double | String]) | String | Boolean | js.typedarray.Uint8Array */](fieldId: Double, fieldType: js.Object, fieldRule: optional | required | repeated): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d[T /* <: Double | (js.Array[Boolean | js.typedarray.Uint8Array | Double | String]) | String | Boolean | js.typedarray.Uint8Array */](fieldId: Double, fieldType: js.Object, fieldRule: optional | required | repeated, defaultValue: T): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d[T /* <: Double | (js.Array[Boolean | js.typedarray.Uint8Array | Double | String]) | String | Boolean | js.typedarray.Uint8Array */](fieldId: Double, fieldType: js.Object, fieldRule: Unit, defaultValue: T): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  /**
    * Field decorator (TypeScript).
    * @param fieldId Field id
    * @param fieldType Field type
    * @param [fieldRule="optional"] Field rule
    * @returns Decorator function
    */
  inline def d[T /* <: typingsJapgolly.apolloProtobufjs.mod.Message[T] */](fieldId: Double, fieldType: Constructor[T]): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d[T /* <: typingsJapgolly.apolloProtobufjs.mod.Message[T] */](fieldId: Double, fieldType: Constructor[T], fieldRule: optional | required | repeated): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  
  /**
    * Constructs a field from a field descriptor.
    * @param name Field name
    * @param json Field descriptor
    * @returns Created field
    * @throws {TypeError} If arguments are invalid
    */
  inline def fromJSON(name: String, json: IField): typingsJapgolly.apolloProtobufjs.mod.Field = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(name.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.apolloProtobufjs.mod.Field]
}
