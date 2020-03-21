package typingsJapgolly.protobufjs.mod.common

import typingsJapgolly.protobufjs.mod.INamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs", "common.get")
@js.native
object get extends js.Object {
  /**
    * Gets the root definition of the specified common proto file.
    *
    * Bundled definitions are:
    * - google/protobuf/any.proto
    * - google/protobuf/duration.proto
    * - google/protobuf/empty.proto
    * - google/protobuf/field_mask.proto
    * - google/protobuf/struct.proto
    * - google/protobuf/timestamp.proto
    * - google/protobuf/wrappers.proto
    *
    * @param file Proto file name
    * @returns Root definition or `null` if not defined
    */
  def apply(file: String): INamespace | Null = js.native
}

