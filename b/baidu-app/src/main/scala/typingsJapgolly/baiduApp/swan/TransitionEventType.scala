package typingsJapgolly.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.baiduApp.baiduAppStrings.transitionend
  - typingsJapgolly.baiduApp.baiduAppStrings.animationstart
  - typingsJapgolly.baiduApp.baiduAppStrings.animationiteration
  - typingsJapgolly.baiduApp.baiduAppStrings.animationend
*/
trait TransitionEventType extends js.Object

object TransitionEventType {
  @scala.inline
  def animationend: typingsJapgolly.baiduApp.baiduAppStrings.animationend = this.cast("animationend")
  @scala.inline
  def animationiteration: typingsJapgolly.baiduApp.baiduAppStrings.animationiteration = this.cast("animationiteration")
  @scala.inline
  def animationstart: typingsJapgolly.baiduApp.baiduAppStrings.animationstart = this.cast("animationstart")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def transitionend: typingsJapgolly.baiduApp.baiduAppStrings.transitionend = this.cast("transitionend")
}

