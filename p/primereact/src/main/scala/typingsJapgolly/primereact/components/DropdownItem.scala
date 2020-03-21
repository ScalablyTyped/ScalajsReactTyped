package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.AnonOption
import typingsJapgolly.primereact.dropdownItemMod.DropdownItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DropdownItem {
  def apply(
    onClick: /* e */ AnonOption => Callback = null,
    option: js.Object = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    template: /* option */ js.Any => CallbackTo[js.UndefOr[Element]] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    DropdownItemProps, 
    typingsJapgolly.primereact.dropdownItemMod.DropdownItem, 
    Unit, 
    DropdownItemProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonOption) => onClick(t0).runNow()))
    if (option != null) __obj.updateDynamic("option")(option.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(js.Any.fromFunction1((t0: /* option */ js.Any) => template(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.dropdownItemMod.DropdownItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.dropdownItemMod.DropdownItem](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.dropdownItemMod.DropdownItemProps])(children: _*)
  }
  @JSImport("primereact/components/dropdown/DropdownItem", "DropdownItem")
  @js.native
  object componentImport extends js.Object
  
}

