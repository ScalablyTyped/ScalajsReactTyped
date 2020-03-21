package typingsJapgolly.agGrid

import typingsJapgolly.agGrid.colDefMod.ColDef
import typingsJapgolly.agGrid.columnMod.Column
import typingsJapgolly.agGrid.dateComponentMod.IDateComp
import typingsJapgolly.agGrid.dateComponentMod.IDateParams
import typingsJapgolly.agGrid.floatingFilterMod.IFloatingFilterParams
import typingsJapgolly.agGrid.floatingFilterWrapperMod.IFloatingFilterWrapperComp
import typingsJapgolly.agGrid.groupCellRendererMod.GroupCellRendererParams
import typingsJapgolly.agGrid.headerCompMod.IHeaderComp
import typingsJapgolly.agGrid.headerCompMod.IHeaderParams
import typingsJapgolly.agGrid.headerGroupCompMod.IHeaderGroupComp
import typingsJapgolly.agGrid.headerGroupCompMod.IHeaderGroupParams
import typingsJapgolly.agGrid.iCellRendererMod.ICellRendererComp
import typingsJapgolly.agGrid.iCellRendererMod.ICellRendererParams
import typingsJapgolly.agGrid.iRichCellEditorParamsMod.IRichCellEditorParams
import typingsJapgolly.agGrid.iSetFilterParamsMod.ISetFilterParams
import typingsJapgolly.agGrid.loadingOverlayComponentMod.ILoadingOverlayComp
import typingsJapgolly.agGrid.noRowsOverlayComponentMod.INoRowsOverlayComp
import typingsJapgolly.agGrid.overlayWrapperComponentMod.IOverlayWrapperComp
import typingsJapgolly.agGrid.utilsMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/components/framework/componentRecipes", JSImport.Namespace)
@js.native
object componentRecipesMod extends js.Object {
  @js.native
  class ComponentRecipes () extends js.Object {
    var columnApi: js.Any = js.native
    var componentResolver: js.Any = js.native
    var filterManager: js.Any = js.native
    var gridApi: js.Any = js.native
    var gridOptions: js.Any = js.native
    var gridOptionsWrapper: js.Any = js.native
    /* private */ def getFilterComponentPrototype[A, B](colDef: js.Any): js.Any = js.native
    def newCellRenderer(target: ColDef, params: ICellRendererParams): Promise[ICellRendererComp] = js.native
    def newCellRenderer(target: IRichCellEditorParams, params: ICellRendererParams): Promise[ICellRendererComp] = js.native
    def newCellRenderer(target: ISetFilterParams, params: ICellRendererParams): Promise[ICellRendererComp] = js.native
    def newDateComponent(params: IDateParams): Promise[IDateComp] = js.native
    /* private */ def newEmptyFloatingFilterWrapperComponent(column: js.Any): js.Any = js.native
    def newFloatingFilterWrapperComponent[M, P /* <: IFloatingFilterParams[M, _] */](column: Column, params: IFloatingFilterParams[M, _]): IFloatingFilterWrapperComp[M, _, _, _] = js.native
    def newFullRowGroupRenderer(params: ICellRendererParams): Promise[ICellRendererComp] = js.native
    def newFullWidthGroupRowInnerCellRenderer(params: ICellRendererParams): Promise[ICellRendererComp] = js.native
    def newHeaderComponent(params: IHeaderParams): Promise[IHeaderComp] = js.native
    def newHeaderGroupComponent(params: IHeaderGroupParams): Promise[IHeaderGroupComp] = js.native
    def newInnerCellRenderer(target: GroupCellRendererParams, params: ICellRendererParams): Promise[ICellRendererComp] = js.native
    def newLoadingOverlayComponent(): Promise[ILoadingOverlayComp] = js.native
    def newNoRowsOverlayComponent(): Promise[INoRowsOverlayComp] = js.native
    def newOverlayWrapperComponent(): IOverlayWrapperComp = js.native
  }
  
  /* static members */
  @js.native
  object ComponentRecipes extends js.Object {
    var filterToFloatingFilterNames: js.Any = js.native
  }
  
}

