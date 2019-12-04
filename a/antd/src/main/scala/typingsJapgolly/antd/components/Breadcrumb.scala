package typingsJapgolly.antd.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.libBreadcrumbBreadcrumbMod.BreadcrumbProps
import typingsJapgolly.antd.libBreadcrumbBreadcrumbMod.Route
import typingsJapgolly.antd.libBreadcrumbMod.default
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Breadcrumb {
  def apply(
    className: String = null,
    itemRender: (/* route */ Route, /* params */ js.Any, /* routes */ js.Array[Route], /* paths */ js.Array[String]) => CallbackTo[Node] = null,
    params: js.Any = null,
    prefixCls: String = null,
    routes: js.Array[Route] = null,
    separator: VdomNode = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[BreadcrumbProps, default, Unit, BreadcrumbProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (itemRender != null) __obj.updateDynamic("itemRender")(js.Any.fromFunction4((t0: /* route */ typingsJapgolly.antd.libBreadcrumbBreadcrumbMod.Route, t1: /* params */ js.Any, t2: /* routes */ js.Array[typingsJapgolly.antd.libBreadcrumbBreadcrumbMod.Route], t3: /* paths */ js.Array[java.lang.String]) => itemRender(t0, t1, t2, t3).runNow()))
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.rawNode.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.libBreadcrumbBreadcrumbMod.BreadcrumbProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.libBreadcrumbMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.libBreadcrumbBreadcrumbMod.BreadcrumbProps])(children: _*)
  }
  @JSImport("antd/lib/breadcrumb", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

