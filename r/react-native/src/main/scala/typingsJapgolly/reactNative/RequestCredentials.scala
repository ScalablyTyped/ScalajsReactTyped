package typingsJapgolly.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactNative.reactNativeStrings.omit
  - typingsJapgolly.reactNative.reactNativeStrings.`same-origin`
  - typingsJapgolly.reactNative.reactNativeStrings.include
*/
trait RequestCredentials extends js.Object

object RequestCredentials {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def include: typingsJapgolly.reactNative.reactNativeStrings.include = this.cast("include")
  @scala.inline
  def omit: typingsJapgolly.reactNative.reactNativeStrings.omit = this.cast("omit")
  @scala.inline
  def `same-origin`: typingsJapgolly.reactNative.reactNativeStrings.`same-origin` = this.cast("same-origin")
}

