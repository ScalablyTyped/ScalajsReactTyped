package typingsJapgolly.jweixin.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IplaypausestopVoice extends BaseParams {
  var localId: String
}

object IplaypausestopVoice {
  @scala.inline
  def apply(
    localId: String,
    complete: /* repeated */ js.Any => Callback = null,
    fail: /* repeated */ js.Any => Callback = null,
    success: /* repeated */ js.Any => Callback = null
  ): IplaypausestopVoice = {
    val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[IplaypausestopVoice]
  }
}

