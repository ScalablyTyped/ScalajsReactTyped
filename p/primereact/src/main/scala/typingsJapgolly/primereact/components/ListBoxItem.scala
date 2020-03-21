package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.AnonOptionOriginalEvent
import typingsJapgolly.primereact.listBoxItemMod.ListBoxItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListBoxItem {
  def apply(
    onClick: /* e */ AnonOptionOriginalEvent => Callback = null,
    onTouchEnd: /* e */ AnonOptionOriginalEvent => Callback = null,
    option: js.Any = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    template: /* item */ js.Any => CallbackTo[js.UndefOr[Element]] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ListBoxItemProps, 
    typingsJapgolly.primereact.listBoxItemMod.ListBoxItem, 
    Unit, 
    ListBoxItemProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonOptionOriginalEvent) => onClick(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonOptionOriginalEvent) => onTouchEnd(t0).runNow()))
    if (option != null) __obj.updateDynamic("option")(option.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(js.Any.fromFunction1((t0: /* item */ js.Any) => template(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.listBoxItemMod.ListBoxItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.listBoxItemMod.ListBoxItem](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.listBoxItemMod.ListBoxItemProps])(children: _*)
  }
  @JSImport("primereact/components/listbox/ListBoxItem", "ListBoxItem")
  @js.native
  object componentImport extends js.Object
  
}

