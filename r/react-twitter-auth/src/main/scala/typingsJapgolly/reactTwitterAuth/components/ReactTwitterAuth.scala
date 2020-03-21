package typingsJapgolly.reactTwitterAuth.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ReactType
import typingsJapgolly.reactTwitterAuth.mod.TwitterLoginProps
import typingsJapgolly.reactTwitterAuth.reactTwitterAuthStrings.`same-origin`
import typingsJapgolly.reactTwitterAuth.reactTwitterAuthStrings.include
import typingsJapgolly.reactTwitterAuth.reactTwitterAuthStrings.omit
import typingsJapgolly.std.HeadersInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactTwitterAuth {
  def apply(
    loginUrl: String,
    requestTokenUrl: String,
    onFailure: String => Callback,
    onSuccess: String => Callback,
    credentials: omit | `same-origin` | include = null,
    customHeaders: HeadersInit = null,
    dialogHeight: Int | Double = null,
    dialogWidth: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    forceLogin: js.UndefOr[Boolean] = js.undefined,
    showIcon: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    tag: ReactType[_] = null,
    text: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    TwitterLoginProps, 
    MountedWithRawType[TwitterLoginProps, js.Object, RawMounted[TwitterLoginProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(loginUrl = loginUrl.asInstanceOf[js.Any], requestTokenUrl = requestTokenUrl.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onFailure")(js.Any.fromFunction1((t0: java.lang.String) => onFailure(t0).runNow()))
    __obj.updateDynamic("onSuccess")(js.Any.fromFunction1((t0: java.lang.String) => onSuccess(t0).runNow()))
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    if (dialogHeight != null) __obj.updateDynamic("dialogHeight")(dialogHeight.asInstanceOf[js.Any])
    if (dialogWidth != null) __obj.updateDynamic("dialogWidth")(dialogWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(forceLogin)) __obj.updateDynamic("forceLogin")(forceLogin.asInstanceOf[js.Any])
    if (!js.isUndefined(showIcon)) __obj.updateDynamic("showIcon")(showIcon.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactTwitterAuth.mod.TwitterLoginProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactTwitterAuth.mod.TwitterLoginProps])(children: _*)
  }
  @JSImport("react-twitter-auth", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

