package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.AnonValueBoolean
import typingsJapgolly.primereact.toggleButtonMod.ToggleButtonProps
import typingsJapgolly.primereact.tooltipOptionsMod.TooltipOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ToggleButton {
  def apply(
    ariaLabelledBy: String = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    id: String = null,
    offIcon: String = null,
    offLabel: String = null,
    onChange: /* e */ AnonValueBoolean => Callback = null,
    onIcon: String = null,
    onLabel: String = null,
    style: js.Object = null,
    tabIndex: Int | Double = null,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ToggleButtonProps, 
    typingsJapgolly.primereact.primereactTogglebuttonMod.ToggleButton, 
    Unit, 
    ToggleButtonProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (offIcon != null) __obj.updateDynamic("offIcon")(offIcon.asInstanceOf[js.Any])
    if (offLabel != null) __obj.updateDynamic("offLabel")(offLabel.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonValueBoolean) => onChange(t0).runNow()))
    if (onIcon != null) __obj.updateDynamic("onIcon")(onIcon.asInstanceOf[js.Any])
    if (onLabel != null) __obj.updateDynamic("onLabel")(onLabel.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.toggleButtonMod.ToggleButtonProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.primereactTogglebuttonMod.ToggleButton](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.toggleButtonMod.ToggleButtonProps])(children: _*)
  }
  @JSImport("primereact/togglebutton", "ToggleButton")
  @js.native
  object componentImport extends js.Object
  
}

