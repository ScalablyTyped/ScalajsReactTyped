package typingsJapgolly.ngTable

import typingsJapgolly.angular.mod.IAttributes
import typingsJapgolly.angular.mod.IAugmentedJQuery
import typingsJapgolly.angular.mod.ICompileService
import typingsJapgolly.angular.mod.IDocumentService
import typingsJapgolly.angular.mod.IModule
import typingsJapgolly.angular.mod.IParseService
import typingsJapgolly.angular.mod.ITimeoutService
import typingsJapgolly.angular.mod.auto.IInjectorService
import typingsJapgolly.ngTable.coreMod.NgTableEventsChannel
import typingsJapgolly.ngTable.ngTableColumnMod.NgTableColumn
import typingsJapgolly.ngTable.ngTableControllerMod.ITableScope
import typingsJapgolly.ngTable.publicInterfacesMod.IColumnDef
import typingsJapgolly.ngTable.publicInterfacesMod.IDynamicTableColDef
import typingsJapgolly.ngTable.publicInterfacesMod.IFilterConfigValues
import typingsJapgolly.ngTable.publicInterfacesMod.ITableInputAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/browser", JSImport.Namespace)
@js.native
object browserMod extends js.Object {
  @js.native
  class NgTableController[TParams, TCol /* <: IColumnDef | IDynamicTableColDef */] protected ()
    extends typingsJapgolly.ngTable.ngTableControllerMod.NgTableController[TParams, TCol] {
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
  }
  
  @js.native
  class NgTableFilterConfig protected ()
    extends typingsJapgolly.ngTable.ngTableFilterConfigMod.NgTableFilterConfig {
    def this(/**
      * Readonly copy of the final values used to configure the service.
      */
    config: IFilterConfigValues) = this()
  }
  
  @js.native
  class NgTableFilterConfigProvider protected ()
    extends typingsJapgolly.ngTable.ngTableFilterConfigMod.NgTableFilterConfigProvider {
    def this($injector: IInjectorService) = this()
  }
  
  val ngTableBrowserModule: IModule = js.native
  /* static members */
  @js.native
  object NgTableController extends js.Object {
    @JSName("$inject")
    var $inject: js.Array[String] = js.native
  }
  
  /* static members */
  @js.native
  object NgTableFilterConfig extends js.Object {
    @JSName("$inject")
    var $inject: js.Array[String] = js.native
  }
  
  /* static members */
  @js.native
  object NgTableFilterConfigProvider extends js.Object {
    @JSName("$inject")
    var $inject: js.Array[String] = js.native
  }
  
}

