package typingsJapgolly.jpegJs

import typingsJapgolly.jpegJs.anon.BufferRetcommentsArraystr
import typingsJapgolly.jpegJs.anon.ColorTransform
import typingsJapgolly.jpegJs.anon.FormatAsRGBA
import typingsJapgolly.jpegJs.anon.RawImageDataBufferLikecom
import typingsJapgolly.jpegJs.anon.UintArrRetcommentsArrayst
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jpeg-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(jpegData: BufferLike): BufferRetcommentsArraystr = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(jpegData.asInstanceOf[js.Any]).asInstanceOf[BufferRetcommentsArraystr]
  inline def decode(jpegData: BufferLike, opts: ColorTransform): UintArrRetcommentsArrayst = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(jpegData.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[UintArrRetcommentsArrayst]
  inline def decode(jpegData: BufferLike, opts: FormatAsRGBA): BufferRetcommentsArraystr = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(jpegData.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[BufferRetcommentsArraystr]
  
  inline def encode(imgData: RawImageDataBufferLikecom): BufferRet = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(imgData.asInstanceOf[js.Any]).asInstanceOf[BufferRet]
  inline def encode(imgData: RawImageDataBufferLikecom, quality: Double): BufferRet = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(imgData.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[BufferRet]
  
  type BufferLike = Buffer | js.typedarray.Uint8Array | ArrayLike[Double] | js.Iterable[Double] | js.typedarray.ArrayBuffer
  
  type BufferRet = RawImageData[Buffer]
  
  type ImageData = BufferRet | UintArrRet
  
  trait RawImageData[T] extends StObject {
    
    var data: T
    
    var height: Double
    
    var width: Double
  }
  object RawImageData {
    
    inline def apply[T](data: T, height: Double, width: Double): RawImageData[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawImageData[T]]
    }
    
    extension [Self <: RawImageData[?], T](x: Self & RawImageData[T]) {
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type UintArrRet = RawImageData[js.typedarray.Uint8Array]
}
