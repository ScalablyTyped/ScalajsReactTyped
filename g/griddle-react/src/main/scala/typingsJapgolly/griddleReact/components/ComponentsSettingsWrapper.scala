package typingsJapgolly.griddleReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.griddleReact.mod.GriddleComponent
import typingsJapgolly.griddleReact.mod.components.SettingsProps
import typingsJapgolly.griddleReact.mod.components.SettingsToggleProps
import typingsJapgolly.griddleReact.mod.components.SettingsWrapper
import typingsJapgolly.griddleReact.mod.components.SettingsWrapperProps
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ComponentsSettingsWrapper {
  def apply(
    Settings: GriddleComponent[SettingsProps] = null,
    SettingsToggle: GriddleComponent[SettingsToggleProps] = null,
    className: String = null,
    isEnabled: js.UndefOr[Boolean] = js.undefined,
    isVisible: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SettingsWrapperProps, SettingsWrapper, Unit, SettingsWrapperProps] = {
    val __obj = js.Dynamic.literal()
  
      if (Settings != null) __obj.updateDynamic("Settings")(Settings.asInstanceOf[js.Any])
    if (SettingsToggle != null) __obj.updateDynamic("SettingsToggle")(SettingsToggle.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(isEnabled)) __obj.updateDynamic("isEnabled")(isEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isVisible)) __obj.updateDynamic("isVisible")(isVisible.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.griddleReact.mod.components.SettingsWrapperProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.griddleReact.mod.components.SettingsWrapper](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.griddleReact.mod.components.SettingsWrapperProps])(children: _*)
  }
  @JSImport("griddle-react", "components.SettingsWrapper")
  @js.native
  object componentImport extends js.Object
  
}

