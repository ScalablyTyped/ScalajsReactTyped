package typingsJapgolly.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.aliApp.aliAppStrings.transitionend
  - typingsJapgolly.aliApp.aliAppStrings.animationstart
  - typingsJapgolly.aliApp.aliAppStrings.animationiteration
  - typingsJapgolly.aliApp.aliAppStrings.animationend
*/
trait TransitionEventType extends js.Object

object TransitionEventType {
  @scala.inline
  def animationend: typingsJapgolly.aliApp.aliAppStrings.animationend = this.cast("animationend")
  @scala.inline
  def animationiteration: typingsJapgolly.aliApp.aliAppStrings.animationiteration = this.cast("animationiteration")
  @scala.inline
  def animationstart: typingsJapgolly.aliApp.aliAppStrings.animationstart = this.cast("animationstart")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def transitionend: typingsJapgolly.aliApp.aliAppStrings.transitionend = this.cast("transitionend")
}

