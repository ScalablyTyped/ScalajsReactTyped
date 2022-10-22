package typingsJapgolly.jweixin.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.jweixin.anon.TranslateResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*=============================音频接口================================*/
/*=============================智能接口================================*/
trait ItranslateVoice
  extends StObject
     with BaseParams {
  
  // 需要识别的音频的本地Id，由录音相关接口获得
  var isShowProgressTips: Double
  
  var localId: String
  
  // 默认为1，显示进度提示
  @JSName("success")
  def success_MItranslateVoice(res: TranslateResult): Unit
}
object ItranslateVoice {
  
  inline def apply(isShowProgressTips: Double, localId: String, success: TranslateResult => Callback): ItranslateVoice = {
    val __obj = js.Dynamic.literal(isShowProgressTips = isShowProgressTips.asInstanceOf[js.Any], localId = localId.asInstanceOf[js.Any], success = js.Any.fromFunction1((t0: TranslateResult) => success(t0).runNow()))
    __obj.asInstanceOf[ItranslateVoice]
  }
  
  extension [Self <: ItranslateVoice](x: Self) {
    
    inline def setIsShowProgressTips(value: Double): Self = StObject.set(x, "isShowProgressTips", value.asInstanceOf[js.Any])
    
    inline def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: TranslateResult => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: TranslateResult) => value(t0).runNow()))
  }
}
