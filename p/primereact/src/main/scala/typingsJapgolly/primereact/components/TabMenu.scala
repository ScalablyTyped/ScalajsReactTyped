package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.AnonValue
import typingsJapgolly.primereact.menuItemMod.MenuItem
import typingsJapgolly.primereact.tabMenuMod.TabMenuProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabMenu {
  def apply(
    activeItem: js.Any = null,
    className: String = null,
    id: String = null,
    model: js.Array[MenuItem] = null,
    onTabChange: /* e */ AnonValue => Callback = null,
    style: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    TabMenuProps, 
    typingsJapgolly.primereact.primereactTabmenuMod.TabMenu, 
    Unit, 
    TabMenuProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (activeItem != null) __obj.updateDynamic("activeItem")(activeItem.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (onTabChange != null) __obj.updateDynamic("onTabChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonValue) => onTabChange(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.tabMenuMod.TabMenuProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.primereactTabmenuMod.TabMenu](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.tabMenuMod.TabMenuProps])(children: _*)
  }
  @JSImport("primereact/tabmenu", "TabMenu")
  @js.native
  object componentImport extends js.Object
  
}

