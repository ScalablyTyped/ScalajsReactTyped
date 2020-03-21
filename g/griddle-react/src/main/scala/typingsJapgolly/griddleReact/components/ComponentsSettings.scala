package typingsJapgolly.griddleReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.griddleReact.mod.GriddleComponent
import typingsJapgolly.griddleReact.mod.components.Settings
import typingsJapgolly.griddleReact.mod.components.SettingsProps
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ComponentsSettings {
  def apply(
    className: String = null,
    settingsComponents: js.Array[GriddleComponent[_]] = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SettingsProps, Settings, Unit, SettingsProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (settingsComponents != null) __obj.updateDynamic("settingsComponents")(settingsComponents.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.griddleReact.mod.components.SettingsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.griddleReact.mod.components.Settings](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.griddleReact.mod.components.SettingsProps])(children: _*)
  }
  @JSImport("griddle-react", "components.Settings")
  @js.native
  object componentImport extends js.Object
  
}

