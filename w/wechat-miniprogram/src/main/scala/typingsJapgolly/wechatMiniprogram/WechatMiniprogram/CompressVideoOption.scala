package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import japgolly.scalajs.react.Callback
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.high
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.low
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.medium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompressVideoOption extends StObject {
  
  /** 码率，单位 kbps */
  var bitrate: Double
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[CompressVideoCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[CompressVideoFailCallback] = js.undefined
  
  /** 帧率 */
  var fps: Double
  
  /** 压缩质量
    *
    * 可选值：
    * - 'low': 低;
    * - 'medium': 中;
    * - 'high': 高; */
  var quality: low | medium | high
  
  /** 相对于原视频的分辨率比例，取值范围(0, 1] */
  var resolution: Double
  
  /** 视频文件路径，可以是临时文件路径也可以是永久文件路径 */
  var src: String
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[CompressVideoSuccessCallback] = js.undefined
}
object CompressVideoOption {
  
  inline def apply(bitrate: Double, fps: Double, quality: low | medium | high, resolution: Double, src: String): CompressVideoOption = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], fps = fps.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompressVideoOption]
  }
  
  extension [Self <: CompressVideoOption](x: Self) {
    
    inline def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setFps(value: Double): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
    
    inline def setQuality(value: low | medium | high): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* result */ CompressVideoSuccessCallbackResult => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* result */ CompressVideoSuccessCallbackResult) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
