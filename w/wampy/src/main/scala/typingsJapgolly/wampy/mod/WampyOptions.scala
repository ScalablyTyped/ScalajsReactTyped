package typingsJapgolly.wampy.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WampyOptions extends js.Object {
  var authid: js.UndefOr[String] = js.undefined
  var authmethods: js.UndefOr[js.Array[String]] = js.undefined
  var autoReconnect: js.UndefOr[Boolean] = js.undefined
  var helloCustomDetails: js.UndefOr[js.Any] = js.undefined
  var maxRetries: js.UndefOr[Double] = js.undefined
  var onChallenge: js.UndefOr[ChallengeCallback] = js.undefined
  var onClose: js.UndefOr[Callback] = js.undefined
  var onConnect: js.UndefOr[Callback] = js.undefined
  var onError: js.UndefOr[Callback] = js.undefined
  var onReconnect: js.UndefOr[Callback] = js.undefined
  var onReconnectSuccess: js.UndefOr[Callback] = js.undefined
  var realm: js.UndefOr[String] = js.undefined
  var reconnectInterval: js.UndefOr[Double] = js.undefined
  var serializer: js.UndefOr[js.Any] = js.undefined
  var ws: js.UndefOr[js.Any] = js.undefined
}

object WampyOptions {
  @scala.inline
  def apply(
    authid: String = null,
    authmethods: js.Array[String] = null,
    autoReconnect: js.UndefOr[Boolean] = js.undefined,
    helloCustomDetails: js.Any = null,
    maxRetries: Int | Double = null,
    onChallenge: (/* auth_method */ String, /* extra */ Dict) => CallbackTo[String] = null,
    onClose: js.UndefOr[japgolly.scalajs.react.Callback] = js.undefined,
    onConnect: js.UndefOr[japgolly.scalajs.react.Callback] = js.undefined,
    onError: js.UndefOr[japgolly.scalajs.react.Callback] = js.undefined,
    onReconnect: js.UndefOr[japgolly.scalajs.react.Callback] = js.undefined,
    onReconnectSuccess: js.UndefOr[japgolly.scalajs.react.Callback] = js.undefined,
    realm: String = null,
    reconnectInterval: Int | Double = null,
    serializer: js.Any = null,
    ws: js.Any = null
  ): WampyOptions = {
    val __obj = js.Dynamic.literal()
    if (authid != null) __obj.updateDynamic("authid")(authid.asInstanceOf[js.Any])
    if (authmethods != null) __obj.updateDynamic("authmethods")(authmethods.asInstanceOf[js.Any])
    if (!js.isUndefined(autoReconnect)) __obj.updateDynamic("autoReconnect")(autoReconnect.asInstanceOf[js.Any])
    if (helloCustomDetails != null) __obj.updateDynamic("helloCustomDetails")(helloCustomDetails.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (onChallenge != null) __obj.updateDynamic("onChallenge")(js.Any.fromFunction2((t0: /* auth_method */ java.lang.String, t1: /* extra */ typingsJapgolly.wampy.mod.Dict) => onChallenge(t0, t1).runNow()))
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    onConnect.foreach(p => __obj.updateDynamic("onConnect")(p.toJsFn))
    onError.foreach(p => __obj.updateDynamic("onError")(p.toJsFn))
    onReconnect.foreach(p => __obj.updateDynamic("onReconnect")(p.toJsFn))
    onReconnectSuccess.foreach(p => __obj.updateDynamic("onReconnectSuccess")(p.toJsFn))
    if (realm != null) __obj.updateDynamic("realm")(realm.asInstanceOf[js.Any])
    if (reconnectInterval != null) __obj.updateDynamic("reconnectInterval")(reconnectInterval.asInstanceOf[js.Any])
    if (serializer != null) __obj.updateDynamic("serializer")(serializer.asInstanceOf[js.Any])
    if (ws != null) __obj.updateDynamic("ws")(ws.asInstanceOf[js.Any])
    __obj.asInstanceOf[WampyOptions]
  }
}

