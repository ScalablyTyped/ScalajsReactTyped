package typingsJapgolly.pubnub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFreeSocketKeepAliveTimeout extends js.Object {
  var freeSocketKeepAliveTimeout: js.UndefOr[Double] = js.undefined
  var keepAliveMsecs: js.UndefOr[Double] = js.undefined
  var maxFreeSockets: js.UndefOr[Double] = js.undefined
  var maxSockets: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object AnonFreeSocketKeepAliveTimeout {
  @scala.inline
  def apply(
    freeSocketKeepAliveTimeout: Int | Double = null,
    keepAliveMsecs: Int | Double = null,
    maxFreeSockets: Int | Double = null,
    maxSockets: Int | Double = null,
    timeout: Int | Double = null
  ): AnonFreeSocketKeepAliveTimeout = {
    val __obj = js.Dynamic.literal()
    if (freeSocketKeepAliveTimeout != null) __obj.updateDynamic("freeSocketKeepAliveTimeout")(freeSocketKeepAliveTimeout.asInstanceOf[js.Any])
    if (keepAliveMsecs != null) __obj.updateDynamic("keepAliveMsecs")(keepAliveMsecs.asInstanceOf[js.Any])
    if (maxFreeSockets != null) __obj.updateDynamic("maxFreeSockets")(maxFreeSockets.asInstanceOf[js.Any])
    if (maxSockets != null) __obj.updateDynamic("maxSockets")(maxSockets.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFreeSocketKeepAliveTimeout]
  }
}

