package typingsJapgolly.primereact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.menuItemMod.MenuItem
import typingsJapgolly.primereact.panelMenuMod.PanelMenuProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PanelMenu {
  def apply(
    className: String = null,
    id: String = null,
    model: js.Array[MenuItem] = null,
    style: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    PanelMenuProps, 
    typingsJapgolly.primereact.primereactPanelmenuMod.PanelMenu, 
    Unit, 
    PanelMenuProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.panelMenuMod.PanelMenuProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.primereactPanelmenuMod.PanelMenu](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.panelMenuMod.PanelMenuProps])(children: _*)
  }
  @JSImport("primereact/panelmenu", "PanelMenu")
  @js.native
  object componentImport extends js.Object
  
}

