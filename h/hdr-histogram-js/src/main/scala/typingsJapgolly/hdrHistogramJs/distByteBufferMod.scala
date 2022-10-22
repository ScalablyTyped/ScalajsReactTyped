package typingsJapgolly.hdrHistogramJs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distByteBufferMod {
  
  @JSImport("hdr-histogram-js/dist/ByteBuffer", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ByteBuffer {
    def this(data: js.typedarray.Uint8Array) = this()
    
    /* CompleteClass */
    var data: js.typedarray.Uint8Array = js.native
    
    /* CompleteClass */
    override def get(): Double = js.native
    
    /* CompleteClass */
    override def getInt32(): Double = js.native
    
    /* CompleteClass */
    override def getInt64(): Double = js.native
    
    /* CompleteClass */
    var int32ArrayForConvert: js.typedarray.Uint32Array = js.native
    
    /* CompleteClass */
    var int8ArrayForConvert: js.typedarray.Uint8Array = js.native
    
    /* CompleteClass */
    var position: Double = js.native
    
    /* CompleteClass */
    override def put(value: Double): Unit = js.native
    
    /* CompleteClass */
    override def putArray(array: js.typedarray.Uint8Array): Unit = js.native
    
    /* CompleteClass */
    override def putInt32(value: Double): Unit = js.native
    
    /* CompleteClass */
    override def putInt64(value: Double): Unit = js.native
    
    /* CompleteClass */
    override def resetPosition(): Unit = js.native
  }
  object default {
    
    @JSImport("hdr-histogram-js/dist/ByteBuffer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def allocate(): ByteBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("allocate")().asInstanceOf[ByteBuffer]
    inline def allocate(size: Double): ByteBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("allocate")(size.asInstanceOf[js.Any]).asInstanceOf[ByteBuffer]
  }
  
  trait ByteBuffer extends StObject {
    
    var data: js.typedarray.Uint8Array
    
    def get(): Double
    
    def getInt32(): Double
    
    def getInt64(): Double
    
    var int32ArrayForConvert: js.typedarray.Uint32Array
    
    var int8ArrayForConvert: js.typedarray.Uint8Array
    
    var position: Double
    
    def put(value: Double): Unit
    
    def putArray(array: js.typedarray.Uint8Array): Unit
    
    def putInt32(value: Double): Unit
    
    def putInt64(value: Double): Unit
    
    def resetPosition(): Unit
  }
  object ByteBuffer {
    
    inline def apply(
      data: js.typedarray.Uint8Array,
      get: CallbackTo[Double],
      getInt32: CallbackTo[Double],
      getInt64: CallbackTo[Double],
      int32ArrayForConvert: js.typedarray.Uint32Array,
      int8ArrayForConvert: js.typedarray.Uint8Array,
      position: Double,
      put: Double => Callback,
      putArray: js.typedarray.Uint8Array => Callback,
      putInt32: Double => Callback,
      putInt64: Double => Callback,
      resetPosition: Callback
    ): ByteBuffer = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], get = get.toJsFn, getInt32 = getInt32.toJsFn, getInt64 = getInt64.toJsFn, int32ArrayForConvert = int32ArrayForConvert.asInstanceOf[js.Any], int8ArrayForConvert = int8ArrayForConvert.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], put = js.Any.fromFunction1((t0: Double) => put(t0).runNow()), putArray = js.Any.fromFunction1((t0: js.typedarray.Uint8Array) => putArray(t0).runNow()), putInt32 = js.Any.fromFunction1((t0: Double) => putInt32(t0).runNow()), putInt64 = js.Any.fromFunction1((t0: Double) => putInt64(t0).runNow()), resetPosition = resetPosition.toJsFn)
      __obj.asInstanceOf[ByteBuffer]
    }
    
    extension [Self <: ByteBuffer](x: Self) {
      
      inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setGet(value: CallbackTo[Double]): Self = StObject.set(x, "get", value.toJsFn)
      
      inline def setGetInt32(value: CallbackTo[Double]): Self = StObject.set(x, "getInt32", value.toJsFn)
      
      inline def setGetInt64(value: CallbackTo[Double]): Self = StObject.set(x, "getInt64", value.toJsFn)
      
      inline def setInt32ArrayForConvert(value: js.typedarray.Uint32Array): Self = StObject.set(x, "int32ArrayForConvert", value.asInstanceOf[js.Any])
      
      inline def setInt8ArrayForConvert(value: js.typedarray.Uint8Array): Self = StObject.set(x, "int8ArrayForConvert", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPut(value: Double => Callback): Self = StObject.set(x, "put", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setPutArray(value: js.typedarray.Uint8Array => Callback): Self = StObject.set(x, "putArray", js.Any.fromFunction1((t0: js.typedarray.Uint8Array) => value(t0).runNow()))
      
      inline def setPutInt32(value: Double => Callback): Self = StObject.set(x, "putInt32", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setPutInt64(value: Double => Callback): Self = StObject.set(x, "putInt64", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setResetPosition(value: Callback): Self = StObject.set(x, "resetPosition", value.toJsFn)
    }
  }
}
