package typingsJapgolly.ngTable

import typingsJapgolly.angular.mod.IAttributes
import typingsJapgolly.angular.mod.IAugmentedJQuery
import typingsJapgolly.angular.mod.ICompileService
import typingsJapgolly.angular.mod.IDocumentService
import typingsJapgolly.angular.mod.IParseService
import typingsJapgolly.angular.mod.IRootScopeService
import typingsJapgolly.angular.mod.ITimeoutService
import typingsJapgolly.ngTable.anon.Columns
import typingsJapgolly.ngTable.anon.Disabled
import typingsJapgolly.ngTable.anon.Header
import typingsJapgolly.ngTable.anon.Show
import typingsJapgolly.ngTable.srcBrowserNgTableColumnMod.NgTableColumn
import typingsJapgolly.ngTable.srcBrowserPublicInterfacesMod.IColumnDef
import typingsJapgolly.ngTable.srcBrowserPublicInterfacesMod.IDynamicTableColDef
import typingsJapgolly.ngTable.srcBrowserPublicInterfacesMod.ITableInputAttributes
import typingsJapgolly.ngTable.srcCoreDataResultsMod.DataResults
import typingsJapgolly.ngTable.srcCoreDataResultsMod.GroupedDataResults
import typingsJapgolly.ngTable.srcCoreMod.NgTableEventsChannel
import typingsJapgolly.ngTable.srcCoreMod.NgTableParams
import typingsJapgolly.ngTable.srcCorePagingMod.IPageButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBrowserNgTableControllerMod {
  
  @JSImport("ng-table/src/browser/ngTableController", "NgTableController")
  @js.native
  open class NgTableController[TParams, TCol /* <: IColumnDef | IDynamicTableColDef */] protected () extends StObject {
    def this(
      $scope: ITableScope[TParams],
      $timeout: ITimeoutService,
      $parse: IParseService,
      $compile: ICompileService,
      $attrs: IAttributes & ITableInputAttributes,
      $element: IAugmentedJQuery,
      $document: IDocumentService,
      ngTableColumn: NgTableColumn[TCol],
      ngTableEventsChannel: NgTableEventsChannel
    ) = this()
    
    /* private */ @JSName("$attrs")
    var $attrs: Any = js.native
    
    /* private */ @JSName("$compile")
    var $compile: Any = js.native
    
    /* private */ @JSName("$document")
    var $document: Any = js.native
    
    /* private */ @JSName("$element")
    var $element: Any = js.native
    
    /* private */ @JSName("$parse")
    var $parse: Any = js.native
    
    /* private */ @JSName("$scope")
    var $scope: Any = js.native
    
    def buildColumns(columns: js.Array[TCol]): js.Array[IColumnDef] = js.native
    
    def compileDirectiveTemplates(): Unit = js.native
    
    /* private */ var delayFilter: Any = js.native
    
    /* private */ def getVisibleColumns(): Any = js.native
    
    /* private */ val hasVisibleFilterColumn: Any = js.native
    
    def loadFilterData($columns: js.Array[IColumnDef]): Unit = js.native
    
    /* private */ var ngTableColumn: Any = js.native
    
    /* private */ var ngTableEventsChannel: Any = js.native
    
    /* private */ def onDataReloadStatusChange(newStatus: Any): Any = js.native
    
    def parseNgTableDynamicExpr(attr: String): Columns = js.native
    
    def setupBindingsToInternalScope(tableParamsExpr: String): Unit = js.native
    
    /* private */ def setupFilterRowBindingsToInternalScope(): Any = js.native
    
    /* private */ def setupGroupRowBindingsToInternalScope(): Any = js.native
    
    /* private */ def some[T](array: Any, predicate: Any): Any = js.native
    
    /* private */ def subscribeToTableEvents(): Any = js.native
  }
  /* static members */
  object NgTableController {
    
    @JSImport("ng-table/src/browser/ngTableController", "NgTableController")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ng-table/src/browser/ngTableController", "NgTableController.$inject")
    @js.native
    def $inject: js.Array[String] = js.native
    inline def $inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ITableScope[T]
    extends StObject
       with IRootScopeService {
    
    @JSName("$columns")
    var $columns: js.Array[IColumnDef] = js.native
    
    @JSName("$data")
    var $data: js.UndefOr[DataResults[T]] = js.native
    
    @JSName("$filterRow")
    var $filterRow: Disabled = js.native
    
    @JSName("$groupRow")
    var $groupRow: Show = js.native
    
    @JSName("$groups")
    var $groups: js.UndefOr[GroupedDataResults[T]] = js.native
    
    @JSName("$loading")
    var $loading: Boolean = js.native
    
    var pages: js.Array[IPageButton] = js.native
    
    var params: NgTableParams[T] = js.native
    
    var show_filter: Boolean = js.native
    
    var templates: Header = js.native
  }
}
