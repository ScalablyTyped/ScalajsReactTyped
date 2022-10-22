package typingsJapgolly.domWebcodecs

import japgolly.scalajs.react.Callback
import org.scalajs.dom.DOMException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioEncoderInit extends StObject {
  
  def error(error: DOMException): Unit
  @JSName("error")
  var error_Original: WebCodecsErrorCallback
  
  def output(output: EncodedAudioChunk, metadata: EncodedAudioChunkMetadata): Unit
  @JSName("output")
  var output_Original: EncodedAudioChunkOutputCallback
}
object AudioEncoderInit {
  
  inline def apply(
    error: /* error */ DOMException => Callback,
    output: (/* output */ EncodedAudioChunk, /* metadata */ EncodedAudioChunkMetadata) => Callback
  ): AudioEncoderInit = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1((t0: /* error */ DOMException) => error(t0).runNow()), output = js.Any.fromFunction2((t0: /* output */ EncodedAudioChunk, t1: /* metadata */ EncodedAudioChunkMetadata) => (output(t0, t1)).runNow()))
    __obj.asInstanceOf[AudioEncoderInit]
  }
  
  extension [Self <: AudioEncoderInit](x: Self) {
    
    inline def setError(value: /* error */ DOMException => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* error */ DOMException) => value(t0).runNow()))
    
    inline def setOutput(value: (/* output */ EncodedAudioChunk, /* metadata */ EncodedAudioChunkMetadata) => Callback): Self = StObject.set(x, "output", js.Any.fromFunction2((t0: /* output */ EncodedAudioChunk, t1: /* metadata */ EncodedAudioChunkMetadata) => (value(t0, t1)).runNow()))
  }
}
