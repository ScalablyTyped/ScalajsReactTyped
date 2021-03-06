package typingsJapgolly.expo.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.expo.rootErrorBoundaryMod.Props
import typingsJapgolly.expo.rootErrorBoundaryMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RootErrorBoundary {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal()
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.expo.rootErrorBoundaryMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.expo.rootErrorBoundaryMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.expo.rootErrorBoundaryMod.Props])(children: _*)
  }
  @JSImport("expo/build/launch/RootErrorBoundary", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

