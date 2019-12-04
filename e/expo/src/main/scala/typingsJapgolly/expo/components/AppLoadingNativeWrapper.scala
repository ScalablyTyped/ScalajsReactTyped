package typingsJapgolly.expo.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.expo.buildLaunchAppLoadingNativeWrapperMod.Props
import typingsJapgolly.expo.buildLaunchAppLoadingNativeWrapperMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AppLoadingNativeWrapper {
  def apply(
    autoHideSplash: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(autoHideSplash)) __obj.updateDynamic("autoHideSplash")(autoHideSplash.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.expo.buildLaunchAppLoadingNativeWrapperMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.expo.buildLaunchAppLoadingNativeWrapperMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.expo.buildLaunchAppLoadingNativeWrapperMod.Props])(children: _*)
  }
  @JSImport("expo/build/launch/AppLoadingNativeWrapper", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

