package typingsJapgolly.reactNativeFbsdk.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeFbsdk.mod.DefaultAudience
import typingsJapgolly.reactNativeFbsdk.mod.LoginBehaviorAndroid
import typingsJapgolly.reactNativeFbsdk.mod.LoginBehaviorIOS
import typingsJapgolly.reactNativeFbsdk.mod.LoginButtonProps
import typingsJapgolly.reactNativeFbsdk.mod.LoginResult
import typingsJapgolly.reactNativeFbsdk.mod.Permissions
import typingsJapgolly.reactNativeFbsdk.mod.TooltipBehaviorIOS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LoginButton {
  def apply(
    defaultAudience: DefaultAudience = null,
    loginBehaviorAndroid: LoginBehaviorAndroid = null,
    loginBehaviorIOS: LoginBehaviorIOS = null,
    onLoginFinished: (/* error */ js.Object, /* result */ LoginResult) => Callback = null,
    onLogoutFinished: js.UndefOr[Callback] = js.undefined,
    permissions: js.Array[Permissions] = null,
    style: ViewStyle = null,
    tooltipBehaviorIOS: TooltipBehaviorIOS = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    LoginButtonProps, 
    typingsJapgolly.reactNativeFbsdk.mod.LoginButton, 
    Unit, 
    LoginButtonProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (defaultAudience != null) __obj.updateDynamic("defaultAudience")(defaultAudience.asInstanceOf[js.Any])
    if (loginBehaviorAndroid != null) __obj.updateDynamic("loginBehaviorAndroid")(loginBehaviorAndroid.asInstanceOf[js.Any])
    if (loginBehaviorIOS != null) __obj.updateDynamic("loginBehaviorIOS")(loginBehaviorIOS.asInstanceOf[js.Any])
    if (onLoginFinished != null) __obj.updateDynamic("onLoginFinished")(js.Any.fromFunction2((t0: /* error */ js.Object, t1: /* result */ typingsJapgolly.reactNativeFbsdk.mod.LoginResult) => onLoginFinished(t0, t1).runNow()))
    onLogoutFinished.foreach(p => __obj.updateDynamic("onLogoutFinished")(p.toJsFn))
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tooltipBehaviorIOS != null) __obj.updateDynamic("tooltipBehaviorIOS")(tooltipBehaviorIOS.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeFbsdk.mod.LoginButtonProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeFbsdk.mod.LoginButton](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeFbsdk.mod.LoginButtonProps])(children: _*)
  }
  @JSImport("react-native-fbsdk", "LoginButton")
  @js.native
  object componentImport extends js.Object
  
}

