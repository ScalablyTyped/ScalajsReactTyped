package typingsJapgolly.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region 扫码 https://docs.alipay.com/mini/api/scan
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.aliApp.aliAppStrings.qr
  - typingsJapgolly.aliApp.aliAppStrings.bar
*/
trait scanType extends js.Object

object scanType {
  @scala.inline
  def bar: typingsJapgolly.aliApp.aliAppStrings.bar = this.cast("bar")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def qr: typingsJapgolly.aliApp.aliAppStrings.qr = this.cast("qr")
}

