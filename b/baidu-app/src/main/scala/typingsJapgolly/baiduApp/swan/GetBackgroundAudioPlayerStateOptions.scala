package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBackgroundAudioPlayerStateOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  @JSName("complete")
  var complete_GetBackgroundAudioPlayerStateOptions: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** 接口调用失败的回调函数 */
  @JSName("fail")
  var fail_GetBackgroundAudioPlayerStateOptions: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** 接口调用成功的回调函数 */
  @JSName("success")
  var success_GetBackgroundAudioPlayerStateOptions: js.UndefOr[js.Function1[/* state */ BackgroundAudioPlayerState, Unit]] = js.undefined
}
object GetBackgroundAudioPlayerStateOptions {
  
  inline def apply(): GetBackgroundAudioPlayerStateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBackgroundAudioPlayerStateOptions]
  }
  
  extension [Self <: GetBackgroundAudioPlayerStateOptions](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: Callback): Self = StObject.set(x, "fail", value.toJsFn)
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: /* state */ BackgroundAudioPlayerState => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* state */ BackgroundAudioPlayerState) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
