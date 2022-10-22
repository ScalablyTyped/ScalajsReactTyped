package typingsJapgolly.protobufjs.global.protobuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("protobuf.Writer")
@js.native
/** Constructs a new writer instance. */
open class Writer ()
  extends typingsJapgolly.protobufjs.mod.Writer
/* static members */
object Writer {
  
  @JSGlobal("protobuf.Writer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Allocates a buffer of the specified size.
    * @param size Buffer size
    * @returns Buffer
    */
  inline def alloc(size: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  /**
    * Creates a new writer.
    * @returns A {@link BufferWriter} when Buffers are supported, otherwise a {@link Writer}
    */
  inline def create(): typingsJapgolly.protobufjs.mod.BufferWriter | typingsJapgolly.protobufjs.mod.Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typingsJapgolly.protobufjs.mod.BufferWriter | typingsJapgolly.protobufjs.mod.Writer]
}
