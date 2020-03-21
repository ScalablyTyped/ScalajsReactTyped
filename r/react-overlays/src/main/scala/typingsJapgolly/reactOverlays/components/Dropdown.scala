package typingsJapgolly.reactOverlays.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactOverlays.dropdownMod.Directions
import typingsJapgolly.reactOverlays.dropdownMod.DropdownProps
import typingsJapgolly.reactOverlays.dropdownMod.DropdownRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Dropdown {
  def apply(
    alignEnd: js.UndefOr[Boolean] = js.undefined,
    drop: Directions = null,
    itemSelector: String = null,
    onToggle: (/* isOpen */ Boolean, /* event */ ReactEventFrom[Element]) => Callback = null,
    show: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: DropdownRenderProps => CallbackTo[japgolly.scalajs.react.raw.React.Element]
  ): UnmountedWithRoot[DropdownProps, typingsJapgolly.reactOverlays.mod.Dropdown, Unit, DropdownProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactOverlays.dropdownMod.DropdownRenderProps) => children(t0).runNow()))
    if (!js.isUndefined(alignEnd)) __obj.updateDynamic("alignEnd")(alignEnd.asInstanceOf[js.Any])
    if (drop != null) __obj.updateDynamic("drop")(drop.asInstanceOf[js.Any])
    if (itemSelector != null) __obj.updateDynamic("itemSelector")(itemSelector.asInstanceOf[js.Any])
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction2((t0: /* isOpen */ scala.Boolean, t1: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onToggle(t0, t1).runNow()))
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactOverlays.dropdownMod.DropdownProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactOverlays.mod.Dropdown](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactOverlays.dropdownMod.DropdownProps])
  }
  @JSImport("react-overlays", "Dropdown")
  @js.native
  object componentImport extends js.Object
  
}

