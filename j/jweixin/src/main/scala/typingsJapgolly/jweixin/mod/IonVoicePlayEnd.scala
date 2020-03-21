package typingsJapgolly.jweixin.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonVoicePlayEnd extends BaseParams {
  @JSName("success")
  def success_MIonVoicePlayEnd(res: Resouce): Unit
}

object IonVoicePlayEnd {
  @scala.inline
  def apply(
    success: Resouce => Callback,
    complete: /* repeated */ js.Any => Callback = null,
    fail: /* repeated */ js.Any => Callback = null
  ): IonVoicePlayEnd = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.jweixin.mod.Resouce) => success(t0).runNow()))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => fail(t0).runNow()))
    __obj.asInstanceOf[IonVoicePlayEnd]
  }
}

