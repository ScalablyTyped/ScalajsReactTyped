package typingsJapgolly.ngTable.ngTableSorterRowControllerMod

import typingsJapgolly.ngTable.ngTableControllerMod.ITableScope
import typingsJapgolly.ngTable.publicInterfacesMod.IColumnDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/browser/ngTableSorterRowController", "NgTableSorterRowController")
@js.native
class NgTableSorterRowController[T] protected () extends js.Object {
  def this($scope: ITableScope[T]) = this()
  @JSName("$scope")
  var $scope: js.Any = js.native
  def sortBy($column: IColumnDef, event: IAugmentedMouseEvent): Unit = js.native
}

/* static members */
@JSImport("ng-table/src/browser/ngTableSorterRowController", "NgTableSorterRowController")
@js.native
object NgTableSorterRowController extends js.Object {
  @JSName("$inject")
  var $inject: js.Array[String] = js.native
}

