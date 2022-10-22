package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.anon.ItemIndex
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsColumnDottypesMod.IDetailsColumnProps
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsColumnDottypesMod.IDetailsColumnRenderTooltipProps
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsColumnDottypesMod.IDetailsColumnStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsColumnDottypesMod.IDetailsColumnStyles
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.IColumn
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsRowDottypesMod.ICellStyleProps
import typingsJapgolly.officeUiFabricReact.libUtilitiesDragdropInterfacesMod.IDragDropHelper
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DetailsColumn {
  
  inline def apply(column: IColumn, columnIndex: Double): Builder = {
    val __props = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IDetailsColumnProps]))
  }
  
  @JSImport("office-ui-fabric-react", "DetailsColumn")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[
          typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsColumnDotbaseMod.DetailsColumnBase
        ] {
    
    inline def cellStyleProps(value: ICellStyleProps): this.type = set("cellStyleProps", value.asInstanceOf[js.Any])
    
    inline def componentRef(value: Callback): this.type = set("componentRef", value.toJsFn)
    
    inline def dragDropHelper(value: IDragDropHelper): this.type = set("dragDropHelper", value.asInstanceOf[js.Any])
    
    inline def dragDropHelperNull: this.type = set("dragDropHelper", null)
    
    inline def isDraggable(value: Boolean): this.type = set("isDraggable", value.asInstanceOf[js.Any])
    
    inline def isDropped(value: Boolean): this.type = set("isDropped", value.asInstanceOf[js.Any])
    
    inline def onColumnClick(value: (/* ev */ ReactMouseEventFrom[HTMLElement], /* column */ IColumn) => Callback): this.type = set("onColumnClick", js.Any.fromFunction2((t0: /* ev */ ReactMouseEventFrom[HTMLElement], t1: /* column */ IColumn) => (value(t0, t1)).runNow()))
    
    inline def onColumnContextMenu(value: (/* column */ IColumn, /* ev */ ReactMouseEventFrom[HTMLElement]) => Callback): this.type = set("onColumnContextMenu", js.Any.fromFunction2((t0: /* column */ IColumn, t1: /* ev */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1)).runNow()))
    
    inline def onRenderColumnHeaderTooltip(
      value: (/* props */ js.UndefOr[IDetailsColumnRenderTooltipProps], /* defaultRender */ js.UndefOr[
          js.Function1[/* props */ js.UndefOr[IDetailsColumnRenderTooltipProps], Element | Null]
        ]) => Element | Null
    ): this.type = set("onRenderColumnHeaderTooltip", js.Any.fromFunction2(value))
    
    inline def parentId(value: String): this.type = set("parentId", value.asInstanceOf[js.Any])
    
    inline def setDraggedItemIndex(value: /* itemIndex */ Double => Callback): this.type = set("setDraggedItemIndex", js.Any.fromFunction1((t0: /* itemIndex */ Double) => value(t0).runNow()))
    
    inline def styles(value: IStyleFunctionOrObject[IDetailsColumnStyleProps, IDetailsColumnStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesFunction1(value: IDetailsColumnStyleProps => DeepPartial[IDetailsColumnStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def updateDragInfo(value: (/* props */ ItemIndex, /* event */ js.UndefOr[MouseEvent]) => Callback): this.type = set("updateDragInfo", js.Any.fromFunction2((t0: /* props */ ItemIndex, t1: /* event */ js.UndefOr[MouseEvent]) => (value(t0, t1)).runNow()))
    
    inline def useFastIcons(value: Boolean): this.type = set("useFastIcons", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDetailsColumnProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
