package typingsJapgolly.reactBreadcrumbsDynamic.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactBreadcrumbsDynamic.mod.BreadcrumbsProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BreadcrumbsProvider {
  def apply(
    shouldBreadcrumbsUpdate: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    BreadcrumbsProviderProps, 
    typingsJapgolly.reactBreadcrumbsDynamic.mod.BreadcrumbsProvider, 
    Unit, 
    BreadcrumbsProviderProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (shouldBreadcrumbsUpdate != null) __obj.updateDynamic("shouldBreadcrumbsUpdate")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => shouldBreadcrumbsUpdate(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBreadcrumbsDynamic.mod.BreadcrumbsProviderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBreadcrumbsDynamic.mod.BreadcrumbsProvider](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBreadcrumbsDynamic.mod.BreadcrumbsProviderProps])(children: _*)
  }
  @JSImport("react-breadcrumbs-dynamic", "BreadcrumbsProvider")
  @js.native
  object componentImport extends js.Object
  
}

