package typingsJapgolly.antd.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.antdBooleans.`false`
import typingsJapgolly.antd.listMod.ListGridType
import typingsJapgolly.antd.listMod.ListItemLayout
import typingsJapgolly.antd.listMod.ListLocale
import typingsJapgolly.antd.listMod.ListProps
import typingsJapgolly.antd.listMod.ListSize
import typingsJapgolly.antd.listMod.default
import typingsJapgolly.antd.paginationPaginationMod.PaginationConfig
import typingsJapgolly.antd.spinMod.SpinProps
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object List {
  def apply[T](
    bordered: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    dataSource: js.Array[T] = null,
    extra: VdomNode = null,
    footer: VdomNode = null,
    grid: ListGridType = null,
    header: VdomNode = null,
    id: String = null,
    itemLayout: ListItemLayout = null,
    loadMore: VdomNode = null,
    loading: Boolean | SpinProps = null,
    locale: ListLocale = null,
    pagination: PaginationConfig | `false` = null,
    prefixCls: String = null,
    renderItem: (T, /* index */ Double) => CallbackTo[Node] = null,
    rowKey: (js.Function1[T, String]) | String = null,
    size: ListSize = null,
    split: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ListProps[T], default[T], Unit, ListProps[T]] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.rawNode.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.rawNode.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.rawNode.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (itemLayout != null) __obj.updateDynamic("itemLayout")(itemLayout.asInstanceOf[js.Any])
    if (loadMore != null) __obj.updateDynamic("loadMore")(loadMore.rawNode.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (pagination != null) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (renderItem != null) __obj.updateDynamic("renderItem")(js.Any.fromFunction2((t0: T, t1: /* index */ scala.Double) => renderItem(t0, t1).runNow()))
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(split)) __obj.updateDynamic("split")(split.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.listMod.ListProps[T], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.listMod.default[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.listMod.ListProps[T]])(children: _*)
  }
  @JSImport("antd/lib/list", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

