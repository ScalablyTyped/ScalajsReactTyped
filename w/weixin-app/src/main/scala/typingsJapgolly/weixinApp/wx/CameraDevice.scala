package typingsJapgolly.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.weixinApp.weixinAppStrings.front
  - typingsJapgolly.weixinApp.weixinAppStrings.back
*/
trait CameraDevice extends js.Object

object CameraDevice {
  @scala.inline
  def back: typingsJapgolly.weixinApp.weixinAppStrings.back = this.cast("back")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def front: typingsJapgolly.weixinApp.weixinAppStrings.front = this.cast("front")
}

