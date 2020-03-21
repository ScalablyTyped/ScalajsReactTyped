package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardOptions
  extends BaseOptions[js.Any, js.Any] {
  var cardList: js.Array[Card]
  @JSName("complete")
  var complete_CardOptions: js.UndefOr[js.Function0[Unit]] = js.undefined
  @JSName("fail")
  var fail_CardOptions: js.UndefOr[js.Function0[Unit]] = js.undefined
  @JSName("success")
  var success_CardOptions: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object CardOptions {
  @scala.inline
  def apply(
    cardList: js.Array[Card],
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    success: js.UndefOr[Callback] = js.undefined
  ): CardOptions = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    success.foreach(p => __obj.updateDynamic("success")(p.toJsFn))
    __obj.asInstanceOf[CardOptions]
  }
}

