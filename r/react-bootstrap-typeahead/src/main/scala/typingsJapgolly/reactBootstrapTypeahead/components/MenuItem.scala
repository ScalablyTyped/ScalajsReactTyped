package typingsJapgolly.reactBootstrapTypeahead.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactBootstrapTypeahead.mod.BaseMenuItemProps
import typingsJapgolly.reactBootstrapTypeahead.mod.MenuItemProps
import typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MenuItem {
  def apply[T /* <: TypeaheadModel */](
    option: T,
    position: Double,
    BaseMenuItemProps: BaseMenuItemProps = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    MenuItemProps[T], 
    typingsJapgolly.reactBootstrapTypeahead.mod.MenuItem[T], 
    Unit, 
    MenuItemProps[T]
  ] = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
  
      if (BaseMenuItemProps != null) js.Dynamic.global.Object.assign(__obj, BaseMenuItemProps)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBootstrapTypeahead.mod.MenuItemProps[T], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrapTypeahead.mod.MenuItem[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrapTypeahead.mod.MenuItemProps[T]])(children: _*)
  }
  @JSImport("react-bootstrap-typeahead", "MenuItem")
  @js.native
  object componentImport extends js.Object
  
}

