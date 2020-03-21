package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.captchaCaptchaMod.CaptchaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Captcha {
  def apply(
    id: String = null,
    language: String = null,
    onExpire: js.UndefOr[Callback] = js.undefined,
    onResponse: /* response */ js.Any => Callback = null,
    siteKey: String = null,
    size: String = null,
    tabIndex: Int | Double = null,
    theme: String = null,
    `type`: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CaptchaProps, typingsJapgolly.primereact.captchaMod.Captcha, Unit, CaptchaProps] = {
    val __obj = js.Dynamic.literal()
  
      if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    onExpire.foreach(p => __obj.updateDynamic("onExpire")(p.toJsFn))
    if (onResponse != null) __obj.updateDynamic("onResponse")(js.Any.fromFunction1((t0: /* response */ js.Any) => onResponse(t0).runNow()))
    if (siteKey != null) __obj.updateDynamic("siteKey")(siteKey.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.captchaCaptchaMod.CaptchaProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.captchaMod.Captcha](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.captchaCaptchaMod.CaptchaProps])(children: _*)
  }
  @JSImport("primereact/captcha", "Captcha")
  @js.native
  object componentImport extends js.Object
  
}

