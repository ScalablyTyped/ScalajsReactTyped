package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.AnonCardId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenCardOptions
  extends BaseOptions[js.Any, js.Any] {
  var cardList: js.Array[AnonCardId]
}

object OpenCardOptions {
  @scala.inline
  def apply(
    cardList: js.Array[AnonCardId],
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: js.Any => Callback = null
  ): OpenCardOptions = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[OpenCardOptions]
  }
}

