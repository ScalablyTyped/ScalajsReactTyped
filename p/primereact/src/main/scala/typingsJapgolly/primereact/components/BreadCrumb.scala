package typingsJapgolly.primereact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.breadcrumbBreadCrumbMod.BreadCrumbProps
import typingsJapgolly.primereact.menuItemMod.MenuItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BreadCrumb {
  def apply(
    className: String = null,
    home: js.Any = null,
    id: String = null,
    model: js.Array[MenuItem] = null,
    style: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    BreadCrumbProps, 
    typingsJapgolly.primereact.breadcrumbMod.BreadCrumb, 
    Unit, 
    BreadCrumbProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (home != null) __obj.updateDynamic("home")(home.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.breadcrumbBreadCrumbMod.BreadCrumbProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.breadcrumbMod.BreadCrumb](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.breadcrumbBreadCrumbMod.BreadCrumbProps])(children: _*)
  }
  @JSImport("primereact/breadcrumb", "BreadCrumb")
  @js.native
  object componentImport extends js.Object
  
}

