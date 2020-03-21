package typingsJapgolly.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 支付操作结果对象
  * PaymentResult对象表示支付操作返回结果，用于确认支付操作成功。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
  */
trait PlusPaymentPaymentResult extends js.Object {
  /**
    * 支付通道对象
    * 用于发起支付操作的支付通道对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var channel: js.UndefOr[PlusPaymentPaymentChannel] = js.undefined
  /**
    * 交易描述信息
    * 如果支付平台不支持此数据则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var description: js.UndefOr[Boolean] = js.undefined
  /**
    * 支付平台返回的原始数据
    * 如果支付平台返回key-value类型字符串，则组合成符合JSON格式的字符串。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var rawdata: js.UndefOr[String] = js.undefined
  /**
    * 支付操作指纹信息
    * 用于向支付平台查询支付订单信息，如果支付平台不支持此数据则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var signature: js.UndefOr[String] = js.undefined
  /**
    * 交易编号信息
    * 如果支付平台不支持此数据则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var tradeno: js.UndefOr[String] = js.undefined
  /**
    * 查找支付交易信息地址
    * 用于向支付平台查询交易信息，如果支付平台不支持此数据则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var url: js.UndefOr[Boolean] = js.undefined
}

object PlusPaymentPaymentResult {
  @scala.inline
  def apply(
    channel: PlusPaymentPaymentChannel = null,
    description: js.UndefOr[Boolean] = js.undefined,
    rawdata: String = null,
    signature: String = null,
    tradeno: String = null,
    url: js.UndefOr[Boolean] = js.undefined
  ): PlusPaymentPaymentResult = {
    val __obj = js.Dynamic.literal()
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (rawdata != null) __obj.updateDynamic("rawdata")(rawdata.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    if (tradeno != null) __obj.updateDynamic("tradeno")(tradeno.asInstanceOf[js.Any])
    if (!js.isUndefined(url)) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusPaymentPaymentResult]
  }
}

