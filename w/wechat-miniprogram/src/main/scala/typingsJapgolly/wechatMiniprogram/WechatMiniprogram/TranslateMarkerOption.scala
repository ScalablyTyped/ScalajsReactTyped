package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranslateMarkerOption extends StObject {
  
  /** 动画结束回调函数 */
  var animationEnd: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  
  /** 移动过程中是否自动旋转 marker */
  var autoRotate: Boolean
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[TranslateMarkerCompleteCallback] = js.undefined
  
  /** 指定 marker 移动到的目标点 */
  var destination: DestinationOption
  
  /** 动画持续时长，平移与旋转分别计算 */
  var duration: js.UndefOr[Double] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[TranslateMarkerFailCallback] = js.undefined
  
  /** 指定 marker */
  var markerId: Double
  
  /** 平移和旋转同时进行
    *
    * 最低基础库： `2.13.0` */
  var moveWithRotate: js.UndefOr[Boolean] = js.undefined
  
  /** marker 的旋转角度 */
  var rotate: Double
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[TranslateMarkerSuccessCallback] = js.undefined
}
object TranslateMarkerOption {
  
  inline def apply(autoRotate: Boolean, destination: DestinationOption, markerId: Double, rotate: Double): TranslateMarkerOption = {
    val __obj = js.Dynamic.literal(autoRotate = autoRotate.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], markerId = markerId.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateMarkerOption]
  }
  
  extension [Self <: TranslateMarkerOption](x: Self) {
    
    inline def setAnimationEnd(value: /* repeated */ Any => Any): Self = StObject.set(x, "animationEnd", js.Any.fromFunction1(value))
    
    inline def setAnimationEndUndefined: Self = StObject.set(x, "animationEnd", js.undefined)
    
    inline def setAutoRotate(value: Boolean): Self = StObject.set(x, "autoRotate", value.asInstanceOf[js.Any])
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setDestination(value: DestinationOption): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setMarkerId(value: Double): Self = StObject.set(x, "markerId", value.asInstanceOf[js.Any])
    
    inline def setMoveWithRotate(value: Boolean): Self = StObject.set(x, "moveWithRotate", value.asInstanceOf[js.Any])
    
    inline def setMoveWithRotateUndefined: Self = StObject.set(x, "moveWithRotate", js.undefined)
    
    inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
