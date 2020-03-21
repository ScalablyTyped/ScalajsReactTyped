package typingsJapgolly.reactStickyBox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactStickyBox.reactStickyBoxStrings.relative
  - typingsJapgolly.reactStickyBox.reactStickyBoxStrings.stickyBottom
  - typingsJapgolly.reactStickyBox.reactStickyBoxStrings.stickyTop
*/
trait StickyBoxMode extends js.Object

object StickyBoxMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def relative: typingsJapgolly.reactStickyBox.reactStickyBoxStrings.relative = this.cast("relative")
  @scala.inline
  def stickyBottom: typingsJapgolly.reactStickyBox.reactStickyBoxStrings.stickyBottom = this.cast("stickyBottom")
  @scala.inline
  def stickyTop: typingsJapgolly.reactStickyBox.reactStickyBoxStrings.stickyTop = this.cast("stickyTop")
}

