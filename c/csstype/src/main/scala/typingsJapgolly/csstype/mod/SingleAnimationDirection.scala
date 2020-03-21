package typingsJapgolly.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.csstype.csstypeStrings.alternate
  - typingsJapgolly.csstype.csstypeStrings.`alternate-reverse`
  - typingsJapgolly.csstype.csstypeStrings.normal
  - typingsJapgolly.csstype.csstypeStrings.reverse
*/
trait SingleAnimationDirection
  extends _SingleAnimation
     with _AnimationDirectionProperty

object SingleAnimationDirection {
  @scala.inline
  def alternate: typingsJapgolly.csstype.csstypeStrings.alternate = this.cast("alternate")
  @scala.inline
  def `alternate-reverse`: typingsJapgolly.csstype.csstypeStrings.`alternate-reverse` = this.cast("alternate-reverse")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def normal: typingsJapgolly.csstype.csstypeStrings.normal = this.cast("normal")
  @scala.inline
  def reverse: typingsJapgolly.csstype.csstypeStrings.reverse = this.cast("reverse")
}

