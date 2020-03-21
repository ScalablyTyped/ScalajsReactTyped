package typingsJapgolly.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.weixinApp.weixinAppStrings.tap
  - typingsJapgolly.weixinApp.weixinAppStrings.touchstart
  - typingsJapgolly.weixinApp.weixinAppStrings.touchmove
  - typingsJapgolly.weixinApp.weixinAppStrings.touchcancel
  - typingsJapgolly.weixinApp.weixinAppStrings.touchend
  - typingsJapgolly.weixinApp.weixinAppStrings.touchforcechange
*/
trait TouchEventType extends js.Object

object TouchEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def tap: typingsJapgolly.weixinApp.weixinAppStrings.tap = this.cast("tap")
  @scala.inline
  def touchcancel: typingsJapgolly.weixinApp.weixinAppStrings.touchcancel = this.cast("touchcancel")
  @scala.inline
  def touchend: typingsJapgolly.weixinApp.weixinAppStrings.touchend = this.cast("touchend")
  @scala.inline
  def touchforcechange: typingsJapgolly.weixinApp.weixinAppStrings.touchforcechange = this.cast("touchforcechange")
  @scala.inline
  def touchmove: typingsJapgolly.weixinApp.weixinAppStrings.touchmove = this.cast("touchmove")
  @scala.inline
  def touchstart: typingsJapgolly.weixinApp.weixinAppStrings.touchstart = this.cast("touchstart")
}

