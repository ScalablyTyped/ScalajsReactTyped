package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import japgolly.scalajs.react.Callback
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.album
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.camera
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.compressed
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.original
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChooseImageOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ChooseImageCompleteCallback] = js.undefined
  
  /** 最多可以选择的图片张数 */
  var count: js.UndefOr[Double] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ChooseImageFailCallback] = js.undefined
  
  /** 所选的图片的尺寸
    *
    * 可选值：
    * - 'original': 原图;
    * - 'compressed': 压缩图; */
  var sizeType: js.UndefOr[js.Array[original | compressed]] = js.undefined
  
  /** 选择图片的来源
    *
    * 可选值：
    * - 'album': 从相册选图;
    * - 'camera': 使用相机; */
  var sourceType: js.UndefOr[js.Array[album | camera]] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ChooseImageSuccessCallback] = js.undefined
}
object ChooseImageOption {
  
  inline def apply(): ChooseImageOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseImageOption]
  }
  
  extension [Self <: ChooseImageOption](x: Self) {
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSizeType(value: js.Array[original | compressed]): Self = StObject.set(x, "sizeType", value.asInstanceOf[js.Any])
    
    inline def setSizeTypeUndefined: Self = StObject.set(x, "sizeType", js.undefined)
    
    inline def setSizeTypeVarargs(value: (original | compressed)*): Self = StObject.set(x, "sizeType", js.Array(value*))
    
    inline def setSourceType(value: js.Array[album | camera]): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    
    inline def setSourceTypeVarargs(value: (album | camera)*): Self = StObject.set(x, "sourceType", js.Array(value*))
    
    inline def setSuccess(value: /* result */ ChooseImageSuccessCallbackResult => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* result */ ChooseImageSuccessCallbackResult) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
