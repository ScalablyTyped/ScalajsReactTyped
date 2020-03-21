package typingsJapgolly.subscribeUiEvent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchend
  - typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchmove
  - typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchmoveEnd
  - typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchmoveStart
  - typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchstart
*/
trait TouchEventType extends js.Object

object TouchEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def touchend: typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchend = this.cast("touchend")
  @scala.inline
  def touchmove: typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchmove = this.cast("touchmove")
  @scala.inline
  def touchmoveEnd: typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchmoveEnd = this.cast("touchmoveEnd")
  @scala.inline
  def touchmoveStart: typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchmoveStart = this.cast("touchmoveStart")
  @scala.inline
  def touchstart: typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchstart = this.cast("touchstart")
}

