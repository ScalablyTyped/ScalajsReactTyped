package typingsJapgolly.ngTable

import typingsJapgolly.angular.mod.IAttributes
import typingsJapgolly.angular.mod.IAugmentedJQuery
import typingsJapgolly.angular.mod.ICompileService
import typingsJapgolly.angular.mod.IDocumentService
import typingsJapgolly.angular.mod.IParseService
import typingsJapgolly.angular.mod.IRootScopeService
import typingsJapgolly.angular.mod.ITimeoutService
import typingsJapgolly.ngTable.coreMod.NgTableEventsChannel
import typingsJapgolly.ngTable.coreMod.NgTableParams
import typingsJapgolly.ngTable.ngTableColumnMod.NgTableColumn
import typingsJapgolly.ngTable.pagingMod.IPageButton
import typingsJapgolly.ngTable.publicInterfacesMod.IColumnDef
import typingsJapgolly.ngTable.publicInterfacesMod.IDynamicTableColDef
import typingsJapgolly.ngTable.publicInterfacesMod.ITableInputAttributes
import typingsJapgolly.ngTable.resultsMod.DataResults
import typingsJapgolly.ngTable.resultsMod.GroupedDataResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/browser/ngTableController", JSImport.Namespace)
@js.native
object ngTableControllerMod extends js.Object {
  @js.native
  trait ITableScope[T] extends IRootScopeService {
    @JSName("$columns")
    var $columns: js.Array[IColumnDef] = js.native
    @JSName("$data")
    var $data: js.UndefOr[DataResults[T]] = js.native
    @JSName("$filterRow")
    var $filterRow: AnonDisabled = js.native
    @JSName("$groupRow")
    var $groupRow: AnonShow = js.native
    @JSName("$groups")
    var $groups: js.UndefOr[GroupedDataResults[T]] = js.native
    @JSName("$loading")
    var $loading: Boolean = js.native
    var pages: js.Array[IPageButton] = js.native
    var params: NgTableParams[T] = js.native
    var show_filter: Boolean = js.native
    var templates: AnonHeader = js.native
  }
  
  @js.native
  class NgTableController[TParams, TCol /* <: IColumnDef | IDynamicTableColDef */] protected () extends js.Object {
    def this(
      $scope: ITableScope[TParams],
      $timeout: ITimeoutService,
      $parse: IParseService,
      $compile: ICompileService,
      $attrs: IAttributes with ITableInputAttributes,
      $element: IAugmentedJQuery,
      $document: IDocumentService,
      ngTableColumn: NgTableColumn[TCol],
      ngTableEventsChannel: NgTableEventsChannel
    ) = this()
    @JSName("$attrs")
    var $attrs: js.Any = js.native
    @JSName("$compile")
    var $compile: js.Any = js.native
    @JSName("$document")
    var $document: js.Any = js.native
    @JSName("$element")
    var $element: js.Any = js.native
    @JSName("$parse")
    var $parse: js.Any = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    var delayFilter: js.Any = js.native
    val hasVisibleFilterColumn: js.Any = js.native
    var ngTableColumn: js.Any = js.native
    var ngTableEventsChannel: js.Any = js.native
    def buildColumns(columns: js.Array[TCol]): js.Array[IColumnDef] = js.native
    def compileDirectiveTemplates(): Unit = js.native
    /* private */ def getVisibleColumns(): js.Any = js.native
    def loadFilterData($columns: js.Array[IColumnDef]): Unit = js.native
    /* private */ def onDataReloadStatusChange(newStatus: js.Any): js.Any = js.native
    def parseNgTableDynamicExpr(attr: String): AnonColumns = js.native
    def setupBindingsToInternalScope(tableParamsExpr: String): Unit = js.native
    /* private */ def setupFilterRowBindingsToInternalScope(): js.Any = js.native
    /* private */ def setupGroupRowBindingsToInternalScope(): js.Any = js.native
    /* private */ def some[T](array: js.Any, predicate: js.Any): js.Any = js.native
    /* private */ def subscribeToTableEvents(): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object NgTableController extends js.Object {
    @JSName("$inject")
    var $inject: js.Array[String] = js.native
  }
  
}

