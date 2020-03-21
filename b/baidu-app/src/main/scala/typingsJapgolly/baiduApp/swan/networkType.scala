package typingsJapgolly.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 设备-----网络状态
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.baiduApp.baiduAppStrings.`2g`
  - typingsJapgolly.baiduApp.baiduAppStrings.`3g`
  - typingsJapgolly.baiduApp.baiduAppStrings.`4g`
  - typingsJapgolly.baiduApp.baiduAppStrings.wifi
  - typingsJapgolly.baiduApp.baiduAppStrings.unknown
  - typingsJapgolly.baiduApp.baiduAppStrings.none
*/
trait networkType extends js.Object

object networkType {
  @scala.inline
  def `2g`: typingsJapgolly.baiduApp.baiduAppStrings.`2g` = this.cast("2g")
  @scala.inline
  def `3g`: typingsJapgolly.baiduApp.baiduAppStrings.`3g` = this.cast("3g")
  @scala.inline
  def `4g`: typingsJapgolly.baiduApp.baiduAppStrings.`4g` = this.cast("4g")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typingsJapgolly.baiduApp.baiduAppStrings.none = this.cast("none")
  @scala.inline
  def unknown: typingsJapgolly.baiduApp.baiduAppStrings.unknown = this.cast("unknown")
  @scala.inline
  def wifi: typingsJapgolly.baiduApp.baiduAppStrings.wifi = this.cast("wifi")
}

