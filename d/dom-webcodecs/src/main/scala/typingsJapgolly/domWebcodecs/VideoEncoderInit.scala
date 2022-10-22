package typingsJapgolly.domWebcodecs

import japgolly.scalajs.react.Callback
import org.scalajs.dom.DOMException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoEncoderInit extends StObject {
  
  def error(error: DOMException): Unit
  @JSName("error")
  var error_Original: WebCodecsErrorCallback
  
  def output(chunk: EncodedVideoChunk, metadata: EncodedVideoChunkMetadata): Unit
  @JSName("output")
  var output_Original: EncodedVideoChunkOutputCallback
}
object VideoEncoderInit {
  
  inline def apply(
    error: /* error */ DOMException => Callback,
    output: (/* chunk */ EncodedVideoChunk, /* metadata */ EncodedVideoChunkMetadata) => Callback
  ): VideoEncoderInit = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1((t0: /* error */ DOMException) => error(t0).runNow()), output = js.Any.fromFunction2((t0: /* chunk */ EncodedVideoChunk, t1: /* metadata */ EncodedVideoChunkMetadata) => (output(t0, t1)).runNow()))
    __obj.asInstanceOf[VideoEncoderInit]
  }
  
  extension [Self <: VideoEncoderInit](x: Self) {
    
    inline def setError(value: /* error */ DOMException => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* error */ DOMException) => value(t0).runNow()))
    
    inline def setOutput(value: (/* chunk */ EncodedVideoChunk, /* metadata */ EncodedVideoChunkMetadata) => Callback): Self = StObject.set(x, "output", js.Any.fromFunction2((t0: /* chunk */ EncodedVideoChunk, t1: /* metadata */ EncodedVideoChunkMetadata) => (value(t0, t1)).runNow()))
  }
}
