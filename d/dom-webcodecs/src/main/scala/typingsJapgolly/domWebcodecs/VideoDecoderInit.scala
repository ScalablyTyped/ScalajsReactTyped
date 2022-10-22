package typingsJapgolly.domWebcodecs

import japgolly.scalajs.react.Callback
import org.scalajs.dom.DOMException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoDecoderInit extends StObject {
  
  def error(error: DOMException): Unit
  @JSName("error")
  var error_Original: WebCodecsErrorCallback
  
  def output(output: VideoFrame): Unit
  @JSName("output")
  var output_Original: VideoFrameOutputCallback
}
object VideoDecoderInit {
  
  inline def apply(error: /* error */ DOMException => Callback, output: /* output */ VideoFrame => Callback): VideoDecoderInit = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1((t0: /* error */ DOMException) => error(t0).runNow()), output = js.Any.fromFunction1((t0: /* output */ VideoFrame) => output(t0).runNow()))
    __obj.asInstanceOf[VideoDecoderInit]
  }
  
  extension [Self <: VideoDecoderInit](x: Self) {
    
    inline def setError(value: /* error */ DOMException => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* error */ DOMException) => value(t0).runNow()))
    
    inline def setOutput(value: /* output */ VideoFrame => Callback): Self = StObject.set(x, "output", js.Any.fromFunction1((t0: /* output */ VideoFrame) => value(t0).runNow()))
  }
}
