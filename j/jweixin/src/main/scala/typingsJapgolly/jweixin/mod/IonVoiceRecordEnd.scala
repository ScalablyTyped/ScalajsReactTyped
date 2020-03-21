package typingsJapgolly.jweixin.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonVoiceRecordEnd extends BaseParams {
  // 录音时间超过一分钟没有停止的时候会执行 complete 回调
  @JSName("complete")
  def complete_MIonVoiceRecordEnd(res: Resouce): Unit
}

object IonVoiceRecordEnd {
  @scala.inline
  def apply(
    complete: Resouce => Callback,
    fail: /* repeated */ js.Any => Callback = null,
    success: /* repeated */ js.Any => Callback = null
  ): IonVoiceRecordEnd = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: typingsJapgolly.jweixin.mod.Resouce) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[IonVoiceRecordEnd]
  }
}

