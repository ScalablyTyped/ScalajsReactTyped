package typingsJapgolly.wegameApi

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  cardList  :std.ReadonlyArray<{  cardId  :string,   cardExt  :string}>} & wegame-api.wx.types.CallbacksWithType<{  cardList  :std.ReadonlyArray<{  code  :string,   cardId  :string,   cardExt  :string,   isSuccess  :boolean}>}> */
trait cardListReadonlyArraycardCardList extends js.Object {
  /**
    * 需要添加的卡券列表
    */
  var cardList: js.Array[AnonCardExt]
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ AnonCardList, Unit]] = js.undefined
}

object cardListReadonlyArraycardCardList {
  @scala.inline
  def apply(
    cardList: js.Array[AnonCardExt],
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    success: /* res */ AnonCardList => Callback = null
  ): cardListReadonlyArraycardCardList = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.wegameApi.AnonCardList) => success(t0).runNow()))
    __obj.asInstanceOf[cardListReadonlyArraycardCardList]
  }
}

