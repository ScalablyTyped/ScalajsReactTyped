package typingsJapgolly.domWebcodecs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
trait AudioDecoder extends StObject {
  
  def close(): Unit
  
  def configure(config: AudioDecoderConfig): Unit
  
  def decode(chunk: EncodedAudioChunk): Unit
  
  val decodeQueueSize: Double
  
  def flush(): js.Promise[Unit]
  
  def reset(): Unit
  
  val state: CodecState
}
object AudioDecoder {
  
  inline def apply(
    close: Callback,
    configure: AudioDecoderConfig => Callback,
    decode: EncodedAudioChunk => Callback,
    decodeQueueSize: Double,
    flush: CallbackTo[js.Promise[Unit]],
    reset: Callback,
    state: CodecState
  ): AudioDecoder = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, configure = js.Any.fromFunction1((t0: AudioDecoderConfig) => configure(t0).runNow()), decode = js.Any.fromFunction1((t0: EncodedAudioChunk) => decode(t0).runNow()), decodeQueueSize = decodeQueueSize.asInstanceOf[js.Any], flush = flush.toJsFn, reset = reset.toJsFn, state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioDecoder]
  }
  
  extension [Self <: AudioDecoder](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setConfigure(value: AudioDecoderConfig => Callback): Self = StObject.set(x, "configure", js.Any.fromFunction1((t0: AudioDecoderConfig) => value(t0).runNow()))
    
    inline def setDecode(value: EncodedAudioChunk => Callback): Self = StObject.set(x, "decode", js.Any.fromFunction1((t0: EncodedAudioChunk) => value(t0).runNow()))
    
    inline def setDecodeQueueSize(value: Double): Self = StObject.set(x, "decodeQueueSize", value.asInstanceOf[js.Any])
    
    inline def setFlush(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "flush", value.toJsFn)
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setState(value: CodecState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
