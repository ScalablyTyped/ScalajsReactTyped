package typingsJapgolly.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonToProxyScript extends js.Object {
  /**
    * Whether the TLS channel ID will be passed into onMessageExternal for processes that are listening for the
    * connection event.
    * @deprecated Unsupported on Firefox at this time.
    */
  var includeTlsChannelId: js.UndefOr[Boolean] = js.undefined
  /** If true, the message will be directed to the extension's proxy sandbox. */
  var toProxyScript: js.UndefOr[Boolean] = js.undefined
}

object AnonToProxyScript {
  @scala.inline
  def apply(
    includeTlsChannelId: js.UndefOr[Boolean] = js.undefined,
    toProxyScript: js.UndefOr[Boolean] = js.undefined
  ): AnonToProxyScript = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeTlsChannelId)) __obj.updateDynamic("includeTlsChannelId")(includeTlsChannelId.asInstanceOf[js.Any])
    if (!js.isUndefined(toProxyScript)) __obj.updateDynamic("toProxyScript")(toProxyScript.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonToProxyScript]
  }
}

