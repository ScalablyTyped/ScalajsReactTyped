package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactUIEventFrom
import japgolly.scalajs.react.ReactWheelEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.blueprintjsTable.gridMod.Grid
import typingsJapgolly.blueprintjsTable.tableQuadrantMod.ITableQuadrantProps
import typingsJapgolly.blueprintjsTable.tableQuadrantMod.QuadrantType
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableQuadrant {
  def apply(
    grid: Grid,
    bodyRenderer: (js.UndefOr[QuadrantType], js.UndefOr[Boolean], js.UndefOr[Boolean]) => CallbackTo[Element],
    bodyRef: /* ref */ HTMLElement | Null => CallbackTo[js.Any] = null,
    className: String = null,
    columnHeaderCellRenderer: /* showFrozenColumnsOnly */ js.UndefOr[Boolean] => CallbackTo[Element] = null,
    enableRowHeader: js.UndefOr[Boolean] = js.undefined,
    menuRenderer: js.UndefOr[CallbackTo[Element]] = js.undefined,
    onScroll: ReactUIEventFrom[HTMLDivElement] => Callback = null,
    onWheel: ReactWheelEventFrom[HTMLDivElement] => Callback = null,
    quadrantRef: /* ref */ HTMLElement | Null => CallbackTo[js.Any] = null,
    quadrantType: QuadrantType = null,
    rowHeaderCellRenderer: /* showFrozenRowsOnly */ js.UndefOr[Boolean] => CallbackTo[Element] = null,
    scrollContainerRef: /* ref */ HTMLElement | Null => CallbackTo[js.Any] = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ITableQuadrantProps, 
    typingsJapgolly.blueprintjsTable.tableQuadrantMod.TableQuadrant, 
    Unit, 
    ITableQuadrantProps
  ] = {
    val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any])
  
      __obj.updateDynamic("bodyRenderer")(js.Any.fromFunction3((t0: js.UndefOr[typingsJapgolly.blueprintjsTable.tableQuadrantMod.QuadrantType], t1: js.UndefOr[scala.Boolean], t2: js.UndefOr[scala.Boolean]) => bodyRenderer(t0, t1, t2).runNow()))
    if (bodyRef != null) __obj.updateDynamic("bodyRef")(js.Any.fromFunction1((t0: /* ref */ org.scalajs.dom.raw.HTMLElement | scala.Null) => bodyRef(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (columnHeaderCellRenderer != null) __obj.updateDynamic("columnHeaderCellRenderer")(js.Any.fromFunction1((t0: /* showFrozenColumnsOnly */ js.UndefOr[scala.Boolean]) => columnHeaderCellRenderer(t0).runNow()))
    if (!js.isUndefined(enableRowHeader)) __obj.updateDynamic("enableRowHeader")(enableRowHeader.asInstanceOf[js.Any])
    menuRenderer.foreach(p => __obj.updateDynamic("menuRenderer")(p.toJsFn))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactUIEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onScroll(t0).runNow()))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactWheelEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onWheel(t0).runNow()))
    if (quadrantRef != null) __obj.updateDynamic("quadrantRef")(js.Any.fromFunction1((t0: /* ref */ org.scalajs.dom.raw.HTMLElement | scala.Null) => quadrantRef(t0).runNow()))
    if (quadrantType != null) __obj.updateDynamic("quadrantType")(quadrantType.asInstanceOf[js.Any])
    if (rowHeaderCellRenderer != null) __obj.updateDynamic("rowHeaderCellRenderer")(js.Any.fromFunction1((t0: /* showFrozenRowsOnly */ js.UndefOr[scala.Boolean]) => rowHeaderCellRenderer(t0).runNow()))
    if (scrollContainerRef != null) __obj.updateDynamic("scrollContainerRef")(js.Any.fromFunction1((t0: /* ref */ org.scalajs.dom.raw.HTMLElement | scala.Null) => scrollContainerRef(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsTable.tableQuadrantMod.ITableQuadrantProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsTable.tableQuadrantMod.TableQuadrant](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsTable.tableQuadrantMod.ITableQuadrantProps])(children: _*)
  }
  @JSImport("@blueprintjs/table/lib/esm/quadrants/tableQuadrant", "TableQuadrant")
  @js.native
  object componentImport extends js.Object
  
}

