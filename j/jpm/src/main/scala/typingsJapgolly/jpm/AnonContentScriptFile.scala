package typingsJapgolly.jpm

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.experimental.URL
import typingsJapgolly.jpm.jpmStrings.end
import typingsJapgolly.jpm.jpmStrings.ready
import typingsJapgolly.jpm.jpmStrings.start
import typingsJapgolly.jpm.panelMod.PanelPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentScriptFile extends js.Object {
  var allow: js.UndefOr[AnonScriptBoolean] = js.undefined
  var contentScript: js.UndefOr[String | js.Array[String]] = js.undefined
  var contentScriptFile: js.UndefOr[String | js.Array[String]] = js.undefined
  var contentScriptOptions: js.UndefOr[js.Any] = js.undefined
  var contentScriptWhen: js.UndefOr[start | ready | end] = js.undefined
  var contentStyle: js.UndefOr[String | js.Array[String]] = js.undefined
  var contentStyleFile: js.UndefOr[String | js.Array[String]] = js.undefined
  var contentURL: js.UndefOr[String | URL] = js.undefined
  var contextMenu: js.UndefOr[Boolean] = js.undefined
  var focus: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ js.Error, _]] = js.undefined
  var onHide: js.UndefOr[js.Function0[_]] = js.undefined
  var onMessage: js.UndefOr[js.Function1[/* message */ String, _]] = js.undefined
  var onShow: js.UndefOr[js.Function0[_]] = js.undefined
  var position: js.UndefOr[PanelPosition] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonContentScriptFile {
  @scala.inline
  def apply(
    allow: AnonScriptBoolean = null,
    contentScript: String | js.Array[String] = null,
    contentScriptFile: String | js.Array[String] = null,
    contentScriptOptions: js.Any = null,
    contentScriptWhen: start | ready | end = null,
    contentStyle: String | js.Array[String] = null,
    contentStyleFile: String | js.Array[String] = null,
    contentURL: String | URL = null,
    contextMenu: js.UndefOr[Boolean] = js.undefined,
    focus: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    onError: /* error */ js.Error => CallbackTo[js.Any] = null,
    onHide: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onMessage: /* message */ String => CallbackTo[js.Any] = null,
    onShow: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    position: PanelPosition = null,
    width: Int | Double = null
  ): AnonContentScriptFile = {
    val __obj = js.Dynamic.literal()
    if (allow != null) __obj.updateDynamic("allow")(allow.asInstanceOf[js.Any])
    if (contentScript != null) __obj.updateDynamic("contentScript")(contentScript.asInstanceOf[js.Any])
    if (contentScriptFile != null) __obj.updateDynamic("contentScriptFile")(contentScriptFile.asInstanceOf[js.Any])
    if (contentScriptOptions != null) __obj.updateDynamic("contentScriptOptions")(contentScriptOptions.asInstanceOf[js.Any])
    if (contentScriptWhen != null) __obj.updateDynamic("contentScriptWhen")(contentScriptWhen.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (contentStyleFile != null) __obj.updateDynamic("contentStyleFile")(contentStyleFile.asInstanceOf[js.Any])
    if (contentURL != null) __obj.updateDynamic("contentURL")(contentURL.asInstanceOf[js.Any])
    if (!js.isUndefined(contextMenu)) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* error */ js.Error) => onError(t0).runNow()))
    onHide.foreach(p => __obj.updateDynamic("onHide")(p.toJsFn))
    if (onMessage != null) __obj.updateDynamic("onMessage")(js.Any.fromFunction1((t0: /* message */ java.lang.String) => onMessage(t0).runNow()))
    onShow.foreach(p => __obj.updateDynamic("onShow")(p.toJsFn))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContentScriptFile]
  }
}

