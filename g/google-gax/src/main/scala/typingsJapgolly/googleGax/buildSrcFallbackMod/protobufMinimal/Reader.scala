package typingsJapgolly.googleGax.buildSrcFallbackMod.protobufMinimal

import typingsJapgolly.protobufjs.mod.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax/build/src/fallback", "protobufMinimal.Reader")
@js.native
open class Reader protected ()
  extends typingsJapgolly.protobufjs.minimalMod.Reader {
  /**
    * Constructs a new reader instance using the specified buffer.
    * @param buffer Buffer to read from
    */
  def this(buffer: js.typedarray.Uint8Array) = this()
}
/* static members */
object Reader {
  
  @JSImport("google-gax/build/src/fallback", "protobufMinimal.Reader")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new reader using the specified buffer.
    * @param buffer Buffer to read from
    * @returns A {@link BufferReader} if `buffer` is a Buffer, otherwise a {@link Reader}
    * @throws {Error} If `buffer` is not a valid buffer
    */
  inline def create(buffer: Buffer | js.typedarray.Uint8Array): typingsJapgolly.protobufjs.mod.Reader | typingsJapgolly.protobufjs.mod.BufferReader = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(buffer.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.protobufjs.mod.Reader | typingsJapgolly.protobufjs.mod.BufferReader]
}
