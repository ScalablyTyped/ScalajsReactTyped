package typingsJapgolly.reactRecaptchaV3.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactRecaptchaV3.mod.ReCaptcha.ReCaptchaProps
import typingsJapgolly.reactRecaptchaV3.mod.ReCaptcha_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReCaptcha {
  def apply(
    action: String,
    sitekey: String,
    elementID: String = null,
    verifyCallback: /* response */ String => Callback = null,
    verifyCallbackName: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ReCaptchaProps, ReCaptcha_, Unit, ReCaptchaProps] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], sitekey = sitekey.asInstanceOf[js.Any])
  
      if (elementID != null) __obj.updateDynamic("elementID")(elementID.asInstanceOf[js.Any])
    if (verifyCallback != null) __obj.updateDynamic("verifyCallback")(js.Any.fromFunction1((t0: /* response */ java.lang.String) => verifyCallback(t0).runNow()))
    if (verifyCallbackName != null) __obj.updateDynamic("verifyCallbackName")(verifyCallbackName.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactRecaptchaV3.mod.ReCaptcha.ReCaptchaProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactRecaptchaV3.mod.ReCaptcha_](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactRecaptchaV3.mod.ReCaptcha.ReCaptchaProps])(children: _*)
  }
  @JSImport("react-recaptcha-v3", "ReCaptcha")
  @js.native
  object componentImport extends js.Object
  
}

