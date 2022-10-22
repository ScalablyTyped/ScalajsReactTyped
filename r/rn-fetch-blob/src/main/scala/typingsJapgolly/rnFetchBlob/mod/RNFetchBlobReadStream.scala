package typingsJapgolly.rnFetchBlob.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RNFetchBlobReadStream extends StObject {
  
  var bufferSize: js.UndefOr[Double] = js.undefined
  
  var closed: Boolean
  
  var encoding: Encoding
  
  def onData(fn: js.Function1[/* chunk */ String | js.Array[Double], Unit]): Unit
  
  def onEnd(fn: js.Function0[Unit]): Unit
  
  def onError(fn: js.Function1[/* err */ Any, Unit]): Unit
  
  def open(): Unit
  
  var path: String
  
  var tick: Double
}
object RNFetchBlobReadStream {
  
  inline def apply(
    closed: Boolean,
    encoding: Encoding,
    onData: js.Function1[/* chunk */ String | js.Array[Double], Unit] => Callback,
    onEnd: js.Function0[Unit] => Callback,
    onError: js.Function1[/* err */ Any, Unit] => Callback,
    open: Callback,
    path: String,
    tick: Double
  ): RNFetchBlobReadStream = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], onData = js.Any.fromFunction1((t0: js.Function1[/* chunk */ String | js.Array[Double], Unit]) => onData(t0).runNow()), onEnd = js.Any.fromFunction1((t0: js.Function0[Unit]) => onEnd(t0).runNow()), onError = js.Any.fromFunction1((t0: js.Function1[/* err */ Any, Unit]) => onError(t0).runNow()), open = open.toJsFn, path = path.asInstanceOf[js.Any], tick = tick.asInstanceOf[js.Any])
    __obj.asInstanceOf[RNFetchBlobReadStream]
  }
  
  extension [Self <: RNFetchBlobReadStream](x: Self) {
    
    inline def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
    
    inline def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
    
    inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    inline def setEncoding(value: Encoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setOnData(value: js.Function1[/* chunk */ String | js.Array[Double], Unit] => Callback): Self = StObject.set(x, "onData", js.Any.fromFunction1((t0: js.Function1[/* chunk */ String | js.Array[Double], Unit]) => value(t0).runNow()))
    
    inline def setOnEnd(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onEnd", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOnError(value: js.Function1[/* err */ Any, Unit] => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: js.Function1[/* err */ Any, Unit]) => value(t0).runNow()))
    
    inline def setOpen(value: Callback): Self = StObject.set(x, "open", value.toJsFn)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setTick(value: Double): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
  }
}
