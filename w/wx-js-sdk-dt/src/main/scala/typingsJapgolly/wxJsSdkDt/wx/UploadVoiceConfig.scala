package typingsJapgolly.wxJsSdkDt.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadVoiceConfig
  extends StObject
     with WxBaseRequestConfig {
  
  var isShowProgressTips: js.UndefOr[Double] = js.undefined
  
  var localId: String
  
  @JSName("success")
  def success_MUploadVoiceConfig(res: Any): Unit
}
object UploadVoiceConfig {
  
  inline def apply(localId: String, success: Any => Callback): UploadVoiceConfig = {
    val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any], success = js.Any.fromFunction1((t0: Any) => success(t0).runNow()))
    __obj.asInstanceOf[UploadVoiceConfig]
  }
  
  extension [Self <: UploadVoiceConfig](x: Self) {
    
    inline def setIsShowProgressTips(value: Double): Self = StObject.set(x, "isShowProgressTips", value.asInstanceOf[js.Any])
    
    inline def setIsShowProgressTipsUndefined: Self = StObject.set(x, "isShowProgressTips", js.undefined)
    
    inline def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Any => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
