package typingsJapgolly.rcPagination.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<rc-pagination.rc-pagination.PaginationData> */
trait PaginationProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var current: js.UndefOr[Double] = js.undefined
  var defaultCurrent: js.UndefOr[Double] = js.undefined
  var defaultPageSize: js.UndefOr[Double] = js.undefined
  var hideOnSinglePage: js.UndefOr[Boolean] = js.undefined
  var itemRender: js.UndefOr[js.Function3[/* page */ Double, /* type */ String, /* element */ Node, Node]] = js.undefined
  var jumpNextIcon: js.UndefOr[ComponentType[js.Object] | Node] = js.undefined
  var jumpPrevIcon: js.UndefOr[ComponentType[js.Object] | Node] = js.undefined
  var locale: js.UndefOr[js.Object] = js.undefined
  var nextIcon: js.UndefOr[ComponentType[js.Object] | Node] = js.undefined
  var onChange: js.UndefOr[js.Function2[/* page */ Double, /* pageSize */ Double, Unit]] = js.undefined
  var onShowSizeChange: js.UndefOr[js.Function2[/* current */ Double, /* size */ Double, Unit]] = js.undefined
  var pageSize: js.UndefOr[Double] = js.undefined
  var pageSizeOptions: js.UndefOr[js.Array[String]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var prevIcon: js.UndefOr[ComponentType[js.Object] | Node] = js.undefined
  var selectComponentClass: js.UndefOr[ComponentType[js.Object]] = js.undefined
  var selectPrefixCls: js.UndefOr[String] = js.undefined
  var showLessItems: js.UndefOr[Boolean] = js.undefined
  var showPrevNextJumpers: js.UndefOr[Boolean] = js.undefined
  var showQuickJumper: js.UndefOr[Boolean | js.Object] = js.undefined
  var showSizeChanger: js.UndefOr[Boolean] = js.undefined
  var showTitle: js.UndefOr[Boolean] = js.undefined
  var showTotal: js.UndefOr[js.Function2[/* total */ Double, /* range */ js.Tuple2[Double, Double], Node]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var total: js.UndefOr[Double] = js.undefined
}

object PaginationProps {
  @scala.inline
  def apply(
    className: String = null,
    current: Int | Double = null,
    defaultCurrent: Int | Double = null,
    defaultPageSize: Int | Double = null,
    hideOnSinglePage: js.UndefOr[Boolean] = js.undefined,
    itemRender: (/* page */ Double, /* type */ String, /* element */ Node) => CallbackTo[Node] = null,
    jumpNextIcon: ComponentType[js.Object] | Node = null,
    jumpPrevIcon: ComponentType[js.Object] | Node = null,
    locale: js.Object = null,
    nextIcon: ComponentType[js.Object] | Node = null,
    onChange: (/* page */ Double, /* pageSize */ Double) => Callback = null,
    onShowSizeChange: (/* current */ Double, /* size */ Double) => Callback = null,
    pageSize: Int | Double = null,
    pageSizeOptions: js.Array[String] = null,
    prefixCls: String = null,
    prevIcon: ComponentType[js.Object] | Node = null,
    selectComponentClass: ComponentType[js.Object] = null,
    selectPrefixCls: String = null,
    showLessItems: js.UndefOr[Boolean] = js.undefined,
    showPrevNextJumpers: js.UndefOr[Boolean] = js.undefined,
    showQuickJumper: Boolean | js.Object = null,
    showSizeChanger: js.UndefOr[Boolean] = js.undefined,
    showTitle: js.UndefOr[Boolean] = js.undefined,
    showTotal: (/* total */ Double, /* range */ js.Tuple2[Double, Double]) => CallbackTo[Node] = null,
    style: CSSProperties = null,
    total: Int | Double = null
  ): PaginationProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (defaultCurrent != null) __obj.updateDynamic("defaultCurrent")(defaultCurrent.asInstanceOf[js.Any])
    if (defaultPageSize != null) __obj.updateDynamic("defaultPageSize")(defaultPageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOnSinglePage)) __obj.updateDynamic("hideOnSinglePage")(hideOnSinglePage.asInstanceOf[js.Any])
    if (itemRender != null) __obj.updateDynamic("itemRender")(js.Any.fromFunction3((t0: /* page */ scala.Double, t1: /* type */ java.lang.String, t2: /* element */ japgolly.scalajs.react.raw.React.Node) => itemRender(t0, t1, t2).runNow()))
    if (jumpNextIcon != null) __obj.updateDynamic("jumpNextIcon")(jumpNextIcon.asInstanceOf[js.Any])
    if (jumpPrevIcon != null) __obj.updateDynamic("jumpPrevIcon")(jumpPrevIcon.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (nextIcon != null) __obj.updateDynamic("nextIcon")(nextIcon.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* page */ scala.Double, t1: /* pageSize */ scala.Double) => onChange(t0, t1).runNow()))
    if (onShowSizeChange != null) __obj.updateDynamic("onShowSizeChange")(js.Any.fromFunction2((t0: /* current */ scala.Double, t1: /* size */ scala.Double) => onShowSizeChange(t0, t1).runNow()))
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageSizeOptions != null) __obj.updateDynamic("pageSizeOptions")(pageSizeOptions.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (prevIcon != null) __obj.updateDynamic("prevIcon")(prevIcon.asInstanceOf[js.Any])
    if (selectComponentClass != null) __obj.updateDynamic("selectComponentClass")(selectComponentClass.asInstanceOf[js.Any])
    if (selectPrefixCls != null) __obj.updateDynamic("selectPrefixCls")(selectPrefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(showLessItems)) __obj.updateDynamic("showLessItems")(showLessItems.asInstanceOf[js.Any])
    if (!js.isUndefined(showPrevNextJumpers)) __obj.updateDynamic("showPrevNextJumpers")(showPrevNextJumpers.asInstanceOf[js.Any])
    if (showQuickJumper != null) __obj.updateDynamic("showQuickJumper")(showQuickJumper.asInstanceOf[js.Any])
    if (!js.isUndefined(showSizeChanger)) __obj.updateDynamic("showSizeChanger")(showSizeChanger.asInstanceOf[js.Any])
    if (!js.isUndefined(showTitle)) __obj.updateDynamic("showTitle")(showTitle.asInstanceOf[js.Any])
    if (showTotal != null) __obj.updateDynamic("showTotal")(js.Any.fromFunction2((t0: /* total */ scala.Double, t1: /* range */ js.Tuple2[scala.Double, scala.Double]) => showTotal(t0, t1).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationProps]
  }
}

