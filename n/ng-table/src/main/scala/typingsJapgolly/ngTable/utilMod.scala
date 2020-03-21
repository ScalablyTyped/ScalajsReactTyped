package typingsJapgolly.ngTable

import typingsJapgolly.ngTable.groupingFuncMod.Grouping
import typingsJapgolly.ngTable.sortingMod.ISortingValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/core/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  def convertSortToOrderBy(sorting: ISortingValues): js.Array[String] = js.native
  def isGroupingFun(`val`: String): /* is ng-table.ng-table/src/core/grouping/groupingFunc.IGroupingFunc<any> */ Boolean = js.native
  def isGroupingFun(`val`: Grouping[_]): /* is ng-table.ng-table/src/core/grouping/groupingFunc.IGroupingFunc<any> */ Boolean = js.native
}

