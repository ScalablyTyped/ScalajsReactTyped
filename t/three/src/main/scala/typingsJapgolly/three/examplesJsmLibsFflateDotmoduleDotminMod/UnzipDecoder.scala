package typingsJapgolly.three.examplesJsmLibsFflateDotmoduleDotminMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnzipDecoder extends StObject {
  
  /**
    * The handler to call whenever data is available
    */
  def ondata(err: js.Error, data: js.typedarray.Uint8Array, `final`: Boolean): Unit
  /**
    * The handler to call whenever data is available
    */
  @JSName("ondata")
  var ondata_Original: AsyncFlateStreamHandler
  
  /**
    * Pushes a chunk to be decompressed
    * @param data The data in this chunk. Do not consume (detach) this data.
    * @param final Whether this is the last chunk in the data stream
    */
  def push(data: js.typedarray.Uint8Array, `final`: Boolean): Unit
  
  /**
    * A method to terminate any internal workers used by the stream. Subsequent
    * calls to push() should silently fail.
    */
  var terminate: js.UndefOr[AsyncTerminable] = js.undefined
}
object UnzipDecoder {
  
  inline def apply(
    ondata: (/* err */ js.Error, /* data */ js.typedarray.Uint8Array, /* final */ Boolean) => Callback,
    push: (js.typedarray.Uint8Array, Boolean) => Callback
  ): UnzipDecoder = {
    val __obj = js.Dynamic.literal(ondata = js.Any.fromFunction3((t0: /* err */ js.Error, t1: /* data */ js.typedarray.Uint8Array, t2: /* final */ Boolean) => (ondata(t0, t1, t2)).runNow()), push = js.Any.fromFunction2((t0: js.typedarray.Uint8Array, t1: Boolean) => (push(t0, t1)).runNow()))
    __obj.asInstanceOf[UnzipDecoder]
  }
  
  extension [Self <: UnzipDecoder](x: Self) {
    
    inline def setOndata(value: (/* err */ js.Error, /* data */ js.typedarray.Uint8Array, /* final */ Boolean) => Callback): Self = StObject.set(x, "ondata", js.Any.fromFunction3((t0: /* err */ js.Error, t1: /* data */ js.typedarray.Uint8Array, t2: /* final */ Boolean) => (value(t0, t1, t2)).runNow()))
    
    inline def setPush(value: (js.typedarray.Uint8Array, Boolean) => Callback): Self = StObject.set(x, "push", js.Any.fromFunction2((t0: js.typedarray.Uint8Array, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setTerminate(value: Callback): Self = StObject.set(x, "terminate", value.toJsFn)
    
    inline def setTerminateUndefined: Self = StObject.set(x, "terminate", js.undefined)
  }
}
