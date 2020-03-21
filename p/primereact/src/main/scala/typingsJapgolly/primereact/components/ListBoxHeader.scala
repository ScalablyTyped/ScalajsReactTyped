package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.AnonValue
import typingsJapgolly.primereact.listBoxHeaderMod.ListBoxHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListBoxHeader {
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    filter: String = null,
    onFilter: /* e */ AnonValue => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ListBoxHeaderProps, 
    typingsJapgolly.primereact.listBoxHeaderMod.ListBoxHeader, 
    Unit, 
    ListBoxHeaderProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (onFilter != null) __obj.updateDynamic("onFilter")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonValue) => onFilter(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.listBoxHeaderMod.ListBoxHeaderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.listBoxHeaderMod.ListBoxHeader](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.listBoxHeaderMod.ListBoxHeaderProps])(children: _*)
  }
  @JSImport("primereact/components/listbox/ListBoxHeader", "ListBoxHeader")
  @js.native
  object componentImport extends js.Object
  
}

