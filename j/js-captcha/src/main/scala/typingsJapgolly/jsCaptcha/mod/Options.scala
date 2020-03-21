package typingsJapgolly.jsCaptcha.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeListOf
import typingsJapgolly.jsCaptcha.jsCaptchaStrings.error
import typingsJapgolly.jsCaptcha.jsCaptchaStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the base jCaptcha class. Derived from https://github.com/robiveli/js-captcha#options
  */
trait Options extends js.Object {
  var callback: js.UndefOr[
    js.Function2[/* response */ success | error, /* input */ NodeListOf[Element with Node], Unit]
  ] = js.undefined
  var canvasFillStyle: js.UndefOr[String] = js.undefined
  var canvasFontFamily: js.UndefOr[String] = js.undefined
  var canvasFontSize: js.UndefOr[String] = js.undefined
  var canvasHeight: js.UndefOr[Double] = js.undefined
  var canvasWidth: js.UndefOr[Double] = js.undefined
  var clearOnSubmit: js.UndefOr[Boolean] = js.undefined
  var el: js.UndefOr[String] = js.undefined
  var focusOnError: js.UndefOr[Boolean] = js.undefined
  var requiredValue: js.UndefOr[String] = js.undefined
  var resetOnError: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    callback: (/* response */ success | error, /* input */ NodeListOf[Element with Node]) => Callback = null,
    canvasFillStyle: String = null,
    canvasFontFamily: String = null,
    canvasFontSize: String = null,
    canvasHeight: Int | Double = null,
    canvasWidth: Int | Double = null,
    clearOnSubmit: js.UndefOr[Boolean] = js.undefined,
    el: String = null,
    focusOnError: js.UndefOr[Boolean] = js.undefined,
    requiredValue: String = null,
    resetOnError: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2((t0: /* response */ typingsJapgolly.jsCaptcha.jsCaptchaStrings.success | typingsJapgolly.jsCaptcha.jsCaptchaStrings.error, t1: /* input */ org.scalajs.dom.raw.NodeListOf[org.scalajs.dom.raw.Element with org.scalajs.dom.raw.Node]) => callback(t0, t1).runNow()))
    if (canvasFillStyle != null) __obj.updateDynamic("canvasFillStyle")(canvasFillStyle.asInstanceOf[js.Any])
    if (canvasFontFamily != null) __obj.updateDynamic("canvasFontFamily")(canvasFontFamily.asInstanceOf[js.Any])
    if (canvasFontSize != null) __obj.updateDynamic("canvasFontSize")(canvasFontSize.asInstanceOf[js.Any])
    if (canvasHeight != null) __obj.updateDynamic("canvasHeight")(canvasHeight.asInstanceOf[js.Any])
    if (canvasWidth != null) __obj.updateDynamic("canvasWidth")(canvasWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(clearOnSubmit)) __obj.updateDynamic("clearOnSubmit")(clearOnSubmit.asInstanceOf[js.Any])
    if (el != null) __obj.updateDynamic("el")(el.asInstanceOf[js.Any])
    if (!js.isUndefined(focusOnError)) __obj.updateDynamic("focusOnError")(focusOnError.asInstanceOf[js.Any])
    if (requiredValue != null) __obj.updateDynamic("requiredValue")(requiredValue.asInstanceOf[js.Any])
    if (!js.isUndefined(resetOnError)) __obj.updateDynamic("resetOnError")(resetOnError.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

