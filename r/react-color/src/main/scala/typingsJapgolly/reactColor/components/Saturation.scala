package typingsJapgolly.reactColor.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactColor.mod.Color
import typingsJapgolly.reactColor.mod.ColorResult
import typingsJapgolly.reactColor.mod.CustomPickerProps
import typingsJapgolly.reactColor.saturationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Saturation {
  def apply(
    onChange: /* color */ ColorResult => Callback,
    color: Color = null,
    pointer: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    CustomPickerProps[typingsJapgolly.reactColor.saturationMod.Saturation], 
    default, 
    Unit, 
    CustomPickerProps[typingsJapgolly.reactColor.saturationMod.Saturation]
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* color */ typingsJapgolly.reactColor.mod.ColorResult) => onChange(t0).runNow()))
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (pointer != null) __obj.updateDynamic("pointer")(pointer.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactColor.mod.CustomPickerProps[typingsJapgolly.reactColor.saturationMod.Saturation], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactColor.saturationMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactColor.mod.CustomPickerProps[typingsJapgolly.reactColor.saturationMod.Saturation]])(children: _*)
  }
  @JSImport("react-color/lib/components/common/Saturation", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

