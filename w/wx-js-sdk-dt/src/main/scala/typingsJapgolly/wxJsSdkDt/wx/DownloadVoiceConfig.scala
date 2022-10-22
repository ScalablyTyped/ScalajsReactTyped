package typingsJapgolly.wxJsSdkDt.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadVoiceConfig
  extends StObject
     with WxBaseRequestConfig {
  
  /**
    * 默认为1，显示进度提示
    */
  var isShowProgressTips: js.UndefOr[Double] = js.undefined
  
  /**
    * 需要下载的音频的服务器端 ID，由 uploadVoice 接口获得
    */
  var serverId: String
  
  /**
    * 下载成功回调
    */
  @JSName("success")
  def success_MDownloadVoiceConfig(res: Any): Unit
}
object DownloadVoiceConfig {
  
  inline def apply(serverId: String, success: Any => Callback): DownloadVoiceConfig = {
    val __obj = js.Dynamic.literal(serverId = serverId.asInstanceOf[js.Any], success = js.Any.fromFunction1((t0: Any) => success(t0).runNow()))
    __obj.asInstanceOf[DownloadVoiceConfig]
  }
  
  extension [Self <: DownloadVoiceConfig](x: Self) {
    
    inline def setIsShowProgressTips(value: Double): Self = StObject.set(x, "isShowProgressTips", value.asInstanceOf[js.Any])
    
    inline def setIsShowProgressTipsUndefined: Self = StObject.set(x, "isShowProgressTips", js.undefined)
    
    inline def setServerId(value: String): Self = StObject.set(x, "serverId", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Any => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
