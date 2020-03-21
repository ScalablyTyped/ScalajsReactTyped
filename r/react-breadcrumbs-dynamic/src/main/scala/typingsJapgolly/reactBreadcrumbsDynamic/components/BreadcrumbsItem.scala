package typingsJapgolly.reactBreadcrumbsDynamic.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactBreadcrumbsDynamic.mod.BreadcrumbsItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BreadcrumbsItem {
  def apply(
    to: String,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    BreadcrumbsItemProps, 
    typingsJapgolly.reactBreadcrumbsDynamic.mod.BreadcrumbsItem, 
    Unit, 
    BreadcrumbsItemProps
  ] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBreadcrumbsDynamic.mod.BreadcrumbsItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBreadcrumbsDynamic.mod.BreadcrumbsItem](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBreadcrumbsDynamic.mod.BreadcrumbsItemProps])(children: _*)
  }
  @JSImport("react-breadcrumbs-dynamic", "BreadcrumbsItem")
  @js.native
  object componentImport extends js.Object
  
}

