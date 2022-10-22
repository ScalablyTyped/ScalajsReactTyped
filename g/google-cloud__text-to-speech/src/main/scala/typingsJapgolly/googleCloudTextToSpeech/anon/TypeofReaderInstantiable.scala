package typingsJapgolly.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.googleGax.mod.fallback.protobufMinimal.Reader
import typingsJapgolly.protobufjs.mod.Buffer
import typingsJapgolly.protobufjs.mod.BufferReader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofReaderInstantiable
  extends StObject
     with Instantiable1[/* buffer */ js.typedarray.Uint8Array, Reader] {
  
  /**
    * Creates a new reader using the specified buffer.
    * @param buffer Buffer to read from
    * @returns A {@link BufferReader} if `buffer` is a Buffer, otherwise a {@link Reader}
    * @throws {Error} If `buffer` is not a valid buffer
    */
  def create(buffer: Buffer | js.typedarray.Uint8Array): typingsJapgolly.protobufjs.mod.Reader | BufferReader = js.native
}
