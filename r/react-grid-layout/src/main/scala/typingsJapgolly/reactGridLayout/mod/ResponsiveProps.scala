package typingsJapgolly.reactGridLayout.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactGridLayout.AnonE
import typingsJapgolly.reactGridLayout.AnonH
import typingsJapgolly.reactGridLayout.reactGridLayoutStrings.horizontal
import typingsJapgolly.reactGridLayout.reactGridLayoutStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveProps extends CoreProps {
  /**
    * `{name: pxVal}, e.g. {lg: 1200, md: 996, sm: 768, xs: 480}`
    *
    * Breakpoint names are arbitrary but must match in the cols and layouts objects.
    */
  var breakpoints: js.UndefOr[StringDictionary[Double]] = js.undefined
  /**
    * Number of cols. This is a breakpoint -> cols map, e.g. `{lg: 12, md: 10, ...}`.
    */
  var cols: js.UndefOr[StringDictionary[Double]] = js.undefined
  /**
    * Padding inside the container in px and formatt [x, y] or { breakpoint: [x, y] }.
    */
  var containerPadding: js.UndefOr[(js.Tuple2[Double, Double]) | (StringDictionary[js.Tuple2[Double, Double]])] = js.undefined
  /**
    * layouts is an object mapping breakpoints to layouts.
    *
    * e.g. `{lg: Layout[], md: Layout[], ...}`
    */
  var layouts: js.UndefOr[Layouts] = js.undefined
  /**
    * Margin between items in px and formatt [x, y] or { breakpoint: [x, y] }.
    */
  var margin: js.UndefOr[(js.Tuple2[Double, Double]) | (StringDictionary[js.Tuple2[Double, Double]])] = js.undefined
  /**
    * Calls back with breakpoint and new number pf cols.
    */
  var onBreakpointChange: js.UndefOr[js.Function2[/* newBreakpoint */ String, /* newCols */ Double, Unit]] = js.undefined
  /**
    * Callback so you can save the layout.
    */
  var onLayoutChange: js.UndefOr[
    js.Function2[/* currentLayout */ js.Array[Layout], /* allLayouts */ Layouts, Unit]
  ] = js.undefined
  /**
    * Callback when the width changes, so you can modify the layout as needed.
    */
  var onWidthChange: js.UndefOr[
    js.Function4[
      /* containerWidth */ Double, 
      /* margin */ js.Tuple2[Double, Double], 
      /* cols */ Double, 
      /* containerPadding */ js.Tuple2[Double, Double], 
      Unit
    ]
  ] = js.undefined
}

object ResponsiveProps {
  @scala.inline
  def apply(
    autoSize: js.UndefOr[Boolean] = js.undefined,
    breakpoints: StringDictionary[Double] = null,
    className: String = null,
    cols: StringDictionary[Double] = null,
    compactType: vertical | horizontal = null,
    containerPadding: (js.Tuple2[Double, Double]) | (StringDictionary[js.Tuple2[Double, Double]]) = null,
    draggableCancel: String = null,
    draggableHandle: String = null,
    droppingItem: AnonH = null,
    isDraggable: js.UndefOr[Boolean] = js.undefined,
    isDroppable: js.UndefOr[Boolean] = js.undefined,
    isResizable: js.UndefOr[Boolean] = js.undefined,
    layouts: Layouts = null,
    margin: (js.Tuple2[Double, Double]) | (StringDictionary[js.Tuple2[Double, Double]]) = null,
    maxRows: Int | Double = null,
    onBreakpointChange: (/* newBreakpoint */ String, /* newCols */ Double) => Callback = null,
    onDrag: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Callback = null,
    onDragStart: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Callback = null,
    onDragStop: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Callback = null,
    onDrop: /* elemParams */ AnonE => Callback = null,
    onLayoutChange: (/* currentLayout */ js.Array[Layout], /* allLayouts */ Layouts) => Callback = null,
    onResize: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Callback = null,
    onResizeStart: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Callback = null,
    onResizeStop: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Callback = null,
    onWidthChange: (/* containerWidth */ Double, /* margin */ js.Tuple2[Double, Double], /* cols */ Double, /* containerPadding */ js.Tuple2[Double, Double]) => Callback = null,
    preventCollision: js.UndefOr[Boolean] = js.undefined,
    rowHeight: Int | Double = null,
    style: CSSProperties = null,
    transformScale: Int | Double = null,
    useCSSTransforms: js.UndefOr[Boolean] = js.undefined,
    verticalCompact: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): ResponsiveProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoSize)) __obj.updateDynamic("autoSize")(autoSize.asInstanceOf[js.Any])
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (compactType != null) __obj.updateDynamic("compactType")(compactType.asInstanceOf[js.Any])
    if (containerPadding != null) __obj.updateDynamic("containerPadding")(containerPadding.asInstanceOf[js.Any])
    if (draggableCancel != null) __obj.updateDynamic("draggableCancel")(draggableCancel.asInstanceOf[js.Any])
    if (draggableHandle != null) __obj.updateDynamic("draggableHandle")(draggableHandle.asInstanceOf[js.Any])
    if (droppingItem != null) __obj.updateDynamic("droppingItem")(droppingItem.asInstanceOf[js.Any])
    if (!js.isUndefined(isDraggable)) __obj.updateDynamic("isDraggable")(isDraggable.asInstanceOf[js.Any])
    if (!js.isUndefined(isDroppable)) __obj.updateDynamic("isDroppable")(isDroppable.asInstanceOf[js.Any])
    if (!js.isUndefined(isResizable)) __obj.updateDynamic("isResizable")(isResizable.asInstanceOf[js.Any])
    if (layouts != null) __obj.updateDynamic("layouts")(layouts.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (maxRows != null) __obj.updateDynamic("maxRows")(maxRows.asInstanceOf[js.Any])
    if (onBreakpointChange != null) __obj.updateDynamic("onBreakpointChange")(js.Any.fromFunction2((t0: /* newBreakpoint */ java.lang.String, t1: /* newCols */ scala.Double) => onBreakpointChange(t0, t1).runNow()))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction6((t0: /* layout */ js.Array[typingsJapgolly.reactGridLayout.mod.Layout], t1: /* oldItem */ typingsJapgolly.reactGridLayout.mod.Layout, t2: /* newItem */ typingsJapgolly.reactGridLayout.mod.Layout, t3: /* placeholder */ typingsJapgolly.reactGridLayout.mod.Layout, t4: /* event */ org.scalajs.dom.raw.MouseEvent, t5: /* element */ org.scalajs.dom.raw.HTMLElement) => onDrag(t0, t1, t2, t3, t4, t5).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction6((t0: /* layout */ js.Array[typingsJapgolly.reactGridLayout.mod.Layout], t1: /* oldItem */ typingsJapgolly.reactGridLayout.mod.Layout, t2: /* newItem */ typingsJapgolly.reactGridLayout.mod.Layout, t3: /* placeholder */ typingsJapgolly.reactGridLayout.mod.Layout, t4: /* event */ org.scalajs.dom.raw.MouseEvent, t5: /* element */ org.scalajs.dom.raw.HTMLElement) => onDragStart(t0, t1, t2, t3, t4, t5).runNow()))
    if (onDragStop != null) __obj.updateDynamic("onDragStop")(js.Any.fromFunction6((t0: /* layout */ js.Array[typingsJapgolly.reactGridLayout.mod.Layout], t1: /* oldItem */ typingsJapgolly.reactGridLayout.mod.Layout, t2: /* newItem */ typingsJapgolly.reactGridLayout.mod.Layout, t3: /* placeholder */ typingsJapgolly.reactGridLayout.mod.Layout, t4: /* event */ org.scalajs.dom.raw.MouseEvent, t5: /* element */ org.scalajs.dom.raw.HTMLElement) => onDragStop(t0, t1, t2, t3, t4, t5).runNow()))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1((t0: /* elemParams */ typingsJapgolly.reactGridLayout.AnonE) => onDrop(t0).runNow()))
    if (onLayoutChange != null) __obj.updateDynamic("onLayoutChange")(js.Any.fromFunction2((t0: /* currentLayout */ js.Array[typingsJapgolly.reactGridLayout.mod.Layout], t1: /* allLayouts */ typingsJapgolly.reactGridLayout.mod.Layouts) => onLayoutChange(t0, t1).runNow()))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction6((t0: /* layout */ js.Array[typingsJapgolly.reactGridLayout.mod.Layout], t1: /* oldItem */ typingsJapgolly.reactGridLayout.mod.Layout, t2: /* newItem */ typingsJapgolly.reactGridLayout.mod.Layout, t3: /* placeholder */ typingsJapgolly.reactGridLayout.mod.Layout, t4: /* event */ org.scalajs.dom.raw.MouseEvent, t5: /* element */ org.scalajs.dom.raw.HTMLElement) => onResize(t0, t1, t2, t3, t4, t5).runNow()))
    if (onResizeStart != null) __obj.updateDynamic("onResizeStart")(js.Any.fromFunction6((t0: /* layout */ js.Array[typingsJapgolly.reactGridLayout.mod.Layout], t1: /* oldItem */ typingsJapgolly.reactGridLayout.mod.Layout, t2: /* newItem */ typingsJapgolly.reactGridLayout.mod.Layout, t3: /* placeholder */ typingsJapgolly.reactGridLayout.mod.Layout, t4: /* event */ org.scalajs.dom.raw.MouseEvent, t5: /* element */ org.scalajs.dom.raw.HTMLElement) => onResizeStart(t0, t1, t2, t3, t4, t5).runNow()))
    if (onResizeStop != null) __obj.updateDynamic("onResizeStop")(js.Any.fromFunction6((t0: /* layout */ js.Array[typingsJapgolly.reactGridLayout.mod.Layout], t1: /* oldItem */ typingsJapgolly.reactGridLayout.mod.Layout, t2: /* newItem */ typingsJapgolly.reactGridLayout.mod.Layout, t3: /* placeholder */ typingsJapgolly.reactGridLayout.mod.Layout, t4: /* event */ org.scalajs.dom.raw.MouseEvent, t5: /* element */ org.scalajs.dom.raw.HTMLElement) => onResizeStop(t0, t1, t2, t3, t4, t5).runNow()))
    if (onWidthChange != null) __obj.updateDynamic("onWidthChange")(js.Any.fromFunction4((t0: /* containerWidth */ scala.Double, t1: /* margin */ js.Tuple2[scala.Double, scala.Double], t2: /* cols */ scala.Double, t3: /* containerPadding */ js.Tuple2[scala.Double, scala.Double]) => onWidthChange(t0, t1, t2, t3).runNow()))
    if (!js.isUndefined(preventCollision)) __obj.updateDynamic("preventCollision")(preventCollision.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transformScale != null) __obj.updateDynamic("transformScale")(transformScale.asInstanceOf[js.Any])
    if (!js.isUndefined(useCSSTransforms)) __obj.updateDynamic("useCSSTransforms")(useCSSTransforms.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalCompact)) __obj.updateDynamic("verticalCompact")(verticalCompact.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsiveProps]
  }
}

