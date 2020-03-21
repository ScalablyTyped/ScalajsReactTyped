package typingsJapgolly.ky.mod

import org.scalajs.dom.experimental.Headers
import org.scalajs.dom.experimental.RequestCredentials
import org.scalajs.dom.experimental.URL
import typingsJapgolly.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NormalizedOptions extends RequestInit {
  @JSName("credentials")
  var credentials_NormalizedOptions: js.UndefOr[RequestCredentials] = js.native
  // New type.
  @JSName("headers")
  var headers_NormalizedOptions: Headers = js.native
  // Extended from `RequestInit`, but ensured to be set (not optional).
  @JSName("method")
  var method_NormalizedOptions: js.UndefOr[String] = js.native
  @JSName("onDownloadProgress")
  var onDownloadProgress_Original: js.Function2[
    /* progress */ DownloadProgress, 
    /* chunk */ scala.scalajs.js.typedarray.Uint8Array, 
    Unit
  ] = js.native
  var prefixUrl: js.UndefOr[URL | String] = js.native
  // Extended from custom `KyOptions`, but ensured to be set (not optional).
  var retry: js.UndefOr[RetryOptions | Double] = js.native
  def onDownloadProgress(progress: DownloadProgress, chunk: scala.scalajs.js.typedarray.Uint8Array): Unit = js.native
}

