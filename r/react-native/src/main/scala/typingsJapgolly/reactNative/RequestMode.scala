package typingsJapgolly.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactNative.reactNativeStrings.navigate
  - typingsJapgolly.reactNative.reactNativeStrings.`same-origin`
  - typingsJapgolly.reactNative.reactNativeStrings.`no-cors`
  - typingsJapgolly.reactNative.reactNativeStrings.cors
*/
trait RequestMode extends js.Object

object RequestMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cors: typingsJapgolly.reactNative.reactNativeStrings.cors = this.cast("cors")
  @scala.inline
  def navigate: typingsJapgolly.reactNative.reactNativeStrings.navigate = this.cast("navigate")
  @scala.inline
  def `no-cors`: typingsJapgolly.reactNative.reactNativeStrings.`no-cors` = this.cast("no-cors")
  @scala.inline
  def `same-origin`: typingsJapgolly.reactNative.reactNativeStrings.`same-origin` = this.cast("same-origin")
}

