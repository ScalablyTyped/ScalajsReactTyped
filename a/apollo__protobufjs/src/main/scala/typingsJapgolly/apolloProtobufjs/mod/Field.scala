package typingsJapgolly.apolloProtobufjs.mod

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
import typingsJapgolly.long.mod.Long
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/protobufjs", "Field")
@js.native
class Field protected () extends FieldBase {
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
  def this(name: String, id: Double, `type`: String, rule: StringDictionary[js.Any]) = this()
  def this(name: String, id: Double, `type`: String, rule: String, extend: String) = this()
  def this(name: String, id: Double, `type`: String, rule: String, extend: StringDictionary[js.Any]) = this()
  def this(name: String, id: Double, `type`: String, rule: StringDictionary[js.Any], extend: String) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: StringDictionary[js.Any],
    extend: StringDictionary[js.Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: String,
    extend: String,
    options: StringDictionary[js.Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: String,
    extend: StringDictionary[js.Any],
    options: StringDictionary[js.Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: StringDictionary[js.Any],
    extend: String,
    options: StringDictionary[js.Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: StringDictionary[js.Any],
    extend: StringDictionary[js.Any],
    options: StringDictionary[js.Any]
  ) = this()
  /** Determines whether this field is packed. Only relevant when repeated and working with proto2. */
  val packed: Boolean = js.native
}

/* static members */
@JSImport("@apollo/protobufjs", "Field")
@js.native
object Field extends js.Object {
  /**
    * Field decorator (TypeScript).
    * @param fieldId Field id
    * @param fieldType Field type
    * @param [fieldRule="optional"] Field rule
    * @param [defaultValue] Default value
    * @returns Decorator function
    */
  def d(
    fieldId: Double,
    fieldType: js.Object | bool | bytes | double | fixed32 | fixed64 | float | int32 | int64 | sfixed32 | sfixed64 | sint32 | sint64 | string | uint32 | uint64
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: js.Object | bool | bytes | double | fixed32 | fixed64 | float | int32 | int64 | sfixed32 | sfixed64 | sint32 | sint64 | string | uint32 | uint64,
    fieldRule: optional
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: optional,
    defaultValue: String
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: js.Object | bool | bytes | double | fixed32 | fixed64 | float | int32 | int64 | sfixed32 | sfixed64 | sint32 | sint64 | string | uint32 | uint64,
    fieldRule: optional,
    defaultValue: js.Array[Boolean | Buffer | Double | Long | String | Uint8Array]
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: optional,
    defaultValue: Boolean
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: optional,
    defaultValue: Double
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: optional,
    defaultValue: Uint8Array
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: js.Object | bool | bytes | double | fixed32 | fixed64 | float | int32 | int64 | sfixed32 | sfixed64 | sint32 | sint64 | string | uint32 | uint64,
    fieldRule: repeated
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: repeated,
    defaultValue: String
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: js.Object | bool | bytes | double | fixed32 | fixed64 | float | int32 | int64 | sfixed32 | sfixed64 | sint32 | sint64 | string | uint32 | uint64,
    fieldRule: repeated,
    defaultValue: js.Array[Boolean | Buffer | Double | Long | String | Uint8Array]
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: repeated,
    defaultValue: Boolean
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: repeated,
    defaultValue: Double
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: repeated,
    defaultValue: Uint8Array
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: js.Object | bool | bytes | double | fixed32 | fixed64 | float | int32 | int64 | sfixed32 | sfixed64 | sint32 | sint64 | string | uint32 | uint64,
    fieldRule: required
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: required,
    defaultValue: String
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: js.Object | bool | bytes | double | fixed32 | fixed64 | float | int32 | int64 | sfixed32 | sfixed64 | sint32 | sint64 | string | uint32 | uint64,
    fieldRule: required,
    defaultValue: js.Array[Boolean | Buffer | Double | Long | String | Uint8Array]
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: required,
    defaultValue: Boolean
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: required,
    defaultValue: Double
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: required,
    defaultValue: Uint8Array
  ): FieldDecorator = js.native
  def d[T /* <: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias long.long.Long */ js.Object */](
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: optional,
    defaultValue: T
  ): FieldDecorator = js.native
  def d[T /* <: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias long.long.Long */ js.Object */](
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: repeated,
    defaultValue: T
  ): FieldDecorator = js.native
  def d[T /* <: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias long.long.Long */ js.Object */](
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: required,
    defaultValue: T
  ): FieldDecorator = js.native
  def d[T /* <: Message[T] */](fieldId: Double, fieldType: String): FieldDecorator = js.native
  /**
    * Field decorator (TypeScript).
    * @param fieldId Field id
    * @param fieldType Field type
    * @param [fieldRule="optional"] Field rule
    * @returns Decorator function
    */
  def d[T /* <: Message[T] */](fieldId: Double, fieldType: Constructor[T]): FieldDecorator = js.native
  @JSName("d")
  def d_T_Object[T /* <: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias long.long.Long */ js.Object */](
    fieldId: Double,
    fieldType: js.Object | bool | bytes | double | fixed32 | fixed64 | float | int32 | int64 | sfixed32 | sfixed64 | sint32 | sint64 | string | uint32 | uint64
  ): FieldDecorator = js.native
  @JSName("d")
  def d_T_Object[T /* <: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias long.long.Long */ js.Object */](
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: optional
  ): FieldDecorator = js.native
  @JSName("d")
  def d_T_Object[T /* <: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias long.long.Long */ js.Object */](
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: repeated
  ): FieldDecorator = js.native
  @JSName("d")
  def d_T_Object[T /* <: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias long.long.Long */ js.Object */](
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: required
  ): FieldDecorator = js.native
  @JSName("d")
  def d_optional[T /* <: Message[T] */](fieldId: Double, fieldType: String, fieldRule: optional): FieldDecorator = js.native
  @JSName("d")
  def d_optional[T /* <: Message[T] */](fieldId: Double, fieldType: Constructor[T], fieldRule: optional): FieldDecorator = js.native
  @JSName("d")
  def d_repeated[T /* <: Message[T] */](fieldId: Double, fieldType: String, fieldRule: repeated): FieldDecorator = js.native
  @JSName("d")
  def d_repeated[T /* <: Message[T] */](fieldId: Double, fieldType: Constructor[T], fieldRule: repeated): FieldDecorator = js.native
  @JSName("d")
  def d_required[T /* <: Message[T] */](fieldId: Double, fieldType: String, fieldRule: required): FieldDecorator = js.native
  @JSName("d")
  def d_required[T /* <: Message[T] */](fieldId: Double, fieldType: Constructor[T], fieldRule: required): FieldDecorator = js.native
  /**
    * Constructs a field from a field descriptor.
    * @param name Field name
    * @param json Field descriptor
    * @returns Created field
    * @throws {TypeError} If arguments are invalid
    */
  def fromJSON(name: String, json: IField): Field = js.native
}

