package typingsJapgolly.wxJsSdkDt.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseWXPayConfig extends WxBaseRequestConfig {
  /**
    * 统一支付接口返回的 prepay_id 参数值，提交格式如：prepay_id=***
    */
  @JSName("package")
  var _package: String
  /**
    * 支付签名随机串，不长于 32 位
    */
  var nonceStr: String
  /**
    * 支付签名
    */
  var paySign: String
  /**
    * 签名方式，默认为'SHA1'，使用新版支付需传入'MD5'
    */
  var signType: js.UndefOr[String] = js.undefined
  /**
    * 支付签名时间戳，注意微信jssdk中的所有使用 timestamp 字段均为小写。但最新版的支付后台生成签名使用的 timeStamp 字段名需大写其中的S字符
    */
  var timestamp: Double
}

object ChooseWXPayConfig {
  @scala.inline
  def apply(
    _package: String,
    nonceStr: String,
    paySign: String,
    timestamp: Double,
    cancel: js.UndefOr[Callback] = js.undefined,
    complete: /* res */ js.UndefOr[js.Any] => Callback = null,
    fail: /* error */ js.UndefOr[js.Any] => Callback = null,
    signType: String = null,
    success: /* res */ js.UndefOr[js.Any] => Callback = null
  ): ChooseWXPayConfig = {
    val __obj = js.Dynamic.literal(nonceStr = nonceStr.asInstanceOf[js.Any], paySign = paySign.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    cancel.foreach(p => __obj.updateDynamic("cancel")(p.toJsFn))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.UndefOr[js.Any]) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* error */ js.UndefOr[js.Any]) => fail(t0).runNow()))
    if (signType != null) __obj.updateDynamic("signType")(signType.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ js.UndefOr[js.Any]) => success(t0).runNow()))
    __obj.asInstanceOf[ChooseWXPayConfig]
  }
}

