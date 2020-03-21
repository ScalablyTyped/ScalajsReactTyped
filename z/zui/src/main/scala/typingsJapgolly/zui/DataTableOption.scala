package typingsJapgolly.zui

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTableOption extends js.Object {
  var afterLoad: js.UndefOr[js.Function1[/* event */ AfterLoadEvent, Unit]] = js.undefined
  var checkByClickRow: js.UndefOr[Boolean] = js.undefined
  var checkable: js.UndefOr[Boolean] = js.undefined
  var checkedClass: js.UndefOr[String] = js.undefined
  var checksChanged: js.UndefOr[js.Function1[/* event */ ChecksChangeEvent, Unit]] = js.undefined
  var colHover: js.UndefOr[Boolean] = js.undefined
  var fixCellHeight: js.UndefOr[Boolean] = js.undefined
  var fixedHeader: js.UndefOr[Boolean] = js.undefined
  var fixedHeaderOffset: js.UndefOr[Double] = js.undefined
  var fixedLeftWidth: js.UndefOr[String] = js.undefined
  var fixedRightWidth: js.UndefOr[String] = js.undefined
  var flexHeadDrag: js.UndefOr[Boolean] = js.undefined
  var minColWidth: js.UndefOr[Double] = js.undefined
  var minFixedLeftWidth: js.UndefOr[Double] = js.undefined
  var minFixedRightWidth: js.UndefOr[Double] = js.undefined
  var minFlexAreaWidth: js.UndefOr[Double] = js.undefined
  var ready: js.UndefOr[js.Function0[Unit]] = js.undefined
  var rowHover: js.UndefOr[Boolean] = js.undefined
  var scrollPos: js.UndefOr[String] = js.undefined
  var selectable: js.UndefOr[Boolean | js.Object] = js.undefined
  var sizeChanged: js.UndefOr[js.Function1[/* event */ SizeChangeEvent, Unit]] = js.undefined
  var sort: js.UndefOr[js.Function1[/* event */ SortEvent, Unit]] = js.undefined
  var sortable: js.UndefOr[Boolean] = js.undefined
  var storage: js.UndefOr[Boolean] = js.undefined
}

object DataTableOption {
  @scala.inline
  def apply(
    afterLoad: /* event */ AfterLoadEvent => Callback = null,
    checkByClickRow: js.UndefOr[Boolean] = js.undefined,
    checkable: js.UndefOr[Boolean] = js.undefined,
    checkedClass: String = null,
    checksChanged: /* event */ ChecksChangeEvent => Callback = null,
    colHover: js.UndefOr[Boolean] = js.undefined,
    fixCellHeight: js.UndefOr[Boolean] = js.undefined,
    fixedHeader: js.UndefOr[Boolean] = js.undefined,
    fixedHeaderOffset: Int | Double = null,
    fixedLeftWidth: String = null,
    fixedRightWidth: String = null,
    flexHeadDrag: js.UndefOr[Boolean] = js.undefined,
    minColWidth: Int | Double = null,
    minFixedLeftWidth: Int | Double = null,
    minFixedRightWidth: Int | Double = null,
    minFlexAreaWidth: Int | Double = null,
    ready: js.UndefOr[Callback] = js.undefined,
    rowHover: js.UndefOr[Boolean] = js.undefined,
    scrollPos: String = null,
    selectable: Boolean | js.Object = null,
    sizeChanged: /* event */ SizeChangeEvent => Callback = null,
    sort: /* event */ SortEvent => Callback = null,
    sortable: js.UndefOr[Boolean] = js.undefined,
    storage: js.UndefOr[Boolean] = js.undefined
  ): DataTableOption = {
    val __obj = js.Dynamic.literal()
    if (afterLoad != null) __obj.updateDynamic("afterLoad")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.zui.AfterLoadEvent) => afterLoad(t0).runNow()))
    if (!js.isUndefined(checkByClickRow)) __obj.updateDynamic("checkByClickRow")(checkByClickRow.asInstanceOf[js.Any])
    if (!js.isUndefined(checkable)) __obj.updateDynamic("checkable")(checkable.asInstanceOf[js.Any])
    if (checkedClass != null) __obj.updateDynamic("checkedClass")(checkedClass.asInstanceOf[js.Any])
    if (checksChanged != null) __obj.updateDynamic("checksChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.zui.ChecksChangeEvent) => checksChanged(t0).runNow()))
    if (!js.isUndefined(colHover)) __obj.updateDynamic("colHover")(colHover.asInstanceOf[js.Any])
    if (!js.isUndefined(fixCellHeight)) __obj.updateDynamic("fixCellHeight")(fixCellHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedHeader)) __obj.updateDynamic("fixedHeader")(fixedHeader.asInstanceOf[js.Any])
    if (fixedHeaderOffset != null) __obj.updateDynamic("fixedHeaderOffset")(fixedHeaderOffset.asInstanceOf[js.Any])
    if (fixedLeftWidth != null) __obj.updateDynamic("fixedLeftWidth")(fixedLeftWidth.asInstanceOf[js.Any])
    if (fixedRightWidth != null) __obj.updateDynamic("fixedRightWidth")(fixedRightWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(flexHeadDrag)) __obj.updateDynamic("flexHeadDrag")(flexHeadDrag.asInstanceOf[js.Any])
    if (minColWidth != null) __obj.updateDynamic("minColWidth")(minColWidth.asInstanceOf[js.Any])
    if (minFixedLeftWidth != null) __obj.updateDynamic("minFixedLeftWidth")(minFixedLeftWidth.asInstanceOf[js.Any])
    if (minFixedRightWidth != null) __obj.updateDynamic("minFixedRightWidth")(minFixedRightWidth.asInstanceOf[js.Any])
    if (minFlexAreaWidth != null) __obj.updateDynamic("minFlexAreaWidth")(minFlexAreaWidth.asInstanceOf[js.Any])
    ready.foreach(p => __obj.updateDynamic("ready")(p.toJsFn))
    if (!js.isUndefined(rowHover)) __obj.updateDynamic("rowHover")(rowHover.asInstanceOf[js.Any])
    if (scrollPos != null) __obj.updateDynamic("scrollPos")(scrollPos.asInstanceOf[js.Any])
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (sizeChanged != null) __obj.updateDynamic("sizeChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.zui.SizeChangeEvent) => sizeChanged(t0).runNow()))
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.zui.SortEvent) => sort(t0).runNow()))
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    if (!js.isUndefined(storage)) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableOption]
  }
}

