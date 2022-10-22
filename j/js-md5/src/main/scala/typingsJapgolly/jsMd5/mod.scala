package typingsJapgolly.jsMd5

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("js-md5", JSImport.Namespace)
  @js.native
  val ^ : md5 = js.native
  
  trait Md5_ extends StObject {
    
    def array(): js.Array[Double]
    
    def arrayBuffer(): js.typedarray.ArrayBuffer
    
    def base64(): String
    
    def buffer(): js.typedarray.ArrayBuffer
    
    def digest(): js.Array[Double]
    
    def hex(): String
    
    def update(message: message): Md5_
  }
  object Md5_ {
    
    inline def apply(
      array: CallbackTo[js.Array[Double]],
      arrayBuffer: CallbackTo[js.typedarray.ArrayBuffer],
      base64: CallbackTo[String],
      buffer: CallbackTo[js.typedarray.ArrayBuffer],
      digest: CallbackTo[js.Array[Double]],
      hex: CallbackTo[String],
      update: message => Md5_
    ): Md5_ = {
      val __obj = js.Dynamic.literal(array = array.toJsFn, arrayBuffer = arrayBuffer.toJsFn, base64 = base64.toJsFn, buffer = buffer.toJsFn, digest = digest.toJsFn, hex = hex.toJsFn, update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[Md5_]
    }
    
    extension [Self <: Md5_](x: Self) {
      
      inline def setArray(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "array", value.toJsFn)
      
      inline def setArrayBuffer(value: CallbackTo[js.typedarray.ArrayBuffer]): Self = StObject.set(x, "arrayBuffer", value.toJsFn)
      
      inline def setBase64(value: CallbackTo[String]): Self = StObject.set(x, "base64", value.toJsFn)
      
      inline def setBuffer(value: CallbackTo[js.typedarray.ArrayBuffer]): Self = StObject.set(x, "buffer", value.toJsFn)
      
      inline def setDigest(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "digest", value.toJsFn)
      
      inline def setHex(value: CallbackTo[String]): Self = StObject.set(x, "hex", value.toJsFn)
      
      inline def setUpdate(value: message => Md5_): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  type _To = md5
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: md5 = ^
  
  @js.native
  trait md5 extends StObject {
    
    def apply(message: message): String = js.native
    
    def array(message: message): js.Array[Double] = js.native
    
    def arrayBuffer(message: message): js.typedarray.ArrayBuffer = js.native
    
    def base64(message: message): String = js.native
    
    def buffer(message: message): js.typedarray.ArrayBuffer = js.native
    
    def create(): Md5_ = js.native
    
    def digest(message: message): js.Array[Double] = js.native
    
    def hex(message: message): String = js.native
    
    def update(message: message): Md5_ = js.native
  }
  
  type message = String | js.Array[Any] | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer
}
