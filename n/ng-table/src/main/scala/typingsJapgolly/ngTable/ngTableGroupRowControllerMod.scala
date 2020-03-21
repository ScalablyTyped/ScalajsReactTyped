package typingsJapgolly.ngTable

import typingsJapgolly.angular.mod.IPromise
import typingsJapgolly.ngTable.groupingFuncMod.IGroupingFunc
import typingsJapgolly.ngTable.ngTableControllerMod.ITableScope
import typingsJapgolly.ngTable.publicInterfacesMod.IColumnDef
import typingsJapgolly.ngTable.resultsMod.DataResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/browser/ngTableGroupRowController", JSImport.Namespace)
@js.native
object ngTableGroupRowControllerMod extends js.Object {
  @js.native
  trait IScopeExtensions[T] extends js.Object {
    @JSName("$selGroup")
    var $selGroup: IGroupingFunc[_] | String = js.native
    @JSName("$selGroupTitle")
    var $selGroupTitle: String = js.native
  }
  
  @js.native
  class NgTableGroupRowController[T] protected () extends js.Object {
    def this($scope: ITableScope[T] with IScopeExtensions[T]) = this()
    @JSName("$scope")
    var $scope: js.Any = js.native
    var groupFns: js.Any = js.native
    /* private */ def changeSortDirection(): js.Any = js.native
    /* private */ def findGroupColumn(groupKey: js.Any): js.Any = js.native
    def getGroupTitle(group: IGroupingFunc[_]): String = js.native
    def getGroupTitle(group: IColumnDef): String = js.native
    def getGroupables(): js.Array[IGroupingFunc[_] | IColumnDef] = js.native
    def getVisibleColumns(): js.Array[IColumnDef] = js.native
    def groupBy(group: IGroupingFunc[_]): Unit = js.native
    def groupBy(group: IColumnDef): Unit = js.native
    /* private */ def isGroupingFunc(`val`: js.Any): js.Any = js.native
    def isSelectedGroup(group: IGroupingFunc[_]): Boolean = js.native
    def isSelectedGroup(group: IColumnDef): Boolean = js.native
    /* private */ def setGroup(grouping: js.Any): js.Any = js.native
    def toggleDetail(): IPromise[
        js.Array[
          DataResult[
            /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ _
          ]
        ]
      ] = js.native
  }
  
  /* static members */
  @js.native
  object NgTableGroupRowController extends js.Object {
    @JSName("$inject")
    var $inject: js.Array[String] = js.native
  }
  
}

