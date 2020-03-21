package typingsJapgolly.tampermonkey.Tampermonkey

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Download Request
trait DownloadRequest extends js.Object {
  var headers: js.UndefOr[RequestHeaders] = js.undefined
  /**
    * Filename - for security reasons the file extension needs to be
    * whitelisted at Tampermonkey options page
    */
  var name: String
  /** Callback to be executed if this download ended up with an error */
  var onerror: js.UndefOr[RequestEventListener[DownloadErrorResponse]] = js.undefined
  /** Callback to be executed if this download finished */
  var onload: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** Callback to be executed if this download failed due to a timeout */
  var onprogress: js.UndefOr[RequestEventListener[DownloadProgressResponse]] = js.undefined
  /** Callback to be executed if this download finished */
  var ontimeout: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** Show 'Save As' dialog */
  var saveAs: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  /** URL from where the data should be downloaded */
  var url: String
}

object DownloadRequest {
  @scala.inline
  def apply(
    name: String,
    url: String,
    headers: RequestHeaders = null,
    onerror: RequestEventListener[DownloadErrorResponse] = null,
    onload: js.UndefOr[Callback] = js.undefined,
    onprogress: RequestEventListener[DownloadProgressResponse] = null,
    ontimeout: js.UndefOr[Callback] = js.undefined,
    saveAs: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null
  ): DownloadRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (onerror != null) __obj.updateDynamic("onerror")(onerror.asInstanceOf[js.Any])
    onload.foreach(p => __obj.updateDynamic("onload")(p.toJsFn))
    if (onprogress != null) __obj.updateDynamic("onprogress")(onprogress.asInstanceOf[js.Any])
    ontimeout.foreach(p => __obj.updateDynamic("ontimeout")(p.toJsFn))
    if (!js.isUndefined(saveAs)) __obj.updateDynamic("saveAs")(saveAs.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadRequest]
  }
}

