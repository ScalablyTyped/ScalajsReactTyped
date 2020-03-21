package typingsJapgolly.webPush.mod

import typingsJapgolly.webPush.AnonPrivateKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var TTL: js.UndefOr[Double] = js.undefined
   // a value in seconds that describes how long a push message is retained by the push service (by default, four weeks).
  var contentEncoding: js.UndefOr[ContentEncoding] = js.undefined
  var gcmAPIKey: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[Headers] = js.undefined
   // the type of push encoding to use (e.g. 'aesgcm', by default, or 'aes128gcm').
  var proxy: js.UndefOr[String] = js.undefined
   // can be a GCM API key to be used for this request and this request only. This overrides any API key set via setGCMAPIKey().
  var vapidDetails: js.UndefOr[AnonPrivateKey] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    TTL: Int | Double = null,
    contentEncoding: ContentEncoding = null,
    gcmAPIKey: String = null,
    headers: Headers = null,
    proxy: String = null,
    vapidDetails: AnonPrivateKey = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (TTL != null) __obj.updateDynamic("TTL")(TTL.asInstanceOf[js.Any])
    if (contentEncoding != null) __obj.updateDynamic("contentEncoding")(contentEncoding.asInstanceOf[js.Any])
    if (gcmAPIKey != null) __obj.updateDynamic("gcmAPIKey")(gcmAPIKey.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (vapidDetails != null) __obj.updateDynamic("vapidDetails")(vapidDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

