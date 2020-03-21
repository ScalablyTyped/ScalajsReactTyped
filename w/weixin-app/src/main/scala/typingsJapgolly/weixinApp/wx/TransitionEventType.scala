package typingsJapgolly.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.weixinApp.weixinAppStrings.transitionend
  - typingsJapgolly.weixinApp.weixinAppStrings.animationstart
  - typingsJapgolly.weixinApp.weixinAppStrings.animationiteration
  - typingsJapgolly.weixinApp.weixinAppStrings.animationend
*/
trait TransitionEventType extends js.Object

object TransitionEventType {
  @scala.inline
  def animationend: typingsJapgolly.weixinApp.weixinAppStrings.animationend = this.cast("animationend")
  @scala.inline
  def animationiteration: typingsJapgolly.weixinApp.weixinAppStrings.animationiteration = this.cast("animationiteration")
  @scala.inline
  def animationstart: typingsJapgolly.weixinApp.weixinAppStrings.animationstart = this.cast("animationstart")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def transitionend: typingsJapgolly.weixinApp.weixinAppStrings.transitionend = this.cast("transitionend")
}

