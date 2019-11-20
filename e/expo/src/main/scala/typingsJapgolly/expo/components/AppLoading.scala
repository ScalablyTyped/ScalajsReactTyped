package typingsJapgolly.expo.components

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
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal()
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.expo.buildLaunchAppLoadingMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.expo.buildLaunchAppLoadingMod.default](js.constructorOf[typingsJapgolly.expo.buildLaunchAppLoadingMod.default])
    f(__obj.asInstanceOf[typingsJapgolly.expo.buildLaunchAppLoadingMod.Props])(children: _*)
  }
}

