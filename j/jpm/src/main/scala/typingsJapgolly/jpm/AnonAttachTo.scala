package typingsJapgolly.jpm

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jpm.FFAddonSDK.ContentWorker
import typingsJapgolly.jpm.jpmStrings.end
import typingsJapgolly.jpm.jpmStrings.ready
import typingsJapgolly.jpm.jpmStrings.start
import typingsJapgolly.jpm.pageModMod.attachmentMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttachTo extends js.Object {
  var attachTo: js.UndefOr[attachmentMode | js.Array[attachmentMode]] = js.undefined
  var contentScript: js.UndefOr[String | js.Array[String]] = js.undefined
  var contentScriptFile: js.UndefOr[String | js.Array[String]] = js.undefined
  var contentScriptOptions: js.UndefOr[js.Any] = js.undefined
  var contentScriptWhen: js.UndefOr[start | ready | end] = js.undefined
  var contentStyle: js.UndefOr[String | js.Array[String]] = js.undefined
  var contentStyleFile: js.UndefOr[String | js.Array[String]] = js.undefined
  var exclude: js.UndefOr[String | js.Array[String]] = js.undefined
  var include: String | (js.Array[js.RegExp | String]) | js.RegExp
  var onAttach: js.UndefOr[js.Function1[/* worker */ ContentWorker, _]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ js.Error, _]] = js.undefined
}

object AnonAttachTo {
  @scala.inline
  def apply(
    include: String | (js.Array[js.RegExp | String]) | js.RegExp,
    attachTo: attachmentMode | js.Array[attachmentMode] = null,
    contentScript: String | js.Array[String] = null,
    contentScriptFile: String | js.Array[String] = null,
    contentScriptOptions: js.Any = null,
    contentScriptWhen: start | ready | end = null,
    contentStyle: String | js.Array[String] = null,
    contentStyleFile: String | js.Array[String] = null,
    exclude: String | js.Array[String] = null,
    onAttach: /* worker */ ContentWorker => CallbackTo[js.Any] = null,
    onError: /* error */ js.Error => CallbackTo[js.Any] = null
  ): AnonAttachTo = {
    val __obj = js.Dynamic.literal(include = include.asInstanceOf[js.Any])
    if (attachTo != null) __obj.updateDynamic("attachTo")(attachTo.asInstanceOf[js.Any])
    if (contentScript != null) __obj.updateDynamic("contentScript")(contentScript.asInstanceOf[js.Any])
    if (contentScriptFile != null) __obj.updateDynamic("contentScriptFile")(contentScriptFile.asInstanceOf[js.Any])
    if (contentScriptOptions != null) __obj.updateDynamic("contentScriptOptions")(contentScriptOptions.asInstanceOf[js.Any])
    if (contentScriptWhen != null) __obj.updateDynamic("contentScriptWhen")(contentScriptWhen.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (contentStyleFile != null) __obj.updateDynamic("contentStyleFile")(contentStyleFile.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (onAttach != null) __obj.updateDynamic("onAttach")(js.Any.fromFunction1((t0: /* worker */ typingsJapgolly.jpm.FFAddonSDK.ContentWorker) => onAttach(t0).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* error */ js.Error) => onError(t0).runNow()))
    __obj.asInstanceOf[AnonAttachTo]
  }
}

