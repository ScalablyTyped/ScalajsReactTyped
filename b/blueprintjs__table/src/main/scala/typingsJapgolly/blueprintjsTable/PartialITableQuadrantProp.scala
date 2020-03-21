package typingsJapgolly.blueprintjsTable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactUIEventFrom
import japgolly.scalajs.react.ReactWheelEventFrom
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.blueprintjsTable.gridMod.Grid
import typingsJapgolly.blueprintjsTable.tableQuadrantMod.QuadrantType
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.EventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/table.@blueprintjs/table/lib/esm/quadrants/tableQuadrant.ITableQuadrantProps> */
trait PartialITableQuadrantProp extends js.Object {
  var bodyRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, _]] = js.undefined
  var bodyRenderer: js.UndefOr[
    js.Function3[
      /* quadrantType */ js.UndefOr[QuadrantType], 
      /* showFrozenRowsOnly */ js.UndefOr[Boolean], 
      /* showFrozenColumnsOnly */ js.UndefOr[Boolean], 
      Element
    ]
  ] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var columnHeaderCellRenderer: js.UndefOr[js.Function1[/* showFrozenColumnsOnly */ js.UndefOr[Boolean], Element]] = js.undefined
  var enableRowHeader: js.UndefOr[Boolean] = js.undefined
  var grid: js.UndefOr[Grid] = js.undefined
  var menuRenderer: js.UndefOr[js.Function0[Element]] = js.undefined
  var onScroll: js.UndefOr[EventHandler[ReactUIEventFrom[HTMLDivElement]]] = js.undefined
  var onWheel: js.UndefOr[EventHandler[ReactWheelEventFrom[HTMLDivElement]]] = js.undefined
  var quadrantRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, _]] = js.undefined
  var quadrantType: js.UndefOr[QuadrantType] = js.undefined
  var rowHeaderCellRenderer: js.UndefOr[js.Function1[/* showFrozenRowsOnly */ js.UndefOr[Boolean], Element]] = js.undefined
  var scrollContainerRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, _]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object PartialITableQuadrantProp {
  @scala.inline
  def apply(
    bodyRef: /* ref */ HTMLElement | Null => CallbackTo[js.Any] = null,
    bodyRenderer: (/* quadrantType */ js.UndefOr[QuadrantType], /* showFrozenRowsOnly */ js.UndefOr[Boolean], /* showFrozenColumnsOnly */ js.UndefOr[Boolean]) => CallbackTo[Element] = null,
    className: String = null,
    columnHeaderCellRenderer: /* showFrozenColumnsOnly */ js.UndefOr[Boolean] => CallbackTo[Element] = null,
    enableRowHeader: js.UndefOr[Boolean] = js.undefined,
    grid: Grid = null,
    menuRenderer: js.UndefOr[CallbackTo[Element]] = js.undefined,
    onScroll: ReactUIEventFrom[HTMLDivElement] => Callback = null,
    onWheel: ReactWheelEventFrom[HTMLDivElement] => Callback = null,
    quadrantRef: /* ref */ HTMLElement | Null => CallbackTo[js.Any] = null,
    quadrantType: QuadrantType = null,
    rowHeaderCellRenderer: /* showFrozenRowsOnly */ js.UndefOr[Boolean] => CallbackTo[Element] = null,
    scrollContainerRef: /* ref */ HTMLElement | Null => CallbackTo[js.Any] = null,
    style: CSSProperties = null
  ): PartialITableQuadrantProp = {
    val __obj = js.Dynamic.literal()
    if (bodyRef != null) __obj.updateDynamic("bodyRef")(js.Any.fromFunction1((t0: /* ref */ org.scalajs.dom.raw.HTMLElement | scala.Null) => bodyRef(t0).runNow()))
    if (bodyRenderer != null) __obj.updateDynamic("bodyRenderer")(js.Any.fromFunction3((t0: /* quadrantType */ js.UndefOr[typingsJapgolly.blueprintjsTable.tableQuadrantMod.QuadrantType], t1: /* showFrozenRowsOnly */ js.UndefOr[scala.Boolean], t2: /* showFrozenColumnsOnly */ js.UndefOr[scala.Boolean]) => bodyRenderer(t0, t1, t2).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (columnHeaderCellRenderer != null) __obj.updateDynamic("columnHeaderCellRenderer")(js.Any.fromFunction1((t0: /* showFrozenColumnsOnly */ js.UndefOr[scala.Boolean]) => columnHeaderCellRenderer(t0).runNow()))
    if (!js.isUndefined(enableRowHeader)) __obj.updateDynamic("enableRowHeader")(enableRowHeader.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    menuRenderer.foreach(p => __obj.updateDynamic("menuRenderer")(p.toJsFn))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactUIEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onScroll(t0).runNow()))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactWheelEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onWheel(t0).runNow()))
    if (quadrantRef != null) __obj.updateDynamic("quadrantRef")(js.Any.fromFunction1((t0: /* ref */ org.scalajs.dom.raw.HTMLElement | scala.Null) => quadrantRef(t0).runNow()))
    if (quadrantType != null) __obj.updateDynamic("quadrantType")(quadrantType.asInstanceOf[js.Any])
    if (rowHeaderCellRenderer != null) __obj.updateDynamic("rowHeaderCellRenderer")(js.Any.fromFunction1((t0: /* showFrozenRowsOnly */ js.UndefOr[scala.Boolean]) => rowHeaderCellRenderer(t0).runNow()))
    if (scrollContainerRef != null) __obj.updateDynamic("scrollContainerRef")(js.Any.fromFunction1((t0: /* ref */ org.scalajs.dom.raw.HTMLElement | scala.Null) => scrollContainerRef(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialITableQuadrantProp]
  }
}

