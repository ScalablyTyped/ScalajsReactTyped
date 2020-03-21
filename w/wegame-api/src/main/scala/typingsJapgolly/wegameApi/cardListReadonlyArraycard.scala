package typingsJapgolly.wegameApi

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  cardList  :std.ReadonlyArray<{  cardId  :string,   code  :string}>} & wegame-api.wx.types.CallbacksWithType<unknown> */
trait cardListReadonlyArraycard extends js.Object {
  /**
    * 需要打开的卡券列表
    */
  var cardList: js.Array[AnonCardId]
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
}

object cardListReadonlyArraycard {
  @scala.inline
  def apply(
    cardList: js.Array[AnonCardId],
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    success: /* res */ js.Any => Callback = null
  ): cardListReadonlyArraycard = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[cardListReadonlyArraycard]
  }
}

