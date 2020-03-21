package typingsJapgolly.reactNativeFbsdk.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginButtonProps extends js.Object {
  /**
    * The default audience to target when attempting a login.
    */
  var defaultAudience: js.UndefOr[DefaultAudience] = js.undefined
  /**
    * The behavior to use when attempting a login.
    * @platform android
    */
  var loginBehaviorAndroid: js.UndefOr[LoginBehaviorAndroid] = js.undefined
  /**
    * The behavior to use when attempting a login.
    * @platform ios
    */
  var loginBehaviorIOS: js.UndefOr[LoginBehaviorIOS] = js.undefined
  /**
    * The callback invoked upon error/completion of a login request.
    */
  var onLoginFinished: js.UndefOr[js.Function2[/* error */ js.Object, /* result */ LoginResult, Unit]] = js.undefined
  /**
    * The callback invoked upon completion of a logout request.
    */
  var onLogoutFinished: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Represents the permissions to request when the login button
    * is pressed.
    */
  var permissions: js.UndefOr[js.Array[Permissions]] = js.undefined
  /**
    * View style, if any.
    */
  var style: js.UndefOr[ViewStyle] = js.undefined
  /**
    * For iOS only, the desired tooltip behavior.
    * @platform ios
    */
  var tooltipBehaviorIOS: js.UndefOr[TooltipBehaviorIOS] = js.undefined
}

object LoginButtonProps {
  @scala.inline
  def apply(
    defaultAudience: DefaultAudience = null,
    loginBehaviorAndroid: LoginBehaviorAndroid = null,
    loginBehaviorIOS: LoginBehaviorIOS = null,
    onLoginFinished: (/* error */ js.Object, /* result */ LoginResult) => Callback = null,
    onLogoutFinished: js.UndefOr[Callback] = js.undefined,
    permissions: js.Array[Permissions] = null,
    style: ViewStyle = null,
    tooltipBehaviorIOS: TooltipBehaviorIOS = null
  ): LoginButtonProps = {
    val __obj = js.Dynamic.literal()
    if (defaultAudience != null) __obj.updateDynamic("defaultAudience")(defaultAudience.asInstanceOf[js.Any])
    if (loginBehaviorAndroid != null) __obj.updateDynamic("loginBehaviorAndroid")(loginBehaviorAndroid.asInstanceOf[js.Any])
    if (loginBehaviorIOS != null) __obj.updateDynamic("loginBehaviorIOS")(loginBehaviorIOS.asInstanceOf[js.Any])
    if (onLoginFinished != null) __obj.updateDynamic("onLoginFinished")(js.Any.fromFunction2((t0: /* error */ js.Object, t1: /* result */ typingsJapgolly.reactNativeFbsdk.mod.LoginResult) => onLoginFinished(t0, t1).runNow()))
    onLogoutFinished.foreach(p => __obj.updateDynamic("onLogoutFinished")(p.toJsFn))
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tooltipBehaviorIOS != null) __obj.updateDynamic("tooltipBehaviorIOS")(tooltipBehaviorIOS.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginButtonProps]
  }
}

