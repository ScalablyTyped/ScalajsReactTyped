package typingsJapgolly.deezerSdk.DeezerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/player#options | Player options}
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.deezerSdk.deezerSdkStrings.small
  - typingsJapgolly.deezerSdk.deezerSdkStrings.medium
  - typingsJapgolly.deezerSdk.deezerSdkStrings.big
*/
trait WidgetSize extends js.Object

object WidgetSize {
  @scala.inline
  def big: typingsJapgolly.deezerSdk.deezerSdkStrings.big = this.cast("big")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def medium: typingsJapgolly.deezerSdk.deezerSdkStrings.medium = this.cast("medium")
  @scala.inline
  def small: typingsJapgolly.deezerSdk.deezerSdkStrings.small = this.cast("small")
}

