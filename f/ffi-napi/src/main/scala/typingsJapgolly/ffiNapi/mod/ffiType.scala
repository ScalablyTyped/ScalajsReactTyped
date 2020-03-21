package typingsJapgolly.ffiNapi.mod

import typingsJapgolly.ffiNapi.Buffer
import typingsJapgolly.refNapi.mod.Type
import typingsJapgolly.refStructDi.mod.StructType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ffi-napi", "ffiType")
@js.native
object ffiType extends js.Object {
  @JSName("FFI_TYPE")
  var FFI_TYPE_Original: StructType = js.native
  def apply(`type`: String): Buffer = js.native
  /** Get a `ffi_type *` Buffer appropriate for the given type. */
  def apply(`type`: Type): Buffer = js.native
  def FFI_TYPE(): js.Any = js.native
  /** Pass it an existing Buffer instance to use that as the backing buffer. */
  def FFI_TYPE(arg: typingsJapgolly.node.Buffer): js.Any = js.native
  def FFI_TYPE(arg: typingsJapgolly.node.Buffer, data: js.Object): js.Any = js.native
  def FFI_TYPE(data: js.Object): js.Any = js.native
}

