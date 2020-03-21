package typingsJapgolly.jqueryToastPlugin

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jqueryToastPlugin.jqueryToastPluginBooleans.`false`
import typingsJapgolly.jqueryToastPlugin.jqueryToastPluginStrings.`bottom-center`
import typingsJapgolly.jqueryToastPlugin.jqueryToastPluginStrings.`bottom-left`
import typingsJapgolly.jqueryToastPlugin.jqueryToastPluginStrings.`bottom-right`
import typingsJapgolly.jqueryToastPlugin.jqueryToastPluginStrings.`mid-center`
import typingsJapgolly.jqueryToastPlugin.jqueryToastPluginStrings.`top-center`
import typingsJapgolly.jqueryToastPlugin.jqueryToastPluginStrings.`top-left`
import typingsJapgolly.jqueryToastPlugin.jqueryToastPluginStrings.`top-right`
import typingsJapgolly.jqueryToastPlugin.jqueryToastPluginStrings.center
import typingsJapgolly.jqueryToastPlugin.jqueryToastPluginStrings.error
import typingsJapgolly.jqueryToastPlugin.jqueryToastPluginStrings.fade
import typingsJapgolly.jqueryToastPlugin.jqueryToastPluginStrings.info
import typingsJapgolly.jqueryToastPlugin.jqueryToastPluginStrings.left
import typingsJapgolly.jqueryToastPlugin.jqueryToastPluginStrings.plain
import typingsJapgolly.jqueryToastPlugin.jqueryToastPluginStrings.right
import typingsJapgolly.jqueryToastPlugin.jqueryToastPluginStrings.slide
import typingsJapgolly.jqueryToastPlugin.jqueryToastPluginStrings.success
import typingsJapgolly.jqueryToastPlugin.jqueryToastPluginStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait toastOptions extends js.Object {
  var afterHidden: js.UndefOr[js.Function0[_]] = js.undefined
  var afterShown: js.UndefOr[js.Function0[_]] = js.undefined
  var allowToastClose: js.UndefOr[Boolean] = js.undefined
  var beforeHide: js.UndefOr[js.Function0[_]] = js.undefined
  var beforeShow: js.UndefOr[js.Function0[_]] = js.undefined
  var bgColor: js.UndefOr[String] = js.undefined
  var heading: js.UndefOr[String] = js.undefined
  var hideAfter: js.UndefOr[Double | `false`] = js.undefined
  var icon: js.UndefOr[info | warning | error | success] = js.undefined
  var loader: js.UndefOr[Boolean] = js.undefined
  var loaderBg: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[
    `bottom-left` | `bottom-right` | `bottom-center` | `top-right` | `top-left` | `top-center` | `mid-center` | CustomPosition
  ] = js.undefined
  var showHideTransition: js.UndefOr[fade | slide | plain] = js.undefined
  var stack: js.UndefOr[Double | `false`] = js.undefined
  var text: String
  var textAlign: js.UndefOr[left | right | center] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
}

object toastOptions {
  @scala.inline
  def apply(
    text: String,
    afterHidden: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    afterShown: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    allowToastClose: js.UndefOr[Boolean] = js.undefined,
    beforeHide: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    beforeShow: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    bgColor: String = null,
    heading: String = null,
    hideAfter: Double | `false` = null,
    icon: info | warning | error | success = null,
    loader: js.UndefOr[Boolean] = js.undefined,
    loaderBg: String = null,
    position: `bottom-left` | `bottom-right` | `bottom-center` | `top-right` | `top-left` | `top-center` | `mid-center` | CustomPosition = null,
    showHideTransition: fade | slide | plain = null,
    stack: Double | `false` = null,
    textAlign: left | right | center = null,
    textColor: String = null
  ): toastOptions = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    afterHidden.foreach(p => __obj.updateDynamic("afterHidden")(p.toJsFn))
    afterShown.foreach(p => __obj.updateDynamic("afterShown")(p.toJsFn))
    if (!js.isUndefined(allowToastClose)) __obj.updateDynamic("allowToastClose")(allowToastClose.asInstanceOf[js.Any])
    beforeHide.foreach(p => __obj.updateDynamic("beforeHide")(p.toJsFn))
    beforeShow.foreach(p => __obj.updateDynamic("beforeShow")(p.toJsFn))
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor.asInstanceOf[js.Any])
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (hideAfter != null) __obj.updateDynamic("hideAfter")(hideAfter.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(loader)) __obj.updateDynamic("loader")(loader.asInstanceOf[js.Any])
    if (loaderBg != null) __obj.updateDynamic("loaderBg")(loaderBg.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (showHideTransition != null) __obj.updateDynamic("showHideTransition")(showHideTransition.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[toastOptions]
  }
}

