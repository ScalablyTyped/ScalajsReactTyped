package typingsJapgolly.jweixin.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.jweixin.AnonTranslateResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*=============================音频接口================================*/
/*=============================智能接口================================*/
trait ItranslateVoice extends BaseParams {
   // 需要识别的音频的本地Id，由录音相关接口获得
  var isShowProgressTips: Double
  var localId: String
   // 默认为1，显示进度提示
  @JSName("success")
  def success_MItranslateVoice(res: AnonTranslateResult): Unit
}

object ItranslateVoice {
  @scala.inline
  def apply(
    isShowProgressTips: Double,
    localId: String,
    success: AnonTranslateResult => Callback,
    complete: /* repeated */ js.Any => Callback = null,
    fail: /* repeated */ js.Any => Callback = null
  ): ItranslateVoice = {
    val __obj = js.Dynamic.literal(isShowProgressTips = isShowProgressTips.asInstanceOf[js.Any], localId = localId.asInstanceOf[js.Any])
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.jweixin.AnonTranslateResult) => success(t0).runNow()))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => fail(t0).runNow()))
    __obj.asInstanceOf[ItranslateVoice]
  }
}

