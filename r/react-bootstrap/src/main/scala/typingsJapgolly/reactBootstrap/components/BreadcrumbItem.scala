package typingsJapgolly.reactBootstrap.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactBootstrap.breadcrumbItemMod.BreadcrumbItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BreadcrumbItem {
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    href: String = null,
    target: String = null,
    title: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    BreadcrumbItemProps, 
    typingsJapgolly.reactBootstrap.mod.BreadcrumbItem, 
    Unit, 
    BreadcrumbItemProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBootstrap.breadcrumbItemMod.BreadcrumbItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrap.mod.BreadcrumbItem](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrap.breadcrumbItemMod.BreadcrumbItemProps])(children: _*)
  }
  @JSImport("react-bootstrap", "BreadcrumbItem")
  @js.native
  object componentImport extends js.Object
  
}

