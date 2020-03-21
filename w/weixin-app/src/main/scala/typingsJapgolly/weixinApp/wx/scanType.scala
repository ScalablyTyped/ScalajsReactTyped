package typingsJapgolly.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 设备-----扫码
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.weixinApp.weixinAppStrings.qrCode
  - typingsJapgolly.weixinApp.weixinAppStrings.barCode
*/
trait scanType extends js.Object

object scanType {
  @scala.inline
  def barCode: typingsJapgolly.weixinApp.weixinAppStrings.barCode = this.cast("barCode")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def qrCode: typingsJapgolly.weixinApp.weixinAppStrings.qrCode = this.cast("qrCode")
}

