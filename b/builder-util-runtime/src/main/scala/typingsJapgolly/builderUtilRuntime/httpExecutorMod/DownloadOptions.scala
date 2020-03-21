package typingsJapgolly.builderUtilRuntime.httpExecutorMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.builderUtilRuntime.cancellationTokenMod.CancellationToken
import typingsJapgolly.builderUtilRuntime.progressCallbackTransformMod.ProgressInfo
import typingsJapgolly.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadOptions extends js.Object {
  val cancellationToken: CancellationToken
  val headers: js.UndefOr[OutgoingHttpHeaders | Null] = js.undefined
  var onProgress: js.UndefOr[js.Function1[/* progress */ ProgressInfo, Unit]] = js.undefined
  val sha2: js.UndefOr[String | Null] = js.undefined
  val sha512: js.UndefOr[String | Null] = js.undefined
}

object DownloadOptions {
  @scala.inline
  def apply(
    cancellationToken: CancellationToken,
    headers: OutgoingHttpHeaders = null,
    onProgress: /* progress */ ProgressInfo => Callback = null,
    sha2: String = null,
    sha512: String = null
  ): DownloadOptions = {
    val __obj = js.Dynamic.literal(cancellationToken = cancellationToken.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1((t0: /* progress */ typingsJapgolly.builderUtilRuntime.progressCallbackTransformMod.ProgressInfo) => onProgress(t0).runNow()))
    if (sha2 != null) __obj.updateDynamic("sha2")(sha2.asInstanceOf[js.Any])
    if (sha512 != null) __obj.updateDynamic("sha512")(sha512.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadOptions]
  }
}

