package typingsJapgolly.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.bool
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.bytes
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.double
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.fixed32
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.fixed64
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.float
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.int32
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.int64
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.sfixed32
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.sfixed64
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.sint32
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.sint64
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.string
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.uint32
import typingsJapgolly.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.uint64
import typingsJapgolly.googleGax.mod.fallback.protobuf.MapField
import typingsJapgolly.protobufjs.mod.Buffer
import typingsJapgolly.protobufjs.mod.Constructor
import typingsJapgolly.protobufjs.mod.FieldDecorator
import typingsJapgolly.protobufjs.mod.IMapField
import typingsJapgolly.protobufjs.mod.Long
import typingsJapgolly.protobufjs.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofMapField
  extends StObject
     with Instantiable4[/* name */ String, /* id */ Double, /* keyType */ String, /* type */ String, MapField] {
  
  def d[T /* <: StringDictionary[
    Double | Long | String | Boolean | js.typedarray.Uint8Array | Buffer | js.Array[Double] | Message[js.Object]
  ] */](
    fieldId: Double,
    fieldKeyType: int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | bool | string,
    fieldValueType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | bool | string | bytes
  ): FieldDecorator = js.native
  /**
    * Map field decorator (TypeScript).
    * @param fieldId Field id
    * @param fieldKeyType Field key type
    * @param fieldValueType Field value type
    * @returns Decorator function
    */
  def d[T /* <: StringDictionary[
    Double | Long | String | Boolean | js.typedarray.Uint8Array | Buffer | js.Array[Double] | Message[js.Object]
  ] */](
    fieldId: Double,
    fieldKeyType: int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | bool | string,
    fieldValueType: js.Object
  ): FieldDecorator = js.native
  def d[T /* <: StringDictionary[
    Double | Long | String | Boolean | js.typedarray.Uint8Array | Buffer | js.Array[Double] | Message[js.Object]
  ] */](
    fieldId: Double,
    fieldKeyType: int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | bool | string,
    fieldValueType: Constructor[js.Object]
  ): FieldDecorator = js.native
  
  /**
    * Constructs a map field from a map field descriptor.
    * @param name Field name
    * @param json Map field descriptor
    * @returns Created map field
    * @throws {TypeError} If arguments are invalid
    */
  def fromJSON(name: String, json: IMapField): typingsJapgolly.protobufjs.mod.MapField = js.native
}
