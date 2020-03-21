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
import typingsJapgolly.apolloProtobufjs.apolloProtobufjsStrings.sfixed32
import typingsJapgolly.apolloProtobufjs.apolloProtobufjsStrings.sfixed64
import typingsJapgolly.apolloProtobufjs.apolloProtobufjsStrings.sint32
import typingsJapgolly.apolloProtobufjs.apolloProtobufjsStrings.sint64
import typingsJapgolly.apolloProtobufjs.apolloProtobufjsStrings.string
import typingsJapgolly.apolloProtobufjs.apolloProtobufjsStrings.uint32
import typingsJapgolly.apolloProtobufjs.apolloProtobufjsStrings.uint64
import typingsJapgolly.long.mod.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/protobufjs", "MapField")
@js.native
class MapField protected () extends FieldBase {
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
  /** Key type. */
  var keyType: String = js.native
  /** Resolved key type if not a basic type. */
  var resolvedKeyType: ReflectionObject | Null = js.native
}

/* static members */
@JSImport("@apollo/protobufjs", "MapField")
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
    Double | Long | String | Boolean | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Uint8Array | js.Array[Double] | Message[js.Object]
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
  def fromJSON(name: String, json: IMapField): MapField = js.native
}

