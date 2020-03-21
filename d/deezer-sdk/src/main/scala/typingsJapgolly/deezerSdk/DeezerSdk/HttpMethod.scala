package typingsJapgolly.deezerSdk.DeezerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See:\
  * {@link https://developers.deezer.com/sdk/javascript/api | DZ.api}\
  * {@link https://developers.deezer.com/api | API}
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.deezerSdk.deezerSdkStrings.GET
  - typingsJapgolly.deezerSdk.deezerSdkStrings.POST
  - typingsJapgolly.deezerSdk.deezerSdkStrings.DELETE
*/
trait HttpMethod extends js.Object

object HttpMethod {
  @scala.inline
  def DELETE: typingsJapgolly.deezerSdk.deezerSdkStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typingsJapgolly.deezerSdk.deezerSdkStrings.GET = this.cast("GET")
  @scala.inline
  def POST: typingsJapgolly.deezerSdk.deezerSdkStrings.POST = this.cast("POST")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

