package typingsJapgolly.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.csstype.csstypeStrings.backwards
  - typingsJapgolly.csstype.csstypeStrings.both
  - typingsJapgolly.csstype.csstypeStrings.forwards
  - typingsJapgolly.csstype.csstypeStrings.none
*/
trait SingleAnimationFillMode
  extends _SingleAnimation
     with _AnimationFillModeProperty

object SingleAnimationFillMode {
  @scala.inline
  def backwards: typingsJapgolly.csstype.csstypeStrings.backwards = this.cast("backwards")
  @scala.inline
  def both: typingsJapgolly.csstype.csstypeStrings.both = this.cast("both")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def forwards: typingsJapgolly.csstype.csstypeStrings.forwards = this.cast("forwards")
  @scala.inline
  def none: typingsJapgolly.csstype.csstypeStrings.none = this.cast("none")
}

