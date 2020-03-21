package typingsJapgolly.protobufjs.minimalMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.Constructor
import typingsJapgolly.protobufjs.mod.FieldDecorator
import typingsJapgolly.protobufjs.mod.IMapField
import typingsJapgolly.protobufjs.mod.Long
import typingsJapgolly.protobufjs.protobufjsStrings.bool
import typingsJapgolly.protobufjs.protobufjsStrings.bytes
import typingsJapgolly.protobufjs.protobufjsStrings.double
import typingsJapgolly.protobufjs.protobufjsStrings.fixed32
import typingsJapgolly.protobufjs.protobufjsStrings.fixed64
import typingsJapgolly.protobufjs.protobufjsStrings.float
import typingsJapgolly.protobufjs.protobufjsStrings.int32
import typingsJapgolly.protobufjs.protobufjsStrings.int64
import typingsJapgolly.protobufjs.protobufjsStrings.sfixed32
import typingsJapgolly.protobufjs.protobufjsStrings.sfixed64
import typingsJapgolly.protobufjs.protobufjsStrings.sint32
import typingsJapgolly.protobufjs.protobufjsStrings.sint64
import typingsJapgolly.protobufjs.protobufjsStrings.string
import typingsJapgolly.protobufjs.protobufjsStrings.uint32
import typingsJapgolly.protobufjs.protobufjsStrings.uint64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs/minimal", "MapField")
@js.native
class MapField protected ()
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
  def this(name: String, id: Double, keyType: String, `type`: String, options: StringDictionary[js.Any]) = this()
  def this(
    name: String,
    id: Double,
    keyType: String,
    `type`: String,
    options: StringDictionary[js.Any],
    comment: String
  ) = this()
}

/* static members */
@JSImport("protobufjs/minimal", "MapField")
@js.native
object MapField extends js.Object {
  /**
    * Map field decorator (TypeScript).
    * @param fieldId Field id
    * @param fieldKeyType Field key type
    * @param fieldValueType Field value type
    * @returns Decorator function
    */
  def d[T /* <: StringDictionary[
    Double | Long | String | Boolean | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Uint8Array | js.Array[Double] | typingsJapgolly.protobufjs.mod.Message[js.Object]
  ] */](
    fieldId: Double,
    fieldKeyType: int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | bool | string,
    fieldValueType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | bool | string | bytes | js.Object | Constructor[js.Object]
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

