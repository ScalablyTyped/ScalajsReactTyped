package typingsJapgolly.levelTranscoder

import typingsJapgolly.levelTranscoder.levelTranscoderStrings.buffer
import typingsJapgolly.levelTranscoder.levelTranscoderStrings.utf8
import typingsJapgolly.levelTranscoder.levelTranscoderStrings.view
import typingsJapgolly.levelTranscoder.libEncodingMod.IEncoding
import typingsJapgolly.levelTranscoder.libEncodingMod.KnownEncoding
import typingsJapgolly.levelTranscoder.libEncodingMod.KnownEncodingName
import typingsJapgolly.levelTranscoder.libEncodingMod.MixedEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* note: abstract class */ @JSImport("level-transcoder", "Encoding")
  @js.native
  open class Encoding[TIn, TFormat, TOut] protected ()
    extends typingsJapgolly.levelTranscoder.libEncodingMod.Encoding[TIn, TFormat, TOut] {
    def this(options: IEncoding[TIn, TFormat, TOut]) = this()
  }
  
  @JSImport("level-transcoder", "Transcoder")
  @js.native
  open class Transcoder[T] protected () extends StObject {
    /**
      * Create a Transcoder.
      * @param formats Formats supported by consumer.
      */
    def this(formats: js.Array[buffer | view | utf8]) = this()
    
    def encoding(encoding: String): typingsJapgolly.levelTranscoder.libEncodingMod.Encoding[Any, T, Any] = js.native
    def encoding[N /* <: KnownEncodingName */](encoding: N): KnownEncoding[N, T] = js.native
    /**
      * Get the given encoding, creating a transcoder encoding if necessary.
      * @param encoding Named encoding or encoding object.
      */
    def encoding[TIn, TFormat, TOut](encoding: MixedEncoding[TIn, TFormat, TOut]): typingsJapgolly.levelTranscoder.libEncodingMod.Encoding[TIn, T, TOut] = js.native
    
    /**
      * Get an array of supported encoding objects.
      */
    def encodings(): js.Array[typingsJapgolly.levelTranscoder.libEncodingMod.Encoding[Any, T, Any]] = js.native
  }
}
