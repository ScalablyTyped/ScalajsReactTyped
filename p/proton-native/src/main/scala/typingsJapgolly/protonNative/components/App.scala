package typingsJapgolly.protonNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protonNative.mod.AppProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object App {
  def apply(
    onShouldQuit: js.UndefOr[Callback] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AppProps, typingsJapgolly.protonNative.mod.App, Unit, AppProps] = {
    val __obj = js.Dynamic.literal()
  
      onShouldQuit.foreach(p => __obj.updateDynamic("onShouldQuit")(p.toJsFn))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.protonNative.mod.AppProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.protonNative.mod.App](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.protonNative.mod.AppProps])(children: _*)
  }
  @JSImport("proton-native", "App")
  @js.native
  object componentImport extends js.Object
  
}

