package typingsJapgolly.sipJs.libSessionMod.InviteClientContext

import typingsJapgolly.sipJs.AnonFromDisplayName
import typingsJapgolly.sipJs.libSessionDescriptionHandlerMod.SessionDescriptionHandlerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Anonymous call if true. */
  var anonymous: js.UndefOr[Boolean] = js.undefined
  /** Deprecated. */
  var body: js.UndefOr[String] = js.undefined
  /** Deprecated. */
  var contentType: js.UndefOr[String] = js.undefined
  /** Array of extra headers added to the INVITE. */
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
  /** If true, send INVITE without SDP. */
  var inviteWithoutSdp: js.UndefOr[Boolean] = js.undefined
  /** Deprecated. */
  var onInfo: js.UndefOr[js.Any] = js.undefined
  /** Deprecated. */
  var params: js.UndefOr[AnonFromDisplayName] = js.undefined
  /** Deprecated. */
  var renderbody: js.UndefOr[String] = js.undefined
  /** Deprecated. */
  var rendertype: js.UndefOr[String] = js.undefined
  /** Options to pass to SessionDescriptionHandler's getDescription() and setDescription(). */
  var sessionDescriptionHandlerOptions: js.UndefOr[SessionDescriptionHandlerOptions] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    anonymous: js.UndefOr[Boolean] = js.undefined,
    body: String = null,
    contentType: String = null,
    extraHeaders: js.Array[String] = null,
    inviteWithoutSdp: js.UndefOr[Boolean] = js.undefined,
    onInfo: js.Any = null,
    params: AnonFromDisplayName = null,
    renderbody: String = null,
    rendertype: String = null,
    sessionDescriptionHandlerOptions: SessionDescriptionHandlerOptions = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anonymous)) __obj.updateDynamic("anonymous")(anonymous.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(inviteWithoutSdp)) __obj.updateDynamic("inviteWithoutSdp")(inviteWithoutSdp.asInstanceOf[js.Any])
    if (onInfo != null) __obj.updateDynamic("onInfo")(onInfo.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (renderbody != null) __obj.updateDynamic("renderbody")(renderbody.asInstanceOf[js.Any])
    if (rendertype != null) __obj.updateDynamic("rendertype")(rendertype.asInstanceOf[js.Any])
    if (sessionDescriptionHandlerOptions != null) __obj.updateDynamic("sessionDescriptionHandlerOptions")(sessionDescriptionHandlerOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

