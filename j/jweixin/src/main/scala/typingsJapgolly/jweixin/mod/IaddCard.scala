package typingsJapgolly.jweixin.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.jweixin.AnonCardExt
import typingsJapgolly.jweixin.AnonCardList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IaddCard extends BaseParams {
  var cardList: js.Array[AnonCardExt]
   // 需要添加的卡券列表
  @JSName("success")
  def success_MIaddCard(res: AnonCardList): Unit
}

object IaddCard {
  @scala.inline
  def apply(
    cardList: js.Array[AnonCardExt],
    success: AnonCardList => Callback,
    complete: /* repeated */ js.Any => Callback = null,
    fail: /* repeated */ js.Any => Callback = null
  ): IaddCard = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.jweixin.AnonCardList) => success(t0).runNow()))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => fail(t0).runNow()))
    __obj.asInstanceOf[IaddCard]
  }
}

