package typingsJapgolly.awsCryptoIe11Detection

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import typingsJapgolly.awsCryptoIe11Detection.buildKeyMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCryptoOperationMod {
  
  trait CryptoOperation extends StObject {
    
    def abort(): Unit
    
    val algorithm: String
    
    def finish(): Unit
    
    val key: Key
    
    def onabort(event: Event): Unit
    
    def oncomplete(event: Event): Unit
    
    def onerror(event: Event): Unit
    
    def onprogress(event: Event): Unit
    
    def process(buffer: js.typedarray.ArrayBufferView): Unit
    
    val result: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  }
  object CryptoOperation {
    
    inline def apply(
      abort: Callback,
      algorithm: String,
      finish: Callback,
      key: Key,
      onabort: Event => Callback,
      oncomplete: Event => Callback,
      onerror: Event => Callback,
      onprogress: Event => Callback,
      process: js.typedarray.ArrayBufferView => Callback
    ): CryptoOperation = {
      val __obj = js.Dynamic.literal(abort = abort.toJsFn, algorithm = algorithm.asInstanceOf[js.Any], finish = finish.toJsFn, key = key.asInstanceOf[js.Any], onabort = js.Any.fromFunction1((t0: Event) => onabort(t0).runNow()), oncomplete = js.Any.fromFunction1((t0: Event) => oncomplete(t0).runNow()), onerror = js.Any.fromFunction1((t0: Event) => onerror(t0).runNow()), onprogress = js.Any.fromFunction1((t0: Event) => onprogress(t0).runNow()), process = js.Any.fromFunction1((t0: js.typedarray.ArrayBufferView) => process(t0).runNow()))
      __obj.asInstanceOf[CryptoOperation]
    }
    
    extension [Self <: CryptoOperation](x: Self) {
      
      inline def setAbort(value: Callback): Self = StObject.set(x, "abort", value.toJsFn)
      
      inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setFinish(value: Callback): Self = StObject.set(x, "finish", value.toJsFn)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setOnabort(value: Event => Callback): Self = StObject.set(x, "onabort", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOncomplete(value: Event => Callback): Self = StObject.set(x, "oncomplete", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnerror(value: Event => Callback): Self = StObject.set(x, "onerror", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnprogress(value: Event => Callback): Self = StObject.set(x, "onprogress", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setProcess(value: js.typedarray.ArrayBufferView => Callback): Self = StObject.set(x, "process", js.Any.fromFunction1((t0: js.typedarray.ArrayBufferView) => value(t0).runNow()))
      
      inline def setResult(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
}
