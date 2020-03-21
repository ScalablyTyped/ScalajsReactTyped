package typingsJapgolly.deezerSdk.DeezerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/player#options | Player options}
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.deezerSdk.deezerSdkStrings.square
  - typingsJapgolly.deezerSdk.deezerSdkStrings.classic
*/
trait WidgetFormat extends js.Object

object WidgetFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def classic: typingsJapgolly.deezerSdk.deezerSdkStrings.classic = this.cast("classic")
  @scala.inline
  def square: typingsJapgolly.deezerSdk.deezerSdkStrings.square = this.cast("square")
}

