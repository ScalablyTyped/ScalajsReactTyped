package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.materialUi.MaterialUI.Switches.RadioButtonGroupProps
import typingsJapgolly.materialUi.materialUiStrings.left
import typingsJapgolly.materialUi.materialUiStrings.right
import typingsJapgolly.materialUi.radioButtonGroupMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RadioButtonGroup {
  def apply(
    name: String,
    className: String = null,
    defaultSelected: js.Any = null,
    labelPosition: left | right = null,
    onChange: (/* e */ ReactEventFrom[js.Object with Element], /* selected */ String) => Callback = null,
    style: CSSProperties = null,
    valueSelected: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[RadioButtonGroupProps, default, Unit, RadioButtonGroupProps] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultSelected != null) __obj.updateDynamic("defaultSelected")(defaultSelected.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* e */ japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element], t1: /* selected */ java.lang.String) => onChange(t0, t1).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (valueSelected != null) __obj.updateDynamic("valueSelected")(valueSelected.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUi.MaterialUI.Switches.RadioButtonGroupProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUi.radioButtonGroupMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUi.MaterialUI.Switches.RadioButtonGroupProps])(children: _*)
  }
  @JSImport("material-ui/RadioButton/RadioButtonGroup", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

