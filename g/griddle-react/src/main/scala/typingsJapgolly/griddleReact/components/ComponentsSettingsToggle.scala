package typingsJapgolly.griddleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.griddleReact.mod.components.SettingsToggle
import typingsJapgolly.griddleReact.mod.components.SettingsToggleProps
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ComponentsSettingsToggle {
  def apply(
    className: String = null,
    onClick: ReactMouseEventFrom[Element] => Callback = null,
    style: CSSProperties = null,
    text: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SettingsToggleProps, SettingsToggle, Unit, SettingsToggleProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onClick(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.griddleReact.mod.components.SettingsToggleProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.griddleReact.mod.components.SettingsToggle](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.griddleReact.mod.components.SettingsToggleProps])(children: _*)
  }
  @JSImport("griddle-react", "components.SettingsToggle")
  @js.native
  object componentImport extends js.Object
  
}

