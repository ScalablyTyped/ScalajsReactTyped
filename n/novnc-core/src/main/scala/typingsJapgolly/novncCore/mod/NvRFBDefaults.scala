package typingsJapgolly.novncCore.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.novncCore.novncCoreStrings.error
import typingsJapgolly.novncCore.novncCoreStrings.normal
import typingsJapgolly.novncCore.novncCoreStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NvRFBDefaults extends js.Object {
  var disconnectTimeout: js.UndefOr[Double] = js.undefined
  var encrypt: js.UndefOr[Boolean] = js.undefined
  var focusContainer: js.UndefOr[HTMLElement] = js.undefined
  var local_cursor: js.UndefOr[Boolean] = js.undefined
  var onBell: js.UndefOr[js.Function1[/* rfb */ RFB, Unit]] = js.undefined
  var onClipboard: js.UndefOr[js.Function2[/* rfb */ RFB, /* text */ String, Unit]] = js.undefined
  var onDesktopName: js.UndefOr[js.Function2[/* rfb */ RFB, /* name */ String, Unit]] = js.undefined
  var onDisconnected: js.UndefOr[js.Function2[/* rfb */ RFB, /* reason */ js.UndefOr[String], Unit]] = js.undefined
  var onFBResize: js.UndefOr[js.Function3[/* rfb */ RFB, /* width */ Double, /* height */ Double, Unit]] = js.undefined
  var onFBUComplete: js.UndefOr[js.Function2[/* rfb */ RFB, /* fbu */ NvFBU, Unit]] = js.undefined
  var onFBUReceive: js.UndefOr[js.Function2[/* rfb */ RFB, /* fbu */ NvFBU, Unit]] = js.undefined
  var onNotification: js.UndefOr[
    js.Function4[
      /* rfb */ RFB, 
      /* msg */ String, 
      /* level */ normal | warn | error, 
      /* options */ js.UndefOr[StringDictionary[js.Any]], 
      Unit
    ]
  ] = js.undefined
  var onPasswordRequired: js.UndefOr[js.Function2[/* rfb */ RFB, /* msg */ js.UndefOr[String], Unit]] = js.undefined
  var onUpdateState: js.UndefOr[
    js.Function3[/* rfb */ RFB, /* state */ NvConnectionState, /* oldstate */ NvConnectionState, Unit]
  ] = js.undefined
  var onXvpInit: js.UndefOr[js.Function1[/* version */ Double, Unit]] = js.undefined
  var repeaterID: js.UndefOr[String] = js.undefined
  var shared: js.UndefOr[Boolean] = js.undefined
  var target: js.UndefOr[HTMLCanvasElement] = js.undefined
  var view_only: js.UndefOr[Boolean] = js.undefined
  var viewportDrag: js.UndefOr[Boolean] = js.undefined
  var wsProtocols: js.UndefOr[js.Array[String]] = js.undefined
  var xvp_password_sep: js.UndefOr[String] = js.undefined
}

object NvRFBDefaults {
  @scala.inline
  def apply(
    disconnectTimeout: Int | Double = null,
    encrypt: js.UndefOr[Boolean] = js.undefined,
    focusContainer: HTMLElement = null,
    local_cursor: js.UndefOr[Boolean] = js.undefined,
    onBell: /* rfb */ RFB => Callback = null,
    onClipboard: (/* rfb */ RFB, /* text */ String) => Callback = null,
    onDesktopName: (/* rfb */ RFB, /* name */ String) => Callback = null,
    onDisconnected: (/* rfb */ RFB, /* reason */ js.UndefOr[String]) => Callback = null,
    onFBResize: (/* rfb */ RFB, /* width */ Double, /* height */ Double) => Callback = null,
    onFBUComplete: (/* rfb */ RFB, /* fbu */ NvFBU) => Callback = null,
    onFBUReceive: (/* rfb */ RFB, /* fbu */ NvFBU) => Callback = null,
    onNotification: (/* rfb */ RFB, /* msg */ String, /* level */ normal | warn | error, /* options */ js.UndefOr[StringDictionary[js.Any]]) => Callback = null,
    onPasswordRequired: (/* rfb */ RFB, /* msg */ js.UndefOr[String]) => Callback = null,
    onUpdateState: (/* rfb */ RFB, /* state */ NvConnectionState, /* oldstate */ NvConnectionState) => Callback = null,
    onXvpInit: /* version */ Double => Callback = null,
    repeaterID: String = null,
    shared: js.UndefOr[Boolean] = js.undefined,
    target: HTMLCanvasElement = null,
    view_only: js.UndefOr[Boolean] = js.undefined,
    viewportDrag: js.UndefOr[Boolean] = js.undefined,
    wsProtocols: js.Array[String] = null,
    xvp_password_sep: String = null
  ): NvRFBDefaults = {
    val __obj = js.Dynamic.literal()
    if (disconnectTimeout != null) __obj.updateDynamic("disconnectTimeout")(disconnectTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(encrypt)) __obj.updateDynamic("encrypt")(encrypt.asInstanceOf[js.Any])
    if (focusContainer != null) __obj.updateDynamic("focusContainer")(focusContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(local_cursor)) __obj.updateDynamic("local_cursor")(local_cursor.asInstanceOf[js.Any])
    if (onBell != null) __obj.updateDynamic("onBell")(js.Any.fromFunction1((t0: /* rfb */ typingsJapgolly.novncCore.mod.RFB) => onBell(t0).runNow()))
    if (onClipboard != null) __obj.updateDynamic("onClipboard")(js.Any.fromFunction2((t0: /* rfb */ typingsJapgolly.novncCore.mod.RFB, t1: /* text */ java.lang.String) => onClipboard(t0, t1).runNow()))
    if (onDesktopName != null) __obj.updateDynamic("onDesktopName")(js.Any.fromFunction2((t0: /* rfb */ typingsJapgolly.novncCore.mod.RFB, t1: /* name */ java.lang.String) => onDesktopName(t0, t1).runNow()))
    if (onDisconnected != null) __obj.updateDynamic("onDisconnected")(js.Any.fromFunction2((t0: /* rfb */ typingsJapgolly.novncCore.mod.RFB, t1: /* reason */ js.UndefOr[java.lang.String]) => onDisconnected(t0, t1).runNow()))
    if (onFBResize != null) __obj.updateDynamic("onFBResize")(js.Any.fromFunction3((t0: /* rfb */ typingsJapgolly.novncCore.mod.RFB, t1: /* width */ scala.Double, t2: /* height */ scala.Double) => onFBResize(t0, t1, t2).runNow()))
    if (onFBUComplete != null) __obj.updateDynamic("onFBUComplete")(js.Any.fromFunction2((t0: /* rfb */ typingsJapgolly.novncCore.mod.RFB, t1: /* fbu */ typingsJapgolly.novncCore.mod.NvFBU) => onFBUComplete(t0, t1).runNow()))
    if (onFBUReceive != null) __obj.updateDynamic("onFBUReceive")(js.Any.fromFunction2((t0: /* rfb */ typingsJapgolly.novncCore.mod.RFB, t1: /* fbu */ typingsJapgolly.novncCore.mod.NvFBU) => onFBUReceive(t0, t1).runNow()))
    if (onNotification != null) __obj.updateDynamic("onNotification")(js.Any.fromFunction4((t0: /* rfb */ typingsJapgolly.novncCore.mod.RFB, t1: /* msg */ java.lang.String, t2: /* level */ typingsJapgolly.novncCore.novncCoreStrings.normal | typingsJapgolly.novncCore.novncCoreStrings.warn | typingsJapgolly.novncCore.novncCoreStrings.error, t3: /* options */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]]) => onNotification(t0, t1, t2, t3).runNow()))
    if (onPasswordRequired != null) __obj.updateDynamic("onPasswordRequired")(js.Any.fromFunction2((t0: /* rfb */ typingsJapgolly.novncCore.mod.RFB, t1: /* msg */ js.UndefOr[java.lang.String]) => onPasswordRequired(t0, t1).runNow()))
    if (onUpdateState != null) __obj.updateDynamic("onUpdateState")(js.Any.fromFunction3((t0: /* rfb */ typingsJapgolly.novncCore.mod.RFB, t1: /* state */ typingsJapgolly.novncCore.mod.NvConnectionState, t2: /* oldstate */ typingsJapgolly.novncCore.mod.NvConnectionState) => onUpdateState(t0, t1, t2).runNow()))
    if (onXvpInit != null) __obj.updateDynamic("onXvpInit")(js.Any.fromFunction1((t0: /* version */ scala.Double) => onXvpInit(t0).runNow()))
    if (repeaterID != null) __obj.updateDynamic("repeaterID")(repeaterID.asInstanceOf[js.Any])
    if (!js.isUndefined(shared)) __obj.updateDynamic("shared")(shared.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(view_only)) __obj.updateDynamic("view_only")(view_only.asInstanceOf[js.Any])
    if (!js.isUndefined(viewportDrag)) __obj.updateDynamic("viewportDrag")(viewportDrag.asInstanceOf[js.Any])
    if (wsProtocols != null) __obj.updateDynamic("wsProtocols")(wsProtocols.asInstanceOf[js.Any])
    if (xvp_password_sep != null) __obj.updateDynamic("xvp_password_sep")(xvp_password_sep.asInstanceOf[js.Any])
    __obj.asInstanceOf[NvRFBDefaults]
  }
}

