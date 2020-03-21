package typingsJapgolly.reactGoogleRecaptcha.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactGoogleRecaptcha.mod.Badge
import typingsJapgolly.reactGoogleRecaptcha.mod.ReCAPTCHAProps
import typingsJapgolly.reactGoogleRecaptcha.mod.Size
import typingsJapgolly.reactGoogleRecaptcha.mod.Theme
import typingsJapgolly.reactGoogleRecaptcha.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_ReCAPTCHAProps97602134[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    sitekey: String,
    badge: Badge = null,
    grecaptcha: js.Object = null,
    hl: String = null,
    onChange: /* token */ String | Null => Callback = null,
    onErrored: js.UndefOr[Callback] = js.undefined,
    onExpired: js.UndefOr[Callback] = js.undefined,
    size: Size = null,
    stoken: String = null,
    tabindex: Int | Double = null,
    theme: Theme = null,
    `type`: Type = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ReCAPTCHAProps, ComponentRef, Unit, ReCAPTCHAProps] = {
    val __obj = js.Dynamic.literal(sitekey = sitekey.asInstanceOf[js.Any])
  
      if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (grecaptcha != null) __obj.updateDynamic("grecaptcha")(grecaptcha.asInstanceOf[js.Any])
    if (hl != null) __obj.updateDynamic("hl")(hl.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* token */ java.lang.String | scala.Null) => onChange(t0).runNow()))
    onErrored.foreach(p => __obj.updateDynamic("onErrored")(p.toJsFn))
    onExpired.foreach(p => __obj.updateDynamic("onExpired")(p.toJsFn))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (stoken != null) __obj.updateDynamic("stoken")(stoken.asInstanceOf[js.Any])
    if (tabindex != null) __obj.updateDynamic("tabindex")(tabindex.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactGoogleRecaptcha.mod.ReCAPTCHAProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactGoogleRecaptcha.mod.ReCAPTCHAProps])(children: _*)
  }
}

