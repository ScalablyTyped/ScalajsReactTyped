package typingsJapgolly.agGrid

import typingsJapgolly.agGrid.animationFrameServiceMod.AnimationFrameService
import typingsJapgolly.agGrid.cellEditorFactoryMod.CellEditorFactory
import typingsJapgolly.agGrid.cellRendererFactoryMod.CellRendererFactory
import typingsJapgolly.agGrid.cellRendererServiceMod.CellRendererService
import typingsJapgolly.agGrid.columnAnimationServiceMod.ColumnAnimationService
import typingsJapgolly.agGrid.columnApiMod.ColumnApi
import typingsJapgolly.agGrid.columnControllerMod.ColumnController
import typingsJapgolly.agGrid.columnHoverServiceMod.ColumnHoverService
import typingsJapgolly.agGrid.componentResolverMod.ComponentResolver
import typingsJapgolly.agGrid.contextMod.Context
import typingsJapgolly.agGrid.dragAndDropServiceMod.DragAndDropService
import typingsJapgolly.agGrid.eventServiceMod.EventService
import typingsJapgolly.agGrid.expressionServiceMod.ExpressionService
import typingsJapgolly.agGrid.filterManagerMod.FilterManager
import typingsJapgolly.agGrid.focusedCellControllerMod.FocusedCellController
import typingsJapgolly.agGrid.gridApiMod.GridApi
import typingsJapgolly.agGrid.gridOptionsWrapperMod.GridOptionsWrapper
import typingsJapgolly.agGrid.gridPanelMod.GridPanel
import typingsJapgolly.agGrid.heightScalerMod.HeightScaler
import typingsJapgolly.agGrid.iContextMenuFactoryMod.IContextMenuFactory
import typingsJapgolly.agGrid.iRangeControllerMod.IRangeController
import typingsJapgolly.agGrid.paginationProxyMod.PaginationProxy
import typingsJapgolly.agGrid.popupServiceMod.PopupService
import typingsJapgolly.agGrid.rowRendererMod.RowRenderer
import typingsJapgolly.agGrid.sortControllerMod.SortController
import typingsJapgolly.agGrid.stylingServiceMod.StylingService
import typingsJapgolly.agGrid.templateServiceMod.TemplateService
import typingsJapgolly.agGrid.valueFormatterServiceMod.ValueFormatterService
import typingsJapgolly.agGrid.valueServiceMod.ValueService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/beans", JSImport.Namespace)
@js.native
object beansMod extends js.Object {
  @js.native
  class Beans () extends js.Object {
    @JSName("$compile")
    var $compile: js.Any = js.native
    var cellEditorFactory: CellEditorFactory = js.native
    var cellRendererFactory: CellRendererFactory = js.native
    var cellRendererService: CellRendererService = js.native
    var columnAnimationService: ColumnAnimationService = js.native
    var columnApi: ColumnApi = js.native
    var columnController: ColumnController = js.native
    var columnHoverService: ColumnHoverService = js.native
    var componentResolver: ComponentResolver = js.native
    var context: Context = js.native
    var contextMenuFactory: IContextMenuFactory = js.native
    var doingMasterDetail: Boolean = js.native
    var dragAndDropService: DragAndDropService = js.native
    var enterprise: Boolean = js.native
    var eventService: EventService = js.native
    var expressionService: ExpressionService = js.native
    var filterManager: FilterManager = js.native
    var focusedCellController: FocusedCellController = js.native
    var gridApi: GridApi = js.native
    var gridOptionsWrapper: GridOptionsWrapper = js.native
    var gridPanel: GridPanel = js.native
    var heightScaler: HeightScaler = js.native
    var paginationProxy: PaginationProxy = js.native
    var popupService: PopupService = js.native
    var rangeController: IRangeController = js.native
    var rowRenderer: RowRenderer = js.native
    var sortController: SortController = js.native
    var stylingService: StylingService = js.native
    var taskQueue: AnimationFrameService = js.native
    var templateService: TemplateService = js.native
    var valueFormatterService: ValueFormatterService = js.native
    var valueService: ValueService = js.native
    /* private */ def postConstruct(): js.Any = js.native
    def registerGridComp(gridPanel: GridPanel): Unit = js.native
  }
  
}

