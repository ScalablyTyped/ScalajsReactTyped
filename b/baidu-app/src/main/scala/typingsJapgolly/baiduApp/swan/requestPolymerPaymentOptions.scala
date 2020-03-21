package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.AnonAuthSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * 百度收银台。
	 * @version 1.8.5
	 */
trait requestPolymerPaymentOptions
  extends BaseOptions[js.Any, js.Any] {
   // 订单信息
  /**
  		 * bannedChannels参数说明
  		 * Alipay	支付宝
  		 * BDWallet	百度钱包
  		 * WeChat	微信支付
  		 */
  var bannedChannels: js.UndefOr[js.Array[String]] = js.undefined
  var orderInfo: orderInfoOptions
   // 需要隐藏的支付方式
  @JSName("success")
  var success_requestPolymerPaymentOptions: js.UndefOr[js.Function1[/* res */ AnonAuthSetting, Unit]] = js.undefined
}

object requestPolymerPaymentOptions {
  @scala.inline
  def apply(
    orderInfo: orderInfoOptions,
    bannedChannels: js.Array[String] = null,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: /* res */ AnonAuthSetting => Callback = null
  ): requestPolymerPaymentOptions = {
    val __obj = js.Dynamic.literal(orderInfo = orderInfo.asInstanceOf[js.Any])
    if (bannedChannels != null) __obj.updateDynamic("bannedChannels")(bannedChannels.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.baiduApp.AnonAuthSetting) => success(t0).runNow()))
    __obj.asInstanceOf[requestPolymerPaymentOptions]
  }
}

