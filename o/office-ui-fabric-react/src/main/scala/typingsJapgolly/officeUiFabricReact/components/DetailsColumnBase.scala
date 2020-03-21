package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.officeUiFabricReact.AnonItemIndex
import typingsJapgolly.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnProps
import typingsJapgolly.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnRenderTooltipProps
import typingsJapgolly.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnStyleProps
import typingsJapgolly.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnStyles
import typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IColumn
import typingsJapgolly.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typingsJapgolly.officeUiFabricReact.dragdropInterfacesMod.IDragDropHelper
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DetailsColumnBase {
  def apply(
    column: IColumn,
    columnIndex: Double,
    cellStyleProps: ICellStyleProps = null,
    componentRef: js.UndefOr[Callback] = js.undefined,
    dragDropHelper: IDragDropHelper = null,
    isDraggable: js.UndefOr[Boolean] = js.undefined,
    isDropped: js.UndefOr[Boolean] = js.undefined,
    onColumnClick: (/* ev */ ReactMouseEventFrom[HTMLElement], /* column */ IColumn) => Callback = null,
    onColumnContextMenu: (/* column */ IColumn, /* ev */ ReactMouseEventFrom[HTMLElement]) => Callback = null,
    onRenderColumnHeaderTooltip: (/* props */ js.UndefOr[IDetailsColumnRenderTooltipProps], /* defaultRender */ js.UndefOr[
      js.Function1[/* props */ js.UndefOr[IDetailsColumnRenderTooltipProps], Element | Null]
    ]) => CallbackTo[Element | Null] = null,
    parentId: String = null,
    setDraggedItemIndex: /* itemIndex */ Double => Callback = null,
    styles: IStyleFunctionOrObject[IDetailsColumnStyleProps, IDetailsColumnStyles] = null,
    theme: ITheme = null,
    updateDragInfo: (/* props */ AnonItemIndex, /* event */ js.UndefOr[MouseEvent]) => Callback = null,
    useFastIcons: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IDetailsColumnProps, 
    typingsJapgolly.officeUiFabricReact.mod.DetailsColumnBase, 
    Unit, 
    IDetailsColumnProps
  ] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any])
  
      if (cellStyleProps != null) __obj.updateDynamic("cellStyleProps")(cellStyleProps.asInstanceOf[js.Any])
    componentRef.foreach(p => __obj.updateDynamic("componentRef")(p.toJsFn))
    if (dragDropHelper != null) __obj.updateDynamic("dragDropHelper")(dragDropHelper.asInstanceOf[js.Any])
    if (!js.isUndefined(isDraggable)) __obj.updateDynamic("isDraggable")(isDraggable.asInstanceOf[js.Any])
    if (!js.isUndefined(isDropped)) __obj.updateDynamic("isDropped")(isDropped.asInstanceOf[js.Any])
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
    if (setDraggedItemIndex != null) __obj.updateDynamic("setDraggedItemIndex")(js.Any.fromFunction1((t0: /* itemIndex */ scala.Double) => setDraggedItemIndex(t0).runNow()))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (updateDragInfo != null) __obj.updateDynamic("updateDragInfo")(js.Any.fromFunction2((t0: /* props */ typingsJapgolly.officeUiFabricReact.AnonItemIndex, t1: /* event */ js.UndefOr[org.scalajs.dom.raw.MouseEvent]) => updateDragInfo(t0, t1).runNow()))
    if (!js.isUndefined(useFastIcons)) __obj.updateDynamic("useFastIcons")(useFastIcons.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.mod.DetailsColumnBase](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react", "DetailsColumnBase")
  @js.native
  object componentImport extends js.Object
  
}

