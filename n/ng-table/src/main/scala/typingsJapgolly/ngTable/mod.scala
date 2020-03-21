package typingsJapgolly.ngTable

import typingsJapgolly.angular.mod.IAttributes
import typingsJapgolly.angular.mod.IAugmentedJQuery
import typingsJapgolly.angular.mod.ICompileService
import typingsJapgolly.angular.mod.IDocumentService
import typingsJapgolly.angular.mod.ILogService
import typingsJapgolly.angular.mod.IModule
import typingsJapgolly.angular.mod.IParseService
import typingsJapgolly.angular.mod.IQService
import typingsJapgolly.angular.mod.IRootScopeService
import typingsJapgolly.angular.mod.ITimeoutService
import typingsJapgolly.angular.mod.auto.IInjectorService
import typingsJapgolly.ngTable.ngTableColumnMod.NgTableColumn
import typingsJapgolly.ngTable.ngTableControllerMod.ITableScope
import typingsJapgolly.ngTable.ngTableDefaultsMod.IDefaults
import typingsJapgolly.ngTable.ngTableParamsMod.IParamValues
import typingsJapgolly.ngTable.ngTableSettingsMod.ISettings
import typingsJapgolly.ngTable.ngTableSettingsMod.NgTableSettings
import typingsJapgolly.ngTable.publicInterfacesMod.IColumnDef
import typingsJapgolly.ngTable.publicInterfacesMod.IDynamicTableColDef
import typingsJapgolly.ngTable.publicInterfacesMod.IFilterConfigValues
import typingsJapgolly.ngTable.publicInterfacesMod.ITableInputAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class NgTableController[TParams, TCol /* <: IColumnDef | IDynamicTableColDef */] protected ()
    extends typingsJapgolly.ngTable.browserMod.NgTableController[TParams, TCol] {
    def this(
      $scope: ITableScope[TParams],
      $timeout: ITimeoutService,
      $parse: IParseService,
      $compile: ICompileService,
      $attrs: IAttributes with ITableInputAttributes,
      $element: IAugmentedJQuery,
      $document: IDocumentService,
      ngTableColumn: NgTableColumn[TCol],
      ngTableEventsChannel: typingsJapgolly.ngTable.coreMod.NgTableEventsChannel
    ) = this()
  }
  
  @js.native
  class NgTableDefaultGetDataProvider ()
    extends typingsJapgolly.ngTable.coreMod.NgTableDefaultGetDataProvider
  
  @js.native
  class NgTableEventsChannel protected ()
    extends typingsJapgolly.ngTable.coreMod.NgTableEventsChannel {
    def this($rootScope: IRootScopeService) = this()
  }
  
  @js.native
  class NgTableFilterConfig protected ()
    extends typingsJapgolly.ngTable.browserMod.NgTableFilterConfig {
    def this(/**
      * Readonly copy of the final values used to configure the service.
      */
    config: IFilterConfigValues) = this()
  }
  
  @js.native
  class NgTableFilterConfigProvider protected ()
    extends typingsJapgolly.ngTable.browserMod.NgTableFilterConfigProvider {
    def this($injector: IInjectorService) = this()
  }
  
  @js.native
  class NgTableParams[T] ()
    extends typingsJapgolly.ngTable.coreMod.NgTableParams[T] {
    def this(baseParameters: Boolean) = this()
    def this(baseParameters: IParamValues[T]) = this()
    def this(baseParameters: Boolean, baseSettings: ISettings[T]) = this()
    def this(baseParameters: IParamValues[T], baseSettings: ISettings[T]) = this()
  }
  
  val ngTableBrowserModule: IModule = js.native
  val ngTableCoreModule: IModule = js.native
  val ngTableModule: IModule = js.native
  /* static members */
  @js.native
  object NgTableController extends js.Object {
    @JSName("$inject")
    var $inject: js.Array[String] = js.native
  }
  
  /* static members */
  @js.native
  object NgTableEventsChannel extends js.Object {
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
  
  /* static members */
  @js.native
  object NgTableParams extends js.Object {
    @JSName("$log")
    var $log: js.Any = js.native
    @JSName("$q")
    var $q: js.Any = js.native
    var ngTableDefaults: js.Any = js.native
    var ngTableEventsChannel: js.Any = js.native
    var ngTableSettings: js.Any = js.native
    def init(
      $q: IQService,
      $log: ILogService,
      ngTableDefaults: IDefaults,
      ngTableEventsChannel: typingsJapgolly.ngTable.ngTableEventsChannelMod.NgTableEventsChannel,
      ngTableSettings: NgTableSettings
    ): Unit = js.native
  }
  
}

