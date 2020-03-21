package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.menuItemMod.MenuItem
import typingsJapgolly.primereact.menuMod.MenuProps
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Menu {
  def apply(
    appendTo: js.Any = null,
    autoZIndex: js.UndefOr[Boolean] = js.undefined,
    bazeZIndex: Int | Double = null,
    className: String = null,
    id: String = null,
    model: js.Array[MenuItem] = null,
    onHide: /* e */ Event_ => Callback = null,
    onShow: /* e */ Event_ => Callback = null,
    popup: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[MenuProps, typingsJapgolly.primereact.primereactMenuMod.Menu, Unit, MenuProps] = {
    val __obj = js.Dynamic.literal()
  
      if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (!js.isUndefined(autoZIndex)) __obj.updateDynamic("autoZIndex")(autoZIndex.asInstanceOf[js.Any])
    if (bazeZIndex != null) __obj.updateDynamic("bazeZIndex")(bazeZIndex.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.std.Event_) => onHide(t0).runNow()))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.std.Event_) => onShow(t0).runNow()))
    if (!js.isUndefined(popup)) __obj.updateDynamic("popup")(popup.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.menuMod.MenuProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.primereactMenuMod.Menu](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.menuMod.MenuProps])(children: _*)
  }
  @JSImport("primereact/menu", "Menu")
  @js.native
  object componentImport extends js.Object
  
}

