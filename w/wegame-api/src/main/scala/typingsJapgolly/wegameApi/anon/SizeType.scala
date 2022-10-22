package typingsJapgolly.wegameApi.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.wegameApi.wegameApiStrings.album
import typingsJapgolly.wegameApi.wegameApiStrings.camera
import typingsJapgolly.wegameApi.wegameApiStrings.compressed
import typingsJapgolly.wegameApi.wegameApiStrings.original
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeType extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var count: Double
  
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 所选的图片的尺寸
    */
  var sizeType: (js.Array[original | compressed]) | (js.Tuple2[original, compressed])
  
  /**
    * 选择图片的来源
    */
  var sourceType: (js.Array[album | camera]) | (js.Tuple2[album, camera])
  
  var success: js.UndefOr[js.Function1[/* res */ TempFilePaths, Unit]] = js.undefined
}
object SizeType {
  
  inline def apply(
    count: Double,
    sizeType: (js.Array[original | compressed]) | (js.Tuple2[original, compressed]),
    sourceType: (js.Array[album | camera]) | (js.Tuple2[album, camera])
  ): SizeType = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], sizeType = sizeType.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeType]
  }
  
  extension [Self <: SizeType](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setFail(value: Callback): Self = StObject.set(x, "fail", value.toJsFn)
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSizeType(value: (js.Array[original | compressed]) | (js.Tuple2[original, compressed])): Self = StObject.set(x, "sizeType", value.asInstanceOf[js.Any])
    
    inline def setSizeTypeVarargs(value: (original | compressed)*): Self = StObject.set(x, "sizeType", js.Array(value*))
    
    inline def setSourceType(value: (js.Array[album | camera]) | (js.Tuple2[album, camera])): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeVarargs(value: (album | camera)*): Self = StObject.set(x, "sourceType", js.Array(value*))
    
    inline def setSuccess(value: /* res */ TempFilePaths => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ TempFilePaths) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
