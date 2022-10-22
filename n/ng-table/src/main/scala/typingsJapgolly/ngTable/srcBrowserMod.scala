package typingsJapgolly.ngTable

import typingsJapgolly.angular.mod.IAttributes
import typingsJapgolly.angular.mod.IAugmentedJQuery
import typingsJapgolly.angular.mod.ICompileService
import typingsJapgolly.angular.mod.IDocumentService
import typingsJapgolly.angular.mod.IModule
import typingsJapgolly.angular.mod.IParseService
import typingsJapgolly.angular.mod.ITimeoutService
import typingsJapgolly.angular.mod.auto.IInjectorService
import typingsJapgolly.ngTable.srcBrowserNgTableColumnMod.NgTableColumn
import typingsJapgolly.ngTable.srcBrowserNgTableControllerMod.ITableScope
import typingsJapgolly.ngTable.srcBrowserPublicInterfacesMod.IColumnDef
import typingsJapgolly.ngTable.srcBrowserPublicInterfacesMod.IDynamicTableColDef
import typingsJapgolly.ngTable.srcBrowserPublicInterfacesMod.IFilterConfigValues
import typingsJapgolly.ngTable.srcBrowserPublicInterfacesMod.ITableInputAttributes
import typingsJapgolly.ngTable.srcCoreMod.NgTableEventsChannel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBrowserMod {
  
  @JSImport("ng-table/src/browser", "NgTableController")
  @js.native
  open class NgTableController[TParams, TCol /* <: IColumnDef | IDynamicTableColDef */] protected ()
    extends typingsJapgolly.ngTable.srcBrowserNgTableControllerMod.NgTableController[TParams, TCol] {
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
  }
  /* static members */
  object NgTableController {
    
    @JSImport("ng-table/src/browser", "NgTableController")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ng-table/src/browser", "NgTableController.$inject")
    @js.native
    def $inject: js.Array[String] = js.native
    inline def $inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ng-table/src/browser", "NgTableFilterConfig")
  @js.native
  open class NgTableFilterConfig protected ()
    extends typingsJapgolly.ngTable.srcBrowserNgTableFilterConfigMod.NgTableFilterConfig {
    def this(/**
      * Readonly copy of the final values used to configure the service.
      */
    config: IFilterConfigValues) = this()
  }
  /* static members */
  object NgTableFilterConfig {
    
    @JSImport("ng-table/src/browser", "NgTableFilterConfig")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ng-table/src/browser", "NgTableFilterConfig.$inject")
    @js.native
    def $inject: js.Array[String] = js.native
    inline def $inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ng-table/src/browser", "NgTableFilterConfigProvider")
  @js.native
  open class NgTableFilterConfigProvider protected ()
    extends typingsJapgolly.ngTable.srcBrowserNgTableFilterConfigMod.NgTableFilterConfigProvider {
    def this($injector: IInjectorService) = this()
  }
  /* static members */
  object NgTableFilterConfigProvider {
    
    @JSImport("ng-table/src/browser", "NgTableFilterConfigProvider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ng-table/src/browser", "NgTableFilterConfigProvider.$inject")
    @js.native
    def $inject: js.Array[String] = js.native
    inline def $inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ng-table/src/browser", "ngTableBrowserModule")
  @js.native
  val ngTableBrowserModule: IModule = js.native
}
