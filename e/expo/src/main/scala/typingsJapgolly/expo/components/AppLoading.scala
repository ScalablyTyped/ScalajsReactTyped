package typingsJapgolly.expo.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.expo.appLoadingMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AppLoading {
  def AnonAutoHideSplash(
    autoHideSplash: js.UndefOr[Boolean] = js.undefined,
    onError: /* error */ js.Error => Callback = null,
    onFinish: js.UndefOr[Callback] = js.undefined,
    startAsync: js.UndefOr[CallbackTo[js.Promise[Unit]]] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    typingsJapgolly.expo.AnonAutoHideSplash, 
    default, 
    Unit, 
    typingsJapgolly.expo.AnonAutoHideSplash
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(autoHideSplash)) __obj.updateDynamic("autoHideSplash")(autoHideSplash.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* error */ js.Error) => onError(t0).runNow()))
    onFinish.foreach(p => __obj.updateDynamic("onFinish")(p.toJsFn))
    startAsync.foreach(p => __obj.updateDynamic("startAsync")(p.toJsFn))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.expo.AnonAutoHideSplash, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.expo.appLoadingMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.expo.AnonAutoHideSplash])(children: _*)
  }
  def AnonOnError(
    onError: Null,
    onFinish: Null,
    startAsync: Null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[typingsJapgolly.expo.AnonOnError, default, Unit, typingsJapgolly.expo.AnonOnError] = {
    val __obj = js.Dynamic.literal(onError = onError.asInstanceOf[js.Any], onFinish = onFinish.asInstanceOf[js.Any], startAsync = startAsync.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.expo.AnonOnError, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.expo.appLoadingMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.expo.AnonOnError])(children: _*)
  }
  @JSImport("expo/build/launch/AppLoading", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

