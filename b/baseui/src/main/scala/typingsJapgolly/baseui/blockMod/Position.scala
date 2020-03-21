package typingsJapgolly.baseui.blockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.baseui.baseuiStrings.static
  - typingsJapgolly.baseui.baseuiStrings.absolute
  - typingsJapgolly.baseui.baseuiStrings.relative
  - typingsJapgolly.baseui.baseuiStrings.fixed
  - typingsJapgolly.baseui.baseuiStrings.sticky
*/
trait Position extends js.Object

object Position {
  @scala.inline
  def absolute: typingsJapgolly.baseui.baseuiStrings.absolute = this.cast("absolute")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fixed: typingsJapgolly.baseui.baseuiStrings.fixed = this.cast("fixed")
  @scala.inline
  def relative: typingsJapgolly.baseui.baseuiStrings.relative = this.cast("relative")
  @scala.inline
  def static: typingsJapgolly.baseui.baseuiStrings.static = this.cast("static")
  @scala.inline
  def sticky: typingsJapgolly.baseui.baseuiStrings.sticky = this.cast("sticky")
}

