package typingsJapgolly.reactNativeSvg.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeSvg.mod.Color
import typingsJapgolly.reactNativeSvg.mod.NumberProp
import typingsJapgolly.reactNativeSvg.mod.StopProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Stop {
  def apply(
    offset: NumberProp = null,
    stopColor: Color = null,
    stopOpacity: NumberProp = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[StopProps, typingsJapgolly.reactNativeSvg.mod.Stop, Unit, StopProps] = {
    val __obj = js.Dynamic.literal()
  
      if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (stopColor != null) __obj.updateDynamic("stopColor")(stopColor.asInstanceOf[js.Any])
    if (stopOpacity != null) __obj.updateDynamic("stopOpacity")(stopOpacity.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeSvg.mod.StopProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeSvg.mod.Stop](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeSvg.mod.StopProps])(children: _*)
  }
  @JSImport("react-native-svg", "Stop")
  @js.native
  object componentImport extends js.Object
  
}

