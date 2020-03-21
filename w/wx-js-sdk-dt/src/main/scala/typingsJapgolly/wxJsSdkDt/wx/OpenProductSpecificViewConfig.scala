package typingsJapgolly.wxJsSdkDt.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenProductSpecificViewConfig extends WxBaseRequestConfig {
  /**
    * 商品id
    */
  var productId: String
  /**
    * 0.默认值，普通商品详情页; 1.扫一扫商品详情页; 2.小店商品详情页
    */
  var viewType: js.UndefOr[Double] = js.undefined
}

object OpenProductSpecificViewConfig {
  @scala.inline
  def apply(
    productId: String,
    cancel: js.UndefOr[Callback] = js.undefined,
    complete: /* res */ js.UndefOr[js.Any] => Callback = null,
    fail: /* error */ js.UndefOr[js.Any] => Callback = null,
    success: /* res */ js.UndefOr[js.Any] => Callback = null,
    viewType: Int | Double = null
  ): OpenProductSpecificViewConfig = {
    val __obj = js.Dynamic.literal(productId = productId.asInstanceOf[js.Any])
    cancel.foreach(p => __obj.updateDynamic("cancel")(p.toJsFn))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.UndefOr[js.Any]) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* error */ js.UndefOr[js.Any]) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ js.UndefOr[js.Any]) => success(t0).runNow()))
    if (viewType != null) __obj.updateDynamic("viewType")(viewType.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenProductSpecificViewConfig]
  }
}

