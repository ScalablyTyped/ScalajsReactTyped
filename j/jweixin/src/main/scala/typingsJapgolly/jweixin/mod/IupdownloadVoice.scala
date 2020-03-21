package typingsJapgolly.jweixin.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IupdownloadVoice extends BaseParams {
   // 需要上传的音频的本地ID，由stopRecord接口获得
  var isShowProgressTips: Double
  var localId: String
   // 默认为1，显示进度提示
  @JSName("success")
  def success_MIupdownloadVoice(res: Resouce): Unit
}

object IupdownloadVoice {
  @scala.inline
  def apply(
    isShowProgressTips: Double,
    localId: String,
    success: Resouce => Callback,
    complete: /* repeated */ js.Any => Callback = null,
    fail: /* repeated */ js.Any => Callback = null
  ): IupdownloadVoice = {
    val __obj = js.Dynamic.literal(isShowProgressTips = isShowProgressTips.asInstanceOf[js.Any], localId = localId.asInstanceOf[js.Any])
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.jweixin.mod.Resouce) => success(t0).runNow()))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => fail(t0).runNow()))
    __obj.asInstanceOf[IupdownloadVoice]
  }
}

