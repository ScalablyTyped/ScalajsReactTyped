package typingsJapgolly.pixiJs.PIXI.interaction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pixiJs.pixiJsStrings.touchstart
  - typingsJapgolly.pixiJs.pixiJsStrings.touchcancel
  - typingsJapgolly.pixiJs.pixiJsStrings.touchend
  - typingsJapgolly.pixiJs.pixiJsStrings.touchendoutside
  - typingsJapgolly.pixiJs.pixiJsStrings.touchmove
  - typingsJapgolly.pixiJs.pixiJsStrings.tap
*/
trait InteractionTouchEvents extends js.Object

object InteractionTouchEvents {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def tap: typingsJapgolly.pixiJs.pixiJsStrings.tap = this.cast("tap")
  @scala.inline
  def touchcancel: typingsJapgolly.pixiJs.pixiJsStrings.touchcancel = this.cast("touchcancel")
  @scala.inline
  def touchend: typingsJapgolly.pixiJs.pixiJsStrings.touchend = this.cast("touchend")
  @scala.inline
  def touchendoutside: typingsJapgolly.pixiJs.pixiJsStrings.touchendoutside = this.cast("touchendoutside")
  @scala.inline
  def touchmove: typingsJapgolly.pixiJs.pixiJsStrings.touchmove = this.cast("touchmove")
  @scala.inline
  def touchstart: typingsJapgolly.pixiJs.pixiJsStrings.touchstart = this.cast("touchstart")
}

