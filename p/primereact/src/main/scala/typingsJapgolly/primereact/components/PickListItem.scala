package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.AnonValue
import typingsJapgolly.primereact.pickListItemMod.PickListItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PickListItem {
  def apply(
    className: String = null,
    onClick: /* e */ AnonValue => Callback = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    template: /* item */ js.Any => CallbackTo[js.UndefOr[Element]] = null,
    value: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    PickListItemProps, 
    typingsJapgolly.primereact.pickListItemMod.PickListItem, 
    Unit, 
    PickListItemProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonValue) => onClick(t0).runNow()))
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(js.Any.fromFunction1((t0: /* item */ js.Any) => template(t0).runNow()))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.pickListItemMod.PickListItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.pickListItemMod.PickListItem](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.pickListItemMod.PickListItemProps])(children: _*)
  }
  @JSImport("primereact/components/picklist/PickListItem", "PickListItem")
  @js.native
  object componentImport extends js.Object
  
}

