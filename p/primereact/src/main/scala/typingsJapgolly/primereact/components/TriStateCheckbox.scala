package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.AnonValueBoolean
import typingsJapgolly.primereact.tooltipOptionsMod.TooltipOptions
import typingsJapgolly.primereact.triStateCheckboxMod.TriStateCheckboxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TriStateCheckbox {
  def apply(
    ariaLabelledBy: String = null,
    className: String = null,
    id: String = null,
    inputId: String = null,
    name: String = null,
    onChange: /* e */ AnonValueBoolean => Callback = null,
    style: js.Object = null,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null,
    value: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    TriStateCheckboxProps, 
    typingsJapgolly.primereact.primereactTristatecheckboxMod.TriStateCheckbox, 
    Unit, 
    TriStateCheckboxProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputId != null) __obj.updateDynamic("inputId")(inputId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonValueBoolean) => onChange(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.triStateCheckboxMod.TriStateCheckboxProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.primereactTristatecheckboxMod.TriStateCheckbox](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.triStateCheckboxMod.TriStateCheckboxProps])(children: _*)
  }
  @JSImport("primereact/tristatecheckbox", "TriStateCheckbox")
  @js.native
  object componentImport extends js.Object
  
}

