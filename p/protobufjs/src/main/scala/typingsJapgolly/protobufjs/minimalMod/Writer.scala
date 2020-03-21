package typingsJapgolly.protobufjs.minimalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs/minimal", "Writer")
@js.native
/** Constructs a new writer instance. */
class Writer ()
  extends typingsJapgolly.protobufjs.mod.Writer

/* static members */
@JSImport("protobufjs/minimal", "Writer")
@js.native
object Writer extends js.Object {
  /**
    * Allocates a buffer of the specified size.
    * @param size Buffer size
    * @returns Buffer
    */
  def alloc(size: Double): scala.scalajs.js.typedarray.Uint8Array = js.native
  /**
    * Creates a new writer.
    * @returns A {@link BufferWriter} when Buffers are supported, otherwise a {@link Writer}
    */
  def create(): typingsJapgolly.protobufjs.mod.BufferWriter | typingsJapgolly.protobufjs.mod.Writer = js.native
}

