package typingsJapgolly.subscribeUiEvent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.resize
  - typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.resizeEnd
  - typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.resizeStart
  - typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.scroll
  - typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.scrollEnd
  - typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.scrollStart
  - typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.visibilitychange
*/
trait UIEventType extends js.Object

object UIEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def resize: typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.resize = this.cast("resize")
  @scala.inline
  def resizeEnd: typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.resizeEnd = this.cast("resizeEnd")
  @scala.inline
  def resizeStart: typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.resizeStart = this.cast("resizeStart")
  @scala.inline
  def scroll: typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.scroll = this.cast("scroll")
  @scala.inline
  def scrollEnd: typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.scrollEnd = this.cast("scrollEnd")
  @scala.inline
  def scrollStart: typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.scrollStart = this.cast("scrollStart")
  @scala.inline
  def visibilitychange: typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.visibilitychange = this.cast("visibilitychange")
}

