package typingsJapgolly.officeUiFabricReact.detailsColumnTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.officeUiFabricReact.AnonItemIndex
import typingsJapgolly.officeUiFabricReact.detailsColumnBaseMod.DetailsColumnBase
import typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IColumn
import typingsJapgolly.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typingsJapgolly.officeUiFabricReact.dragdropInterfacesMod.IDragDropHelper
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsColumnProps extends ClassAttributes[DetailsColumnBase] {
  /**
    * Custom styles for cell rendering.
    */
  var cellStyleProps: js.UndefOr[ICellStyleProps] = js.undefined
  /**
    * The column definition for the component instance.
    */
  var column: IColumn
  /**
    * The column index for the component instance.
    */
  var columnIndex: Double
  /**
    * A reference to the component instance.
    */
  var componentRef: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * The drag and drop helper for the component instance.
    */
  var dragDropHelper: js.UndefOr[IDragDropHelper | Null] = js.undefined
  /**
    * Whether or not the column can be re-ordered via drag and drop.
    */
  var isDraggable: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether or not the column has been dropped via drag and drop.
    */
  var isDropped: js.UndefOr[Boolean] = js.undefined
  /**
    * Callback fired when click event occurs.
    */
  var onColumnClick: js.UndefOr[
    js.Function2[/* ev */ ReactMouseEventFrom[HTMLElement], /* column */ IColumn, Unit]
  ] = js.undefined
  /**
    * Callback fired on contextual menu event to provide contextual menu UI.
    */
  var onColumnContextMenu: js.UndefOr[
    js.Function2[/* column */ IColumn, /* ev */ ReactMouseEventFrom[HTMLElement], Unit]
  ] = js.undefined
  /**
    * Render function for providing a column header tooltip.
    */
  var onRenderColumnHeaderTooltip: js.UndefOr[IRenderFunction[IDetailsColumnRenderTooltipProps]] = js.undefined
  /**
    * Parent ID used for accessibility label(s).
    */
  var parentId: js.UndefOr[String] = js.undefined
  /**
    * @deprecated use `updateDragInfo`
    */
  var setDraggedItemIndex: js.UndefOr[js.Function1[/* itemIndex */ Double, Unit]] = js.undefined
  /**
    * The component styles to respect during render.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDetailsColumnStyleProps, IDetailsColumnStyles]] = js.undefined
  /**
    * The theme object to respect during render.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * Callback on drag and drop event.
    */
  var updateDragInfo: js.UndefOr[
    js.Function2[/* props */ AnonItemIndex, /* event */ js.UndefOr[MouseEvent], Unit]
  ] = js.undefined
  /**
    * Whether to use fast icon and check components. The icons can't be targeted by customization
    * but are still customizable via class names.
    * @defaultvalue true
    */
  var useFastIcons: js.UndefOr[Boolean] = js.undefined
}

object IDetailsColumnProps {
  @scala.inline
  def apply(
    column: IColumn,
    columnIndex: Double,
    cellStyleProps: ICellStyleProps = null,
    componentRef: js.UndefOr[Callback] = js.undefined,
    dragDropHelper: IDragDropHelper = null,
    isDraggable: js.UndefOr[Boolean] = js.undefined,
    isDropped: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    onColumnClick: (/* ev */ ReactMouseEventFrom[HTMLElement], /* column */ IColumn) => Callback = null,
    onColumnContextMenu: (/* column */ IColumn, /* ev */ ReactMouseEventFrom[HTMLElement]) => Callback = null,
    onRenderColumnHeaderTooltip: (/* props */ js.UndefOr[IDetailsColumnRenderTooltipProps], /* defaultRender */ js.UndefOr[
      js.Function1[/* props */ js.UndefOr[IDetailsColumnRenderTooltipProps], Element | Null]
    ]) => CallbackTo[Element | Null] = null,
    parentId: String = null,
    ref: LegacyRef[DetailsColumnBase] = null,
    setDraggedItemIndex: /* itemIndex */ Double => Callback = null,
    styles: IStyleFunctionOrObject[IDetailsColumnStyleProps, IDetailsColumnStyles] = null,
    theme: ITheme = null,
    updateDragInfo: (/* props */ AnonItemIndex, /* event */ js.UndefOr[MouseEvent]) => Callback = null,
    useFastIcons: js.UndefOr[Boolean] = js.undefined
  ): IDetailsColumnProps = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any])
    if (cellStyleProps != null) __obj.updateDynamic("cellStyleProps")(cellStyleProps.asInstanceOf[js.Any])
    componentRef.foreach(p => __obj.updateDynamic("componentRef")(p.toJsFn))
    if (dragDropHelper != null) __obj.updateDynamic("dragDropHelper")(dragDropHelper.asInstanceOf[js.Any])
    if (!js.isUndefined(isDraggable)) __obj.updateDynamic("isDraggable")(isDraggable.asInstanceOf[js.Any])
    if (!js.isUndefined(isDropped)) __obj.updateDynamic("isDropped")(isDropped.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onColumnClick != null) __obj.updateDynamic("onColumnClick")(js.Any.fromFunction2((t0: /* ev */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* column */ typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IColumn) => onColumnClick(t0, t1).runNow()))
    if (onColumnContextMenu != null) __obj.updateDynamic("onColumnContextMenu")(js.Any.fromFunction2((t0: /* column */ typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IColumn, t1: /* ev */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onColumnContextMenu(t0, t1).runNow()))
    if (onRenderColumnHeaderTooltip != null) __obj.updateDynamic("onRenderColumnHeaderTooltip")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[
  typingsJapgolly.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnRenderTooltipProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[
      typingsJapgolly.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnRenderTooltipProps
    ], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderColumnHeaderTooltip(t0, t1).runNow()))
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (setDraggedItemIndex != null) __obj.updateDynamic("setDraggedItemIndex")(js.Any.fromFunction1((t0: /* itemIndex */ scala.Double) => setDraggedItemIndex(t0).runNow()))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (updateDragInfo != null) __obj.updateDynamic("updateDragInfo")(js.Any.fromFunction2((t0: /* props */ typingsJapgolly.officeUiFabricReact.AnonItemIndex, t1: /* event */ js.UndefOr[org.scalajs.dom.raw.MouseEvent]) => updateDragInfo(t0, t1).runNow()))
    if (!js.isUndefined(useFastIcons)) __obj.updateDynamic("useFastIcons")(useFastIcons.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsColumnProps]
  }
}

