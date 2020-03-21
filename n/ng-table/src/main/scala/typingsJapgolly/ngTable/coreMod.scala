package typingsJapgolly.ngTable

import typingsJapgolly.angular.mod.ILogService
import typingsJapgolly.angular.mod.IModule
import typingsJapgolly.angular.mod.IQService
import typingsJapgolly.angular.mod.IRootScopeService
import typingsJapgolly.ngTable.ngTableDefaultsMod.IDefaults
import typingsJapgolly.ngTable.ngTableParamsMod.IParamValues
import typingsJapgolly.ngTable.ngTableSettingsMod.ISettings
import typingsJapgolly.ngTable.ngTableSettingsMod.NgTableSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/core", JSImport.Namespace)
@js.native
object coreMod extends js.Object {
  @js.native
  class NgTableDefaultGetDataProvider ()
    extends typingsJapgolly.ngTable.dataMod.NgTableDefaultGetDataProvider
  
  @js.native
  class NgTableEventsChannel protected ()
    extends typingsJapgolly.ngTable.ngTableEventsChannelMod.NgTableEventsChannel {
    def this($rootScope: IRootScopeService) = this()
  }
  
  @js.native
  class NgTableParams[T] ()
    extends typingsJapgolly.ngTable.ngTableParamsMod.NgTableParams[T] {
    def this(baseParameters: Boolean) = this()
    def this(baseParameters: IParamValues[T]) = this()
    def this(baseParameters: Boolean, baseSettings: ISettings[T]) = this()
    def this(baseParameters: IParamValues[T], baseSettings: ISettings[T]) = this()
  }
  
  val ngTableCoreModule: IModule = js.native
  /* static members */
  @js.native
  object NgTableEventsChannel extends js.Object {
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

