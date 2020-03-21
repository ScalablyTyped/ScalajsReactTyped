package typingsJapgolly.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 开放接口-----微信支付
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.baiduApp.baiduAppStrings.MD5
  - typingsJapgolly.baiduApp.baiduAppStrings.`HMAC-SHA256`
*/
trait PaymentSignType extends js.Object

object PaymentSignType {
  @scala.inline
  def `HMAC-SHA256`: typingsJapgolly.baiduApp.baiduAppStrings.`HMAC-SHA256` = this.cast("HMAC-SHA256")
  @scala.inline
  def MD5: typingsJapgolly.baiduApp.baiduAppStrings.MD5 = this.cast("MD5")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

