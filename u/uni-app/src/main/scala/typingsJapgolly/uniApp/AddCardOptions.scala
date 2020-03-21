package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddCardOptions extends js.Object {
  /**
    * 需要添加的卡券列表
    */
  var cardList: js.UndefOr[js.Array[AddCardData]] = js.undefined
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ AddCardRes, Unit]] = js.undefined
}

object AddCardOptions {
  @scala.inline
  def apply(
    cardList: js.Array[AddCardData] = null,
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    success: /* result */ AddCardRes => Callback = null
  ): AddCardOptions = {
    val __obj = js.Dynamic.literal()
    if (cardList != null) __obj.updateDynamic("cardList")(cardList.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.uniApp.AddCardRes) => success(t0).runNow()))
    __obj.asInstanceOf[AddCardOptions]
  }
}

