package typingsJapgolly.expo.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.expo.buildLaunchAppLoadingMod.Props
import typingsJapgolly.expo.buildLaunchAppLoadingMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AppLoading {
  def Anon_AutoHideSplash(
    autoHideSplash: js.UndefOr[Boolean] = js.undefined,
    onError: /* error */ js.Error => Callback = null,
    onFinish: js.UndefOr[Callback] = js.undefined,
    startAsync: js.UndefOr[CallbackTo[js.Promise[Unit]]] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(autoHideSplash)) __obj.updateDynamic("autoHideSplash")(autoHideSplash.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* error */ js.Error) => onError(t0).runNow()))
    onFinish.foreach(p => __obj.updateDynamic("onFinish")(p.toJsFn))
    startAsync.foreach(p => __obj.updateDynamic("startAsync")(p.toJsFn))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.expo.buildLaunchAppLoadingMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.expo.buildLaunchAppLoadingMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.expo.buildLaunchAppLoadingMod.Props])(children: _*)
  }
  def Anon_OnError(
    onError: Null,
    onFinish: Null,
    startAsync: Null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal(onError = onError.asInstanceOf[js.Any], onFinish = onFinish.asInstanceOf[js.Any], startAsync = startAsync.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.expo.buildLaunchAppLoadingMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.expo.buildLaunchAppLoadingMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.expo.buildLaunchAppLoadingMod.Props])(children: _*)
  }
  @JSImport("expo/build/launch/AppLoading", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

