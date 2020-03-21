package typingsJapgolly.reactRecaptcha.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactRecaptcha.reactRecaptchaStrings.`inline`
import typingsJapgolly.reactRecaptcha.reactRecaptchaStrings.audio
import typingsJapgolly.reactRecaptcha.reactRecaptchaStrings.bottomleft
import typingsJapgolly.reactRecaptcha.reactRecaptchaStrings.bottomright
import typingsJapgolly.reactRecaptcha.reactRecaptchaStrings.compact
import typingsJapgolly.reactRecaptcha.reactRecaptchaStrings.dark
import typingsJapgolly.reactRecaptcha.reactRecaptchaStrings.explicit
import typingsJapgolly.reactRecaptcha.reactRecaptchaStrings.image
import typingsJapgolly.reactRecaptcha.reactRecaptchaStrings.invisible
import typingsJapgolly.reactRecaptcha.reactRecaptchaStrings.light
import typingsJapgolly.reactRecaptcha.reactRecaptchaStrings.normal
import typingsJapgolly.reactRecaptcha.reactRecaptchaStrings.onload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecaptchaProps extends js.Object {
  var badge: js.UndefOr[bottomright | bottomleft | `inline`] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var elementID: js.UndefOr[String] = js.undefined
  var expiredCallback: js.UndefOr[js.Function0[_]] = js.undefined
  var expiredCallbackName: js.UndefOr[String] = js.undefined
  var hl: js.UndefOr[String] = js.undefined
  var onloadCallback: js.UndefOr[js.Function0[_]] = js.undefined
  var onloadCallbackName: js.UndefOr[String] = js.undefined
  var render: js.UndefOr[onload | explicit] = js.undefined
  var sitekey: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[normal | compact | invisible] = js.undefined
  var tabindex: js.UndefOr[Double | String] = js.undefined
  var theme: js.UndefOr[dark | light] = js.undefined
  var `type`: js.UndefOr[audio | image] = js.undefined
  var verifyCallback: js.UndefOr[js.Function1[/* response */ String, _]] = js.undefined
  var verifyCallbackName: js.UndefOr[String] = js.undefined
}

object RecaptchaProps {
  @scala.inline
  def apply(
    badge: bottomright | bottomleft | `inline` = null,
    className: String = null,
    elementID: String = null,
    expiredCallback: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    expiredCallbackName: String = null,
    hl: String = null,
    onloadCallback: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onloadCallbackName: String = null,
    render: onload | explicit = null,
    sitekey: String = null,
    size: normal | compact | invisible = null,
    tabindex: Double | String = null,
    theme: dark | light = null,
    `type`: audio | image = null,
    verifyCallback: /* response */ String => CallbackTo[js.Any] = null,
    verifyCallbackName: String = null
  ): RecaptchaProps = {
    val __obj = js.Dynamic.literal()
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (elementID != null) __obj.updateDynamic("elementID")(elementID.asInstanceOf[js.Any])
    expiredCallback.foreach(p => __obj.updateDynamic("expiredCallback")(p.toJsFn))
    if (expiredCallbackName != null) __obj.updateDynamic("expiredCallbackName")(expiredCallbackName.asInstanceOf[js.Any])
    if (hl != null) __obj.updateDynamic("hl")(hl.asInstanceOf[js.Any])
    onloadCallback.foreach(p => __obj.updateDynamic("onloadCallback")(p.toJsFn))
    if (onloadCallbackName != null) __obj.updateDynamic("onloadCallbackName")(onloadCallbackName.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    if (sitekey != null) __obj.updateDynamic("sitekey")(sitekey.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (tabindex != null) __obj.updateDynamic("tabindex")(tabindex.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (verifyCallback != null) __obj.updateDynamic("verifyCallback")(js.Any.fromFunction1((t0: /* response */ java.lang.String) => verifyCallback(t0).runNow()))
    if (verifyCallbackName != null) __obj.updateDynamic("verifyCallbackName")(verifyCallbackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecaptchaProps]
  }
}

