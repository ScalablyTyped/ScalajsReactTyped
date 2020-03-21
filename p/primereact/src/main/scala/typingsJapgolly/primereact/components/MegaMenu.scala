package typingsJapgolly.primereact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.megaMenuMod.MegaMenuProps
import typingsJapgolly.primereact.menuItemMod.MenuItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MegaMenu {
  def apply(
    className: String = null,
    id: String = null,
    model: js.Array[MenuItem] = null,
    orientation: String = null,
    style: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    MegaMenuProps, 
    typingsJapgolly.primereact.primereactMegamenuMod.MegaMenu, 
    Unit, 
    MegaMenuProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.megaMenuMod.MegaMenuProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.primereactMegamenuMod.MegaMenu](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.megaMenuMod.MegaMenuProps])(children: _*)
  }
  @JSImport("primereact/megamenu", "MegaMenu")
  @js.native
  object componentImport extends js.Object
  
}

