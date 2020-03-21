package typingsJapgolly.reactOverlays.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactOverlays.dropdownToggleMod.DropdownToggleProps
import typingsJapgolly.reactOverlays.dropdownToggleMod.DropdownToggleRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DropdownToggle {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: DropdownToggleRenderProps => CallbackTo[Element]
  ): UnmountedWithRoot[
    DropdownToggleProps, 
    typingsJapgolly.reactOverlays.mod.DropdownToggle, 
    Unit, 
    DropdownToggleProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactOverlays.dropdownToggleMod.DropdownToggleRenderProps) => children(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactOverlays.dropdownToggleMod.DropdownToggleProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactOverlays.mod.DropdownToggle](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactOverlays.dropdownToggleMod.DropdownToggleProps])
  }
  @JSImport("react-overlays", "DropdownToggle")
  @js.native
  object componentImport extends js.Object
  
}

