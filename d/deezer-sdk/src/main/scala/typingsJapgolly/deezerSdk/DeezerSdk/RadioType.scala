package typingsJapgolly.deezerSdk.DeezerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/loadtracks | Load tracks to a player}
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.deezerSdk.deezerSdkStrings.radio
  - typingsJapgolly.deezerSdk.deezerSdkStrings.artist
  - typingsJapgolly.deezerSdk.deezerSdkStrings.user
*/
trait RadioType extends js.Object

object RadioType {
  @scala.inline
  def artist: typingsJapgolly.deezerSdk.deezerSdkStrings.artist = this.cast("artist")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def radio: typingsJapgolly.deezerSdk.deezerSdkStrings.radio = this.cast("radio")
  @scala.inline
  def user: typingsJapgolly.deezerSdk.deezerSdkStrings.user = this.cast("user")
}

