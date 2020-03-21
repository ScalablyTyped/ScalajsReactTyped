package typingsJapgolly.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactNative.reactNativeStrings.none
  - typingsJapgolly.reactNative.reactNativeStrings.fade
  - typingsJapgolly.reactNative.reactNativeStrings.slide
*/
trait StatusBarAnimation extends js.Object

object StatusBarAnimation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fade: typingsJapgolly.reactNative.reactNativeStrings.fade = this.cast("fade")
  @scala.inline
  def none: typingsJapgolly.reactNative.reactNativeStrings.none = this.cast("none")
  @scala.inline
  def slide: typingsJapgolly.reactNative.reactNativeStrings.slide = this.cast("slide")
}

