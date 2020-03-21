package typingsJapgolly.reactRecaptcha.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactRecaptcha.mod.RecaptchaProps
import typingsJapgolly.reactRecaptcha.mod.^
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

object ReactRecaptcha {
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
    verifyCallbackName: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[RecaptchaProps, ^, Unit, RecaptchaProps] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactRecaptcha.mod.RecaptchaProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactRecaptcha.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactRecaptcha.mod.RecaptchaProps])(children: _*)
  }
  @JSImport("react-recaptcha", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

