package typingsJapgolly.reactBreadcrumbs.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.reactBreadcrumbs.mod.BreadcrumbsProps
import typingsJapgolly.reactBreadcrumbs.mod.Crumbs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Breadcrumbs {
  def apply(
    className: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    separator: VdomNode = null,
    setCrumbs: /* crumbs */ Crumbs => CallbackTo[Node] = null,
    wrapper: StatelessComponent[js.Object] | ComponentClassP[js.Object] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    BreadcrumbsProps, 
    typingsJapgolly.reactBreadcrumbs.mod.Breadcrumbs, 
    Unit, 
    BreadcrumbsProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.rawNode.asInstanceOf[js.Any])
    if (setCrumbs != null) __obj.updateDynamic("setCrumbs")(js.Any.fromFunction1((t0: /* crumbs */ typingsJapgolly.reactBreadcrumbs.mod.Crumbs) => setCrumbs(t0).runNow()))
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBreadcrumbs.mod.BreadcrumbsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBreadcrumbs.mod.Breadcrumbs](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBreadcrumbs.mod.BreadcrumbsProps])(children: _*)
  }
  @JSImport("react-breadcrumbs", "Breadcrumbs")
  @js.native
  object componentImport extends js.Object
  
}

