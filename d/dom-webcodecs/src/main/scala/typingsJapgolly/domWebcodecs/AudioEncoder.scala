package typingsJapgolly.domWebcodecs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
trait AudioEncoder extends StObject {
  
  def close(): Unit
  
  def configure(config: AudioEncoderConfig): Unit
  
  def encode(data: AudioData): Unit
  
  val encodeQueueSize: Double
  
  def flush(): js.Promise[Unit]
  
  def reset(): Unit
  
  val state: CodecState
}
object AudioEncoder {
  
  inline def apply(
    close: Callback,
    configure: AudioEncoderConfig => Callback,
    encode: AudioData => Callback,
    encodeQueueSize: Double,
    flush: CallbackTo[js.Promise[Unit]],
    reset: Callback,
    state: CodecState
  ): AudioEncoder = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, configure = js.Any.fromFunction1((t0: AudioEncoderConfig) => configure(t0).runNow()), encode = js.Any.fromFunction1((t0: AudioData) => encode(t0).runNow()), encodeQueueSize = encodeQueueSize.asInstanceOf[js.Any], flush = flush.toJsFn, reset = reset.toJsFn, state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioEncoder]
  }
  
  extension [Self <: AudioEncoder](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setConfigure(value: AudioEncoderConfig => Callback): Self = StObject.set(x, "configure", js.Any.fromFunction1((t0: AudioEncoderConfig) => value(t0).runNow()))
    
    inline def setEncode(value: AudioData => Callback): Self = StObject.set(x, "encode", js.Any.fromFunction1((t0: AudioData) => value(t0).runNow()))
    
    inline def setEncodeQueueSize(value: Double): Self = StObject.set(x, "encodeQueueSize", value.asInstanceOf[js.Any])
    
    inline def setFlush(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "flush", value.toJsFn)
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setState(value: CodecState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
