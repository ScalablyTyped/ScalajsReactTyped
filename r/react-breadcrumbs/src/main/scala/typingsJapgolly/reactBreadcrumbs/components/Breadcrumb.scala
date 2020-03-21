package typingsJapgolly.reactBreadcrumbs.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.history.mod.LocationDescriptor
import typingsJapgolly.history.mod.LocationState
import typingsJapgolly.reactBreadcrumbs.AnonTitle
import typingsJapgolly.reactBreadcrumbs.mod.BreadcrumbProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Breadcrumb {
  def apply(
    data: LocationDescriptor[LocationState] with AnonTitle,
    hidden: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    BreadcrumbProps, 
    typingsJapgolly.reactBreadcrumbs.mod.Breadcrumb, 
    Unit, 
    BreadcrumbProps
  ] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
      if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBreadcrumbs.mod.BreadcrumbProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBreadcrumbs.mod.Breadcrumb](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBreadcrumbs.mod.BreadcrumbProps])(children: _*)
  }
  @JSImport("react-breadcrumbs", "Breadcrumb")
  @js.native
  object componentImport extends js.Object
  
}

