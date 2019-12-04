package typingsJapgolly.expo.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.expo.buildLaunchRootErrorBoundaryDotWebMod.Props
import typingsJapgolly.expo.buildLaunchRootErrorBoundaryDotWebMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RootErrorBoundaryDotWeb {
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
  typingsJapgolly.expo.buildLaunchRootErrorBoundaryDotWebMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.expo.buildLaunchRootErrorBoundaryDotWebMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.expo.buildLaunchRootErrorBoundaryDotWebMod.Props])(children: _*)
  }
  @JSImport("expo/build/launch/RootErrorBoundary.web", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

