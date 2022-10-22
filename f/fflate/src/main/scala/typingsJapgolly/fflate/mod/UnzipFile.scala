package typingsJapgolly.fflate.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnzipFile extends StObject {
  
  /**
    * The compression format for the data stream. This number is determined by
    * the spec in PKZIP's APPNOTE.txt, section 4.4.5. For example, 0 = no
    * compression, 8 = deflate, 14 = LZMA. If start() is called but there is no
    * decompression stream available for this method, start() will throw.
    */
  var compression: Double
  
  /**
    * The name of the file
    */
  var name: String
  
  def ondata(err: Null, data: js.typedarray.Uint8Array, `final`: Boolean): Unit
  /**
    * The handler to call whenever data is available
    */
  def ondata(err: FlateError, data: js.typedarray.Uint8Array, `final`: Boolean): Unit
  /**
    * The handler to call whenever data is available
    */
  @JSName("ondata")
  var ondata_Original: AsyncFlateStreamHandler
  
  /**
    * The original size of the file. Will not be present for archives created
    * in a streaming fashion.
    */
  var originalSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The compressed size of the file. Will not be present for archives created
    * in a streaming fashion.
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * Starts reading from the stream. Calling this function will always enable
    * this stream, but ocassionally the stream will be enabled even without
    * this being called.
    */
  def start(): Unit
  
  /**
    * A method to terminate any internal workers used by the stream. ondata
    * will not be called any further.
    */
  def terminate(): Unit
  /**
    * A method to terminate any internal workers used by the stream. ondata
    * will not be called any further.
    */
  @JSName("terminate")
  var terminate_Original: AsyncTerminable
}
object UnzipFile {
  
  inline def apply(
    compression: Double,
    name: String,
    ondata: (/* err */ FlateError | Null, /* data */ js.typedarray.Uint8Array, /* final */ Boolean) => Callback,
    start: Callback,
    terminate: Callback
  ): UnzipFile = {
    val __obj = js.Dynamic.literal(compression = compression.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ondata = js.Any.fromFunction3((t0: /* err */ FlateError | Null, t1: /* data */ js.typedarray.Uint8Array, t2: /* final */ Boolean) => (ondata(t0, t1, t2)).runNow()), start = start.toJsFn, terminate = terminate.toJsFn)
    __obj.asInstanceOf[UnzipFile]
  }
  
  extension [Self <: UnzipFile](x: Self) {
    
    inline def setCompression(value: Double): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOndata(
      value: (/* err */ FlateError | Null, /* data */ js.typedarray.Uint8Array, /* final */ Boolean) => Callback
    ): Self = StObject.set(x, "ondata", js.Any.fromFunction3((t0: /* err */ FlateError | Null, t1: /* data */ js.typedarray.Uint8Array, t2: /* final */ Boolean) => (value(t0, t1, t2)).runNow()))
    
    inline def setOriginalSize(value: Double): Self = StObject.set(x, "originalSize", value.asInstanceOf[js.Any])
    
    inline def setOriginalSizeUndefined: Self = StObject.set(x, "originalSize", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
    
    inline def setTerminate(value: Callback): Self = StObject.set(x, "terminate", value.toJsFn)
  }
}
