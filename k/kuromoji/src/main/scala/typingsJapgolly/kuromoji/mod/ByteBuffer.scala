package typingsJapgolly.kuromoji.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ByteBuffer extends StObject {
  
  var buffer: js.typedarray.Uint8Array
  
  def get(index: Double): Double
  
  def getInt(index: Double): Double
  
  def getShort(index: Double): Double
  
  def getString(index: Double): String
  
  var position: Double
  
  def put(b: Double): Unit
  
  def putInt(num: Double): Unit
  
  def putShort(num: Double): Unit
  
  def putString(str: String): Unit
  
  def readInt(): Double
  
  def reallocate(): Unit
  
  def shrink(): js.typedarray.Uint8Array
  
  def size(): Double
}
object ByteBuffer {
  
  inline def apply(
    buffer: js.typedarray.Uint8Array,
    get: Double => Double,
    getInt: Double => Double,
    getShort: Double => Double,
    getString: Double => String,
    position: Double,
    put: Double => Callback,
    putInt: Double => Callback,
    putShort: Double => Callback,
    putString: String => Callback,
    readInt: CallbackTo[Double],
    reallocate: Callback,
    shrink: CallbackTo[js.typedarray.Uint8Array],
    size: CallbackTo[Double]
  ): ByteBuffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), getInt = js.Any.fromFunction1(getInt), getShort = js.Any.fromFunction1(getShort), getString = js.Any.fromFunction1(getString), position = position.asInstanceOf[js.Any], put = js.Any.fromFunction1((t0: Double) => put(t0).runNow()), putInt = js.Any.fromFunction1((t0: Double) => putInt(t0).runNow()), putShort = js.Any.fromFunction1((t0: Double) => putShort(t0).runNow()), putString = js.Any.fromFunction1((t0: String) => putString(t0).runNow()), readInt = readInt.toJsFn, reallocate = reallocate.toJsFn, shrink = shrink.toJsFn, size = size.toJsFn)
    __obj.asInstanceOf[ByteBuffer]
  }
  
  extension [Self <: ByteBuffer](x: Self) {
    
    inline def setBuffer(value: js.typedarray.Uint8Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Double => Double): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetInt(value: Double => Double): Self = StObject.set(x, "getInt", js.Any.fromFunction1(value))
    
    inline def setGetShort(value: Double => Double): Self = StObject.set(x, "getShort", js.Any.fromFunction1(value))
    
    inline def setGetString(value: Double => String): Self = StObject.set(x, "getString", js.Any.fromFunction1(value))
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Double => Callback): Self = StObject.set(x, "put", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setPutInt(value: Double => Callback): Self = StObject.set(x, "putInt", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setPutShort(value: Double => Callback): Self = StObject.set(x, "putShort", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setPutString(value: String => Callback): Self = StObject.set(x, "putString", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setReadInt(value: CallbackTo[Double]): Self = StObject.set(x, "readInt", value.toJsFn)
    
    inline def setReallocate(value: Callback): Self = StObject.set(x, "reallocate", value.toJsFn)
    
    inline def setShrink(value: CallbackTo[js.typedarray.Uint8Array]): Self = StObject.set(x, "shrink", value.toJsFn)
    
    inline def setSize(value: CallbackTo[Double]): Self = StObject.set(x, "size", value.toJsFn)
  }
}
