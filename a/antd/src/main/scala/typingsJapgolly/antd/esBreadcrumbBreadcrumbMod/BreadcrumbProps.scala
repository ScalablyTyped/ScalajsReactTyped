package typingsJapgolly.antd.esBreadcrumbBreadcrumbMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var itemRender: js.UndefOr[
    js.Function4[
      /* route */ Route, 
      /* params */ js.Any, 
      /* routes */ js.Array[Route], 
      /* paths */ js.Array[String], 
      Node
    ]
  ] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var routes: js.UndefOr[js.Array[Route]] = js.undefined
  var separator: js.UndefOr[Node] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object BreadcrumbProps {
  @scala.inline
  def apply(
    className: String = null,
    itemRender: (/* route */ Route, /* params */ js.Any, /* routes */ js.Array[Route], /* paths */ js.Array[String]) => CallbackTo[Node] = null,
    params: js.Any = null,
    prefixCls: String = null,
    routes: js.Array[Route] = null,
    separator: VdomNode = null,
    style: CSSProperties = null
  ): BreadcrumbProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (itemRender != null) __obj.updateDynamic("itemRender")(js.Any.fromFunction4((t0: /* route */ typingsJapgolly.antd.esBreadcrumbBreadcrumbMod.Route, t1: /* params */ js.Any, t2: /* routes */ js.Array[typingsJapgolly.antd.esBreadcrumbBreadcrumbMod.Route], t3: /* paths */ js.Array[java.lang.String]) => itemRender(t0, t1, t2, t3).runNow()))
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.rawNode.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbProps]
  }
}

