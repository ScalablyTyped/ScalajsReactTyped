package typingsJapgolly.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 设备-----网络状态
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.weixinApp.weixinAppStrings.`2g`
  - typingsJapgolly.weixinApp.weixinAppStrings.`3g`
  - typingsJapgolly.weixinApp.weixinAppStrings.`4g`
  - typingsJapgolly.weixinApp.weixinAppStrings.wifi
  - typingsJapgolly.weixinApp.weixinAppStrings.unknown
  - typingsJapgolly.weixinApp.weixinAppStrings.none
*/
trait networkType extends js.Object

object networkType {
  @scala.inline
  def `2g`: typingsJapgolly.weixinApp.weixinAppStrings.`2g` = this.cast("2g")
  @scala.inline
  def `3g`: typingsJapgolly.weixinApp.weixinAppStrings.`3g` = this.cast("3g")
  @scala.inline
  def `4g`: typingsJapgolly.weixinApp.weixinAppStrings.`4g` = this.cast("4g")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typingsJapgolly.weixinApp.weixinAppStrings.none = this.cast("none")
  @scala.inline
  def unknown: typingsJapgolly.weixinApp.weixinAppStrings.unknown = this.cast("unknown")
  @scala.inline
  def wifi: typingsJapgolly.weixinApp.weixinAppStrings.wifi = this.cast("wifi")
}

