package typingsJapgolly.levelTranscoder

import typingsJapgolly.levelTranscoder.levelTranscoderStrings.format
import typingsJapgolly.levelTranscoder.libEncodingMod.Encoding
import typingsJapgolly.levelTranscoder.libEncodingMod.IEncoding
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatsMod {
  
  @JSImport("level-transcoder/lib/formats", "BufferFormat")
  @js.native
  open class BufferFormat[TIn, TOut] protected () extends Encoding[TIn, Buffer, TOut] {
    def this(options: Omit[IEncoding[TIn, Buffer, TOut], format]) = this()
  }
  
  @JSImport("level-transcoder/lib/formats", "UTF8Format")
  @js.native
  open class UTF8Format[TIn, TOut] protected () extends Encoding[TIn, String, TOut] {
    def this(options: Omit[IEncoding[TIn, String, TOut], format]) = this()
  }
  
  @JSImport("level-transcoder/lib/formats", "ViewFormat")
  @js.native
  open class ViewFormat[TIn, TOut] protected ()
    extends Encoding[TIn, js.typedarray.Uint8Array, TOut] {
    def this(options: Omit[IEncoding[TIn, js.typedarray.Uint8Array, TOut], format]) = this()
  }
}
