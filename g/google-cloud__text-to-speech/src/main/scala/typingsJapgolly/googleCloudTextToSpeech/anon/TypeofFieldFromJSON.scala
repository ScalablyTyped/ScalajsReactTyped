package typingsJapgolly.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.bool
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.bytes
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.double
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.fixed32
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.fixed64
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.float
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.int32
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.int64
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.optional
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.repeated
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.required
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.sfixed32
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.sfixed64
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.sint32
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.sint64
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.string
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.uint32
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.uint64
import typingsJapgolly.googleGax.mod.protobufMinimal.Field
import typingsJapgolly.protobufjs.mod.Buffer
import typingsJapgolly.protobufjs.mod.Constructor
import typingsJapgolly.protobufjs.mod.FieldDecorator
import typingsJapgolly.protobufjs.mod.IField
import typingsJapgolly.protobufjs.mod.Long
import typingsJapgolly.protobufjs.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFieldFromJSON
  extends StObject
     with Instantiable3[/* name */ String, /* id */ Double, /* type */ String, Field] {
  
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes,
    fieldRule: optional | required | repeated,
    defaultValue: String
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: bool | bytes | double | fixed32 | fixed64 | float | int32 | int64 | sfixed32 | sfixed64 | sint32 | sint64 | string | uint32 | uint64,
    fieldRule: optional | repeated | required,
    defaultValue: js.Array[Boolean | Buffer | Double | Long | String | js.typedarray.Uint8Array]
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes,
    fieldRule: optional | required | repeated,
    defaultValue: js.typedarray.Uint8Array
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes,
    fieldRule: optional | required | repeated,
    defaultValue: Boolean
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes,
    fieldRule: optional | required | repeated,
    defaultValue: Double
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes,
    fieldRule: optional | required | repeated,
    defaultValue: Long
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes,
    fieldRule: Unit,
    defaultValue: String
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: bool | bytes | double | fixed32 | fixed64 | float | int32 | int64 | sfixed32 | sfixed64 | sint32 | sint64 | string | uint32 | uint64,
    fieldRule: Unit,
    defaultValue: js.Array[Boolean | Buffer | Double | Long | String | js.typedarray.Uint8Array]
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes,
    fieldRule: Unit,
    defaultValue: js.typedarray.Uint8Array
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes,
    fieldRule: Unit,
    defaultValue: Boolean
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes,
    fieldRule: Unit,
    defaultValue: Double
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes,
    fieldRule: Unit,
    defaultValue: Long
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: js.Object,
    fieldRule: optional | required | repeated,
    defaultValue: String
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: js.Object,
    fieldRule: optional | repeated | required,
    defaultValue: js.Array[Boolean | Buffer | Double | Long | String | js.typedarray.Uint8Array]
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: js.Object,
    fieldRule: optional | required | repeated,
    defaultValue: js.typedarray.Uint8Array
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: js.Object,
    fieldRule: optional | required | repeated,
    defaultValue: Boolean
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: js.Object,
    fieldRule: optional | required | repeated,
    defaultValue: Double
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: js.Object,
    fieldRule: optional | required | repeated,
    defaultValue: Long
  ): FieldDecorator = js.native
  def d(fieldId: Double, fieldType: js.Object, fieldRule: Unit, defaultValue: String): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: js.Object,
    fieldRule: Unit,
    defaultValue: js.Array[Boolean | Buffer | Double | Long | String | js.typedarray.Uint8Array]
  ): FieldDecorator = js.native
  def d(fieldId: Double, fieldType: js.Object, fieldRule: Unit, defaultValue: js.typedarray.Uint8Array): FieldDecorator = js.native
  def d(fieldId: Double, fieldType: js.Object, fieldRule: Unit, defaultValue: Boolean): FieldDecorator = js.native
  def d(fieldId: Double, fieldType: js.Object, fieldRule: Unit, defaultValue: Double): FieldDecorator = js.native
  def d(fieldId: Double, fieldType: js.Object, fieldRule: Unit, defaultValue: Long): FieldDecorator = js.native
  def d[T /* <: Double | (js.Array[Boolean | Buffer | Double | Long | String | js.typedarray.Uint8Array]) | Long | String | Boolean | js.typedarray.Uint8Array | Buffer */](
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes
  ): FieldDecorator = js.native
  def d[T /* <: Double | (js.Array[Boolean | Buffer | Double | Long | String | js.typedarray.Uint8Array]) | Long | String | Boolean | js.typedarray.Uint8Array | Buffer */](
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes,
    fieldRule: optional | required | repeated
  ): FieldDecorator = js.native
  def d[T /* <: Message[T] */](fieldId: Double, fieldType: String): FieldDecorator = js.native
  def d[T /* <: Message[T] */](fieldId: Double, fieldType: String, fieldRule: optional | required | repeated): FieldDecorator = js.native
  /**
    * Field decorator (TypeScript).
    * @param fieldId Field id
    * @param fieldType Field type
    * @param [fieldRule="optional"] Field rule
    * @param [defaultValue] Default value
    * @returns Decorator function
    */
  def d[T /* <: Double | (js.Array[Boolean | Buffer | Double | Long | String | js.typedarray.Uint8Array]) | Long | String | Boolean | js.typedarray.Uint8Array | Buffer */](fieldId: Double, fieldType: js.Object): FieldDecorator = js.native
  def d[T /* <: Double | (js.Array[Boolean | Buffer | Double | Long | String | js.typedarray.Uint8Array]) | Long | String | Boolean | js.typedarray.Uint8Array | Buffer */](fieldId: Double, fieldType: js.Object, fieldRule: optional | required | repeated): FieldDecorator = js.native
  /**
    * Field decorator (TypeScript).
    * @param fieldId Field id
    * @param fieldType Field type
    * @param [fieldRule="optional"] Field rule
    * @returns Decorator function
    */
  def d[T /* <: Message[T] */](fieldId: Double, fieldType: Constructor[T]): FieldDecorator = js.native
  def d[T /* <: Message[T] */](fieldId: Double, fieldType: Constructor[T], fieldRule: optional | required | repeated): FieldDecorator = js.native
  
  /**
    * Constructs a field from a field descriptor.
    * @param name Field name
    * @param json Field descriptor
    * @returns Created field
    * @throws {TypeError} If arguments are invalid
    */
  def fromJSON(name: String, json: IField): typingsJapgolly.protobufjs.mod.Field = js.native
}
