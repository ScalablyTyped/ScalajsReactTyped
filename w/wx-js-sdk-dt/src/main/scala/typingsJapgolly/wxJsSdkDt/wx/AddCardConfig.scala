package typingsJapgolly.wxJsSdkDt.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.wxJsSdkDt.AnonCardList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddCardConfig extends js.Object {
  var cardList: js.Array[Card]
  var success: js.UndefOr[js.Function1[/* res */ AnonCardList, Unit]] = js.undefined
}

object AddCardConfig {
  @scala.inline
  def apply(cardList: js.Array[Card], success: /* res */ AnonCardList => Callback = null): AddCardConfig = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.wxJsSdkDt.AnonCardList) => success(t0).runNow()))
    __obj.asInstanceOf[AddCardConfig]
  }
}

