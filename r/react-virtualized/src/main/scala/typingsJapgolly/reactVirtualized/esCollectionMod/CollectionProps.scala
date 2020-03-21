package typingsJapgolly.reactVirtualized.esCollectionMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactVirtualized.esGridMod.ScrollParams
import typingsJapgolly.reactVirtualized.esGridMod.SectionRenderedParams
import typingsJapgolly.reactVirtualized.mod.Alignment
import typingsJapgolly.reactVirtualized.mod.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionProps
  extends /**
  * PLEASE NOTE
  * The [key: string]: any; line is here on purpose
  * This is due to the need of force re-render of PureComponent
  * Check the following link if you want to know more
  * https://github.com/bvaughn/react-virtualized#pass-thru-props
  */
/* key */ StringDictionary[js.Any] {
  var `aria-label`: js.UndefOr[String] = js.undefined
  /**
    * Outer height of Collection is set to "auto". This property should only be
    * used in conjunction with the WindowScroller HOC.
    */
  var autoHeight: js.UndefOr[Boolean] = js.undefined
  /**
    * Number of cells in Collection.
    */
  var cellCount: Double
  /**
    * Responsible for rendering a group of cells given their indices.
    * Should implement the following interface: ({
    *   cellSizeAndPositionGetter:Function,
    *   indices: Array<number>,
    *   cellRenderer: Function
    * }): Array<PropTypes.node>
    */
  var cellGroupRenderer: js.UndefOr[CollectionCellGroupRenderer] = js.undefined
  /**
    * Responsible for rendering a cell given an row and column index.
    * Should implement the following interface: ({ index: number, key: string, style: object }): PropTypes.element
    */
  var cellRenderer: CollectionCellRenderer
  /**
    * Callback responsible for returning size and offset/position information for a given cell (index).
    * ({ index: number }): { height: number, width: number, x: number, y: number }
    */
  var cellSizeAndPositionGetter: CollectionCellSizeAndPositionGetter
  /**
    * Optional custom CSS class name to attach to root Collection element.
    */
  var className: js.UndefOr[String] = js.undefined
  var height: Double
  var horizontalOverscanSize: js.UndefOr[Double] = js.undefined
  /**
    * Optional custom id to attach to root Collection element.
    */
  var id: js.UndefOr[String] = js.undefined
  var noContentRenderer: js.UndefOr[js.Function0[Element]] = js.undefined
  /**
    * Callback invoked whenever the scroll offset changes within the inner
    * scrollable region: ({ clientHeight, clientWidth, scrollHeight, scrollLeft, scrollTop, scrollWidth }): void
    */
  var onScroll: js.UndefOr[js.Function1[/* params */ ScrollParams, _]] = js.undefined
  /**
    * Callback invoked with information about the section of the Collection
    * that was just rendered: ({ indices: Array<number> }): void
    */
  var onSectionRendered: js.UndefOr[js.Function1[/* params */ SectionRenderedParams, _]] = js.undefined
  /**
    * Horizontal offset
    */
  var scrollLeft: js.UndefOr[Double] = js.undefined
  /**
    * Controls the alignment of scrolled-to-cells. The default ("auto") scrolls
    * the least amount possible to ensure that the specified cell is fully
    * visible. Use "start" to always align cells to the top/left of the
    * Collection and "end" to align them bottom/right. Use "center" to align
    * specified cell in the middle of container.
    */
  var scrollToAlignment: js.UndefOr[Alignment] = js.undefined
  var scrollToCell: js.UndefOr[Double] = js.undefined
  /**
    * Vertical Offset
    */
  var scrollTop: js.UndefOr[Double] = js.undefined
  /**
    * Optionally override the size of the sections a Collection's cells are split into.
    */
  var sectionSize: js.UndefOr[Double] = js.undefined
  /**
    * Optional custom inline style to attach to root Collection element.
    */
  var style: js.UndefOr[CSSProperties] = js.undefined
  var verticalOverscanSize: js.UndefOr[Double] = js.undefined
  /**
    * Width of Collection; this property determines the number of visible
    * (vs virtualized) columns.
    */
  var width: Double
}

object CollectionProps {
  @scala.inline
  def apply(
    cellCount: Double,
    cellRenderer: /* params */ CollectionCellRendererParams => CallbackTo[Node],
    cellSizeAndPositionGetter: /* params */ Index => CallbackTo[CollectionCellSizeAndPosition],
    height: Double,
    width: Double,
    StringDictionary: /**
    * PLEASE NOTE
    * The [key: string]: any; line is here on purpose
    * This is due to the need of force re-render of PureComponent
    * Check the following link if you want to know more
    * https://github.com/bvaughn/react-virtualized#pass-thru-props
    */
  /* key */ StringDictionary[js.Any] = null,
    `aria-label`: String = null,
    autoHeight: js.UndefOr[Boolean] = js.undefined,
    cellGroupRenderer: /* params */ CollectionCellGroupRendererParams => CallbackTo[js.Array[Node]] = null,
    className: String = null,
    horizontalOverscanSize: Int | Double = null,
    id: String = null,
    noContentRenderer: js.UndefOr[CallbackTo[Element]] = js.undefined,
    onScroll: /* params */ ScrollParams => CallbackTo[js.Any] = null,
    onSectionRendered: /* params */ SectionRenderedParams => CallbackTo[js.Any] = null,
    scrollLeft: Int | Double = null,
    scrollToAlignment: Alignment = null,
    scrollToCell: Int | Double = null,
    scrollTop: Int | Double = null,
    sectionSize: Int | Double = null,
    style: CSSProperties = null,
    verticalOverscanSize: Int | Double = null
  ): CollectionProps = {
    val __obj = js.Dynamic.literal(cellCount = cellCount.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("cellRenderer")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactVirtualized.esCollectionMod.CollectionCellRendererParams) => cellRenderer(t0).runNow()))
    __obj.updateDynamic("cellSizeAndPositionGetter")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactVirtualized.mod.Index) => cellSizeAndPositionGetter(t0).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight.asInstanceOf[js.Any])
    if (cellGroupRenderer != null) __obj.updateDynamic("cellGroupRenderer")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactVirtualized.esCollectionMod.CollectionCellGroupRendererParams) => cellGroupRenderer(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (horizontalOverscanSize != null) __obj.updateDynamic("horizontalOverscanSize")(horizontalOverscanSize.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    noContentRenderer.foreach(p => __obj.updateDynamic("noContentRenderer")(p.toJsFn))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactVirtualized.esGridMod.ScrollParams) => onScroll(t0).runNow()))
    if (onSectionRendered != null) __obj.updateDynamic("onSectionRendered")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactVirtualized.esGridMod.SectionRenderedParams) => onSectionRendered(t0).runNow()))
    if (scrollLeft != null) __obj.updateDynamic("scrollLeft")(scrollLeft.asInstanceOf[js.Any])
    if (scrollToAlignment != null) __obj.updateDynamic("scrollToAlignment")(scrollToAlignment.asInstanceOf[js.Any])
    if (scrollToCell != null) __obj.updateDynamic("scrollToCell")(scrollToCell.asInstanceOf[js.Any])
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    if (sectionSize != null) __obj.updateDynamic("sectionSize")(sectionSize.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (verticalOverscanSize != null) __obj.updateDynamic("verticalOverscanSize")(verticalOverscanSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionProps]
  }
}

