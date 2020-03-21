package typingsJapgolly.reactMessengerCheckbox.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactMessengerCheckbox.mod.ReactMessengerProps
import typingsJapgolly.reactMessengerCheckbox.mod.^
import typingsJapgolly.reactMessengerCheckbox.reactMessengerCheckboxStrings.dark
import typingsJapgolly.reactMessengerCheckbox.reactMessengerCheckboxStrings.large
import typingsJapgolly.reactMessengerCheckbox.reactMessengerCheckboxStrings.light
import typingsJapgolly.reactMessengerCheckbox.reactMessengerCheckboxStrings.medium
import typingsJapgolly.reactMessengerCheckbox.reactMessengerCheckboxStrings.small
import typingsJapgolly.reactMessengerCheckbox.reactMessengerCheckboxStrings.standard
import typingsJapgolly.reactMessengerCheckbox.reactMessengerCheckboxStrings.xlarge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactMessengerCheckbox {
  def apply(
    appId: String,
    origin: String,
    pageId: String,
    userRef: String,
    allowLogin: js.UndefOr[Boolean] = js.undefined,
    autoLogAppEvents: js.UndefOr[Boolean] = js.undefined,
    centerAlign: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    onEvent: /* event */ js.Any => Callback = null,
    prechecked: js.UndefOr[Boolean] = js.undefined,
    size: small | medium | large | standard | xlarge = null,
    skin: light | dark = null,
    version: String = null,
    xfbml: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ReactMessengerProps, ^, Unit, ReactMessengerProps] = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], pageId = pageId.asInstanceOf[js.Any], userRef = userRef.asInstanceOf[js.Any])
  
      if (!js.isUndefined(allowLogin)) __obj.updateDynamic("allowLogin")(allowLogin.asInstanceOf[js.Any])
    if (!js.isUndefined(autoLogAppEvents)) __obj.updateDynamic("autoLogAppEvents")(autoLogAppEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(centerAlign)) __obj.updateDynamic("centerAlign")(centerAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (onEvent != null) __obj.updateDynamic("onEvent")(js.Any.fromFunction1((t0: /* event */ js.Any) => onEvent(t0).runNow()))
    if (!js.isUndefined(prechecked)) __obj.updateDynamic("prechecked")(prechecked.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(xfbml)) __obj.updateDynamic("xfbml")(xfbml.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactMessengerCheckbox.mod.ReactMessengerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactMessengerCheckbox.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactMessengerCheckbox.mod.ReactMessengerProps])(children: _*)
  }
  @JSImport("react-messenger-checkbox", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

