package typingsJapgolly.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.aliApp.aliAppStrings.tap
  - typingsJapgolly.aliApp.aliAppStrings.touchstart
  - typingsJapgolly.aliApp.aliAppStrings.touchmove
  - typingsJapgolly.aliApp.aliAppStrings.touchcancel
  - typingsJapgolly.aliApp.aliAppStrings.touchend
  - typingsJapgolly.aliApp.aliAppStrings.touchforcechange
*/
trait TouchEventType extends js.Object

object TouchEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def tap: typingsJapgolly.aliApp.aliAppStrings.tap = this.cast("tap")
  @scala.inline
  def touchcancel: typingsJapgolly.aliApp.aliAppStrings.touchcancel = this.cast("touchcancel")
  @scala.inline
  def touchend: typingsJapgolly.aliApp.aliAppStrings.touchend = this.cast("touchend")
  @scala.inline
  def touchforcechange: typingsJapgolly.aliApp.aliAppStrings.touchforcechange = this.cast("touchforcechange")
  @scala.inline
  def touchmove: typingsJapgolly.aliApp.aliAppStrings.touchmove = this.cast("touchmove")
  @scala.inline
  def touchstart: typingsJapgolly.aliApp.aliAppStrings.touchstart = this.cast("touchstart")
}

